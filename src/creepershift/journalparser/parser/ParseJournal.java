package creepershift.journalparser.parser;

import creepershift.elitecompaniongui.Main;
import creepershift.journalparser.Reference;
import creepershift.journalparser.app.CommanderData;
import creepershift.journalparser.app.MaterialData;
import creepershift.journalparser.app.MaterialDataHandler;
import creepershift.journalparser.app.storage.AppStorage;
import creepershift.journalparser.util.LineWriter;
import creepershift.journalparser.util.LogOutput;
import creepershift.journalparser.util.ParserJson;
import creepershift.journalparser.util.TimeUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * EliteCompanion
 * Created by Max on 2/28/2017.
 */
public class ParseJournal {

    private static String lastFile;
    private File currentFile;
    private String lastTimestamp;
    private boolean isLastFile;
    private MaterialDataHandler materialDataHandler;
    private AppStorage appStorage;
    private LogOutput logOutput;
    private CommanderData commanderData;
    private boolean startUp;

    public ParseJournal(File file, MaterialDataHandler materials, AppStorage appst, LogOutput logout, CommanderData cmdrData, boolean startUp) {

        lastFile = appst.lastFile();
        lastTimestamp = appst.lastTimeStamp();
        currentFile = file;
        materialDataHandler = materials;
        logOutput = logout;
        appStorage = appst;
        commanderData = cmdrData;
        this.startUp = startUp;


        if (currentFile.getName().equalsIgnoreCase(lastFile)) {
            isLastFile = true;
            System.out.println("isLastFile");
        } else {
            isLastFile = false;
            System.out.println("isNotLastFile");
        }


        loadFile();

    }

    private void loadFile() {

        //Returns a list of Strings, each containing a line in the specified file.
        List<String> journalLines = LineWriter.getFileLines(Reference.eliteDirectory, currentFile.getName());

        System.out.println(ParserJson.parseVersion(journalLines.get(0), "gameversion"));


        processFile(journalLines);


    }

    private void processFile(List<String> journalLines) {



        /*
        Loop through all the strings in the file
         */
        for (String line : journalLines) {


            /*
            Checks through our events
             */
            if (line.contains("\"event\":\"LoadGame\",")) {
                f_loadGame(line);
            } else if (line.contains(", \"event\":\"MaterialCollected\",")) {
                f_materialCollected(line);
            } else if (line.contains(", \"event\":\"EngineerCraft\",")) {
                doOutput(JournalEvent.ENGINEER_CRAFT, line);
            } else if (line.contains(", \"event\":\"MaterialDiscarded\",")) {
                doOutput(JournalEvent.MATERIAL_DISCARDED, line);
            } else if (line.contains(" \"event\":\"Materials\",")) {
                f_materialDump(line);
            } else if (line.contains(" \"event\":\"Cargo\",")) {

            }


        }

    }




    /*
        When you log in, the game prints a complete material dump.
        We use that to set the material list as that will always be correct.
        */
    private void f_materialDump(String line) {
        String[][] dataRaw = ParserJson.parseMaterialDump(line, "Raw");
        String[][] dataEncoded = ParserJson.parseMaterialDump(line, "Encoded");

        if ((dataRaw != null && startUp) ||(dataRaw != null &&!isLastFile || dataRaw != null &&TimeUtil.isAfter(dataRaw[2][0], lastTimestamp))) {


            List<MaterialData> mats = new ArrayList<>();
            for (int i = 0; i < dataRaw[0].length; i++) {
                mats.add(new MaterialData(dataRaw[0][i], Integer.parseInt(dataRaw[1][i]), "Raw"));
            }


            for (int i = 0; i < (dataEncoded != null ? dataEncoded[0].length : 0); i++) {
                mats.add(new MaterialData(dataEncoded[0][i], Integer.parseInt(dataEncoded[1][i]), "Encoded"));
            }
            if(!startUp)
            lastTimestamp = dataRaw[2][0];
            materialDataHandler.setMaterialDump(mats);
            Main.controller.controller.displayTable();
            f_saveAppData();

        }
    }

    /*
    We parse the String that is created when a material is collected.
     */
    private void f_materialCollected(String line){

        String[] data = ParserJson.parseCollectedString(line);

        if (data != null &&!isLastFile || data != null &&TimeUtil.isAfter(data[3], lastTimestamp)) {

            materialDataHandler.addsEntry(data[0], Integer.parseInt(data[1]), data[2]);
            lastTimestamp = data[3];
            logOutput.addMaterialCollected(data[0],Integer.parseInt(data[1]),data[3]);
            f_saveAppData();
        }

    }


    private void f_loadGame(String line){

        String[] data = ParserJson.parseStartupString(line);
        if (data != null) {

        commanderData.setLoadGame(data[0], Integer.parseInt(data[1]), data[2], data[3]);
        }

    }



    private void doOutput(JournalEvent event, String line) {


    }

    private void f_saveAppData(){
            appStorage.updateData(currentFile.getName(), lastTimestamp);

    }

}
