package creepershift.elitecompaniongui.lang;

import java.io.InputStream;
import java.util.ArrayList;

/**
 * EliteCompanionGui
 * Created by Max on 2/18/2017.
 */
public class Lang {


    ArrayList<String> techName;
    ArrayList<String> langName;

    public Lang(InputStream inputStream) {

        techName = new ArrayList<>();
        langName = new ArrayList<>();

        if (inputStream != null) {

            convertStreamToString(inputStream);
        }

        /*
        if(file.exists())
            loadFile(file);
        else Main.logOutput.addNotFormattedString("[ERROR] Lang file not found! "  + file.getPath());

*/
    }

    private void convertStreamToString(InputStream is) {
        java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\n");
        while (s.hasNext()) {
            loadString(s.next());
        }
    }


    private void loadString(String s) {


        if(!s.isEmpty()) {

            String[] data = s.split(">");

            if(data.length >1) {

                techName.add(data[0].trim());
                langName.add(data[1].trim());

            }
        }
    }


    public String getLangName(String name) {

        if (techName.contains(name))
            return langName.get(techName.indexOf(name));

        return name;
    }


}



