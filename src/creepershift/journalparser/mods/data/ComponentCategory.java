package creepershift.journalparser.mods.data;

import creepershift.elitecompaniongui.Main;

import java.util.ArrayList;

/**
 * EliteCompanionGui
 * Created by Max on 2/19/2017.
 */
public class ComponentCategory {


    String category;
    ArrayList<ComponentComponent> compList;

    public ComponentCategory(String cat) {

        category = cat;
        compList = new ArrayList<>();

    }

    public void addToCategory(ComponentComponent comp) {

        compList.add(comp);


    }

    public String[] returnComponents() {

        String[] returnString = new String[compList.size()];
        for (int i = 0; i < compList.size(); i++) {

            returnString[i] = Main.lang.getLangName(compList.get(i).getComponent());
        }
        return returnString;

    }

    public ComponentComponent getComponent(String compName) {
        for (ComponentComponent comp : compList) {
            if (comp.getComponent().equalsIgnoreCase(compName))
                return comp;
        }
        return null;
    }

    public String returnCategoryName(){
        return category;
    }


}
