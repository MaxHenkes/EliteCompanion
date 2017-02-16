package creepershift.elitecompanion.data.mods.data;

import creepershift.elitecompanion.data.mods.ModData;

/**
 * EliteCompanion
 * Created by Max on 2/14/2017.
 */
public class Component{

    int componentTiers;
    private TieredRecipe[] recipes;
    String component;
    String[] engineers;


    public Component(String componentName, ModData modName, int tiers, String[] engineerNames){

        component = componentName;
        recipes = modName.getRecipe(tiers);
        componentTiers = tiers;
        engineers = engineerNames;

    }



}
