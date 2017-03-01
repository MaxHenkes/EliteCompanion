package creepershift.journalparser.parser;

import creepershift.elitecompaniongui.Main;
import creepershift.journalparser.Reference;
import creepershift.journalparser.app.MaterialDataHandler;
import creepershift.journalparser.app.storage.AppStorage;
import creepershift.journalparser.app.storage.MaterialStorage;
import creepershift.journalparser.util.LineWriter;
import creepershift.journalparser.util.LogOutput;
import creepershift.journalparser.util.ParserJson;

import java.io.File;
import java.util.List;

/**
 * EliteCompanion
 * Created by Max on 2/28/2017.
 */
public class ParseJournal {

    private static File lastFile;
    private File currentFile;
    String commander = Reference.COMMANDER_NAME;
    String lastTimestamp;
    private boolean isLastFile;
    private MaterialStorage materialStorage;
    private AppStorage appStorage;
    private LogOutput logOutput;

    public ParseJournal(File file, MaterialStorage matst, AppStorage appst, LogOutput logout) {

        lastTimestamp = appst.lastTimeStamp();
        currentFile = file;
        materialStorage = matst;
        appStorage = appst;
        logOutput = logout;


            if (currentFile == lastFile) {
                isLastFile = true;
            } else {
                isLastFile = false;
            }


            loadFile();

    }

    public void loadFile() {

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
                doOutput(JournalEvent.LOAD_GAME, line);
            } else if (line.contains(", \"event\":\"MaterialCollected\",")) {
                doOutput(JournalEvent.MATERIAL_COLLECTED, line);
            } else if (line.contains(", \"event\":\"EngineerCraft\",")) {
                doOutput(JournalEvent.ENGINEER_CRAFT, line);
            } else if (line.contains(", \"event\":\"MaterialDiscarded\",")) {
                doOutput(JournalEvent.MATERIAL_DISCARDED, line);
            } else if (line.contains(" \"event\":\"Materials\",")) {
                doOutput(JournalEvent.MATERIAL_DUMP, line);
            } else if (line.contains(" \"event\":\"Cargo\",")) {

            }


        }

    }

    private void doOutput(JournalEvent event, String line) {


        switch (event) {

            case MATERIAL_DUMP:
                String[][] data = ParserJson.parseMaterialDump(line, "Raw");
                for (int i = 0 ; i < data[0].length; i++) {
                    MaterialDataHandler.addEntry(data[0][i], Integer.parseInt(data[1][i]));
                    System.out.println(data[0][i] + " - " +  data[1][i]);
                }

                String[][] data2 = ParserJson.parseMaterialDump(line, "Encoded");
                for (int i = 0 ; i < data2[0].length; i++) {
                    MaterialDataHandler.addEntry(data2[0][i], Integer.parseInt(data2[1][i]));
                    System.out.println("added");
                }
                Main.controller.controller.displayTable();
                break;


        }


    }


}
