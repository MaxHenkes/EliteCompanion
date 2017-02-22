package creepershift.elitecompaniongui.data;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * EliteCompanionGui
 * Created by Max on 2/18/2017.
 */
public class Table {

    private final SimpleStringProperty matName;
    private final SimpleIntegerProperty matCount;

    public Table(int tCount, String tMat){
        matCount = new SimpleIntegerProperty(tCount);
        matName = new SimpleStringProperty(tMat);

    }

    public Integer getMatCount(){

        return matCount.get();
    }

    public String getMatName(){

        return matName.get();
    }

    public void setMatName(String s){

        matName.set(s);
    }
    public void setMatCount(int i){
        matCount.set(i);
    }

}