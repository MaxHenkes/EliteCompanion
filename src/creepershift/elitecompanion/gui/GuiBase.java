package creepershift.elitecompanion.gui;

import javax.swing.*;

/**
 * Created by Max on 1/31/2017.
 */
public class GuiBase extends JFrame{


public GuiBase(){
    addWindowListener(new Terminator());
    setTitle("Elite Companion");
    setSize(400,400);
    setLocation(10, 200);


}

public static void createGui(){
    JFrame frame = new GuiBase();

    frame.setVisible(true);


}



}
