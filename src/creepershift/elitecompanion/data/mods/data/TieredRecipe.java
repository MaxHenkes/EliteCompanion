package creepershift.elitecompanion.data.mods.data;

/**
 * EliteCompanion
 * Created by Max on 2/14/2017.
 */
public class TieredRecipe {

    private int tier;
    private String[] recipe;

    public TieredRecipe(int recipeTier, String[] recipeIngredients){
        tier = recipeTier;
        recipe = recipeIngredients;
    }

    public int getTier(){
        return tier;
    }
    public String[] getRecipe(){
        return recipe;
    }

}
