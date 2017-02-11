package creepershift.elitecompanion;

import creepershift.elitecompanion.data.MaterialDataHandler;
import creepershift.elitecompanion.data.Parser;
import creepershift.elitecompanion.data.storage.AppStorage;
import creepershift.elitecompanion.data.storage.MaterialStorage;
import creepershift.elitecompanion.gui.App;

/**
 * Created by Max on 1/30/2017.
 */
public class Main {

    public static AppStorage appStorage;
    public static MaterialStorage materialStorage;

    public static void main(String[] args){


        App.init();
        MaterialDataHandler.init();
        appStorage = new AppStorage(Reference.dataDirectory, Reference.appDataFile);
        materialStorage = new MaterialStorage(Reference.dataDirectory, Reference.materialDataFile);
        Parser.parseJournals();

        /*
        Currently just used to make sure stuff is working.
        Will be reworked once the parts are all there.
         */


       //Tests the parser with a journal file I specify.
       //Parser.loadJournalFile(Reference.debugJournal, "Journal.170128220217.01.log");

        System.out.println(MaterialDataHandler.printMaterial());



    }


}
