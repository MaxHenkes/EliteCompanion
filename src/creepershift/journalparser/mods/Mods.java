package creepershift.journalparser.mods;

import creepershift.journalparser.mods.data.ComponentCategory;
import creepershift.journalparser.mods.data.ComponentComponent;
import creepershift.journalparser.mods.data.ComponentMod;
import creepershift.journalparser.mods.data.EngineerTier;

import java.util.ArrayList;

/**
 * EliteCompanion
 * Created by Max on 2/14/2017.
 */
public class Mods {

    public ModData ammo, armorPowerPlant, armorBlastRes, boosterBlastRes, chargePowerDist, cleanDrive, dirtyDrive, doubleShot, strengthDrive, efficient, engineFocusDist, lowPowerShield,
            expandedInterdictor, fsdBoot, focused, armorHeavyDuty, boosterHeavyDuty, magazine, highCapacityDist, fsdRange, armorKineticRes, boosterKineticRes, shieldKineticRes,
            lightweight, armorLightWeight, longRange, rangeInterdictor, lowEmissionPowerPlant, overchargedPowerPlant, overcharged, rapidCell, rapidfire, reinforced, shieldReinforced,
            boosterRes, shielded, fsdShielded, shortRange, specialCell, sturdy, sysDist, armorThermalRes, boosterThermalRes, shieldThermalRes, weapDist;


    public ComponentCategory weapons, internals, optionals, utility;

    public static ArrayList<ComponentCategory> componentCategories = new ArrayList();

    public void initMods() {


        armorPowerPlant = new ModData("armorPowerPlant", 5);
        armorPowerPlant.setRecipe(1, new String[]{"wornshieldemitters"});
        armorPowerPlant.setRecipe(2, new String[]{"carbon", "shieldemitters"});
        armorPowerPlant.setRecipe(3, new String[]{"carbon", "highdensitycomposites", "shieldemitters"});
        armorPowerPlant.setRecipe(4, new String[]{"fedproprietarycomposites", "shieldingsensors", "vanadium"});
        armorPowerPlant.setRecipe(5, new String[]{"compoundshielding", "fedcorecomposites", "tungsten"});


        armorBlastRes = new ModData("armorBlastRes", 3);
        armorBlastRes.setRecipe(1, new String[]{"nickel"});
        armorBlastRes.setRecipe(2, new String[]{"carbon", "zinc"});
        armorBlastRes.setRecipe(3, new String[]{"salvagedalloys", "vanadium", "zirconium"});


        boosterBlastRes = new ModData("boosterBlastRes", 3);
        boosterBlastRes.setRecipe(1, new String[]{"iron"});
        boosterBlastRes.setRecipe(2, new String[]{"conductivecomponents", "iron"});
        boosterBlastRes.setRecipe(3, new String[]{"conductivecomponents", "focuscrystals", "iron"});


        chargePowerDist = new ModData("chargePowerDist", 5);
        chargePowerDist.setRecipe(1, new String[]{"legacyfirmware"});
        chargePowerDist.setRecipe(2, new String[]{"chemicalprocessors", "legacyfirmware"});
        chargePowerDist.setRecipe(3, new String[]{"chemicaldistillery", "gridresistors", "consumerfirmware"});
        chargePowerDist.setRecipe(4, new String[]{"chemicalmanipulators", "industrialfirmware", "hybridcapacitors"});
        chargePowerDist.setRecipe(5, new String[]{"chemicalmanipulators", "industrialfirmware", "exquisitefocuscrystals"});


        cleanDrive = new ModData("cleanDrive", 5);
        cleanDrive.setRecipe(1, new String[]{"sulphur"});
        cleanDrive.setRecipe(2, new String[]{"conductivecomponents", "legacyfirmware"});
        cleanDrive.setRecipe(3, new String[]{"conductivecomponents", "legacyfirmware", "emissiondata"});
        cleanDrive.setRecipe(4, new String[]{"conductiveceramics", "decodedemissiondata", "consumerfirmware"});
        cleanDrive.setRecipe(5, new String[]{"compactemissionsdata", "conductiveceramics", "tin"});

        dirtyDrive = new ModData("dirtyDrive", 5);
        dirtyDrive.setRecipe(1, new String[]{"legacyfirmware"});
        dirtyDrive.setRecipe(2, new String[]{"mechanicalequipment", "legacyfirmware"});
        dirtyDrive.setRecipe(3, new String[]{"chromium", "mechanicalcomponents", "legacyfirmware"});
        dirtyDrive.setRecipe(4, new String[]{"configurablecomponents", "consumerfirmware", "selenium"});
        dirtyDrive.setRecipe(5, new String[]{"cadmium", "industrialfirmware", "pharmaceuticalisolators"});

        doubleShot = new ModData("doubleShot", 5);
        doubleShot.setRecipe(1, new String[]{"carbon"});
        doubleShot.setRecipe(2, new String[]{"carbon", "mechanicalequipment"});
        doubleShot.setRecipe(3, new String[]{"carbon", "mechanicalequipment", "industrialfirmware"});
        doubleShot.setRecipe(4, new String[]{"mechanicalcomponents", "securityfirmware", "vanadium"});
        doubleShot.setRecipe(5, new String[]{""});


        strengthDrive = new ModData("strengthDrive", 5);
        strengthDrive.setRecipe(1, new String[]{"carbon"});
        strengthDrive.setRecipe(2, new String[]{"heatconductionwiring", "vanadium"});
        strengthDrive.setRecipe(3, new String[]{"heatconductionwiring", "vanadium", "shieldingsensors"});
        strengthDrive.setRecipe(4, new String[]{"compoundshielding", "heatdispersionplate", "highdensitycomposites"});
        strengthDrive.setRecipe(5, new String[]{"heatexchangers", "imperialshielding", "fedproprietarycomposites"});

        efficient = new ModData("efficient", 5);
        efficient.setRecipe(1, new String[]{"sulphur"});
        efficient.setRecipe(2, new String[]{"heatdispersionplate", "sulphur"});
        efficient.setRecipe(3, new String[]{"chromium", "scrambledemissiondata", "heatexchangers"});
        efficient.setRecipe(4, new String[]{"heatvanes", "archivedemissiondata", "selenium"});
        efficient.setRecipe(5, new String[]{"cadmium", "protoheatradiators", "emissiondata"});

        engineFocusDist = new ModData("engineFocusDist", 3);
        engineFocusDist.setRecipe(1, new String[]{"sulphur"});
        engineFocusDist.setRecipe(2, new String[]{"conductivecomponents", "sulphur"});
        engineFocusDist.setRecipe(3, new String[]{"bulkscandata", "chromium", "electrochemicalarrays"});

        lowPowerShield = new ModData("lowPowerShield", 5);
        lowPowerShield.setRecipe(1, new String[]{"shieldcyclerecordings"});
        lowPowerShield.setRecipe(2, new String[]{"shieldcyclerecordings", "germanium"});
        lowPowerShield.setRecipe(3, new String[]{"shieldcyclerecordings", "germanium", "precipitatedalloys"});
        lowPowerShield.setRecipe(4, new String[]{"shieldsoakanalysis", "niobium", "thermicalloys"});
        lowPowerShield.setRecipe(5, new String[]{"militarygradealloys", "tin", "shielddensityreports"});


        expandedInterdictor = new ModData("expandedInterdictor", 5);
        expandedInterdictor.setRecipe(1, new String[]{"mechanicalscrap"});
        expandedInterdictor.setRecipe(2, new String[]{"mechanicalequipment", "encryptedfiles"});
        expandedInterdictor.setRecipe(3, new String[]{"gridresistors", "mechanicalcomponents", "encryptioncodes"});
        expandedInterdictor.setRecipe(4, new String[]{"encodedscandata", "mechanicalequipment", "wakesolutions"});
        expandedInterdictor.setRecipe(5, new String[]{""});

        fsdBoot = new ModData("fsdBoot", 5);
        fsdBoot.setRecipe(1, new String[]{"gridresistors"});
        fsdBoot.setRecipe(2, new String[]{"chromium", "gridresistors"});
        fsdBoot.setRecipe(3, new String[]{"gridresistors", "heatdispersionplate", "selenium"});
        fsdBoot.setRecipe(4, new String[]{"cadmium", "heatexchangers", "hybridcapacitors"});
        fsdBoot.setRecipe(5, new String[]{"electrochemicalarrays", "heatvanes", "tellurium"});

        focused = new ModData("focused", 5);
        focused.setRecipe(1, new String[]{"iron"});
        focused.setRecipe(2, new String[]{"conductivecomponents", "iron"});
        focused.setRecipe(3, new String[]{"chromium", "conductiveceramics", "iron"});
        focused.setRecipe(4, new String[]{"focuscrystals", "germanium", "polymercapacitors"});
        focused.setRecipe(5, new String[]{"militarysupercapacitors", "niobium", "refinedfocuscrystals"});

        armorHeavyDuty = new ModData("armorHeavyDuty", 5);
        armorHeavyDuty.setRecipe(1, new String[]{"carbon"});
        armorHeavyDuty.setRecipe(2, new String[]{"carbon", "shieldemitters"});
        armorHeavyDuty.setRecipe(3, new String[]{"carbon", "highdensitycomposites", "shieldemitters"});
        armorHeavyDuty.setRecipe(4, new String[]{"fedproprietarycomposites", "shieldingsensors", "vanadium"});
        armorHeavyDuty.setRecipe(5, new String[]{"compoundshielding", "fedcorecomposites", "tungsten"});

        boosterHeavyDuty = new ModData("boosterHeavyDuty", 5);
        boosterHeavyDuty.setRecipe(1, new String[]{"gridresistors"});
        boosterHeavyDuty.setRecipe(2, new String[]{"shieldcyclerecordings", "hybridcapacitors"});
        boosterHeavyDuty.setRecipe(3, new String[]{"shieldcyclerecordings", "hybridcapacitors", "niobium"});
        boosterHeavyDuty.setRecipe(4, new String[]{"electrochemicalarrays", "shieldsoakanalysis", "tin"});
        boosterHeavyDuty.setRecipe(5, new String[]{"antimony", "polymercapacitors", "shielddensityreports"});

        magazine = new ModData("capacity", 5);
        magazine.setRecipe(1, new String[]{"mechanicalscrap"});
        magazine.setRecipe(2, new String[]{"mechanicalscrap", "vanadium"});
        magazine.setRecipe(3, new String[]{"mechanicalscrap", "niobium", "vanadium"});
        magazine.setRecipe(4, new String[]{"highdensitycomposites", "mechanicalequipment", "tin"});
        magazine.setRecipe(5, new String[]{"mechanicalcomponents", "militarysupercapacitors", "fedproprietarycomposites"});

        highCapacityDist = new ModData("highCapacityDist", 5);
        highCapacityDist.setRecipe(1, new String[]{"sulphur"});
        highCapacityDist.setRecipe(2, new String[]{"chromium", "legacyfirmware"});
        highCapacityDist.setRecipe(3, new String[]{"chromium", "highdensitycomposites", "legacyfirmware"});
        highCapacityDist.setRecipe(4, new String[]{"consumerfirmware", "fedproprietarycomposites", "selenium"});
        highCapacityDist.setRecipe(5, new String[]{"industrialfirmware", "militarysupercapacitors", "fedproprietarycomposites"});

        fsdRange = new ModData("fsdRange", 5);
        fsdRange.setRecipe(1, new String[]{"disruptedwakeechoes"});
        fsdRange.setRecipe(2, new String[]{"disruptedwakeechoes", "chemicalprocessors"});
        fsdRange.setRecipe(3, new String[]{"chemicalprocessors", "phosphorus", "wakesolutions"});
        fsdRange.setRecipe(4, new String[]{"chemicaldistillery", "hyperspacetrajectories", "manganese"});
        fsdRange.setRecipe(5, new String[]{"arsenic", "chemicalmanipulators", "dataminedwake"});


        armorKineticRes = new ModData("armorKineticRes", 3);
        armorKineticRes.setRecipe(1, new String[]{"nickel"});
        armorKineticRes.setRecipe(2, new String[]{"nickel", "vanadium"});
        armorKineticRes.setRecipe(3, new String[]{"highdensitycomposites", "salvagedalloys", "vanadium"});

        boosterKineticRes = new ModData("boosterKineticRes", 3);
        boosterKineticRes.setRecipe(1, new String[]{"iron"});
        boosterKineticRes.setRecipe(2, new String[]{"germanium", "gridresistors"});
        boosterKineticRes.setRecipe(3, new String[]{"focuscrystals", "hybridcapacitors", "salvagedalloys"});


        shieldKineticRes = new ModData("shieldKineticRes", 5);
        shieldKineticRes.setRecipe(1, new String[]{"shieldcyclerecordings"});
        shieldKineticRes.setRecipe(2, new String[]{"shieldcyclerecordings", "consumerfirmware"});
        shieldKineticRes.setRecipe(3, new String[]{"shieldcyclerecordings", "consumerfirmware", "selenium"});
        shieldKineticRes.setRecipe(4, new String[]{"focuscrystals", "shieldsoakanalysis", "mercury"});
        shieldKineticRes.setRecipe(5, new String[]{"refinedfocuscrystals", "ruthenium", "shielddensityreports"});


        lightweight = new ModData("lightweight", 5);
        lightweight.setRecipe(1, new String[]{"phosphorus"});
        lightweight.setRecipe(2, new String[]{"manganese", "salvagedalloys"});
        lightweight.setRecipe(3, new String[]{"conductiveceramics", "manganese", "salvagedalloys"});
        lightweight.setRecipe(4, new String[]{"conductivecomponents", "phasealloys", "protolightalloys"});
        lightweight.setRecipe(5, new String[]{"conductiveceramics", "protolightalloys", "protoradiolicalloys"});

        armorLightWeight = new ModData("armorLightWeight", 5);
        armorLightWeight.setRecipe(1, new String[]{"iron"});
        armorLightWeight.setRecipe(2, new String[]{"conductivecomponents", "iron"});
        armorLightWeight.setRecipe(3, new String[]{"conductivecomponents", "highdensitycomposites", "iron"});
        armorLightWeight.setRecipe(4, new String[]{"conductiveceramics", "germanium", "fedproprietarycomposites"});
        armorLightWeight.setRecipe(5, new String[]{"conductiveceramics", "militarygradealloys", "tin"});

        longRange = new ModData("longRange", 5);
        longRange.setRecipe(1, new String[]{"sulphur"});
        longRange.setRecipe(2, new String[]{"consumerfirmware", "sulphur"});
        longRange.setRecipe(3, new String[]{"focuscrystals", "consumerfirmware", "iron"});
        longRange.setRecipe(4, new String[]{"conductivepolymers", "focuscrystals", "consumerfirmware"});
        longRange.setRecipe(5, new String[]{"biotechconductors", "industrialfirmware", "thermicalloys"});


        rangeInterdictor = new ModData("rangeInterdictor", 3);
        rangeInterdictor.setRecipe(1, new String[]{"encryptedfiles"});
        rangeInterdictor.setRecipe(2, new String[]{"disruptedwakeechoes", "encryptioncodes"});
        rangeInterdictor.setRecipe(3, new String[]{"bulkscandata", "fsdtelemetry", "symmetrickeys"});

        lowEmissionPowerPlant = new ModData("lowEmissionPowerPlant", 3);
        lowEmissionPowerPlant.setRecipe(1, new String[]{"iron"});
        lowEmissionPowerPlant.setRecipe(2, new String[]{"iron", "archivedemissiondata"});
        lowEmissionPowerPlant.setRecipe(3, new String[]{"heatexchangers", "iron", "archivedemissiondata"});


        overchargedPowerPlant = new ModData("overchargedPowerPlant", 5);
        overchargedPowerPlant.setRecipe(1, new String[]{"sulphur"});
        overchargedPowerPlant.setRecipe(2, new String[]{"conductivecomponents", "heatconductionwiring"});
        overchargedPowerPlant.setRecipe(3, new String[]{"conductivecomponents", "heatconductionwiring", "selenium"});
        overchargedPowerPlant.setRecipe(4, new String[]{"cadmium", "conductiveceramics", "heatdispersionplate"});
        overchargedPowerPlant.setRecipe(5, new String[]{"chemicalmanipulators", "conductiveceramics", "tellurium"});


        overcharged = new ModData("overcharged", 5);
        overcharged.setRecipe(1, new String[]{"nickel"});
        overcharged.setRecipe(2, new String[]{"conductivecomponents", "nickel"});
        overcharged.setRecipe(3, new String[]{"conductivecomponents", "electrochemicalarrays", "nickel"});
        overcharged.setRecipe(4, new String[]{"conductiveceramics", "polymercapacitors", "zinc"});
        overcharged.setRecipe(5, new String[]{"conductivepolymers", "embeddedfirmware", "zirconium"});

        rapidCell = new ModData("rapidCell", 3);
        rapidCell.setRecipe(1, new String[]{"sulphur"});
        rapidCell.setRecipe(2, new String[]{"chromium", "gridresistors"});
        rapidCell.setRecipe(3, new String[]{"hybridcapacitors", "precipitatedalloys", "sulphur"});

        rapidfire = new ModData("rapidfire", 5);
        rapidfire.setRecipe(1, new String[]{"mechanicalscrap"});
        rapidfire.setRecipe(2, new String[]{"heatdispersionplate", "mechanicalscrap"});
        rapidfire.setRecipe(3, new String[]{"mechanicalequipment", "precipitatedalloys", "legacyfirmware"});
        rapidfire.setRecipe(4, new String[]{"mechanicalcomponents", "consumerfirmware", "thermicalloys"});
        rapidfire.setRecipe(5, new String[]{"configurablecomponents", "precipitatedalloys", "technetium"});

        reinforced = new ModData("reinforced", 5);
        reinforced.setRecipe(1, new String[]{"nickel"});
        reinforced.setRecipe(2, new String[]{"nickel", "shieldemitters"});
        reinforced.setRecipe(3, new String[]{"nickel", "shieldemitters", "tungsten"});
        reinforced.setRecipe(4, new String[]{"molybdenum", "tungsten", "zinc"});
        reinforced.setRecipe(5, new String[]{"highdensitycomposites", "molybdenum", "technetium"});


        shieldReinforced = new ModData("shieldReinforced", 5);
        shieldReinforced.setRecipe(1, new String[]{"phosphorus"});
        shieldReinforced.setRecipe(2, new String[]{"conductivecomponents", "phosphorus"});
        shieldReinforced.setRecipe(3, new String[]{"conductivecomponents", "mechanicalcomponents", "phosphorus"});
        shieldReinforced.setRecipe(4, new String[]{"conductiveceramics", "configurablecomponents", "manganese"});
        shieldReinforced.setRecipe(5, new String[]{"arsenic", "conductivepolymers", "improvisedcomponents"});

        boosterRes = new ModData("boosterRes", 5);
        boosterRes.setRecipe(1, new String[]{"phosphorus"});
        boosterRes.setRecipe(2, new String[]{"conductivecomponents", "phosphorus"});
        boosterRes.setRecipe(3, new String[]{"conductivecomponents", "focuscrystals", "phosphorus"});
        boosterRes.setRecipe(4, new String[]{"conductiveceramics", "manganese", "refinedfocuscrystals"});
        boosterRes.setRecipe(5, new String[]{"conductiveceramics", "imperialshielding", "refinedfocuscrystals"});


        shielded = new ModData("shielded", 5);
        shielded.setRecipe(1, new String[]{"shieldemitters"});
        shielded.setRecipe(2, new String[]{"carbon", "shieldemitters"});
        shielded.setRecipe(3, new String[]{"carbon", "highdensitycomposites", "shieldemitters"});
        shielded.setRecipe(4, new String[]{"fedproprietarycomposites", "shieldingsensors", "vanadium"});
        shielded.setRecipe(5, new String[]{"compoundshielding", "fedcorecomposites", "tungsten"});


        fsdShielded = new ModData("fsdShielded", 5);
        fsdShielded.setRecipe(1, new String[]{"nickel"});
        fsdShielded.setRecipe(2, new String[]{"carbon", "shieldemitters"});
        fsdShielded.setRecipe(3, new String[]{"carbon", "shieldingsensors", "zinc"});
        fsdShielded.setRecipe(4, new String[]{"compoundshielding", "highdensitycomposites", "vanadium"});
        fsdShielded.setRecipe(5, new String[]{"imperialshielding", "fedproprietarycomposites", "tungsten"});

        shortRange = new ModData("shortRange", 5);
        shortRange.setRecipe(1, new String[]{"nickel"});
        shortRange.setRecipe(2, new String[]{"consumerfirmware", "nickel"});
        shortRange.setRecipe(3, new String[]{"electrochemicalarrays", "consumerfirmware", "nickel"});
        shortRange.setRecipe(4, new String[]{"conductivepolymers", "electrochemicalarrays", "consumerfirmware"});
        shortRange.setRecipe(5, new String[]{"biotechconductors", "configurablecomponents", "industrialfirmware"});

        specialCell = new ModData("specialCell", 3);
        specialCell.setRecipe(1, new String[]{"legacyfirmware"});
        specialCell.setRecipe(2, new String[]{"conductivecomponents", "legacyfirmware"});
        specialCell.setRecipe(3, new String[]{"conductivecomponents", "industrialfirmware", "scrambledemissiondata"});


        sturdy = new ModData("sturdy", 5);
        sturdy.setRecipe(1, new String[]{"nickel"});
        sturdy.setRecipe(2, new String[]{"nickel", "shieldemitters"});
        sturdy.setRecipe(3, new String[]{"nickel", "shieldemitters", "tungsten"});
        sturdy.setRecipe(4, new String[]{"molybdenum", "tungsten", "zinc"});
        sturdy.setRecipe(5, new String[]{"highdensitycomposites", "molybdenum", "technetium"});

        sysDist = new ModData("sysDist", 3);
        sysDist.setRecipe(1, new String[]{"sulphur"});
        sysDist.setRecipe(2, new String[]{"conductivecomponents", "sulphur"});
        sysDist.setRecipe(3, new String[]{"bulkscandata", "chromium", "electrochemicalarrays"});

        armorThermalRes = new ModData("armorThermalRes", 3);
        armorThermalRes.setRecipe(1, new String[]{"heatconductionwiring"});
        armorThermalRes.setRecipe(2, new String[]{"heatdispersionplate", "nickel"});
        armorThermalRes.setRecipe(3, new String[]{"heatexchangers", "salvagedalloys", "vanadium"});

        boosterThermalRes = new ModData("boosterThermalRes", 3);
        boosterThermalRes.setRecipe(1, new String[]{"iron"});
        boosterThermalRes.setRecipe(2, new String[]{"germanium", "heatconductionwiring"});
        boosterThermalRes.setRecipe(3, new String[]{"focuscrystals", "heatconductionwiring", "heatdispersionplate"});

        shieldThermalRes = new ModData("shieldThermalRes", 5);
        shieldThermalRes.setRecipe(1, new String[]{"shieldcyclerecordings"});
        shieldThermalRes.setRecipe(2, new String[]{"shieldcyclerecordings", "germanium"});
        shieldThermalRes.setRecipe(3, new String[]{"shieldcyclerecordings", "germanium", "selenium"});
        shieldThermalRes.setRecipe(4, new String[]{"focuscrystals", "shieldsoakanalysis", "mercury"});
        shieldThermalRes.setRecipe(5, new String[]{"refinedfocuscrystals", "ruthenium", "shielddensityreports"});

        weapDist = new ModData("weapDist", 3);
        weapDist.setRecipe(1, new String[]{"sulphur"});
        weapDist.setRecipe(2, new String[]{"conductivecomponents", "sulphur"});
        weapDist.setRecipe(3, new String[]{"bulkscandata", "hybridcapacitors", "selenium"});


        weapons = new ComponentCategory("weapons");
        internals = new ComponentCategory("internals");
        optionals = new ComponentCategory("optionals");
        utility = new ComponentCategory("utility");


        //ARMOR + HULL
        ComponentComponent armor = new ComponentComponent("armor");
        EngineerTier armorEngineers = new EngineerTier(5);
        armorEngineers.addTiers("1>1", new String[]{"ryder", "jean"});
        armorEngineers.addTiers("2>3", "jean");
        armorEngineers.addTiers("4>5", "jean");

        armor.addComponent(new ComponentMod("armor", armorBlastRes, 3, armorEngineers));
        armor.addComponent(new ComponentMod("armor", armorKineticRes, 3, armorEngineers));
        armor.addComponent(new ComponentMod("armor", armorLightWeight, 3, armorEngineers));
        armor.addComponent(new ComponentMod("armor", armorThermalRes, 3, armorEngineers));
        armor.addComponent(new ComponentMod("armor", armorHeavyDuty, 5, armorEngineers));

        ComponentComponent hullReinforcement = new ComponentComponent("hullReinforcement");
        hullReinforcement.addComponent(new ComponentMod("hullReinforcement", armorBlastRes, 3, armorEngineers));
        hullReinforcement.addComponent(new ComponentMod("hullReinforcement", armorHeavyDuty, 5, armorEngineers));
        hullReinforcement.addComponent(new ComponentMod("hullReinforcement", armorKineticRes, 3, armorEngineers));
        hullReinforcement.addComponent(new ComponentMod("hullReinforcement", armorLightWeight, 5, armorEngineers));

        optionals.addToCategory(hullReinforcement);
        internals.addToCategory(armor);


        //PowerPlant
        ComponentComponent powerPlant = new ComponentComponent("powerPlant");
        EngineerTier powerPlantEngineers = new EngineerTier(5);
        powerPlantEngineers.addTiers("1>1", new String[]{"farseer", "qwent", "tani"});
        powerPlantEngineers.addTiers("2>4", new String[]{"qwent", "tani"});
        powerPlantEngineers.addTiers("5>5", "tani");

        powerPlant.addComponent(new ComponentMod("powerPlant", armorPowerPlant, 5, powerPlantEngineers));

        internals.addToCategory(powerPlant);


        //SHIELDBOOSTER
        ComponentComponent shieldBooster = new ComponentComponent("shieldBooster");
        EngineerTier shieldBoosterEngineers = new EngineerTier(5);
        shieldBoosterEngineers.addTiers("1>1", new String[]{"farseer", "cheung", "vatermann"});
        shieldBoosterEngineers.addTiers("2>3", new String[]{"cheung", "vatermann"});
        shieldBoosterEngineers.addTiers("4>5", new String[]{"vatermann"});

        shieldBooster.addComponent(new ComponentMod("shieldBooster", boosterBlastRes, 3, shieldBoosterEngineers));
        shieldBooster.addComponent(new ComponentMod("shieldBooster", boosterHeavyDuty, 5, shieldBoosterEngineers));
        shieldBooster.addComponent(new ComponentMod("shieldBooster", boosterKineticRes, 3, shieldBoosterEngineers));

        utility.addToCategory(shieldBooster);


        //POWER DISTRIBUTOR
        ComponentComponent powerDist = new ComponentComponent("powerDist");
        EngineerTier powerDistEngineers = new EngineerTier(5);
        powerDistEngineers.addTiers("1>3", new String[]{"dweller", "qwent", "tani"});
        powerDistEngineers.addTiers("4>5", "dweller");

        powerDist.addComponent(new ComponentMod("powerDist", chargePowerDist, 5, powerDistEngineers));
        powerDist.addComponent(new ComponentMod("powerDist", engineFocusDist, 3, powerDistEngineers));
        powerDist.addComponent(new ComponentMod("powerDist", highCapacityDist, 5, powerDistEngineers));

        internals.addToCategory(powerDist);

        //THRUSTERS
        ComponentComponent thrusters = new ComponentComponent("thrusters");
        EngineerTier thrusterEngineers = new EngineerTier(5);
        thrusterEngineers.addTiers("1>2", new String[]{"farseer", "martuuk", "palin"});
        thrusterEngineers.addTiers("3>3", new String[]{"farseer", "palin"});
        thrusterEngineers.addTiers("4>5", "palin");

        thrusters.addComponent(new ComponentMod("thrusters", cleanDrive, 5, thrusterEngineers));
        thrusters.addComponent(new ComponentMod("thrusters", dirtyDrive, 5, thrusterEngineers));
        thrusters.addComponent(new ComponentMod("thrusters", strengthDrive, 5, thrusterEngineers));

        internals.addToCategory(thrusters);


        //FRAG CANNON
        ComponentComponent fragmentCannon = new ComponentComponent("fragmentCannon");
        EngineerTier fragCannonTier = new EngineerTier(5);
        fragCannonTier.addTiers("1>3", new String[]{"blaster", "nemo"});
        fragCannonTier.addTiers("4>5", "nemo");

        fragmentCannon.addComponent(new ComponentMod("fragmentCannon", doubleShot, 5, fragCannonTier));
        fragmentCannon.addComponent(new ComponentMod("fragmentCannon", efficient, 5, fragCannonTier));
        fragmentCannon.addComponent(new ComponentMod("fragmentCannon", magazine, 5, fragCannonTier));

        weapons.addToCategory(fragmentCannon);

        //BURST LASER
        ComponentComponent burstLaser = new ComponentComponent("burstlaser");
        EngineerTier burstLaserTier = new EngineerTier(5);
        burstLaserTier.addTiers("1>3", new String[]{"dweller", "tarquin"});
        burstLaserTier.addTiers("4>5", "tarquin");

        burstLaser.addComponent(new ComponentMod("burstlaser", efficient, 5, burstLaserTier));
        burstLaser.addComponent(new ComponentMod("burstlaser", focused, 5, burstLaserTier));

        weapons.addToCategory(burstLaser);


        //CANNONS
        ComponentComponent cannon = new ComponentComponent("cannon");
        EngineerTier cannonTiers = new EngineerTier(5);
        cannonTiers.addTiers("1>2", new String[]{"blaster", "sarge"});
        cannonTiers.addTiers("3>5", "sarge");

        cannon.addComponent(new ComponentMod("cannon", efficient, 5, cannonTiers));
        cannon.addComponent(new ComponentMod("cannon", magazine, 5, cannonTiers));

        weapons.addToCategory(cannon);

        //MULTICANNON
        ComponentComponent multicannon = new ComponentComponent("multicannon");
        EngineerTier multicannonTier = new EngineerTier(5);
        multicannonTier.addTiers("1>3", new String[]{"blaster", "nemo"});
        multicannonTier.addTiers("4>5", new String[]{"blaster"});

        multicannon.addComponent(new ComponentMod("multicannon", efficient, 5, multicannonTier));
        multicannon.addComponent(new ComponentMod("multicannon", magazine, 5, multicannonTier));

        weapons.addToCategory(multicannon);

        //PLASMA
        ComponentComponent plasma = new ComponentComponent("plasma");
        EngineerTier plasmaTier = new EngineerTier(5);
        plasmaTier.addTiers("1>2", new String[]{"nemo", "turner"});
        plasmaTier.addTiers("3>5", "turner");

        plasma.addComponent(new ComponentMod("plasma", efficient, 5, plasmaTier));
        plasma.addComponent(new ComponentMod("plasma", focused, 5, plasmaTier));

        weapons.addToCategory(plasma);

        //PULSELASER
        ComponentComponent pulseLaser = new ComponentComponent("pulselaser");
        EngineerTier pulseLaserTiers = new EngineerTier(5);
        pulseLaserTiers.addTiers("1>4", new String[]{"dweller", "tarquin"});
        pulseLaserTiers.addTiers("5>5", "tarquin");

        pulseLaser.addComponent(new ComponentMod("pulselaser", efficient, 5, pulseLaserTiers));
        pulseLaser.addComponent(new ComponentMod("pulselaser", focused, 5, pulseLaserTiers));

        weapons.addToCategory(pulseLaser);


        //SHIELD
        ComponentComponent shield = new ComponentComponent("shield");
        EngineerTier shieldTiers = new EngineerTier(5);
        shieldTiers.addTiers("1>3", new String[]{"martuuk", "cheung", "vatermann"});
        shieldTiers.addTiers("4>5", "cheung");

        shield.addComponent(new ComponentMod("shield", lowPowerShield, 5, shieldTiers));
        shield.addComponent(new ComponentMod("shield", shieldKineticRes, 5, shieldTiers));

        optionals.addToCategory(shield);


        //FSD INTERDICTOR
        ComponentComponent fsdInterdictor = new ComponentComponent("fsdInterdictor");
        EngineerTier fsdInterdictorTier = new EngineerTier(5);
        fsdInterdictorTier.addTiers("1>1", new String[]{"farseer", "dekker", "fortune"});
        fsdInterdictorTier.addTiers("2>3", new String[]{"dekker", "fortune"});
        fsdInterdictorTier.addTiers("4>5", "dekker");

        fsdInterdictor.addComponent(new ComponentMod("fsdInterdictor", expandedInterdictor, 5, fsdInterdictorTier));

        optionals.addToCategory(fsdInterdictor);


        //FRAMESHIFTDRIVE
        ComponentComponent fsd = new ComponentComponent("fsd");
        EngineerTier fsdTiers = new EngineerTier(5);
        fsdTiers.addTiers("1>3", new String[]{"farseer", "martuuk", "palin", "dekker"});
        fsdTiers.addTiers("4>5", new String[]{"farseer", "martuuk"});

        fsd.addComponent(new ComponentMod("fsd", fsdBoot, 5, fsdTiers));
        fsd.addComponent(new ComponentMod("fsd", fsdRange, 5, fsdTiers));

        internals.addToCategory(fsd);

        //MINE LAUNCHER
        ComponentComponent mineLauncher = new ComponentComponent("mineLauncher");
        EngineerTier mineTiers = new EngineerTier(5);
        mineTiers.addTiers("1>3", new String[]{"ryder", "ishmaak"});
        mineTiers.addTiers("4>5", "ishmaak");

        mineLauncher.addComponent(new ComponentMod("mineLauncher", magazine, 5, mineTiers));

        weapons.addToCategory(mineLauncher);


        //missiles
        ComponentComponent missiles = new ComponentComponent("missiles");
        EngineerTier missileTiers = new EngineerTier(5);
        missileTiers.addTiers("1>3", new String[]{"ryder", "ishmaak"});
        missileTiers.addTiers("4>5", "ishmaak");

        missiles.addComponent(new ComponentMod("missiles", magazine, 5, missileTiers));


        weapons.addToCategory(missiles);


        //RAILGUN

        ComponentComponent railgun = new ComponentComponent("railgun");
        EngineerTier railgunTiers = new EngineerTier(5);
        railgunTiers.addTiers("1>3", new String[]{"blaster", "sarge"});
        railgunTiers.addTiers("4>5", "blaster");


        railgun.addComponent(new ComponentMod("railgun", magazine, 5, railgunTiers));

        weapons.addToCategory(railgun);


        //CHAFF
        ComponentComponent chaff = new ComponentComponent("chaff");
        EngineerTier chaffTiers = new EngineerTier(5);
        chaffTiers.addTiers("1>5", "tah");

        chaff.addComponent(new ComponentMod("chaff", lightweight, 5, chaffTiers));
        utility.addToCategory(chaff);

        //COLLECTORLIMPET
        ComponentComponent collectorLimpet = new ComponentComponent("collectorLimpet");
        EngineerTier collectorLimpetTiers = new EngineerTier(5);
        collectorLimpetTiers.addTiers("1>4", new String[]{"fortune", "sarge", "tah"});
        collectorLimpetTiers.addTiers("5>5", new String[]{"fortune", "sarge"});

        collectorLimpet.addComponent(new ComponentMod("collectorLimpet", lightweight, 5, collectorLimpetTiers));

        optionals.addToCategory(collectorLimpet);


        //ELECTRONIC COUNTER MEASURE
        ComponentComponent electronicCounter = new ComponentComponent("electronicCounter");
        EngineerTier electronicCounterTiers = new EngineerTier(5);
        electronicCounterTiers.addTiers("1>5", "tah");

        electronicCounter.addComponent(new ComponentMod("electronicCounter", lightweight, 5, electronicCounterTiers));

        utility.addToCategory(electronicCounter);


        //FSD WAKE SCANNER
        ComponentComponent fsdWakeScanner = new ComponentComponent("fsdWakeScanner");
        EngineerTier wakeScannerTier = new EngineerTier(5);
        wakeScannerTier.addTiers("1>3", new String[]{"fortune", "turner", "jameson"});
        wakeScannerTier.addTiers("4>5", "fortune");

        fsdWakeScanner.addComponent(new ComponentMod("fsdWakeScanner", lightweight, 5, wakeScannerTier));

        utility.addToCategory(fsdWakeScanner);

        //FUEL LIMPET
        ComponentComponent fuelLimpet = new ComponentComponent("fuelLimpet");
        EngineerTier fuelLimpetTier = new EngineerTier(5);
        fuelLimpetTier.addTiers("1>4", new String[]{"fortune", "sarge", "tah"});
        fuelLimpetTier.addTiers("5>5", new String[]{"fortune", "sarge"});

        fuelLimpet.addComponent(new ComponentMod("fuelLimpet", lightweight, 5, fuelLimpetTier));

        optionals.addToCategory(fuelLimpet);


        //HATCH BREAKER LIMPET
        ComponentComponent hatchLimpet = new ComponentComponent("hatchLimpet");
        EngineerTier hatchLimpetTiers = new EngineerTier(5);
        hatchLimpetTiers.addTiers("1>4", new String[]{"fortune", "sarge", "tah"});
        hatchLimpetTiers.addTiers("5>5", new String[]{"fortune", "sarge"});

        hatchLimpet.addComponent(new ComponentMod("hatchLimpet", lightweight, 5, hatchLimpetTiers));

        optionals.addToCategory(hatchLimpet);


        //HEAT SINK LAUNCHER
        ComponentComponent heatsink = new ComponentComponent("heatsink");
        EngineerTier heatsinkTiers = new EngineerTier(5);
        heatsinkTiers.addTiers("1>5", "tah");

        heatsink.addComponent(new ComponentMod("heatsink", lightweight, 5, heatsinkTiers));

        utility.addToCategory(heatsink);


        //KILL WARRANT SCANNER
        ComponentComponent kws = new ComponentComponent("kws");
        EngineerTier kwsTiers = new EngineerTier(5);
        kwsTiers.addTiers("1>3", new String[]{"fortune", "turner", "jameson"});
        kwsTiers.addTiers("4>5", "fortune");

        kws.addComponent(new ComponentMod("kws", lightweight, 5, kwsTiers));

        utility.addToCategory(kws);


        //LIFE SUPPORT
        ComponentComponent lifesupport = new ComponentComponent("lifesupport");
        EngineerTier lifesupportTiers = new EngineerTier(4);
        lifesupportTiers.addTiers("1>3", new String[]{"turner", "jameson"});
        lifesupportTiers.addTiers("4>4", "jameson");

        lifesupport.addComponent(new ComponentMod("lifesupport", lightweight, 4, lifesupportTiers));

        internals.addToCategory(lifesupport);

        //CARGOSCANNER
        ComponentComponent cargoscanner = new ComponentComponent("cargoscanner");
        EngineerTier cargoscannerTier = new EngineerTier(5);
        cargoscannerTier.addTiers("1>3", new String[]{"fortune", "turner", "jameson"});
        cargoscannerTier.addTiers("4>5", "fortune");

        cargoscanner.addComponent(new ComponentMod("cargoscanner", lightweight, 5, cargoscannerTier));

        utility.addToCategory(cargoscanner);

        //POINT DEFENCE
        ComponentComponent pointDefence = new ComponentComponent("pointDefence");
        EngineerTier pointDefenceTiers = new EngineerTier(5);
        pointDefenceTiers.addTiers("1>5", "tah");

        pointDefence.addComponent(new ComponentMod("pointDefence", lightweight, 5, pointDefenceTiers));

        utility.addToCategory(pointDefence);

        //PROSPECTOR LIMPET
        ComponentComponent prospectorLimpet = new ComponentComponent("prospectorLimpet");
        EngineerTier prospectorLimpetTiers = new EngineerTier(5);
        prospectorLimpetTiers.addTiers("1>4", new String[]{"fortune", "sarge", "tah"});
        prospectorLimpetTiers.addTiers("5>5", new String[]{"fortune", "sarge"});

        prospectorLimpet.addComponent(new ComponentMod("prospectorLimpet", lightweight, 5, prospectorLimpetTiers));

        optionals.addToCategory(prospectorLimpet);


//Beam Laser	Lightweight Mount	The Dweller, Broo Tarquin!!!!!!!


        componentCategories.add(weapons);
        componentCategories.add(internals);
        componentCategories.add(optionals);
        componentCategories.add(utility);


    }


    public static ComponentCategory getCategory(String name) {

        for (ComponentCategory comp : componentCategories)
            if (comp.returnCategoryName().equalsIgnoreCase(name))
                return comp;

        return null;
    }


}
