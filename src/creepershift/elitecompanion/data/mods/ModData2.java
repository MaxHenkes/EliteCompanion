package creepershift.elitecompanion.data.mods;

/**
 * EliteCompanion
 * Created by Max on 2/13/2017.
 */
public class ModData2 {

    private String component;
    private String mod;
    private int tier;
    private String[] materials;
    private String[] engineers;

    public int size;


    public ModData2(String componentName, String modName, String[] engineerNames, int modTier, String[] materialArray){

        component = componentName;
        engineers = engineerNames;
        mod= modName;
        tier = modTier;
        materials = materialArray;
        size = materialArray.length;

    }


    public int getTier() {return tier;}
    public String getComponent(){return component;}
    public String[] getMaterials(){return materials;}
    public String getMod(){return mod;}
    public String[] getEngineer(){return engineers;}

}
