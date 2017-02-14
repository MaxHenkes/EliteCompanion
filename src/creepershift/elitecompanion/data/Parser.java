package creepershift.elitecompanion.data;


import creepershift.elitecompanion.Main;
import creepershift.elitecompanion.Reference;
import creepershift.elitecompanion.util.GsonParser;
import creepershift.elitecompanion.util.LineWriter;
import creepershift.elitecompanion.util.ParserJson;
import creepershift.elitecompanion.util.TimeUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * EliteCompanion
 * Created by Max on 1/30/2017.
 */
public class Parser {

    public static void parseJournals(boolean debug, String debugString) {

        File[] journalFiles;

        if(!debug) {
            journalFiles = new File(Reference.eliteDirectory).listFiles();
        }else{
            journalFiles = new File(debugString).listFiles();
        }


        if (journalFiles != null) {
            for (File file : journalFiles) {

                if (!file.getName().endsWith(".log")) {
                    continue;
                }


                String[] s = file.getName().split("^Journal.");
                String[] s1 = s[1].split(".01.log$");

                /*
                Since the filename gets larger the older the file gets,
                we can easily check if the file is newer than the old one.
                 */

                if (Main.appStorage.lastFileNumber() == null || (Double.parseDouble(Main.appStorage.lastFileNumber()) < Double.parseDouble(s1[0]))) {

                    loadJournalFile(file, false, debugString, debug);


                } else if ((Double.parseDouble(Main.appStorage.lastFileNumber()) == Double.parseDouble(s1[0]))) {

                    loadJournalFile(file, true, debugString, debug);

                }


            }
        }


    }


    /*
    Loads the journal file, reads it line by line and passes it on to be parsed.
     */
    private static void loadJournalFile(File journal, boolean isCurrentFile, String debugString, boolean debug) {

        //Returns a list of Strings, each containing a line in the specified file.
        List<String> journalLines;
        if(!debug) {
            journalLines = LineWriter.getFileLines(Reference.eliteDirectory, journal.getName());
        }else{
            journalLines = LineWriter.getFileLines(debugString, journal.getName());
        }
        //loops through the lines
        for (int i = 0; i < journalLines.size(); i++) {

                   /* Checks for the correct EVENT, in this case Materials being collected.
                    Sends that line to the parser, currently only returns material name and count. */
            if (journalLines.get(i).contains(", \"event\":\"MaterialCollected\",")) {

                String[] line = ParserJson.parseCollectedString((journalLines.get(i)));

                if (isCurrentFile && TimeUtil.isAfter(line[2], Main.appStorage.lastTimeStamp())) {


                    MaterialDataHandler.addEntry(line[0], Integer.parseInt(line[1]));

                    Main.appStorage.updateData(journal.getName(), line[2]);

                }

                if (!isCurrentFile) {

                    MaterialDataHandler.addEntry(line[0], Integer.parseInt(line[1]));

                    Main.appStorage.updateData(journal.getName(), line[2]);

                }


            }

            if (journalLines.get(i).contains(", \"event\":\"EngineerCraft\",")) {

                String time = ParserJson.parseMissionString((journalLines.get(i)));
                ArrayList<String> list = GsonParser.parseMaterials(journalLines.get(i));

                if (isCurrentFile && TimeUtil.isAfter(time, Main.appStorage.lastTimeStamp())) {

                    Main.appStorage.updateData(journal.getName(), time);

                    for (String string : list) {

                        MaterialDataHandler.removeEntry(string, 1);

                    }


                }

                if (!isCurrentFile) {

                    Main.appStorage.updateData(journal.getName(), time);

                    for (String string : list) {

                        MaterialDataHandler.removeEntry(string, 1);

                    }

                }


            }


        }

        Main.materialStorage.saveFile();
        //In case stuff doesn't work. TODO: Implement error handling.


    }
}

