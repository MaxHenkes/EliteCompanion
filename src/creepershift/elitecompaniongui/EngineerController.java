package creepershift.elitecompaniongui;

import creepershift.journalparser.mods.Mods;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.DragEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;

public class EngineerController implements Initializable {


    public TextArea consoleLog;
    public TextField commanderID;
    public TextField creditID;
    public TextField shipID;
    public ComboBox<String> categoryDBox;
    public ComboBox<String> modDBox;
    public ComboBox<String> moduleDBox;
    public Button addToMyModsButton;
    public ComboBox<String> boxTier;
    public TextArea modIngredientList;
    public MaterialController controller;
    public Stage mainStage;
    private Stage stage;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        consoleLog.setEditable(false);
        commanderID.setEditable(false);
        creditID.setEditable(false);
        shipID.setEditable(false);


        modDBox.setDisable(true);
        moduleDBox.setDisable(true);
        addToMyModsButton.setVisible(false);
        boxTier.setDisable(true);
        modIngredientList.setVisible(false);
        modIngredientList.setEditable(false);

        categoryDBox.setItems(FXCollections.observableArrayList("Weapons", "Core Internals", "Optional Internals", "Utility"));

        FXMLLoader loader = new FXMLLoader(getClass().getResource("materials.fxml"));
        Parent root = null;
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        controller = loader.getController();
        stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Materials");
        stage.setResizable(false);
        stage.initStyle(StageStyle.UNDECORATED);



    }

    public void setLabels(String[] labels) {

        NumberFormat format = NumberFormat.getNumberInstance();
        String creditString = format.format(Long.parseLong(labels[1]));

        if (!commanderID.getText().equalsIgnoreCase(labels[0]) || !shipID.getText().equalsIgnoreCase(labels[2]) || !creditID.getText().equalsIgnoreCase(creditString)) {
            commanderID.setText(labels[0]);
            creditID.setText(creditString);
            shipID.setText(labels[2]);
        }

    }

    public void setConsoleLog(String[] log) {

        String text2 = "";
        for (String s : log) {

            if (s == null) {
                text2 = text2 + "" + "\n";
            } else {
                text2 = text2 + s + "\n";
            }
        }

        consoleLog.setText(text2);
    }




    public void onCategoryBoxAction(ActionEvent actionEvent) {

       setBoxForContent(moduleDBox, Main.lang.getTechName(categoryDBox.getValue()));


    }

    public void onModuleBoxAction(ActionEvent actionEvent) {

        setBoxForContent(modDBox, moduleDBox.getValue());

    }

    public void onModBoxAction(ActionEvent actionEvent) {


        setBoxForContent(boxTier, null);
    }


    public void addToMyModsAction(ActionEvent actionEvent) {

        Main.logOutput.addNotFormattedString("Added Mod to Collection.");

    }

    public void onTierChoose(ActionEvent actionEvent) {

        modIngredientList.setVisible(true);

        modIngredientList.setText(Mods.getCategory(Main.lang.getTechName(categoryDBox.getValue())).getComponent(moduleDBox.getValue()).getMod(Main.lang.getTechName(modDBox.getValue()))
                .getRecipeForTiers()[Integer.parseInt(Main.lang.getTechName(boxTier.getValue()))]);


    }


    private void setBoxForContent(ComboBox<String> box, String name){


        if (box.equals(moduleDBox)) {
            box.setDisable(false);
            box.setItems(FXCollections.observableArrayList(Mods.getCategory(name).returnComponents()));
            modDBox.setDisable(true);
            boxTier.setDisable(true);
        } else if(box.equals(modDBox)){
            box.setDisable(false);
            box.setItems(FXCollections.observableArrayList(Mods.getCategory(Main.lang.getTechName(categoryDBox.getValue())).getComponent(name).returnMods()));
            boxTier.setDisable(true);
        }else if(box.equals(boxTier)){
            addToMyModsButton.setVisible(true);
            box.setDisable(false);
            box.setItems(FXCollections.observableArrayList("Grade 1", "Grade 2", "Grade 3", "Grade 4", "Grade 5"));
        }






    }

    @FXML
    public void onShowMaterialsButton(ActionEvent actionEvent) throws IOException {



        if(stage.isShowing()) {

            stage.close();


        }else{

            stage.setX(mainStage.getX() + mainStage.getWidth()-5);
            stage.setY(mainStage.getY());
            stage.show();

        }

    }

    public void onbutton(ActionEvent actionEvent) {

        System.out.println(stage.getX() +" - " + stage.getY());
    }

    @FXML
    public void onWindowDragDone(DragEvent dragEvent) {

        System.out.println(mainStage.getX() + mainStage.getWidth());

        stage.setX(mainStage.getX() + mainStage.getWidth());
        stage.setY(mainStage.getY());


    }

    public void closeStage(){
        stage.close();
    }

    //  x       y
    //1254.0 - 175.0

}
