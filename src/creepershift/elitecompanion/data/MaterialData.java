package creepershift.elitecompanion.data;

/**
 * Created by Max on 2/8/2017.
 */
public class MaterialData {

   private String materialName;
   private int materialCount;

    public MaterialData(String name){
        materialName = name;
        materialCount = 0;
    }

    public MaterialData(String name, int count){
        materialName = name;
        materialCount = count;
    }

    public String getMaterialName(){

    return materialName;
    }
    public int getMaterialCount(){

        return materialCount;
    }

    public void addCount(int count){

        materialCount += count;

    }

}
