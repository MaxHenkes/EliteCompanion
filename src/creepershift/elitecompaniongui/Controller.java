package creepershift.elitecompaniongui;

import creepershift.elitecompaniongui.data.Table;
import creepershift.journalparser.app.MaterialData;
import creepershift.journalparser.app.MaterialDataHandler;
import creepershift.journalparser.mods.Mods;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;

public class Controller implements Initializable {


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

    @FXML
    private TableView<Table> table;

    @FXML
    private TableColumn<Table, String> materialTable;

    @FXML
    private TableColumn<Table, Integer> amountTable;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        consoleLog.setEditable(false);
        commanderID.setEditable(false);
        creditID.setEditable(false);
        shipID.setEditable(false);
        materialTable.setCellValueFactory(new PropertyValueFactory<Table, String>("matName"));
        amountTable.setCellValueFactory(new PropertyValueFactory<Table, Integer>("matCount"));

        modDBox.setDisable(true);
        moduleDBox.setDisable(true);
        addToMyModsButton.setVisible(false);
        boxTier.setDisable(true);
        modIngredientList.setVisible(false);
        modIngredientList.setEditable(false);

        categoryDBox.setItems(FXCollections.observableArrayList("Weapons", "Core Internals", "Optional Internals", "Utility"));


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


    public void displayTable() {

        ObservableList<Table> data = FXCollections.observableArrayList();

        for (MaterialData mat : MaterialDataHandler.mat) {

            data.add(new Table(mat.getMaterialCount(), Main.lang.getLangName(mat.getMaterialName())));
        }

        table.setItems(data);

    }

    public void onCategoryBoxAction(ActionEvent actionEvent) {

       setBoxForContent(moduleDBox, categoryDBox.getValue().toLowerCase());


    }

    public void onModuleBoxAction(ActionEvent actionEvent) {

        setBoxForContent(modDBox, moduleDBox.getValue().toLowerCase());

    }

    public void onModBoxAction(ActionEvent actionEvent) {


        setBoxForContent(boxTier, null);
    }


    public void addToMyModsAction(ActionEvent actionEvent) {

        Main.logOutput.addNotFormattedString("Added Mod to Collection.");

    }

    public void onTierChoose(ActionEvent actionEvent) {

        modIngredientList.setVisible(true);

        modIngredientList.setText(Main.mods.weapons.getComponent(Main.techLang.getLangName(moduleDBox.getValue())).getMod(Main.techLang.getLangName(modDBox.getValue()))
                .getRecipeForTiers()[Integer.parseInt(Main.techLang.getLangName(boxTier.getValue())) -1]);


    }


    private void setBoxForContent(ComboBox<String> box, String name){


        if (box.equals(moduleDBox)) {
            box.setDisable(false);
            box.setItems(FXCollections.observableArrayList(Mods.getCategory(name).returnComponents()));
        } else if(box.equals(modDBox)){
            box.setDisable(false);
            box.setItems(FXCollections.observableArrayList(Main.mods.weapons.getComponent(name).returnMods()));
        }else if(box.equals(boxTier)){
            addToMyModsButton.setVisible(true);
            box.setDisable(false);
            box.setItems(FXCollections.observableArrayList("Grade 1", "Grade 2", "Grade 3", "Grade 4", "Grade 5"));
        }






    }


}
