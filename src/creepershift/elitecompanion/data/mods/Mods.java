package creepershift.elitecompanion.data.mods;

/**
 * EliteCompanion
 * Created by Max on 2/14/2017.
 */
public class Mods {

    public ModData ammo, armorPowerPlant, armorBlastRes, boosterBlastRes, chargePowerDist, cleanDrive, dirtyDrive, doubleShot, strengthDrive, efficient, engineFocusDist, lowPowerShield,
            expandedInterdictor, fsdBoot, focused, armorHeavyDuty, boosterHeavyDuty, magazine, highCapacityDist, fsdRange, armorKineticRes, boosterKineticRes, shieldKineticRes,
            lightweight, armorLightWeight, longRange, rangeInterdictor, lowEmissionPowerPlant, overchargedPowerPlant, overcharged, rapidCell, rapidfire, reinforced, shieldReinforced,
            boosterRes, shielded, fsdShielded, shortRange, specialCell, sturdy, sysDist, armorThermalRes,boosterThermalRes, shieldThermalRes, weapDist;





    public void initMods(){

        armorPowerPlant = new ModData("armorPowerPlant", 5);
        armorPowerPlant.setRecipe(1, new String[]{"wornshieldemitters"});
        armorPowerPlant.setRecipe(2, new String[]{"carbon", "shieldemitters"});
        armorPowerPlant.setRecipe(3, new String[]{"carbon", "highdensitycomposites", "shieldemitters"});
        armorPowerPlant.setRecipe(4, new String[]{"fedproprietarycomposites", "shieldingsensors", "vanadium"});
        armorPowerPlant.setRecipe(5, new String[]{"compoundshielding", "fedcorecomposites", "tungsten"});



        armorBlastRes = new ModData("armorBlastRes", 3);
        armorBlastRes.setRecipe(1, new String[]{"nickel"});
        armorBlastRes.setRecipe(2, new String[]{"carbon","zinc"});
        armorBlastRes.setRecipe(3, new String[]{"salvagedalloys","vanadium", "zirconium"});


        boosterBlastRes = new ModData("boosterBlastRes", 3);
        boosterBlastRes.setRecipe(1, new String[]{"iron"});
        boosterBlastRes.setRecipe(2, new String[]{"conductivecomponents","iron"});
        boosterBlastRes.setRecipe(3, new String[]{"conductivecomponents","focuscrystals", "iron"});


        chargePowerDist = new ModData("chargePowerDist", 5);
        chargePowerDist.setRecipe(1, new String[]{"legacyfirmware"});
        chargePowerDist.setRecipe(2, new String[]{"chemicalprocessors","legacyfirmware"});
        chargePowerDist.setRecipe(3, new String[]{"chemicaldistillery","gridresistors", "consumerfirmware"});
        chargePowerDist.setRecipe(4, new String[]{"chemicalmanipulators","industrialfirmware", "hybridcapacitors"});
        chargePowerDist.setRecipe(5, new String[]{"chemicalmanipulators","industrialfirmware", "exquisitefocuscrystals"});


        cleanDrive = new ModData("cleanDrive", 5);
        cleanDrive.setRecipe(1, new String[]{"sulphur"});
        cleanDrive.setRecipe(2, new String[]{"conductivecomponents","legacyfirmware"});
        cleanDrive.setRecipe(3, new String[]{"conductivecomponents","legacyfirmware", "emissiondata"});
        cleanDrive.setRecipe(4, new String[]{"conductiveceramics","decodedemissiondata", "consumerfirmware"});
        cleanDrive.setRecipe(5, new String[]{"compactemissionsdata","conductiveceramics", "tin"});

        dirtyDrive = new ModData("dirtyDrive", 5);
        dirtyDrive.setRecipe(1, new String[]{"legacyfirmware"});
        dirtyDrive.setRecipe(2, new String[]{"mechanicalequipment","legacyfirmware"});
        dirtyDrive.setRecipe(3, new String[]{"chromium","mechanicalcomponents", "legacyfirmware"});
        dirtyDrive.setRecipe(4, new String[]{"configurablecomponents","consumerfirmware", "selenium"});
        dirtyDrive.setRecipe(5, new String[]{"cadmium","industrialfirmware", "pharmaceuticalisolators"});

        doubleShot = new ModData("doubleShot", 5);
        dirtyDrive.setRecipe(1, new String[]{"carbon"});
        dirtyDrive.setRecipe(2, new String[]{"carbon","mechanicalequipment"});
        dirtyDrive.setRecipe(3, new String[]{"carbon","mechanicalequipment", "industrialfirmware"});
        dirtyDrive.setRecipe(4, new String[]{"mechanicalcomponents","securityfirmware", "vanadium"});
        dirtyDrive.setRecipe(5, new String[]{""});


        strengthDrive = new ModData("strengthDrive", 5);
        strengthDrive.setRecipe(1, new String[]{"carbon"});
        strengthDrive.setRecipe(2, new String[]{"heatconductionwiring","vanadium"});
        strengthDrive.setRecipe(3, new String[]{"heatconductionwiring","vanadium", "shieldingsensors"});
        strengthDrive.setRecipe(4, new String[]{"compoundshielding","heatdispersionplate", "highdensitycomposites"});
        strengthDrive.setRecipe(5, new String[]{"heatexchangers","imperialshielding", "fedproprietarycomposites"});

        efficient = new ModData("efficient", 5);
        efficient.setRecipe(1, new String[]{"sulphur"});
        efficient.setRecipe(2, new String[]{"heatdispersionplate","sulphur"});
        efficient.setRecipe(3, new String[]{"chromium","scrambledemissiondata", "heatexchangers"});
        efficient.setRecipe(4, new String[]{"heatvanes","archivedemissiondata", "selenium"});
        efficient.setRecipe(5, new String[]{"cadmium","protoheatradiators", "emissiondata"});

        engineFocusDist = new ModData("engineFocusDist", 3);
        engineFocusDist.setRecipe(1, new String[]{"sulphur"});
        engineFocusDist.setRecipe(2, new String[]{"conductivecomponents","sulphur"});
        engineFocusDist.setRecipe(3, new String[]{"bulkscandata","chromium", "electrochemicalarrays"});

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
        fsdBoot.setRecipe(5, new String[]{"electrochemicalarrays" , "heatvanes", "tellurium"});

        focused = new ModData("focused", 5);
        focused.setRecipe(1, new String[]{"iron"});
        focused.setRecipe(2, new String[]{"conductivecomponents","iron"});
        focused.setRecipe(3, new String[]{"chromium","conductiveceramics", "iron"});
        focused.setRecipe(4, new String[]{"focuscrystals","germanium", "polymercapacitors"});
        focused.setRecipe(5, new String[]{"militarysupercapacitors","niobium", "refinedfocuscrystals"});

        armorHeavyDuty = new ModData("armorHeavyDuty", 5);
        armorHeavyDuty.setRecipe(1, new String[]{"carbon"});
        armorHeavyDuty.setRecipe(2, new String[]{"carbon","shieldemitters"});
        armorHeavyDuty.setRecipe(3, new String[]{"carbon","highdensitycomposites", "shieldemitters"});
        armorHeavyDuty.setRecipe(4, new String[]{"fedproprietarycomposites","shieldingsensors", "vanadium"});
        armorHeavyDuty.setRecipe(5, new String[]{"compoundshielding","fedcorecomposites", "tungsten"});

        boosterHeavyDuty = new ModData("boosterHeavyDuty", 5);
        boosterHeavyDuty.setRecipe(1, new String[]{"gridresistors"});
        boosterHeavyDuty.setRecipe(2, new String[]{"shieldcyclerecordings","hybridcapacitors"});
        boosterHeavyDuty.setRecipe(3, new String[]{"shieldcyclerecordings","hybridcapacitors", "niobium"});
        boosterHeavyDuty.setRecipe(4, new String[]{"electrochemicalarrays","shieldsoakanalysis", "tin"});
        boosterHeavyDuty.setRecipe(5, new String[]{"antimony","polymercapacitors", "shielddensityreports"});

        magazine = new ModData("capacity", 5);
        magazine.setRecipe(1, new String[]{"mechanicalscrap"});
        magazine.setRecipe(2, new String[]{"mechanicalscrap","vanadium"});
        magazine.setRecipe(3, new String[]{"mechanicalscrap","niobium", "vanadium"});
        magazine.setRecipe(4, new String[]{"highdensitycomposites","mechanicalequipment", "tin"});
        magazine.setRecipe(5, new String[]{"mechanicalcomponents","militarysupercapacitors", "fedproprietarycomposites"});

        highCapacityDist = new ModData("highCapacityDist", 5);
        highCapacityDist.setRecipe(1, new String[]{"sulphur"});
        highCapacityDist.setRecipe(2, new String[]{"chromium","legacyfirmware"});
        highCapacityDist.setRecipe(3, new String[]{"chromium","highdensitycomposites", "legacyfirmware"});
        highCapacityDist.setRecipe(4, new String[]{"consumerfirmware","fedproprietarycomposites", "selenium"});
        highCapacityDist.setRecipe(5, new String[]{"industrialfirmware","militarysupercapacitors", "fedproprietarycomposites"});

        fsdRange = new ModData("fsdRange", 5);
        fsdRange.setRecipe(1, new String[]{"disruptedwakeechoes"});
        fsdRange.setRecipe(2, new String[]{"disruptedwakeechoes","chemicalprocessors"});
        fsdRange.setRecipe(3, new String[]{"chemicalprocessors","phosphorus", "wakesolutions"});
        fsdRange.setRecipe(4, new String[]{"chemicaldistillery","hyperspacetrajectories", "manganese"});
        fsdRange.setRecipe(5, new String[]{"arsenic","chemicalmanipulators", "dataminedwake"});


        armorKineticRes = new ModData("armorKineticRes", 3);
        armorKineticRes.setRecipe(1, new String[]{"nickel"});
        armorKineticRes.setRecipe(2, new String[]{"nickel","vanadium"});
        armorKineticRes.setRecipe(3, new String[]{"highdensitycomposites","salvagedalloys", "vanadium"});

        boosterKineticRes = new ModData("boosterKineticRes", 3);
        boosterKineticRes.setRecipe(1, new String[]{"iron"});
        boosterKineticRes.setRecipe(2, new String[]{"germanium","gridresistors"});
        boosterKineticRes.setRecipe(3, new String[]{"focuscrystals","hybridcapacitors", "salvagedalloys"});


        shieldKineticRes = new ModData("shieldKineticRes", 5);
        shieldKineticRes.setRecipe(1, new String[]{"shieldcyclerecordings"});
        shieldKineticRes.setRecipe(2, new String[]{"shieldcyclerecordings","consumerfirmware"});
        shieldKineticRes.setRecipe(3, new String[]{"shieldcyclerecordings","consumerfirmware", "selenium"});
        shieldKineticRes.setRecipe(4, new String[]{"focuscrystals","shieldsoakanalysis", "mercury"});
        shieldKineticRes.setRecipe(5, new String[]{"refinedfocuscrystals","ruthenium", "shielddensityreports"});


        lightweight = new ModData("lightweight", 5);
        lightweight.setRecipe(1, new String[]{"phosphorus"});
        lightweight.setRecipe(2, new String[]{"manganese","salvagedalloys"});
        lightweight.setRecipe(3, new String[]{"conductiveceramics","manganese", "salvagedalloys"});
        lightweight.setRecipe(4, new String[]{"conductivecomponents","phasealloys", "protolightalloys"});
        lightweight.setRecipe(5, new String[]{"conductiveceramics","protolightalloys", "protoradiolicalloys"});

        armorLightWeight = new ModData("armorLightWeight", 5);
        armorLightWeight.setRecipe(1, new String[]{"iron"});
        armorLightWeight.setRecipe(2, new String[]{"conductivecomponents","iron"});
        armorLightWeight.setRecipe(3, new String[]{"conductivecomponents","highdensitycomposites", "iron"});
        armorLightWeight.setRecipe(4, new String[]{"conductiveceramics","germanium", "fedproprietarycomposites"});
        armorLightWeight.setRecipe(5, new String[]{"conductiveceramics","militarygradealloys", "tin"});

        longRange = new ModData("longRange", 5);
        longRange.setRecipe(1, new String[]{"sulphur"});
        longRange.setRecipe(2, new String[]{"consumerfirmware","sulphur"});
        longRange.setRecipe(3, new String[]{"focuscrystals","consumerfirmware", "iron"});
        longRange.setRecipe(4, new String[]{"conductivepolymers","focuscrystals", "consumerfirmware"});
        longRange.setRecipe(5, new String[]{"biotechconductors","industrialfirmware", "thermicalloys"});


        rangeInterdictor = new ModData("rangeInterdictor", 3);
        rangeInterdictor.setRecipe(1, new String[]{"encryptedfiles"});
        rangeInterdictor.setRecipe(2, new String[]{"disruptedwakeechoes","encryptioncodes"});
        rangeInterdictor.setRecipe(3, new String[]{"bulkscandata", "fsdtelemetry", "symmetrickeys"});

        lowEmissionPowerPlant = new ModData("lowEmissionPowerPlant", 3);
        lowEmissionPowerPlant.setRecipe(1, new String[]{"iron"});
        lowEmissionPowerPlant.setRecipe(2, new String[]{"iron","archivedemissiondata"});
        lowEmissionPowerPlant.setRecipe(3, new String[]{"heatexchangers", "iron", "archivedemissiondata"});


        overchargedPowerPlant = new ModData("overchargedPowerPlant", 5);
        overchargedPowerPlant.setRecipe(1, new String[]{"sulphur"});
        overchargedPowerPlant.setRecipe(2, new String[]{"conductivecomponents","heatconductionwiring"});
        overchargedPowerPlant.setRecipe(3, new String[]{"conductivecomponents","heatconductionwiring", "selenium"});
        overchargedPowerPlant.setRecipe(4, new String[]{"cadmium","conductiveceramics", "heatdispersionplate"});
        overchargedPowerPlant.setRecipe(5, new String[]{"chemicalmanipulators","conductiveceramics", "tellurium"});


        overcharged = new ModData("overcharged", 5);
        overcharged.setRecipe(1, new String[]{"nickel"});
        overcharged.setRecipe(2, new String[]{"conductivecomponents","nickel"});
        overcharged.setRecipe(3, new String[]{"conductivecomponents","electrochemicalarrays", "nickel"});
        overcharged.setRecipe(4, new String[]{"conductiveceramics","polymercapacitors", "zinc"});
        overcharged.setRecipe(5, new String[]{"conductivepolymers","embeddedfirmware", "zirconium"});

        rapidCell = new ModData("rapidCell", 3);
        rapidCell.setRecipe(1, new String[]{"sulphur"});
        rapidCell.setRecipe(2, new String[]{"chromium","gridresistors"});
        rapidCell.setRecipe(3, new String[]{"hybridcapacitors", "precipitatedalloys", "sulphur"});

        rapidfire = new ModData("rapidfire", 5);
        rapidfire.setRecipe(1, new String[]{"mechanicalscrap"});
        rapidfire.setRecipe(2, new String[]{"heatdispersionplate","mechanicalscrap"});
        rapidfire.setRecipe(3, new String[]{"mechanicalequipment","precipitatedalloys", "legacyfirmware"});
        rapidfire.setRecipe(4, new String[]{"mechanicalcomponents","consumerfirmware", "thermicalloys"});
        rapidfire.setRecipe(5, new String[]{"configurablecomponents","precipitatedalloys", "technetium"});

        reinforced = new ModData("reinforced", 5);
        reinforced.setRecipe(1, new String[]{"nickel"});
        reinforced.setRecipe(2, new String[]{"nickel","shieldemitters"});
        reinforced.setRecipe(3, new String[]{"nickel","shieldemitters", "tungsten"});
        reinforced.setRecipe(4, new String[]{"molybdenum","tungsten", "zinc"});
        reinforced.setRecipe(5, new String[]{"highdensitycomposites","molybdenum", "technetium"});



        shieldReinforced = new ModData("shieldReinforced", 5);
        shieldReinforced.setRecipe(1, new String[]{"phosphorus"});
        shieldReinforced.setRecipe(2, new String[]{"conductivecomponents","phosphorus"});
        shieldReinforced.setRecipe(3, new String[]{"conductivecomponents","mechanicalcomponents", "phosphorus"});
        shieldReinforced.setRecipe(4, new String[]{"conductiveceramics","configurablecomponents", "manganese"});
        shieldReinforced.setRecipe(5, new String[]{"arsenic","conductivepolymers", "improvisedcomponents"});

        boosterRes = new ModData("boosterRes", 5);
        boosterRes.setRecipe(1, new String[]{"phosphorus"});
        boosterRes.setRecipe(2, new String[]{"conductivecomponents","phosphorus"});
        boosterRes.setRecipe(3, new String[]{"conductivecomponents","focuscrystals", "phosphorus"});
        boosterRes.setRecipe(4, new String[]{"conductiveceramics","manganese", "refinedfocuscrystals"});
        boosterRes.setRecipe(5, new String[]{"conductiveceramics","imperialshielding", "refinedfocuscrystals"});


        shielded = new ModData("shielded", 5);
        shielded.setRecipe(1, new String[]{"shieldemitters"});
        shielded.setRecipe(2, new String[]{"carbon","shieldemitters"});
        shielded.setRecipe(3, new String[]{"carbon","highdensitycomposites", "shieldemitters"});
        shielded.setRecipe(4, new String[]{"fedproprietarycomposites","shieldingsensors", "vanadium"});
        shielded.setRecipe(5, new String[]{"compoundshielding","fedcorecomposites", "tungsten"});


        fsdShielded = new ModData("fsdShielded", 5);
        fsdShielded.setRecipe(1, new String[]{"nickel"});
        fsdShielded.setRecipe(2, new String[]{"carbon","shieldemitters"});
        fsdShielded.setRecipe(3, new String[]{"carbon","shieldingsensors", "zinc"});
        fsdShielded.setRecipe(4, new String[]{"compoundshielding","highdensitycomposites", "vanadium"});
        fsdShielded.setRecipe(5, new String[]{"imperialshielding","fedproprietarycomposites", "tungsten"});

        shortRange = new ModData("shortRange", 5);
        shortRange.setRecipe(1, new String[]{"nickel"});
        shortRange.setRecipe(2, new String[]{"consumerfirmware","nickel"});
        shortRange.setRecipe(3, new String[]{"electrochemicalarrays","consumerfirmware", "nickel"});
        shortRange.setRecipe(4, new String[]{"conductivepolymers","electrochemicalarrays", "consumerfirmware"});
        shortRange.setRecipe(5, new String[]{"biotechconductors","configurablecomponents", "industrialfirmware"});

        specialCell = new ModData("specialCell", 3);
        specialCell.setRecipe(1, new String[]{"legacyfirmware"});
        specialCell.setRecipe(2, new String[]{"conductivecomponents","legacyfirmware"});
        specialCell.setRecipe(3, new String[]{"conductivecomponents","industrialfirmware", "scrambledemissiondata"});


        sturdy = new ModData("sturdy", 5);
        sturdy.setRecipe(1, new String[]{"nickel"});
        sturdy.setRecipe(2, new String[]{"nickel","shieldemitters"});
        sturdy.setRecipe(3, new String[]{"nickel","shieldemitters", "tungsten"});
        sturdy.setRecipe(4, new String[]{"molybdenum","tungsten", "zinc"});
        sturdy.setRecipe(5, new String[]{"highdensitycomposites","molybdenum", "technetium"});

        sysDist = new ModData("sysDist", 3);
        sysDist.setRecipe(1, new String[]{"sulphur"});
        sysDist.setRecipe(2, new String[]{"conductivecomponents","sulphur"});
        sysDist.setRecipe(3, new String[]{"bulkscandata","chromium", "electrochemicalarrays"});

        armorThermalRes = new ModData("armorThermalRes", 3);
        armorThermalRes.setRecipe(1, new String[]{"heatconductionwiring"});
        armorThermalRes.setRecipe(2, new String[]{"heatdispersionplate","nickel"});
        armorThermalRes.setRecipe(3, new String[]{"heatexchangers","salvagedalloys", "vanadium"});

        boosterThermalRes = new ModData("boosterThermalRes", 3);
        boosterThermalRes.setRecipe(1, new String[]{"iron"});
        boosterThermalRes.setRecipe(2, new String[]{"germanium","heatconductionwiring"});
        boosterThermalRes.setRecipe(3, new String[]{"focuscrystals","heatconductionwiring", "heatdispersionplate"});

        shieldThermalRes = new ModData("shieldThermalRes", 5);
        shieldThermalRes.setRecipe(1, new String[]{"shieldcyclerecordings"});
        shieldThermalRes.setRecipe(2, new String[]{"shieldcyclerecordings","germanium"});
        shieldThermalRes.setRecipe(3, new String[]{"shieldcyclerecordings","germanium", "selenium"});
        shieldThermalRes.setRecipe(4, new String[]{"focuscrystals","shieldsoakanalysis", "mercury"});
        shieldThermalRes.setRecipe(5, new String[]{"refinedfocuscrystals","ruthenium", "shielddensityreports"});

        weapDist = new ModData("weapDist", 3);
        weapDist.setRecipe(1, new String[]{"sulphur"});
        weapDist.setRecipe(2, new String[]{"conductivecomponents","sulphur"});
        weapDist.setRecipe(3, new String[]{"bulkscandata","hybridcapacitors", "selenium"});

    }


}
