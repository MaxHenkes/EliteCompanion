package creepershift.journalparser.util;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * EliteCompanion
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


            JSONObject jsonObject = (JSONObject) obj;

            System.out.println(jsonObject);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


    public static String parseVersion(String jsonString, String key) {
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(jsonString);
            JSONObject jsonObject = (JSONObject) obj;

            return (String) jsonObject.get(key);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }


    /*
        Reads out the material EVENT json line from a string.
        Returns both the name and the count inside a String Array.
         */
    public static String[] parseCollectedString(String jsonString) {

        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(jsonString);


            JSONObject jsonObject = (JSONObject) obj;
            String name = (String) jsonObject.get("Name");
            String count = String.valueOf(jsonObject.get("Count"));
            String time = (String) jsonObject.get("timestamp");


            return new String[]{name, count, time};

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }


    public static String[] parseStartupString(String jsonString) {

        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(jsonString);


            JSONObject jsonObject = (JSONObject) obj;
            String name = (String) jsonObject.get("Commander");
            String credits = String.valueOf(jsonObject.get("Credits"));
            String ship = (String) jsonObject.get("Ship");
            String time = (String) jsonObject.get("timestamp");


            return new String[]{name, credits, ship, time};

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String parseMissionString(String jsonString) {

        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(jsonString);

            JSONObject jsonObject = (JSONObject) obj;

            return (String) jsonObject.get("timestamp");

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static JSONArray parseMaterialDump(String jsonString) {
        JSONParser parser = new JSONParser();


        try {
            Object obj = parser.parse(jsonString);
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jarray = (JSONArray)jsonObject.get("Raw");

            return jarray;

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }


}
