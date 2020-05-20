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

    public TableView<Furniture> furnitureTableView;
    public TableColumn<Furniture, String> colNameFurniture;
    public TableColumn<Furniture, Boolean> tabcolActiveP;
    public TableColumn<Furniture, Boolean> tabcolActiveC;
    public TableColumn<Furniture, String> colUnitFurniture;
    public TableColumn<Furniture, String> colQuantityFurniture;
    public TableColumn<Furniture, String> colOrdinalPricePerUnitFurniture;
    public TableColumn<Furniture, String> colPriceCPPerUnitFurniture;
    public TableColumn<Furniture, String> colPriceCPPerKeyFurniture;
    public TableColumn<Furniture, String> colCostCPPerUnitFurniture;
    public TableColumn<Furniture, String> colPriceOrderFurniture;
    public TableColumn<Furniture, String> colCostCPFurniture;
    public TableColumn<Furniture, String> colProductionTimeFurniture;
    public TableColumn<Furniture, String> colActualCostFurniture;
    public TableColumn<Furniture, String> colActualDifferenceFurniture;
    public TableColumn<Furniture, String> colPaidFurniture;
    public TableColumn<Furniture, String> colResidueFurniture;
    public TableColumn<Furniture, String> colDateOfDeliveryFurniture;
    public TableColumn<Furniture, String> colPlannedCPFurniture;
    public TableColumn<Furniture, String> colActualCPFurniture;
    public TableColumn<Furniture, String> colAccountFurniture;
    public TableColumn<Furniture, String> colContactsFurniture;
    public TableColumn<Furniture, String> colNotesFurniture;
    public TableColumn<Furniture, String> colCharacteristicsFurniture;


    public Button createRoomButton;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        colNameFurniture.setCellValueFactory(new PropertyValueFactory<>("nameFurniture"));
        colUnitFurniture.setCellValueFactory(new PropertyValueFactory<>("unitFurniture"));
        colQuantityFurniture.setCellValueFactory(new PropertyValueFactory<>("quantityFurniture"));
        colOrdinalPricePerUnitFurniture.setCellValueFactory(new PropertyValueFactory<>("ordinalPricePerUnitFurniture"));
        colPriceCPPerUnitFurniture.setCellValueFactory(new PropertyValueFactory<>("priceCPPerUnitFurniture"));
        colPriceCPPerKeyFurniture.setCellValueFactory(new PropertyValueFactory<>("priceCPPerKeyFurniture"));
        colCostCPPerUnitFurniture.setCellValueFactory(new PropertyValueFactory<>("costCPPerUnitFurniture"));
        colPriceOrderFurniture.setCellValueFactory(new PropertyValueFactory<>("priceOrderFurniture"));
        colCostCPFurniture.setCellValueFactory(new PropertyValueFactory<>("costCPFurniture"));
        colProductionTimeFurniture.setCellValueFactory(new PropertyValueFactory<>("productionTimeFurniture"));
        colActualCostFurniture.setCellValueFactory(new PropertyValueFactory<>("actualCostFurniture"));
        colActualDifferenceFurniture.setCellValueFactory(new PropertyValueFactory<>("actualDifferenceFurniture"));
        colPaidFurniture.setCellValueFactory(new PropertyValueFactory<>("paidFurniture"));
        colResidueFurniture.setCellValueFactory(new PropertyValueFactory<>("residueFurniture"));
        colDateOfDeliveryFurniture.setCellValueFactory(new PropertyValueFactory<>("dateOfDeliveryFurniture"));
        colPlannedCPFurniture.setCellValueFactory(new PropertyValueFactory<>("plannedCPFurniture"));
        colActualCPFurniture.setCellValueFactory(new PropertyValueFactory<>("actualCPFurniture"));
        colAccountFurniture.setCellValueFactory(new PropertyValueFactory<>("accountFurniture"));
        colContactsFurniture.setCellValueFactory(new PropertyValueFactory<>("contactsFurniture"));
        colNotesFurniture.setCellValueFactory(new PropertyValueFactory<>("notesFurniture"));
        colCharacteristicsFurniture.setCellValueFactory(new PropertyValueFactory<>("characteristicsFurniture"));

        furnitureTableView.setItems(observableList);
        furnitureTableView.setEditable(true);

        colNameFurniture.setCellFactory(TextFieldTableCell.forTableColumn());
        colUnitFurniture.setCellFactory(TextFieldTableCell.forTableColumn());
        colQuantityFurniture.setCellFactory(TextFieldTableCell.forTableColumn());
        colOrdinalPricePerUnitFurniture.setCellFactory(TextFieldTableCell.forTableColumn());
        colPriceCPPerUnitFurniture.setCellFactory(TextFieldTableCell.forTableColumn());
        colPriceCPPerKeyFurniture.setCellFactory(TextFieldTableCell.forTableColumn());
        colCostCPPerUnitFurniture.setCellFactory(TextFieldTableCell.forTableColumn());
        colPriceOrderFurniture.setCellFactory(TextFieldTableCell.forTableColumn());
        colCostCPFurniture.setCellFactory(TextFieldTableCell.forTableColumn());
        colProductionTimeFurniture.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCostFurniture.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualDifferenceFurniture.setCellFactory(TextFieldTableCell.forTableColumn());
        colPaidFurniture.setCellFactory(TextFieldTableCell.forTableColumn());
        colResidueFurniture.setCellFactory(TextFieldTableCell.forTableColumn());
        colDateOfDeliveryFurniture.setCellFactory(TextFieldTableCell.forTableColumn());
        colPlannedCPFurniture.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCPFurniture.setCellFactory(TextFieldTableCell.forTableColumn());
        colAccountFurniture.setCellFactory(TextFieldTableCell.forTableColumn());
        colContactsFurniture.setCellFactory(TextFieldTableCell.forTableColumn());
        colNotesFurniture.setCellFactory(TextFieldTableCell.forTableColumn());
        colCharacteristicsFurniture.setCellFactory(TextFieldTableCell.forTableColumn());
    }

    ObservableList<Furniture> observableList = FXCollections.observableArrayList(
//            new Furniture("Ведро", "шт", "2"),
//            new Furniture("Лопата", "шт", "5"),
            new Furniture(),
            new Furniture(),
            new Furniture()
    );


    public void addElementFurniture(ActionEvent actionEvent) {
    }

    public void deleteElementFurniture(ActionEvent actionEvent) {
        ObservableList<Furniture> allFurniture, singleFurniture;
        allFurniture = furnitureTableView.getItems();
        singleFurniture = furnitureTableView.getSelectionModel().getSelectedItems();
        singleFurniture.forEach(allFurniture::remove);
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
