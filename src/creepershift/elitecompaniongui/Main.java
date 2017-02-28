package creepershift.elitecompaniongui;

import creepershift.elitecompaniongui.lang.Lang;
import creepershift.journalparser.ParserObject;
import creepershift.journalparser.Reference;
import creepershift.journalparser.app.storage.AppStorage;
import creepershift.journalparser.app.storage.MaterialStorage;
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

    public ParserObject parser;
    public static LogOutput logOutput;
    public static EngineerController controller;
    public static Lang lang;
    public static Mods mods;

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
            }
        });
        mods = new Mods();
        mods.initMods();
        logOutput = new LogOutput(13);
        logOutput.addNotFormattedString("Welcome Commander!");
        lang = new Lang(getClass().getResourceAsStream("/creepershift/elitecompaniongui/assets/Lang.txt"));


        parser = new ParserObject(new AppStorage(Reference.dataDirectory, Reference.appDataFile), new MaterialStorage(Reference.dataDirectory, Reference.materialDataFile), logOutput);
        controller.controller.displayTable();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
