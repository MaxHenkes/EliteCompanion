package creepershift.elitecompanion.data;

import creepershift.elitecompanion.Main;
import creepershift.elitecompanion.util.LineWriter;

import java.io.*;
import java.util.List;

/**
 * Created by Max on 1/30/2017.
 */
public class Data {

    /*
    Loaded whenever the data file is modified.
    Needed to check for new files/entries.
     */
    public static String lastFile;
    public static String lastTimeStamp;


    /*
    Loads the data file. Creates it in case it doesn't exist.
     */
    public static void loadDataFile() {

        File dataFile = new File(Main.dataDirectory + "Data.txt");
        File dataFolder = new File(Main.dataDirectory);

        /*
        Creates both the data file and folders if they don't exist.
        */
        if (!dataFolder.exists() || !dataFile.exists()) {
            try {
                boolean folder = dataFolder.mkdirs();
                boolean file = dataFile.createNewFile();

                if (file || folder)
                    System.out.println("\n Folder or Files created.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /*
        If the file exists, we use our Linewriter class to load the first 2 lines into memory.
         */
        List<String> lineList = LineWriter.getFileLines(Main.dataDirectory, "Data.txt");
        if (lineList.size() >= 2) {
            lastFile = lineList.get(0); //First line contains the name of the last opened File
            lastTimeStamp = lineList.get(1); //Second line contains the timestamp of the last read out event
        }

    }


    /*
    Used to save data to the data file using our Linewriter class.
    TODO: Return if values were overwritten?
     */
    public static void saveData(String[] data) {

        /*
        Get the lines contained in our data file.
         */
        List<String> lineList = LineWriter.getFileLines(Main.dataDirectory, "Data.txt");


        /*
        If the file is empty, we just add new entries.
         */
        if (lineList.size() == 0) {

            lineList.add(0, data[0]);
            lineList.add(1, data[1]);

        }
        /*
        If the file already contains data, we overwrite it.
         */
        if (lineList.size() >= 2) {
            lineList.set(0, data[0]);
            lineList.set(1, data[1]);


        }

        /*
        This actually writes the data to the file.
         */
        LineWriter.writeFileLines(Main.dataDirectory, "Data.txt", lineList);
        loadDataFile(); //is called so the new data is also loaded into memory.

    }
}
