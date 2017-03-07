package creepershift.journalparser;

import creepershift.journalparser.app.CommanderData;
import creepershift.journalparser.app.MaterialDataHandler;
import creepershift.journalparser.app.storage.AppStorage;
import creepershift.journalparser.parser.ParseJournal;
import creepershift.journalparser.util.LogOutput;

import java.io.File;

/**
 * EliteCompanion
 * Created by Max on 2/28/2017.
 */
public class ParserMain extends Thread {

    private AppStorage appStorage;
    private MaterialDataHandler matHandler;
    private LogOutput log;
    private boolean doParse = true;
    private int sleepTimer = 5000;
    private volatile Thread thread;
    private boolean startup = true;
    private CommanderData commanderData;

    public ParserMain(AppStorage appst, MaterialDataHandler mats, LogOutput log, CommanderData cmdrData) {

        appStorage = appst;
        matHandler = mats;
        commanderData = cmdrData;
        this.log = log;
        thread = new Thread(this);
        thread.start();
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


                if (startup) {
                    ParseJournal parser = new ParseJournal(getLatestFile(journals), matHandler, appStorage, log, commanderData, startup);

                    startup = false;
                    continue;
                }


                for (File file : journals) {

                    if (!file.getName().endsWith(".log")) {
                        continue;
                    }

                    try {
                        String[] s = file.getName().split("^Journal.");
                        String[] s1 = s[1].split(".01.log$");

                        if (appStorage.lastFileNumber() == null || (Double.parseDouble(appStorage.lastFileNumber()) <= Double.parseDouble(s1[0]))) {

                            ParseJournal parser = new ParseJournal(file, matHandler, appStorage, log, commanderData, startup);

                        }

                    } catch (ArrayIndexOutOfBoundsException e) {
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

    private File getLatestFile(File[] files) {

        File latestFile = null;
        String latestString = null;

        for (File file : files) {

            try {
                String[] s = file.getName().split("^Journal.");
                String[] s1 = s[1].split(".01.log$");

                if (latestFile == null) {
                    latestFile = file;
                    latestString = s1[0];
                } else if (Double.parseDouble(s1[0]) > Double.parseDouble(latestString)) {
                    latestFile = file;
                    latestString = s1[0];
                }


            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
            }

        }

        return latestFile;
    }

}
