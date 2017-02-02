package creepershift.elitecompanion.gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Max on 1/31/2017.
 */
public class Terminator extends WindowAdapter {
    public void windowClosing(WindowEvent e){
        System.exit(0);

    }
}
