package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;


public class EditProjectController implements Initializable {

    public TableView<Furniture> furnitureTableView;
    public TableColumn<Furniture, String> colNameFurniture;
    public TableColumn<Furniture, Boolean> tabcolActivePFurniture;
    public TableColumn<Furniture, Boolean> tabcolActiveCFurniture;
    public TableColumn<Furniture, String> colUnitFurniture;
    public TableColumn<Furniture, String> colQuantityFurniture;
    public TableColumn<Furniture, String> colOrdinalPriceUnitFurniture;
    public TableColumn<Furniture, String> colPriceCPUnitFurniture;
    public TableColumn<Furniture, String> colPriceCPKeyFurniture;
    public TableColumn<Furniture, String> colCostCPUnitFurniture;
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



    public TableView<MaterialWall> materialTableViewWall;
    public TableColumn<MaterialWall, String> colNameMaterialWall;
    public TableColumn<MaterialWall, Boolean> tabcolActivePMaterialWall;
    public TableColumn<MaterialWall, Boolean> tabcolActiveCMaterialWall;
    public TableColumn<MaterialWall, String> colUnitMaterialWall;
    public TableColumn<MaterialWall, String> colQuantityMaterialWall;
    public TableColumn<MaterialWall, String> colOrdinalPriceUnitMaterialWall;
    public TableColumn<MaterialWall, String> colPriceCPUnitMaterialWall;
    public TableColumn<MaterialWall, String> colPriceCPKeyMaterialWall;
    public TableColumn<MaterialWall, String> colCostCPUnitMaterialWall;
    public TableColumn<MaterialWall, String> colPriceOrderMaterialWall;
    public TableColumn<MaterialWall, String> colCostCPMaterialWall;
    public TableColumn<MaterialWall, String> colProductionTimeMaterialWall;
    public TableColumn<MaterialWall, String> colActualCostMaterialWall;
    public TableColumn<MaterialWall, String> colActualDifferenceMaterialWall;
    public TableColumn<MaterialWall, String> colPaidMaterialWall;
    public TableColumn<MaterialWall, String> colResidueMaterialWall;
    public TableColumn<MaterialWall, String> colDateOfDeliveryMaterialWall;
    public TableColumn<MaterialWall, String> colPlannedCPMaterialWall;
    public TableColumn<MaterialWall, String> colActualCPMaterialWall;
    public TableColumn<MaterialWall, String> colAccountMaterialWall;
    public TableColumn<MaterialWall, String> colContactsMaterialWall;
    public TableColumn<MaterialWall, String> colNotesMaterialWall;
    public TableColumn<MaterialWall, String> colCharacteristicsMaterialWall;


    public Button createRoomButton;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        colNameFurniture.setCellValueFactory(new PropertyValueFactory<>("nameFurniture"));
        colUnitFurniture.setCellValueFactory(new PropertyValueFactory<>("unitFurniture"));
        colQuantityFurniture.setCellValueFactory(new PropertyValueFactory<>("quantityFurniture"));
        colOrdinalPriceUnitFurniture.setCellValueFactory(new PropertyValueFactory<>("ordinalPriceUnitFurniture"));
        colPriceCPUnitFurniture.setCellValueFactory(new PropertyValueFactory<>("priceCPUnitFurniture"));
        colPriceCPKeyFurniture.setCellValueFactory(new PropertyValueFactory<>("priceCPKeyFurniture"));
        colCostCPUnitFurniture.setCellValueFactory(new PropertyValueFactory<>("costCPUnitFurniture"));
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

        colNameMaterialWall.setCellValueFactory(new PropertyValueFactory<>("nameMaterialWall"));
        colUnitMaterialWall.setCellValueFactory(new PropertyValueFactory<>("unitMaterialWall"));
        colQuantityMaterialWall.setCellValueFactory(new PropertyValueFactory<>("quantityMaterialWall"));
        colOrdinalPriceUnitMaterialWall.setCellValueFactory(new PropertyValueFactory<>("ordinalPriceUnitMaterialWall"));
        colPriceCPUnitMaterialWall.setCellValueFactory(new PropertyValueFactory<>("priceCPUnitMaterialWall"));
        colPriceCPKeyMaterialWall.setCellValueFactory(new PropertyValueFactory<>("priceCPKeyMaterialWall"));
        colCostCPUnitMaterialWall.setCellValueFactory(new PropertyValueFactory<>("costCPUnitMaterialWall"));
        colPriceOrderMaterialWall.setCellValueFactory(new PropertyValueFactory<>("priceOrderMaterialWall"));
        colCostCPMaterialWall.setCellValueFactory(new PropertyValueFactory<>("costCPMaterialWall"));
        colProductionTimeMaterialWall.setCellValueFactory(new PropertyValueFactory<>("productionTimeMaterialWall"));
        colActualCostMaterialWall.setCellValueFactory(new PropertyValueFactory<>("actualCostMaterialWall"));
        colActualDifferenceMaterialWall.setCellValueFactory(new PropertyValueFactory<>("actualDifferenceMaterialWall"));
        colPaidMaterialWall.setCellValueFactory(new PropertyValueFactory<>("paidMaterialWall"));
        colResidueMaterialWall.setCellValueFactory(new PropertyValueFactory<>("residueMaterialWall"));
        colDateOfDeliveryMaterialWall.setCellValueFactory(new PropertyValueFactory<>("dateOfDeliveryMaterialWall"));
        colPlannedCPMaterialWall.setCellValueFactory(new PropertyValueFactory<>("plannedCPMaterialWall"));
        colActualCPMaterialWall.setCellValueFactory(new PropertyValueFactory<>("actualCPMaterialWall"));
        colAccountMaterialWall.setCellValueFactory(new PropertyValueFactory<>("accountMaterialWall"));
        colContactsMaterialWall.setCellValueFactory(new PropertyValueFactory<>("contactsMaterialWall"));
        colNotesMaterialWall.setCellValueFactory(new PropertyValueFactory<>("notesMaterialWall"));
        colCharacteristicsMaterialWall.setCellValueFactory(new PropertyValueFactory<>("characteristicsMaterialWall"));


        furnitureTableView.setItems(observableListFurniture);
        furnitureTableView.setEditable(true);

        materialTableViewWall.setItems(observableListMaterialWall);
        materialTableViewWall.setEditable(true);


        colNameFurniture.setCellFactory(TextFieldTableCell.forTableColumn());
        colUnitFurniture.setCellFactory(TextFieldTableCell.forTableColumn());
        colQuantityFurniture.setCellFactory(TextFieldTableCell.forTableColumn());
        colOrdinalPriceUnitFurniture.setCellFactory(TextFieldTableCell.forTableColumn());
        colPriceCPUnitFurniture.setCellFactory(TextFieldTableCell.forTableColumn());
        colPriceCPKeyFurniture.setCellFactory(TextFieldTableCell.forTableColumn());
        colCostCPUnitFurniture.setCellFactory(TextFieldTableCell.forTableColumn());
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

        colNameMaterialWall.setCellFactory(TextFieldTableCell.forTableColumn());
        colUnitMaterialWall.setCellFactory(TextFieldTableCell.forTableColumn());
        colQuantityMaterialWall.setCellFactory(TextFieldTableCell.forTableColumn());
        colOrdinalPriceUnitMaterialWall.setCellFactory(TextFieldTableCell.forTableColumn());
        colPriceCPUnitMaterialWall.setCellFactory(TextFieldTableCell.forTableColumn());
        colPriceCPKeyMaterialWall.setCellFactory(TextFieldTableCell.forTableColumn());
        colCostCPUnitMaterialWall.setCellFactory(TextFieldTableCell.forTableColumn());
        colPriceOrderMaterialWall.setCellFactory(TextFieldTableCell.forTableColumn());
        colCostCPMaterialWall.setCellFactory(TextFieldTableCell.forTableColumn());
        colProductionTimeMaterialWall.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCostMaterialWall.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualDifferenceMaterialWall.setCellFactory(TextFieldTableCell.forTableColumn());
        colPaidMaterialWall.setCellFactory(TextFieldTableCell.forTableColumn());
        colResidueMaterialWall.setCellFactory(TextFieldTableCell.forTableColumn());
        colDateOfDeliveryMaterialWall.setCellFactory(TextFieldTableCell.forTableColumn());
        colPlannedCPMaterialWall.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCPMaterialWall.setCellFactory(TextFieldTableCell.forTableColumn());
        colAccountMaterialWall.setCellFactory(TextFieldTableCell.forTableColumn());
        colContactsMaterialWall.setCellFactory(TextFieldTableCell.forTableColumn());
        colNotesMaterialWall.setCellFactory(TextFieldTableCell.forTableColumn());
        colCharacteristicsMaterialWall.setCellFactory(TextFieldTableCell.forTableColumn());
    }

    ObservableList<Furniture> observableListFurniture = FXCollections.observableArrayList(
//            new Furniture("Ведро", "шт", "2"),
//            new Furniture("Лопата", "шт", "5"),
            new Furniture(),
            new Furniture(),
            new Furniture()
    );

    ObservableList<MaterialWall> observableListMaterialWall = FXCollections.observableArrayList(
            new MaterialWall(),
            new MaterialWall(),
            new MaterialWall()
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
