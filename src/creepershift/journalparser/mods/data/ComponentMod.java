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
    String[] engineers;
    ModData mod;


    public ComponentMod(String componentName, ModData modName, int tiers, String[] engineerNames) {

        component = componentName;
        recipes = modName.getRecipe(tiers);
        componentTiers = tiers;
        engineers = engineerNames;
        mod = modName;

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
