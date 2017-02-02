package creepershift.elitecompanion.data;


import creepershift.elitecompanion.Main;
import creepershift.elitecompanion.util.LineWriter;

import java.io.*;
import java.util.List;

/**
 * Created by Max on 1/30/2017.
 */
public class Parser {



    /*
    Loads the journal file, reads it line by line and passes it on to be parsed.
     */
    public static void loadJournalFile(File journal, String debugName) {


        //TODO: Implement checking for file number and timestamp.
        if (!debugName.equals(Data.lastFile)) {

            if (journal.exists()) {
                System.out.println("Journal found.");

                //Returns a list of Strings, each containing a line in the specified file.
               List<String> journalLines = LineWriter.getFileLines(Main.eliteDirectory, debugName);

               String timeStamp = null;
               String fileName = debugName;

               //loops through the lines
               for(int i = 0 ; i < journalLines.size() ; i++ ) {

                   //timestamp calculation, probably a bad idea in case the format ever changes TODO: REWORK
                   String line = journalLines.get(i);
                   timeStamp = line.substring(15, 35);

                   /* Checks for the correct EVENT, in this case Materials being collected.
                    Sends that line to the parser, currently only returns material name and count. */
                   if(journalLines.get(i).contains(", \"event\":\"MaterialCollected\",")){
                      System.out.println(ParserJson.parseMaterialString(journalLines.get(i))[0] + " " + ParserJson.parseMaterialString(journalLines.get(i))[1]);
                   }

               }
                //When we're done looping, we save the new data to our data file.
               Data.saveData(new String[]{fileName, timeStamp});



                //In case stuff doesn't work. TODO: Implement Error handling.
            } else {
                System.out.println("Journal not found.");
            }


        }
    }

}