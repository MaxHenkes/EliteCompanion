package creepershift.elitecompanion.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Max on 2/9/2017.
 */
public class MaterialDataHandler {

 // static MaterialData[] mat = new MaterialData[8];
    static List<MaterialData> mat = new ArrayList<>();

    public static void init(){

        //no need to init ArrayList, will be initialized when it's being created

        /*
        Creates a new MaterialData array containing individual materialData objects,
        initialized with the Reference.MaterialNames
         */

        /*
        old ARRAY implementation

        for (int i = 0; i <mat.length; i++){
            mat[i] = new MaterialData(Reference.materialNames[i]);
        }
        */




    }



    /*
    Adds material count
     */
    public static void addEntry(String name, int count) {

        /*
        OLD ARRAY IMPLEMENTATION

        for (int i = 0; i < mat.length; i++) {
            if (mat[i].getMaterialName().equals(name)) {
                mat[i].addCount(count);
                break;
            }
        }
        */


        if (mat.size() == 0) {
            mat.add(new MaterialData(name, count));
        }else {

            for (int i = 0; i < mat.size(); i++) {
            if (mat.get(i).getMaterialName().equalsIgnoreCase(name)){
                mat.get(i).addCount(count);
                break;
                }
                if (i == mat.size()-1 && !mat.get(i).getMaterialName().equalsIgnoreCase(name))
                    mat.add(new MaterialData(name, count));

            }
        }




    }


    /*
    Returns the amount of a material
     */
    public static int getMaterialCount(String name) {


        for (int i = 0; i < mat.size(); i++){
            if (mat.get(i).getMaterialName().equalsIgnoreCase(name))
                return mat.get(i).getMaterialCount();
                    }


        /*
        OLD ARRAY IMPLEMENTATION
        for (int i = 0; i < mat.length; i++) {
            if (mat[i].getMaterialName().equals(name)) {
                return mat[i].getMaterialCount();
            }
        }
        */
        return 0;

    }

    public static String printMaterial() {
        String mats = new String();


        for (int i = 0; i < mat.size(); i++) {
            mats = mats + mat.get(i).getMaterialName() + " " + mat.get(i).getMaterialCount() + "\n";

        }
        return mats;

    }

        /* OLD ARRAY IMPLEMENTATION




        for (int i = 0; i < mat.length; i++) {
            mats = mats + mat[i].getMaterialName() + " " + mat[i].getMaterialCount() + "\n";

        }
        return mats;
    }

    */

    public static String[] saveMaterials(){



        String [] mats = new String[mat.size()*2];
        int j = 0;

        for(int i = 0; i < mat.size(); i++){
            mats[j] = mat.get(i).getMaterialName();
            j++;
            mats[j] = mat.get(i).getMaterialCount() + "";
            j++;
        }



        /* OLD ARRAY IMPLEMENTATION


    String[] mats = new String[mat.length*2];

    int j = 0;

        for (int i = 0; i < mat.length; i++) {
            mats[j] = mat[i].getMaterialName();
            j +=1;
            mats[j] = mat[i].getMaterialCount() + "";
            j +=1;
        }


        */

    return mats;
    }

}
