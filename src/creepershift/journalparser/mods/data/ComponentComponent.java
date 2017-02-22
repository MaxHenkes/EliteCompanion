package creepershift.journalparser.mods.data;

import creepershift.elitecompaniongui.Main;

import java.util.ArrayList;

/**
 * EliteCompanionGui
 * Created by Max on 2/19/2017.
 */
public class ComponentComponent {

    private ArrayList<ComponentMod> compMod;
    String compName;

    public ComponentComponent(String component){
        compName = component;
        compMod = new ArrayList<>();
    }


    public void addComponent(ComponentMod comp){

        if(comp.getComponentName().equalsIgnoreCase(compName)){
            compMod.add(comp);
        }

    }


    public String getComponent(){
        return compName;
    }



    public String[] returnMods(){

        String[] returnString = new String[compMod.size()];

        for (int i = 0; i < compMod.size(); i++){
            returnString[i] = Main.lang.getLangName(compMod.get(i).getModName());
        }

        return returnString;
    }

    public ComponentMod getMod(String mod){
        for(ComponentMod comp: compMod){
            if(comp.getModName().equalsIgnoreCase(mod))
                return comp;
        }


        return null;
    }

}
