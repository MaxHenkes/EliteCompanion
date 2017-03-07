package creepershift.journalparser.app.storage;

import creepershift.journalparser.util.LineWriter;

import java.util.ArrayList;
import java.util.List;

/** ${PACKAGE_NAME} for EliteCompanion
 * Created by Max on 2/9/2017.
 */
public class AppStorage extends Storage {


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
    */
    public void saveData() {

        /*
        Creates a new list and populates it with the data.
         */
        ArrayList<String> lineList = new ArrayList<String>();
        lineList.add(0, lastFile);
        lineList.add(1, lastTimeStamp);

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

    public String lastFileNumber() {


        if (lastFile == null){
            return null;
        }
        /*
        Temp removal of all stuff we don't need in the filename.
        Not pretty D: .
         */
        String[] s = lastFile.split("^Journal.");
        String[] s1 = s[1].split(".01.log$");

        return s1[0];
    }

    public void updateData(String file, String time) {

        lastFile = file;
        lastTimeStamp = time;

    }

}
