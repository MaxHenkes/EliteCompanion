package creepershift.elitecompanion.data.mods;

import creepershift.elitecompanion.data.mods.data.TieredRecipe;

/**
 * EliteCompanion
 * Created by Max on 2/14/2017.
 */
public class ModData {


    private String name;
    private TieredRecipe[] recipes;


    public ModData(String modName, int tier) {
        name = modName;
        recipes = new TieredRecipe[tier];
    }

    public String getName() {
        return name;
    }

    public void setRecipe(int tier, String[] recipe) {
        if (tier <= recipes.length && tier > 0) {
            recipes[tier - 1] = new TieredRecipe(tier, recipe);
        }
    }

    public TieredRecipe[] getRecipes() {

        return recipes;
    }

    public TieredRecipe getRecipeByTier(int tier) {
        return recipes[tier - 1];
    }

    public TieredRecipe[] getRecipe(int maxtier) {


        TieredRecipe[] recipeByTier = new TieredRecipe[maxtier];

        for (int i = 0; i < maxtier; i++) {
            recipeByTier[i] = recipes[i];
        }

        return recipeByTier;
    }


}
