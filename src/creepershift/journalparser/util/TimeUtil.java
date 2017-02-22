package creepershift.journalparser.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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

    static String returnHHMM(String time){

        try {
            Date date = sdf.parse(time);


            return String.valueOf(date.getHours()) + ":" + date.getMinutes();
        }catch (ParseException e){
            e.printStackTrace();
        }


        return "[ERRTIME]";

    }


    public static String getTime(){

        Calendar cal = new GregorianCalendar();




        return "[" + cal.getTime().getHours() + ":" + cal.getTime().getMinutes() + "] ";
    }


}
