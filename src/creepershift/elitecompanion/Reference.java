package creepershift.elitecompanion;

import java.io.File;

/**  EliteCompanion
 * Created by Max on 2/9/2017.
 */
public class Reference {

    public static final String[] materialNames = {"zinc", "nickel", "germanium", "carbon", "sulphur", "archivedemissiondata", "emissiondata", "legacyfirmware"};
    public static final String userDirectory = System.getProperty("user.home");
    public static final String dataDirectory = userDirectory+"\\AppData\\Roaming\\EliteCompanion\\";
    public static final String eliteDirectory = userDirectory + "\\Saved Games\\Frontier Developments\\Elite Dangerous\\";
    public static File debugJournal = new File(eliteDirectory + "Journal.170128220217.01.log");
    public static final boolean DEBUG = true;
    public static final String appDataFile = "EliteData.txt";
    public static final String materialDataFile = "MaterialData.txt";
}
