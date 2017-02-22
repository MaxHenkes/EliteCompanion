package creepershift.journalparser.app;

/**  EliteCompanion
 * Created by Max on 2/8/2017.
 */
public class MaterialData {

   private String materialName;
   private int materialCount;


    MaterialData(String name, int count){
        materialName = name;
        materialCount = count;
    }

   public String getMaterialName(){

    return materialName;
    }
   public int getMaterialCount(){

        return materialCount;
    }

    void addCount(int count){

        materialCount += count;

    }

    void subtractCount(int count){

        if (materialCount >= count) materialCount -= count;
    }

    boolean hasMaterial(String mat){
        return materialName.equalsIgnoreCase(mat);
    }

}
