package creepershift.elitecompanion.data;

import java.util.ArrayList;
import java.util.List;

/**${PACKAGE_NAME} for EliteCompanion
 * Created by Max on 2/9/2017.
 */
public class MaterialDataHandler {

    private static List<MaterialData> mat = new ArrayList<>();

    /*
    Adds material count.
    If material doesn't exist, we initialize it.
    This way we can easily add new materials on the fly.
    This is also used to load the saved data back into the RAM.
     */
    public static void addEntry(String name, int count) {
        if(containsMaterial(name) >= 0){
            mat.get(containsMaterial(name)).addCount(count);
        }else if(containsMaterial(name) == -1){
            mat.add(new MaterialData(name, count));
        }


    }

    public static void removeEntry(String name, int count){
        if(containsMaterial(name) >= 0){
            mat.get(containsMaterial(name)).subtractCount(count);
        }
        else if(containsMaterial(name) == -1){
            mat.add(new MaterialData(name, 0));
        }
    }


    private static int containsMaterial(String material){

        for (int i = 0; i < mat.size(); i++){
            if (mat.get(i).hasMaterial(material))
                return i;
        }
        return -1;
    }

    /*
    Returns the amount of a material
     */
    public static int getMaterialCount(String name) {


        for (MaterialData aMat : mat) {
            if (aMat.getMaterialName().equalsIgnoreCase(name))
                return aMat.getMaterialCount();
        }

        return 0;

    }

    public static void printMaterial() {

        for (MaterialData aMat : mat) {
            System.out.println(aMat.getMaterialName() + " " + aMat.getMaterialCount());
        }
    }


    public static String[] saveMaterialString(){



        String [] mats = new String[mat.size()*2];
        int j = 0;

        for(int i = 0; i < mat.size(); i++){
            mats[j] = mat.get(i).getMaterialName();
            j++;
            mats[j] = String.valueOf(mat.get(i).getMaterialCount());
            j++;
        }

    return mats;
    }





}
