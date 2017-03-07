package creepershift.journalparser.app;

import java.util.ArrayList;
import java.util.List;

/**${PACKAGE_NAME} for EliteCompanion
 * Created by Max on 2/9/2017.
 */
public class MaterialDataHandler {

    /*
    MaterialData's for every available Materials are stored inside an ArrayList.
    This class handles creating, modfying and displaying those materials.
     */

    private List<MaterialData> materialData = new ArrayList<>();


    public MaterialDataHandler(){

    }


    public void setMaterialDump(List<MaterialData> mats){

        materialData.clear();
        materialData = mats;

    }


    public List<MaterialData> getMaterials(){

        return materialData;
    }



    public void addsEntry(String name, int count, String type) {
        if(containsMaterial(name) >= 0){
            materialData.get(containsMaterial(name)).addCount(count);
        }else if(containsMaterial(name) == -1){
            materialData.add(new MaterialData(name, count, type));
        }


    }

    public void removesEntry(String name, int count, String type){
        if(containsMaterial(name) >= 0){
            materialData.get(containsMaterial(name)).subtractCount(count);
        }
        else if(containsMaterial(name) == -1){
            materialData.add(new MaterialData(name, 0, type));
        }
    }


    private int containsMaterial(String material){

        for (int i = 0; i < materialData.size(); i++){
            if (materialData.get(i).hasMaterial(material))
                return i;
        }
        return -1;
    }

    /*
    Returns the amount of a material
     */
    public  int getMaterialCount(String name) {


        for (MaterialData aMat : materialData) {
            if (aMat.getMaterialName().equalsIgnoreCase(name))
                return aMat.getMaterialCount();
        }

        return 0;

    }

    public  void printMaterial() {

        for (MaterialData aMat : materialData) {
            System.out.println(aMat.getMaterialName() + " " + aMat.getMaterialCount());
        }
    }

    public  String presentMaterials(){

        String mats = "";

        for(MaterialData aMat : materialData){
            mats = mats + aMat.getMaterialName() + ": " + aMat.getMaterialCount() + "\n";
        }

        return mats;
    }



}
