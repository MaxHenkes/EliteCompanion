package creepershift.elitecompanion.util;

import creepershift.elitecompanion.Main;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Max on 2/2/2017.
 */
public class LineWriter {


    public static List<String> getFileLines(String filePath, String fileName) {

        Path dataPath = FileSystems.getDefault().getPath(filePath, fileName);

      //  if (Main.DEBUG)System.out.println(dataPath);

        List<String> fileContent = null;
        try {
            fileContent = new ArrayList<>(Files.readAllLines(dataPath, StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileContent;

    }


    public static void writeFileLines(String filePath, String fileName, List<String> list) {

        Path dataPath = FileSystems.getDefault().getPath(filePath, fileName);

        try {
            Files.write(dataPath, list, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
