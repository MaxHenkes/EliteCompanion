package creepershift.journalparser.mods.data;


import creepershift.elitecompaniongui.Main;
import creepershift.journalparser.mods.ModData;

/**
 * EliteCompanion
 * Created by Max on 2/14/2017.
 */
public class ComponentMod {

    int componentTiers;
    private TieredRecipe[] recipes;
    String component;
    ModData mod;
    EngineerTier engineerTiers;


    public ComponentMod(String componentName, ModData modName, int tiers, EngineerTier eng) {

        component = componentName;
        recipes = modName.getRecipe(tiers);
        componentTiers = tiers;
        mod = modName;
        engineerTiers = eng;

    }

    public String getComponentName() {
        return component;
    }


    public String getModName() {
        return mod.getName();
    }

    public String[] getRecipeForTiers() {

        String[] recipeString = new String[componentTiers];

        for (int i = 0; i < componentTiers; i++) {

            recipeString[i] = "";

            for (String s : recipes[i].getRecipe()) {


                recipeString[i] = recipeString[i].concat(Main.lang.getLangName(s) + "\n");
            }
        }

        return recipeString;


    }

}
