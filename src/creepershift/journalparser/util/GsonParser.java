package creepershift.journalparser.util;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * EliteCompanion
 * Created by Max on 2/14/2017.
 */
public class GsonParser {


    private static JsonObject parseJson(String line){


        JsonObject jObject = new JsonParser().parse(line).getAsJsonObject();
        jObject = jObject.getAsJsonObject("Ingredients");


       return jObject;
}



public static ArrayList<String> parseMaterials(String string){


    String jsonObjectString = parseJson(string).toString();

    Pattern pattern = Pattern.compile("\"[^\"]*\"");


    Matcher matcher = pattern.matcher(jsonObjectString);

    ArrayList<String> materials = new ArrayList<>();

    while(matcher.find()){

        String s = matcher.group().replaceAll("\"", "");

        materials.add(s);
    }

    return materials;

}



}
