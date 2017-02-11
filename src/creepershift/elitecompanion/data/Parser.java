package creepershift.elitecompanion.data;


import creepershift.elitecompanion.Main;
import creepershift.elitecompanion.Reference;
import creepershift.elitecompanion.util.LineWriter;
import creepershift.elitecompanion.util.TimeUtil;

import java.io.File;
import java.util.List;

/**
 * EliteCompanion
 * Created by Max on 1/30/2017.
 */
public class Parser {

    public static void parseJournals() {

        File[] journalFiles = new File(Reference.eliteDirectory).listFiles();

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

                    loadJournalFile(file, false);


                } else if ((Double.parseDouble(Main.appStorage.lastFileNumber()) == Double.parseDouble(s1[0]))) {

                    loadJournalFile(file, true);

                }


            }
        }


    }


    /*
    Loads the journal file, reads it line by line and passes it on to be parsed.
     */
    static void loadJournalFile(File journal, boolean isCurrentFile) {

            //Returns a list of Strings, each containing a line in the specified file.
            List<String> journalLines = LineWriter.getFileLines(Reference.eliteDirectory, journal.getName());

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


            }

            Main.materialStorage.saveFile();
            //In case stuff doesn't work. TODO: Implement error handling.


    }
}

