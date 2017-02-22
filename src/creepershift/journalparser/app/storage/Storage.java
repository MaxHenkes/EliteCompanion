package creepershift.journalparser.app.storage;


import creepershift.journalparser.Reference;

import java.io.File;
import java.io.IOException;

/**  EliteCompanion
 * Created by Max on 2/9/2017.
 */
abstract class Storage {

    private File storageFile;
    private File storageFolder;

   public Storage(String path, String fileName){

        storageFile = new File(path + fileName);
        storageFolder = new File(path);
        createDefaults();

    }


    private void createDefaults(){

        if (!storageFolder.exists() || !storageFile.exists()) {
            try {
                boolean folder = storageFolder.mkdirs();
                boolean file = storageFile.createNewFile();

                if (Reference.DEBUG && file || folder)
                    System.out.println("\n Folder or Files created.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }



}
