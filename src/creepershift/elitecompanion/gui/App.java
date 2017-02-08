package creepershift.elitecompanion.gui;

import creepershift.elitecompanion.data.MaterialDataHandler;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by Max on 2/8/2017.
 */
public class App {
    public JPanel panelMain;
    public JTextArea textAreaMain;
    private JButton buttonRun;


    public App() {


        textAreaMain.setEditable(false);
        buttonRun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAreaMain.setText(MaterialDataHandler.printMaterial());
            }
        });
    }


    public static void init() {

        JFrame frame = new JFrame("Elite: Dangerous Companion");
        frame.setContentPane(new App().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(300, 300);


    }



}
