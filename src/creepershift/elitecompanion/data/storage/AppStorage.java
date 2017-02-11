package creepershift.elitecompanion.data.storage;

import creepershift.elitecompanion.util.LineWriter;

import java.util.List;

/**
 * Created by Max on 2/9/2017.
 */
public class AppStorage extends Storage{


    private String lastFile;
    private String lastTimeStamp;
    private String filePath;
    private String fileName;

    public AppStorage(String path, String name) {
        super(path, name);
        filePath = path;
        fileName = name;
        readFile();

    }

    /*
    Reads the file if possible:
    First line contains the name of the last opened File.
    Second line contains the timestamp of the last read out event.
     */
    private void readFile() {

        List<String> lineList = LineWriter.getFileLines(filePath, fileName);
        if (lineList.size() >= 2) {
            lastFile = lineList.get(0);
            lastTimeStamp = lineList.get(1);
        }
    }


    /*
    Used to save data to the data file using our Linewriter class.
    TODO: Return if values were overwritten?
    */
    private void saveData() {

        /*
        Get the lines contained in our data file.
         */
        List<String> lineList = LineWriter.getFileLines(filePath, fileName);


        /*
        If the file is empty, we just add new entries.
         */
        if (lineList.size() == 0) {

            lineList.add(0, lastFile);
            lineList.add(1, lastTimeStamp);

        }
        /*
        If the file already contains data, we overwrite it.
         */
        if (lineList.size() >= 2) {
            lineList.set(0, lastFile);
            lineList.set(1, lastTimeStamp);


        }

        /*
        This actually writes the data to the file.
         */
        LineWriter.writeFileLines(filePath, fileName, lineList);
    }

    public String lastFile() {
        return lastFile;
    }

    public String lastTimeStamp() {
        return lastTimeStamp;
    }

    public String lastFileNumber(){

        /*
        Temp removal of all stuff we dont need in the filename.
        Not pretty D: .
         */
        String[] s = lastFile.split("^Journal.");
        System.out.println(s[0]);
        String[] s1 = s[1].split(".01.log$");

        return s1[0];
    }

    public void updateLastFile(String file){

    lastFile = file;
    saveData();

    }

}
