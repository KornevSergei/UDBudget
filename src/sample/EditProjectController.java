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
    public TableColumn<Furniture, Boolean> colActivePFurniture;
    public TableColumn<Furniture, Boolean> colActiveCFurniture;
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
    public TableColumn<MaterialWall, Boolean> colActivePMaterialWall;
    public TableColumn<MaterialWall, Boolean> colActiveCMaterialWall;
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

    public TableView<MaterialFloor> materialTableViewFloor;
    public TableColumn<MaterialFloor, String> colNameMaterialFloor;
    public TableColumn<MaterialFloor, Boolean> colActivePMaterialFloor;
    public TableColumn<MaterialFloor, Boolean> colActiveCMaterialFloor;
    public TableColumn<MaterialFloor, String> colUnitMaterialFloor;
    public TableColumn<MaterialFloor, String> colQuantityMaterialFloor;
    public TableColumn<MaterialFloor, String> colOrdinalPriceUnitMaterialFloor;
    public TableColumn<MaterialFloor, String> colPriceCPUnitMaterialFloor;
    public TableColumn<MaterialFloor, String> colPriceCPKeyMaterialFloor;
    public TableColumn<MaterialFloor, String> colCostCPUnitMaterialFloor;
    public TableColumn<MaterialFloor, String> colPriceOrderMaterialFloor;
    public TableColumn<MaterialFloor, String> colCostCPMaterialFloor;
    public TableColumn<MaterialFloor, String> colProductionTimeMaterialFloor;
    public TableColumn<MaterialFloor, String> colActualCostMaterialFloor;
    public TableColumn<MaterialFloor, String> colActualDifferenceMaterialFloor;
    public TableColumn<MaterialFloor, String> colPaidMaterialFloor;
    public TableColumn<MaterialFloor, String> colResidueMaterialFloor;
    public TableColumn<MaterialFloor, String> colDateOfDeliveryMaterialFloor;
    public TableColumn<MaterialFloor, String> colPlannedCPMaterialFloor;
    public TableColumn<MaterialFloor, String> colActualCPMaterialFloor;
    public TableColumn<MaterialFloor, String> colAccountMaterialFloor;
    public TableColumn<MaterialFloor, String> colContactsMaterialFloor;
    public TableColumn<MaterialFloor, String> colNotesMaterialFloor;
    public TableColumn<MaterialFloor, String> colCharacteristicsMaterialFloor;

    public TableView<MaterialCeiling> materialTableViewCeiling;
    public TableColumn<MaterialCeiling, String> colNameMaterialCeiling;
    public TableColumn<MaterialCeiling, Boolean> colActivePMaterialCeiling;
    public TableColumn<MaterialCeiling, Boolean> colActiveCMaterialCeiling;
    public TableColumn<MaterialCeiling, String> colUnitMaterialCeiling;
    public TableColumn<MaterialCeiling, String> colQuantityMaterialCeiling;
    public TableColumn<MaterialCeiling, String> colOrdinalPriceUnitMaterialCeiling;
    public TableColumn<MaterialCeiling, String> colPriceCPUnitMaterialCeiling;
    public TableColumn<MaterialCeiling, String> colPriceCPKeyMaterialCeiling;
    public TableColumn<MaterialCeiling, String> colCostCPUnitMaterialCeiling;
    public TableColumn<MaterialCeiling, String> colPriceOrderMaterialCeiling;
    public TableColumn<MaterialCeiling, String> colCostCPMaterialCeiling;
    public TableColumn<MaterialCeiling, String> colProductionTimeMaterialCeiling;
    public TableColumn<MaterialCeiling, String> colActualCostMaterialCeiling;
    public TableColumn<MaterialCeiling, String> colActualDifferenceMaterialCeiling;
    public TableColumn<MaterialCeiling, String> colPaidMaterialCeiling;
    public TableColumn<MaterialCeiling, String> colResidueMaterialCeiling;
    public TableColumn<MaterialCeiling, String> colDateOfDeliveryMaterialCeiling;
    public TableColumn<MaterialCeiling, String> colPlannedCPMaterialCeiling;
    public TableColumn<MaterialCeiling, String> colActualCPMaterialCeiling;
    public TableColumn<MaterialCeiling, String> colAccountMaterialCeiling;
    public TableColumn<MaterialCeiling, String> colContactsMaterialCeiling;
    public TableColumn<MaterialCeiling, String> colNotesMaterialCeiling;
    public TableColumn<MaterialCeiling, String> colCharacteristicsMaterialCeiling;


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

        colNameMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("nameMaterialFloor"));
        colUnitMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("unitMaterialFloor"));
        colQuantityMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("quantityMaterialFloor"));
        colOrdinalPriceUnitMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("ordinalPriceUnitMaterialFloor"));
        colPriceCPUnitMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("priceCPUnitMaterialFloor"));
        colPriceCPKeyMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("priceCPKeyMaterialFloor"));
        colCostCPUnitMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("costCPUnitMaterialFloor"));
        colPriceOrderMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("priceOrderMaterialFloor"));
        colCostCPMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("costCPMaterialFloor"));
        colProductionTimeMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("productionTimeMaterialFloor"));
        colActualCostMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("actualCostMaterialFloor"));
        colActualDifferenceMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("actualDifferenceMaterialFloor"));
        colPaidMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("paidMaterialFloor"));
        colResidueMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("residueMaterialFloor"));
        colDateOfDeliveryMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("dateOfDeliveryMaterialFloor"));
        colPlannedCPMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("plannedCPMaterialFloor"));
        colActualCPMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("actualCPMaterialFloor"));
        colAccountMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("accountMaterialFloor"));
        colContactsMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("contactsMaterialFloor"));
        colNotesMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("notesMaterialFloor"));
        colCharacteristicsMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("characteristicsMaterialFloor"));

        colNameMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("nameMaterialCeiling"));
        colUnitMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("unitMaterialCeiling"));
        colQuantityMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("quantityMaterialCeiling"));
        colOrdinalPriceUnitMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("ordinalPriceUnitMaterialCeiling"));
        colPriceCPUnitMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("priceCPUnitMaterialCeiling"));
        colPriceCPKeyMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("priceCPKeyMaterialCeiling"));
        colCostCPUnitMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("costCPUnitMaterialCeiling"));
        colPriceOrderMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("priceOrderMaterialCeiling"));
        colCostCPMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("costCPMaterialCeiling"));
        colProductionTimeMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("productionTimeMaterialCeiling"));
        colActualCostMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("actualCostMaterialCeiling"));
        colActualDifferenceMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("actualDifferenceMaterialCeiling"));
        colPaidMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("paidMaterialCeiling"));
        colResidueMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("residueMaterialCeiling"));
        colDateOfDeliveryMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("dateOfDeliveryMaterialCeiling"));
        colPlannedCPMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("plannedCPMaterialCeiling"));
        colActualCPMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("actualCPMaterialCeiling"));
        colAccountMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("accountMaterialCeiling"));
        colContactsMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("contactsMaterialCeiling"));
        colNotesMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("notesMaterialCeiling"));
        colCharacteristicsMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("characteristicsMaterialCeiling"));


        furnitureTableView.setItems(observableListFurniture);
        materialTableViewWall.setItems(observableListMaterialWall);
        materialTableViewFloor.setItems(observableListMaterialFloor);
        materialTableViewCeiling.setItems(observableListMaterialCeiling);


        furnitureTableView.setEditable(true);
        materialTableViewWall.setEditable(true);
        materialTableViewFloor.setEditable(true);
        materialTableViewCeiling.setEditable(true);


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

        colNameMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());
        colUnitMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());
        colQuantityMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());
        colOrdinalPriceUnitMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());
        colPriceCPUnitMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());
        colPriceCPKeyMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());
        colCostCPUnitMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());
        colPriceOrderMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());
        colCostCPMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());
        colProductionTimeMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCostMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualDifferenceMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());
        colPaidMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());
        colResidueMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());
        colDateOfDeliveryMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());
        colPlannedCPMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCPMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());
        colAccountMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());
        colContactsMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());
        colNotesMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());
        colCharacteristicsMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());

        colNameMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colUnitMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colQuantityMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colOrdinalPriceUnitMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colPriceCPUnitMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colPriceCPKeyMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colCostCPUnitMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colPriceOrderMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colCostCPMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colProductionTimeMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCostMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualDifferenceMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colPaidMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colResidueMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colDateOfDeliveryMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colPlannedCPMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCPMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colAccountMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colContactsMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colNotesMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colCharacteristicsMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
    }

    ObservableList<Furniture> observableListFurniture = FXCollections.observableArrayList(
//            new Furniture("Ведро", "шт", "2"),
            new Furniture(),
            new Furniture(),
            new Furniture()
    );

    ObservableList<MaterialWall> observableListMaterialWall = FXCollections.observableArrayList(
            new MaterialWall(),
            new MaterialWall(),
            new MaterialWall()
    );

    ObservableList<MaterialFloor> observableListMaterialFloor = FXCollections.observableArrayList(
            new MaterialFloor(),
            new MaterialFloor(),
            new MaterialFloor()
    );

    ObservableList<MaterialCeiling> observableListMaterialCeiling = FXCollections.observableArrayList(
            new MaterialCeiling(),
            new MaterialCeiling(),
            new MaterialCeiling()
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
