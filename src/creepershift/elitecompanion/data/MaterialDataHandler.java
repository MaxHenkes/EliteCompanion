package creepershift.elitecompanion.data;

import creepershift.elitecompanion.Reference;

/**
 * Created by Max on 2/9/2017.
 */
public class MaterialDataHandler {

  static MaterialData[] mat = new MaterialData[8];


    public static void init(){

        /*
        Creates a new MaterialData array containing individual materialData objects,
        initialized with the Reference.MaterialNames
         */

        for (int i = 0; i <mat.length; i++){
            mat[i] = new MaterialData(Reference.materialNames[i]);
        }
    }



    /*
    Adds material count
     */
    public static void addEntry(String name, int count) {

        for (int i = 0; i < mat.length; i++) {
            if (mat[i].getMaterialName().equals(name)) {
                mat[i].addCount(count);
                break;
            }
        }
    }


    /*
    Returns the amount of a material
     */
    public static int getMaterialCount(String name) {


        for (int i = 0; i < mat.length; i++) {
            if (mat[i].getMaterialName().equals(name)) {
                return mat[i].getMaterialCount();
            }
        }
        return 0;

    }

    public static String printMaterial() {
        String mats = new String();
        for (int i = 0; i < mat.length; i++) {
            mats = mats + mat[i].getMaterialName() + " " + mat[i].getMaterialCount() + "\n";

        }
        return mats;
    }

    public static String[] saveMaterials(){

    String[] mats = new String[mat.length*2];

    int j = 0;

        for (int i = 0; i < mat.length; i++) {
            mats[j] = mat[i].getMaterialName();
            j +=1;
            mats[j] = mat[i].getMaterialCount() + "";
            j +=1;
        }

    return mats;
    }

}
