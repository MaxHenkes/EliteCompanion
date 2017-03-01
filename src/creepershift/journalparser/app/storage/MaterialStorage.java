package creepershift.journalparser.app.storage;

import creepershift.journalparser.Reference;
import creepershift.journalparser.app.MaterialDataHandler;
import creepershift.journalparser.util.LineWriter;

import java.util.ArrayList;
import java.util.List;

/**  EliteCompanion
 * Created by Max on 2/9/2017.
 */
public class MaterialStorage extends Storage {

    private String filePath;
    private String fileName;

    public MaterialStorage(String path, String name) {
        super(path, name);
        filePath = path;
        fileName = name;
       // readFile();
    }


    /*
    Reads the file if possible:
    First line contains the name of the last opened File.
    Second line contains the timestamp of the last read out event.
    */
    private void readFile() {

        List<String> lineList = LineWriter.getFileLines(filePath, fileName);
        if (lineList.size() > 0 && lineList.size() %2 == 0) {

            for (int i = 0; i < lineList.size(); i += 2 ){
                MaterialDataHandler.addEntry(lineList.get(i), Integer.parseInt(lineList.get(i+1)));
            }


        }
    }


    public void saveFile(){

        String[] data = MaterialDataHandler.saveMaterialString();

        List<String> lineList = new ArrayList<String>();
        for(int i = 0; i < data.length; i++) {
            lineList.add(data[i]);
            i++;
            lineList.add(data[i]);
        }
        LineWriter.writeFileLines(Reference.dataDirectory, Reference.materialDataFile, lineList);

    }


}
