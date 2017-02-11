package creepershift.elitecompanion.data;


import creepershift.elitecompanion.Main;
import creepershift.elitecompanion.Reference;
import creepershift.elitecompanion.util.LineWriter;

import java.io.File;
import java.util.List;

/**
 * Created by Max on 1/30/2017.
 */
public class Parser {

  //  ArrayList<String> fileList = new ArrayList<String>();




    public static void parseJournals(){

        File[] journalFiles = new File(Reference.eliteDirectory).listFiles();

        for (File file: journalFiles){

            if (!file.getName().endsWith(".log")){
                continue;
            }

            String[] s = file.getName().split("^Journal.");
            String[] s1 = s[1].split(".01.log$");

            /*
            Since the filename gets larger the older the file gets,
            we can easily check if the file is newer than the old one.
             */

            if ((Double.parseDouble(Main.appStorage.lastFileNumber()) < Double.parseDouble(s1[0]))){

            loadJournalFile(file);
            Main.appStorage.updateLastFile(file.getName().toString());

            }


//            if (file.getName().equalsIgnoreCase(Main.appStorage.lastFile())){






        }





    }



    /*
    Loads the journal file, reads it line by line and passes it on to be parsed.
     */
    public static void loadJournalFile(File journal) {


        //TODO: Implement checking for file number and timestamp.

            if (journal.exists()) {
                System.out.println("Journal found.");

                //Returns a list of Strings, each containing a line in the specified file.
               List<String> journalLines = LineWriter.getFileLines(Reference.eliteDirectory, journal.getName());

               String timeStamp = null;
               String fileName = journal.getName();

               //loops through the lines
               for(int i = 0 ; i < journalLines.size() ; i++ ) {

                   //timestamp calculation, probably a bad idea in case the format ever changes TODO: REWORK
                   String line = journalLines.get(i);
                   timeStamp = line.substring(15, 35);

                   /* Checks for the correct EVENT, in this case Materials being collected.
                    Sends that line to the parser, currently only returns material name and count. */
                   if(journalLines.get(i).contains(", \"event\":\"MaterialCollected\",")){

                       MaterialDataHandler.addEntry(ParserJson.parseMaterialString(journalLines.get(i))[0], Integer.parseInt(ParserJson.parseMaterialString(journalLines.get(i))[1]));

                   }



               }
                Main.materialStorage.saveFile();
                //When we're done looping, we save the new data to our data file.
             //  Main.appStorage.saveData(new String[]{fileName, timeStamp});



                //In case stuff doesn't work. TODO: Implement Error handling.
            } else {
                System.out.println("Journal not found.");
            }


        }
    }

