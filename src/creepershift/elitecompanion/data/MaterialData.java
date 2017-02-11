package creepershift.elitecompanion.data;

/**  EliteCompanion
 * Created by Max on 2/8/2017.
 */
class MaterialData {

   private String materialName;
   private int materialCount;


    MaterialData(String name, int count){
        materialName = name;
        materialCount = count;
    }

    String getMaterialName(){

    return materialName;
    }
    int getMaterialCount(){

        return materialCount;
    }

    void addCount(int count){

        materialCount += count;

    }

    boolean hasMaterial(String mat){
        return materialName.equalsIgnoreCase(mat);
    }

}
