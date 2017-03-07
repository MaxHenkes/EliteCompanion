package creepershift.elitecompaniongui;

import creepershift.elitecompaniongui.data.Table;
import creepershift.journalparser.app.MaterialData;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * EliteCompanion
 * Created by Max on 2/26/2017.
 */
public class MaterialController implements Initializable {


    @FXML
    private TableView<Table> table;

    @FXML
    private TableColumn<Table, String> materialTable;

    @FXML
    private TableColumn<Table, Integer> amountTable;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        materialTable.setCellValueFactory(new PropertyValueFactory<Table, String>("matName"));
        amountTable.setCellValueFactory(new PropertyValueFactory<Table, Integer>("matCount"));
    }


    public void displayTable() {

        ObservableList<Table> data = FXCollections.observableArrayList();

        for (MaterialData mat : Main.matHandler.getMaterials()) {

            data.add(new Table(mat.getMaterialCount(), Main.lang.getLangName(mat.getMaterialName())));
        }

        table.setItems(data);

    }
}
