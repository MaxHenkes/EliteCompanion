package creepershift.journalparser;

/**
 * JournalParser
 * Created by Max on 2/17/2017.
 */
public class ParserObject extends Thread{

    /*

    private AppStorage appStorage;
    private boolean doParse = true;
    private int sleepTimer = 5000;
    LogOutput logOutput;
    private volatile Thread thread;

    public ParserObject(AppStorage appStorage, LogOutput logOutput){

        this.appStorage = appStorage;
        this.logOutput = logOutput;
        thread = new Thread(this);
        thread.start();

    }

    public void stopThread(){
        thread = null;
    }

    public void setParse(boolean parse){
        doParse = parse;
    }

    public void setSleepTimer(int time){
        sleepTimer = time;
    }

    @Override
    public void run() {

        Thread thisThread = Thread.currentThread();
        while(doParse && thread == thisThread){

            File[] journalFiles;

                journalFiles = new File(Reference.eliteDirectory).listFiles();


            if (journalFiles != null) {
                for (File file : journalFiles) {

                    if (!file.getName().endsWith(".log")) {
                        continue;
                    }


                    String[] s = file.getName().split("^Journal.");
                    String[] s1 = s[1].split(".01.log$");




                    if (appStorage.lastFileNumber() == null || (Double.parseDouble(appStorage.lastFileNumber()) < Double.parseDouble(s1[0]))) {

                        loadJournalFile(file, false);


                    } else if ((Double.parseDouble(appStorage.lastFileNumber()) == Double.parseDouble(s1[0]))) {

                        loadJournalFile(file, true);

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





    private void loadJournalFile(File journal, boolean isCurrentFile) {

        //Returns a list of Strings, each containing a line in the specified file.
        List<String> journalLines;

        journalLines = LineWriter.getFileLines(Reference.eliteDirectory, journal.getName());
        //loops through the lines
        for (int i = 0; i < journalLines.size(); i++) {


            if (journalLines.get(i).contains(", \"event\":\"MaterialCollected\",")) {

                String[] line = ParserJson.parseCollectedString((journalLines.get(i)));

                if (isCurrentFile && TimeUtil.isAfter(line[2], appStorage.lastTimeStamp())) {


                    MaterialDataHandler.addEntry(line[0], Integer.parseInt(line[1]),"");

                    appStorage.updateData(journal.getName(), line[2]);
                    logOutput.addMaterialCollected(line[0], Integer.parseInt(line[1]), line[2]);

                }

                if (!isCurrentFile) {

                    MaterialDataHandler.addEntry(line[0], Integer.parseInt(line[1]),"");

                    appStorage.updateData(journal.getName(), line[2]);
                    logOutput.addMaterialCollected(line[0], Integer.parseInt(line[1]), line[2]);
                }


            }

            if (journalLines.get(i).contains(", \"event\":\"EngineerCraft\",")) {

                String time = ParserJson.parseMissionString((journalLines.get(i)));
                ArrayList<String> list = GsonParser.parseMaterials(journalLines.get(i));

                if (isCurrentFile && TimeUtil.isAfter(time, appStorage.lastTimeStamp())) {

                    appStorage.updateData(journal.getName(), time);

                    for (String string : list) {

                        MaterialDataHandler.removeEntry(string, 1,"");

                    }


                    logOutput.addEngineerCraft(list, time);

                }

                if (!isCurrentFile) {

                    appStorage.updateData(journal.getName(), time);

                    for (String string : list) {

                        MaterialDataHandler.removeEntry(string, 1,"");
                        logOutput.addEngineerCraft(list, time);
                    }

                }


            }


            if (journalLines.get(i).contains(", \"event\":\"MaterialDiscarded\",")) {

                String[] line = ParserJson.parseCollectedString((journalLines.get(i)));

                if (isCurrentFile && TimeUtil.isAfter(line[2], appStorage.lastTimeStamp())) {


                    MaterialDataHandler.removeEntry(line[0], Integer.parseInt(line[1]),"");

                    appStorage.updateData(journal.getName(), line[2]);
                    logOutput.addMaterialDiscarded(line[2], line[0], Integer.parseInt(line[1]));

                }

                if (!isCurrentFile) {

                    MaterialDataHandler.removeEntry(line[0], Integer.parseInt(line[1]),"");

                    appStorage.updateData(journal.getName(), line[2]);
                    logOutput.addMaterialDiscarded(line[2], line[0], Integer.parseInt(line[1]));
                }


            }

            if (journalLines.get(i).contains("\"event\":\"LoadGame\",")) {
            String[] line = ParserJson.parseStartupString((journalLines.get(i)));


            if(isCurrentFile){
                Main.controller.setLabels(line);
            }


            }


        }

        //In case stuff doesn't work. TODO: Implement error handling.


    }





*/

}

