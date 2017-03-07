package creepershift.journalparser.app;

/**  EliteCompanion
 * Created by Max on 2/8/2017.
 */
public class MaterialData {

   private String materialName;
   private int materialCount;
   private String type;


   public MaterialData(String name, int count, String type){
        materialName = name;
        materialCount = count;
        this.type = type;
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

    public String returnType(){
        return type;
    }
}
