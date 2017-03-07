package creepershift.elitecompaniongui;

import creepershift.elitecompaniongui.lang.Lang;
import creepershift.journalparser.ParserMain;
import creepershift.journalparser.Reference;
import creepershift.journalparser.app.CommanderData;
import creepershift.journalparser.app.MaterialDataHandler;
import creepershift.journalparser.app.storage.AppStorage;
import creepershift.journalparser.mods.Mods;
import creepershift.journalparser.util.LogOutput;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Main extends Application {

    public ParserMain  parser;
    public static LogOutput logOutput;
    public static EngineerController controller;
    public static Lang lang;
    public static Mods mods;
    public static MaterialDataHandler matHandler;
    AppStorage appStr;

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("about.fxml"));
        Parent root = loader.load();
        controller = loader.getController();
        primaryStage.setTitle("Elite: Companion");
        primaryStage.setScene(new Scene(root, 600, 475));
        primaryStage.setResizable(false);
        primaryStage.show();
        controller.mainStage = primaryStage;
        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {


                parser.stopThread();
                controller.closeStage();
                appStr.saveData();
            }
        });
        mods = new Mods();
        mods.initMods();
        logOutput = new LogOutput(13);
        logOutput.addNotFormattedString("Welcome Commander!");
        lang = new Lang(getClass().getResourceAsStream("/creepershift/elitecompaniongui/assets/Lang.txt"));
        matHandler = new MaterialDataHandler();
        appStr = new AppStorage(Reference.dataDirectory, Reference.appDataFile);
        CommanderData cmdrData = new CommanderData(controller);
        parser = new ParserMain(appStr, matHandler, logOutput, cmdrData);

    }


    public static void main(String[] args) {
        launch(args);
    }
}
