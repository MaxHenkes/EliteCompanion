package creepershift.elitecompanion.data;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by Max on 2/2/2017.
 */
public class ParserJson {


    /*
    Parses entire String and outputs it to the console. For DEBUG purposes.
     */
    public static void parseString(String jsonString) {

        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(jsonString);


            JSONObject jsonObject = (JSONObject)obj;

            System.out.println(jsonObject);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    /*
    Reads out the material EVENT json line from a string.
    Returns both the name and the count inside a String Array.
     */
    public static String[] parseMaterialString(String jsonString) {

        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(jsonString);


            JSONObject jsonObject = (JSONObject)obj;
            String name = (String)jsonObject.get("Name");
            long count = (long)jsonObject.get("Count");
            String count2 =  "" + count;


            return new String[]{name, count2};

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }


}
