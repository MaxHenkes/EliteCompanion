package creepershift.journalparser;

import creepershift.journalparser.app.storage.AppStorage;
import creepershift.journalparser.app.storage.MaterialStorage;
import creepershift.journalparser.parser.ParseJournal;
import creepershift.journalparser.util.LogOutput;

import java.io.File;

/**
 * EliteCompanion
 * Created by Max on 2/28/2017.
 */
public class ParserMain extends Thread {

    private AppStorage appStorage;
    private MaterialStorage materialStorage;
    LogOutput log;
    private boolean doParse = true;
    private int sleepTimer = 5000;
    private LogOutput logOutput;
    private volatile Thread thread;
    ParseJournal parser;

    public ParserMain(AppStorage appst, MaterialStorage matst, LogOutput log) {

        appStorage = appst;
        materialStorage = matst;
        logOutput = log;
        thread = new Thread(this);
        thread.start();
        parser = new ParseJournal(Reference.COMMANDER_NAME);


    }


    @Override
    public void run() {

        /*
        Start the thread, set it to our global variable,
        let's us pause/kill the thread from outside later on.
         */
        Thread thisThread = Thread.currentThread();
        while (doParse && thread == thisThread) {


            File[] journals = new File(Reference.eliteDirectory).listFiles();
            if (journals != null) {

                for (File file : journals) {

                    if (!file.getName().endsWith(".log")) {
                        continue;
                    }

                    try {
                        String[] s = file.getName().split("^Journal.");
                        String[] s1 = s[1].split(".01.log$");

                        if (appStorage.lastFileNumber() == null || (Double.parseDouble(appStorage.lastFileNumber()) <= Double.parseDouble(s1[0]))) {

                            parser.loadFile(file);

                        }

                    }catch(ArrayIndexOutOfBoundsException e){
                        e.printStackTrace();
                    }
                }

            }


            try {
                thisThread.sleep(sleepTimer);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


    public void stopThread() {
        thread = null;
    }

    public void setParse(boolean parse) {
        doParse = parse;
    }

    public void setSleepTimer(int time) {
        sleepTimer = time;
    }
}
