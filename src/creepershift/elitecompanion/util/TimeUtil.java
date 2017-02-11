package creepershift.elitecompanion.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * EliteCompanion
 * Created by Max on 2/11/2017.
 */
public class TimeUtil {


    /*
    Parses the timestamp dates.
    Returns if date1 is after date2.
     */


    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

    public static boolean isAfter(String d1, String d2){
        try {
            Date date1 = sdf.parse(d1);
            Date date2 = sdf.parse(d2);


            if(date1.after(date2))
                return true;


        } catch (ParseException e) {
            e.printStackTrace();
        }


        return false;
    }

    public static boolean isCurrent(String d1, String d2){
        try {
            Date date1 = sdf.parse(d1);
            Date date2 = sdf.parse(d2);


            if(date1.equals(date2))
                return true;


        } catch (ParseException e) {
            e.printStackTrace();
        }


        return false;
    }


}
