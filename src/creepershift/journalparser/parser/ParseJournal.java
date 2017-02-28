package creepershift.journalparser.parser;

import creepershift.journalparser.Reference;
import creepershift.journalparser.util.LineWriter;
import creepershift.journalparser.util.ParserJson;
import org.json.simple.JSONArray;

import java.io.File;
import java.util.List;

/**
 * EliteCompanion
 * Created by Max on 2/28/2017.
 */
public class ParseJournal {

    static String lastFile;
    String commander;
    String currentLine;

    public ParseJournal(String cmdr){
        commander = cmdr;
    }

    public void loadFile(File file) {

        //Returns a list of Strings, each containing a line in the specified file.
        List<String> journalLines = LineWriter.getFileLines(Reference.eliteDirectory, file.getName());

        System.out.println(ParserJson.parseVersion(journalLines.get(0), "gameversion"));





        processFile(journalLines);


    }

    private void processFile(List<String> journalLines){



        /*
        Loop through all the strings in the file
         */
        for(String line : journalLines){


            /*
            Checks through our events
             */
            if(line.contains("\"event\":\"LoadGame\",")){
                doOutput(JournalEvent.LOAD_GAME, line);
            }else if (line.contains(", \"event\":\"MaterialCollected\",")){
                doOutput(JournalEvent.MATERIAL_COLLECTED, line);
            }else if(line.contains(", \"event\":\"EngineerCraft\",")){
                doOutput(JournalEvent.ENGINEER_CRAFT, line);
            }else if(line.contains(", \"event\":\"MaterialDiscarded\",")){
                doOutput(JournalEvent.MATERIAL_DISCARDED, line);
            }else if(line.contains(" \"event\":\"Materials\",")) {
                doOutput(JournalEvent.MATERIAL_DUMP, line);
            }else if(line.contains(" \"event\":\"Cargo\",")){

            }






        }

    }

    private void doOutput(JournalEvent event, String line){


        switch(event){

            case MATERIAL_DUMP:
               JSONArray jarray = ParserJson.parseMaterialDump(line);
               for (int i =0 ; i< jarray.size(); i++){
                   System.out.println(jarray.get(i).toString());
               }

        }




    }


}
