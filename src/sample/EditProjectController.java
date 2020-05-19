package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.net.URL;
import java.util.ResourceBundle;


public class EditProjectController implements Initializable {

    public AnchorPane anchorPane;
    public TableView<Furniture> furnitureTableView;
    public TableColumn<Furniture, String> colNameFurniture;
    public TableColumn<Furniture, Boolean> tabcolActiveP;
    public TableColumn<Furniture, Boolean> tabcolActiveC;
    public TableColumn<Furniture, String> colUnitFurniture;
    public TableColumn<Furniture, String> colQuantityFurniture;

    private ObservableList<Furniture> furnitureList = FXCollections.observableArrayList();


    public Button createRoomButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

//        furnitureTableView.setItems(furnitureList);
//        Callback<TableColumn<Furniture, String>, TableCell<Furniture, String>> cellFactoryInteger =
//                new Callback<TableColumn<Furniture, String>, TableCell<Furniture, String>>() {
//                    public TableCell call(TableColumn p) {
//                        return new EditingCellTextBox("\\d");
//                    }
//                };


    }

    private void initTable() {
        initCols();
    }

    private void initCols() {
        colNameFurniture.setCellValueFactory(new PropertyValueFactory<>("nameFurniture"));
        colUnitFurniture.setCellValueFactory(new PropertyValueFactory<>("unitFurniture"));
        colQuantityFurniture.setCellValueFactory(new PropertyValueFactory<>("quantityFurniture"));

        editableCols();
    }

    private void editableCols() {
        colNameFurniture.setCellFactory(TextFieldTableCell.forTableColumn());

        colNameFurniture.setOnEditCommit(e -> {
            e.getTableView().getItems().get(e.getTablePosition().getRow()).setNameFurniture(e.getNewValue());
        });

        colUnitFurniture.setCellFactory(TextFieldTableCell.forTableColumn());

        colUnitFurniture.setOnEditCommit(e -> {
            e.getTableView().getItems().get(e.getTablePosition().getRow()).setUnitFurniture(e.getNewValue());
        });

        colQuantityFurniture.setCellFactory(TextFieldTableCell.forTableColumn());

        colQuantityFurniture.setOnEditCommit(e -> {
            e.getTableView().getItems().get(e.getTablePosition().getRow()).setQuantityFurniture(e.getNewValue());
        });

        furnitureTableView.setEditable(true);

    }

    private void loadData(){
        ObservableList <Furniture> furnitureObservableList = FXCollections.observableArrayList();

    }


    public void addElementFurniture(ActionEvent actionEvent) {
    }

    public void deleteElementFurniture(ActionEvent actionEvent) {
    }

    public void saveElementFurniture(ActionEvent actionEvent) {
    }

    public void addRoom(ActionEvent actionEvent) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("RoomName.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("УД Бюджет");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void addPayment(ActionEvent actionEvent) {
    }


}
