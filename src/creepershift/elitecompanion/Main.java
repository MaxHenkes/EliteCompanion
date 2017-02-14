package creepershift.elitecompanion;

import creepershift.elitecompanion.data.MaterialDataHandler;
import creepershift.elitecompanion.data.Parser;
import creepershift.elitecompanion.data.storage.AppStorage;
import creepershift.elitecompanion.data.storage.MaterialStorage;
import creepershift.elitecompanion.gui.App;

/**  EliteCompanion
 * Created by Max on 1/30/2017.
 */
public class Main {

    public static AppStorage appStorage;
    public static MaterialStorage materialStorage;

    private static final boolean test = false;

    public static void main(String[] args){


        if (!test) {


            App.init();
            appStorage = new AppStorage(Reference.dataDirectory, Reference.appDataFile);
            materialStorage = new MaterialStorage(Reference.dataDirectory, Reference.materialDataFile);
            Parser.parseJournals(true, "C:\\Users\\Max\\Desktop\\Elite\\Taverius\\");
        /*
        Currently just used to make sure stuff is working.
        Will be reworked once the parts are all there.
         */

            MaterialDataHandler.printMaterial();


        }

    }


}
