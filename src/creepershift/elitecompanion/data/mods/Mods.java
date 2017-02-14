package creepershift.elitecompanion.data.mods;

import java.util.ArrayList;

/**
 * EliteCompanion
 * Created by Max on 2/13/2017.
 */
public class Mods {


    /*
    REMOVE LATER
    archivedemissiondata = irregular emission data
    emissiondata = unexpected emission data



     */



    public static ArrayList<ModData> mods;

    public static void initMods(){


             /*
    Armor
    Blast Resistance
     */
        addModToData("armor", "blastres", new String[]{"ryder", "jean"}, 1, new String[]{"nickel"});
        addModToData("armor", "blastres", new String[]{"jean"}, 2, new String[]{"carbon", "zinc"});
        addModToData("armor", "blastres", new String[]{"jean"}, 3, new String[]{"salvagedalloys", "vanadium", "zirconium"});

     /*
    Armor
    Heavy Duty
     */
        addModToData("armor", "heavyduty", new String[]{"ryder", "jean"}, 1, new String[]{"carbon"});
        addModToData("armor", "heavyduty", new String[]{"jean"}, 2, new String[]{"carbon", "shieldemitters"});
        addModToData("armor", "heavyduty", new String[]{"jean"}, 3, new String[]{"carbon", "highdensitycomposites", "shieldemitters"});
        addModToData("armor", "heavyduty", new String[]{"jean"}, 4, new String[]{"fedproprietarycomposites", "shieldingsensors", "vanadium"});
        addModToData("armor", "heavyduty", new String[]{"jean"}, 5, new String[]{"compoundshielding", "fedcorecomposites", "tungsten"});

     /*
    Armor
    Kinetic Resistance
     */
        addModToData("armor", "kineticres", new String[]{"ryder", "jean"}, 1, new String[]{"nickel"});
        addModToData("armor", "kineticres", new String[]{"jean"}, 2, new String[]{"nickel", "vanadium"});
        addModToData("armor", "kineticres", new String[]{"jean"}, 3, new String[]{"highdensitycomposites", "salvagedalloys", "vanadium"});

     /*
    Armor
    Lightweight
     */
        addModToData("armor", "light", new String[]{"ryder", "jean"}, 1, new String[]{"iron"});
        addModToData("armor", "light", new String[]{"jean"}, 2, new String[]{"conductivepolymers", "iron"});
        addModToData("armor", "light", new String[]{"jean"}, 3, new String[]{"conductivepolymers", "highdensitycomposites", "iron"});

     /*
    Armor
    Thermal Resistance
     */
        addModToData("armor", "thermalres", new String[]{"ryder", "jean"}, 1, new String[]{"heatconductionwiring"});
        addModToData("armor", "thermalres", new String[]{"jean"}, 2, new String[]{"heatdispersionplate", "nickel"});
        addModToData("armor", "thermalres", new String[]{"jean"}, 3, new String[]{"heatexchangers", "salvagedalloys", "vanadium"});

     /*
    Auto field maintenance unit
       Shielded
     */
        addModToData("fieldmaintenance", "shielded", new String[]{"turner", "jameson"}, 1, new String[]{"wornshieldemitters"});
        addModToData("fieldmaintenance", "shielded", new String[]{"turner", "jameson"}, 2, new String[]{"carbon", "shieldemitters"});
        addModToData("fieldmaintenance", "shielded", new String[]{"turner", "jameson"}, 3, new String[]{"carbon", "highdensitycomposites", "shieldemitters"});
        addModToData("fieldmaintenance", "shielded", new String[]{"jameson"}, 4, new String[]{"fedproprietarycomposites", "shieldingsensors", "vanadium"});

     /*
     Beam Laser
        Lightweight
         */
        addModToData("beamlaser", "light", new String[]{"dweller", "tarquin"}, 1, new String[]{"phosphorus"});
        addModToData("beamlaser", "light", new String[]{"dweller", "tarquin"}, 2, new String[]{"manganese", "salvagedalloys"});
        addModToData("beamlaser", "light", new String[]{"dweller", "tarquin"}, 3, new String[]{"conductiveceramics", "manganese", "salvagedalloys"});
        addModToData("beamlaser", "light", new String[]{"tarquin"}, 4, new String[]{"conductivecomponents", "phasealloys", "protolightalloys"});

     /*
     Beam Laser
        Long Range
         */
        addModToData("beamlaser", "long", new String[]{"dweller", "tarquin"}, 1, new String[]{"sulphur"});
        addModToData("beamlaser", "long", new String[]{"dweller", "tarquin"}, 2, new String[]{"consumerfirmware", "sulphur"});
        addModToData("beamlaser", "long", new String[]{"dweller", "tarquin"}, 3, new String[]{"focuscrystals", "consumerfirmware", "sulphur"});
        addModToData("beamlaser", "long", new String[]{"tarquin"}, 4, new String[]{"conductivepolymers", "focuscrystals", "consumerfirmware"});

     /*
     Beam Laser
        Short Range
         */
        addModToData("beamlaser", "short", new String[]{"dweller", "tarquin"}, 1, new String[]{"nickel"});
        addModToData("beamlaser", "short", new String[]{"dweller", "tarquin"}, 2, new String[]{"consumerfirmware", "nickel"});
        addModToData("beamlaser", "short", new String[]{"dweller", "tarquin"}, 3, new String[]{"electrochemicalarrays", "consumerfirmware", "nickel"});
        addModToData("beamlaser", "short", new String[]{"tarquin"}, 4, new String[]{"conductivepolymers", "electrochemicalarrays", "consumerfirmware"});
        addModToData("beamlaser", "short", new String[]{"tarquin"}, 5, new String[]{"biotechconductors", "configurablecomponents", "industrialfirmware"});

     /*
     Beam Laser
        Sturdy Mount
         */
        addModToData("beamlaser", "sturdy", new String[]{"dweller", "tarquin"}, 1, new String[]{"nickel"});
        addModToData("beamlaser", "sturdy", new String[]{"dweller", "tarquin"}, 2, new String[]{"shieldemitters", "nickel"});
        addModToData("beamlaser", "sturdy", new String[]{"dweller", "tarquin"}, 3, new String[]{"shieldemitters", "tungsten", "nickel"});
        addModToData("beamlaser", "sturdy", new String[]{"tarquin"}, 4, new String[]{"molybdenum", "tungsten", "zinc"});
        addModToData("beamlaser", "sturdy", new String[]{"tarquin"}, 5, new String[]{"highdensitycomposites", "molybdenum", "technetium"});

     /*
     Burst Laser
        Efficient Weapon
         */
        addModToData("burstlaser", "efficient", new String[]{"dweller", "tarquin"}, 1, new String[]{"sulphur"});
        addModToData("burstlaser", "efficient", new String[]{"dweller", "tarquin"}, 2, new String[]{"heatdispersionplate", "sulphur"});
        addModToData("burstlaser", "efficient", new String[]{"dweller", "tarquin"}, 3, new String[]{"chromium", "scrambledemissiondata", "heatexchangers"});
        addModToData("burstlaser", "efficient", new String[]{"tarquin"}, 4, new String[]{"heatvanes", "archivedemissiondata", "selenium"});
        addModToData("burstlaser", "efficient", new String[]{"tarquin"}, 5, new String[]{"protoheatradiators", "emissiondata", "cadmium"}); //TODO: Check again!

     /*
     Burst Laser
        Focused Weapon
         */
        addModToData("burstlaser", "focused", new String[]{"dweller", "tarquin"}, 1, new String[]{"iron"});
        addModToData("burstlaser", "focused", new String[]{"dweller", "tarquin"}, 2, new String[]{"conductivepolymers", "iron"});
        addModToData("burstlaser", "focused", new String[]{"dweller", "tarquin"}, 3, new String[]{"chromium", "conductiveceramics", "iron"});
        addModToData("burstlaser", "focused", new String[]{"tarquin"}, 4, new String[]{"heatvanes", "archivedemissiondata", "selenium"});
        addModToData("burstlaser", "focused", new String[]{"tarquin"}, 5, new String[]{"protoheatradiators", "emissiondata", "cadmium"}); //TODO: Check again!













    /*
    FSD Drive
    Range
     */
        addModToData("fsd", "range", new String[]{"farseer", "martuuk", "palin", "dekker"}, 1, new String[]{""});
        addModToData("fsd", "range", new String[]{"farseer", "martuuk", "palin", "dekker"}, 2, new String[]{""});
        addModToData("fsd", "range", new String[]{"farseer", "martuuk", "palin", "dekker"}, 3, new String[]{""});
        addModToData("fsd", "range", new String[]{"farseer", "martuuk"}, 4, new String[]{""});
        addModToData("fsd", "range", new String[]{"farseer", "martuuk"}, 5, new String[]{""});

    /*
    FSD Drive
    Faster Boot
     */
        addModToData("fsd", "boot", new String[]{"farseer", "martuuk", "palin", "dekker"}, 1, new String[]{""});
        addModToData("fsd", "boot", new String[]{"farseer", "martuuk", "palin", "dekker"}, 2, new String[]{""});
        addModToData("fsd", "boot", new String[]{"farseer", "martuuk", "palin", "dekker"}, 3, new String[]{""});
        addModToData("fsd", "boot", new String[]{"farseer", "martuuk"}, 4, new String[]{""});
        addModToData("fsd", "boot", new String[]{"farseer", "martuuk"}, 5, new String[]{""});

     /*
    FSD Drive
    Shielded
     */
        addModToData("fsd", "shielded", new String[]{"farseer", "martuuk", "palin", "dekker"}, 1, new String[]{""});
        addModToData("fsd", "shielded", new String[]{"farseer", "martuuk", "palin", "dekker"}, 2, new String[]{""});
        addModToData("fsd", "shielded", new String[]{"farseer", "martuuk", "palin", "dekker"}, 3, new String[]{""});
        addModToData("fsd", "shielded", new String[]{"farseer", "martuuk"}, 4, new String[]{""});
        addModToData("fsd", "shielded", new String[]{"farseer", "martuuk"}, 5, new String[]{""});

     /*
    Power Plant
    Shielded
     */
        addModToData("powerplant", "shielded", new String[]{"farseer", "qwent", "tani"}, 1, new String[]{""});
        addModToData("powerplant", "shielded", new String[]{"qwent", "tani"}, 2, new String[]{""});
        addModToData("powerplant", "shielded", new String[]{"qwent", "tani"}, 3, new String[]{""});
        addModToData("powerplant", "shielded", new String[]{"qwent", "tani"}, 4, new String[]{""});
        addModToData("powerplant", "shielded", new String[]{"tani"}, 5, new String[]{""});

     /*
    Power Plant
    Overcharged
     */
        addModToData("powerplant", "overcharged", new String[]{"farseer", "qwent", "tani"}, 1, new String[]{""});
        addModToData("powerplant", "overcharged", new String[]{"qwent", "tani"}, 2, new String[]{""});
        addModToData("powerplant", "overcharged", new String[]{"qwent", "tani"}, 3, new String[]{""});
        addModToData("powerplant", "overcharged", new String[]{"qwent", "tani"}, 4, new String[]{""});
        addModToData("powerplant", "overcharged", new String[]{"tani"}, 5, new String[]{""});

     /*
    Power Plant
    Low Emission
     */
        addModToData("powerplant", "lowemission", new String[]{"farseer", "qwent", "tani"}, 1, new String[]{""});
        addModToData("powerplant", "lowemission", new String[]{"qwent", "tani"}, 2, new String[]{""});
        addModToData("powerplant", "lowemission", new String[]{"qwent", "tani"}, 3, new String[]{""});




















    }

    public static void addModToData(String componentName, String modName, String[] engineerNames, int modTier, String[] materialArray){

        mods.add(new ModData(componentName, modName, engineerNames, modTier, materialArray));

    }


}
