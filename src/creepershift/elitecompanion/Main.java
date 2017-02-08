package creepershift.elitecompanion;

import creepershift.elitecompanion.data.Data;
import creepershift.elitecompanion.data.MaterialDataHandler;
import creepershift.elitecompanion.data.Parser;
import creepershift.elitecompanion.gui.App;

import java.io.File;

/**
 * Created by Max on 1/30/2017.
 */
public class Main {

    /*
    A few constants and debug stuff. Will be cleaned up later.
     */
    public static final String userDirectory = System.getProperty("user.home");
    public static final String dataDirectory = userDirectory+"\\AppData\\Roaming\\EliteCompanion\\";
    public static final String eliteDirectory = Main.userDirectory + "\\Saved Games\\Frontier Developments\\Elite Dangerous\\";
    public static File debugJournal = new File(Main.eliteDirectory + "Journal.170128220217.01.log");

    public static final boolean DEBUG = true;


    public static void main(String[] args){


        App.init();
        MaterialDataHandler.init();
        /*
        Currently just used to make sure stuff is working.
        Will be reworked once the parts are all there.
         */

        //loads or creates the data file.
        Data.loadDataFile();

        //tests writing to the data file.
        String[] test = new String[2];

        test[0] = "testline1";
        test[1] = "testline2";

        //actually writes to the data file.
       Data.saveData(test);


       //Tests the parser with a journal file I specify.
       Parser.loadJournalFile(debugJournal, "Journal.170128220217.01.log");

        System.out.println(MaterialDataHandler.printMaterial());



    }


}
