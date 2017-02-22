package creepershift.journalparser.util;

import creepershift.elitecompaniongui.Main;

import java.util.ArrayList;

/**
 * JournalParser
 * Created by Max on 2/17/2017.
 */
public class LogOutput {



    private String[] log;
    private final int size;
    private int current = 0;


    public LogOutput(int size){
        log = new String[size];
        this.size = size;
    }

    public void addLog(String entry){
        log[current] = entry;
        current++;
        if(current >= size){
            current = 0;
        }
    }

    public void addMaterialCollected(String material, int count, String time){

        log[current] = "[" + TimeUtil.returnHHMM(time) + "]" + " Collected " + count + " " + Main.lang.getLangName(material) + ".";
        current++;
        if(current >= size){
            current = 0;
        }

        Main.controller.setConsoleLog(returnStringInOrder());
    }

    public void addMaterialDiscarded(String time, String material, int count){




        log[current] = "[" + TimeUtil.returnHHMM(time) + "]" + " Discarded " + count + " " + Main.lang.getLangName(material) + ".";
        current++;
        if(current >= size){
            current = 0;
        }

        Main.controller.setConsoleLog(returnStringInOrder());

    }

    public void addEngineerCraft(ArrayList<String> materials, String time){

        String engineerCraft = "[" + TimeUtil.returnHHMM(time) + "]" +" Spent";

        for (String string: materials){
            engineerCraft = engineerCraft.concat(" " + Main.lang.getLangName(string));
        }

        engineerCraft = engineerCraft.concat(" at [Engineer]");

        log[current] = engineerCraft;
        current++;
        if(current >= size){
            current = 0;
        }
        Main.controller.setConsoleLog(returnStringInOrder());

    }


    public void addNotFormattedString(String string){


        log[current] = TimeUtil.getTime() + string;
        current++;
        if(current >= size){
            current = 0;
        }

        Main.controller.setConsoleLog(returnStringInOrder());

    }

    private String[] returnStringInOrder(){
        String[] strings = new String[size];
        int j = current;
        for(int i = 0; i < size; i++){

            strings[i] = log[j];
            j++;
            if(j >= size){
                j = 0;
            }
        }


        return strings;
    }

}
