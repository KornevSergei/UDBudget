package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.net.URL;
import java.util.ResourceBundle;


public class EditProjectController implements Initializable {

    public TableView<AK> AKTableView;
    public TableColumn<AK, String> colRateAK;
    public TableColumn<AK, String> colTermAK;
    public TableColumn<AK, String> colCostAK;
    private ObservableList<AK> observableListAK = FXCollections.observableArrayList();


    //Блок Мебели - доделать!!
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
    private ObservableList<Furniture> observableListFurniture = FXCollections.observableArrayList();


    //Блок материалов
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
    private ObservableList<MaterialWall> observableListMaterialWall = FXCollections.observableArrayList();


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
    private ObservableList<MaterialFloor> observableListMaterialFloor = FXCollections.observableArrayList();

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
    private ObservableList<MaterialCeiling> observableListMaterialCeiling = FXCollections.observableArrayList();

    public TableView<MaterialOther> materialTableViewOther;
    public TableColumn<MaterialOther, String> colNameMaterialOther;
    public TableColumn<MaterialOther, Boolean> colActivePMaterialOther;
    public TableColumn<MaterialOther, Boolean> colActiveCMaterialOther;
    public TableColumn<MaterialOther, String> colUnitMaterialOther;
    public TableColumn<MaterialOther, String> colQuantityMaterialOther;
    public TableColumn<MaterialOther, String> colOrdinalPriceUnitMaterialOther;
    public TableColumn<MaterialOther, String> colPriceCPUnitMaterialOther;
    public TableColumn<MaterialOther, String> colPriceCPKeyMaterialOther;
    public TableColumn<MaterialOther, String> colCostCPUnitMaterialOther;
    public TableColumn<MaterialOther, String> colPriceOrderMaterialOther;
    public TableColumn<MaterialOther, String> colCostCPMaterialOther;
    public TableColumn<MaterialOther, String> colProductionTimeMaterialOther;
    public TableColumn<MaterialOther, String> colActualCostMaterialOther;
    public TableColumn<MaterialOther, String> colActualDifferenceMaterialOther;
    public TableColumn<MaterialOther, String> colPaidMaterialOther;
    public TableColumn<MaterialOther, String> colResidueMaterialOther;
    public TableColumn<MaterialOther, String> colDateOfDeliveryMaterialOther;
    public TableColumn<MaterialOther, String> colPlannedCPMaterialOther;
    public TableColumn<MaterialOther, String> colActualCPMaterialOther;
    public TableColumn<MaterialOther, String> colAccountMaterialOther;
    public TableColumn<MaterialOther, String> colContactsMaterialOther;
    public TableColumn<MaterialOther, String> colNotesMaterialOther;
    public TableColumn<MaterialOther, String> colCharacteristicsMaterialOther;
    private ObservableList<MaterialOther> observableListMaterialOther = FXCollections.observableArrayList();

    public TableView<MaterialSuddenly> materialTableViewSuddenly;
    public TableColumn<MaterialSuddenly, String> colNameMaterialSuddenly;
    public TableColumn<MaterialSuddenly, Boolean> colActivePMaterialSuddenly;
    public TableColumn<MaterialSuddenly, Boolean> colActiveCMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colUnitMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colQuantityMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colOrdinalPriceUnitMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colPriceCPUnitMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colPriceCPKeyMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colCostCPUnitMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colPriceOrderMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colCostCPMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colProductionTimeMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colActualCostMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colActualDifferenceMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colPaidMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colResidueMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colDateOfDeliveryMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colPlannedCPMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colActualCPMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colAccountMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colContactsMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colNotesMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colCharacteristicsMaterialSuddenly;
    private ObservableList<MaterialSuddenly> observableListMaterialSuddenly = FXCollections.observableArrayList();


    //Блок Техники
    public TableView<AppliancesKitchen> appliancesTableViewKitchen;
    public TableColumn<AppliancesKitchen, String> colNameAppliancesKitchen;
    public TableColumn<AppliancesKitchen, Boolean> colActivePAppliancesKitchen;
    public TableColumn<AppliancesKitchen, Boolean> colActiveCAppliancesKitchen;
    public TableColumn<AppliancesKitchen, String> colUnitAppliancesKitchen;
    public TableColumn<AppliancesKitchen, String> colQuantityAppliancesKitchen;
    public TableColumn<AppliancesKitchen, String> colOrdinalPriceUnitAppliancesKitchen;
    public TableColumn<AppliancesKitchen, String> colPriceCPUnitAppliancesKitchen;
    public TableColumn<AppliancesKitchen, String> colPriceCPKeyAppliancesKitchen;
    public TableColumn<AppliancesKitchen, String> colCostCPUnitAppliancesKitchen;
    public TableColumn<AppliancesKitchen, String> colPriceOrderAppliancesKitchen;
    public TableColumn<AppliancesKitchen, String> colCostCPAppliancesKitchen;
    public TableColumn<AppliancesKitchen, String> colProductionTimeAppliancesKitchen;
    public TableColumn<AppliancesKitchen, String> colActualCostAppliancesKitchen;
    public TableColumn<AppliancesKitchen, String> colActualDifferenceAppliancesKitchen;
    public TableColumn<AppliancesKitchen, String> colPaidAppliancesKitchen;
    public TableColumn<AppliancesKitchen, String> colResidueAppliancesKitchen;
    public TableColumn<AppliancesKitchen, String> colDateOfDeliveryAppliancesKitchen;
    public TableColumn<AppliancesKitchen, String> colPlannedCPAppliancesKitchen;
    public TableColumn<AppliancesKitchen, String> colActualCPAppliancesKitchen;
    public TableColumn<AppliancesKitchen, String> colAccountAppliancesKitchen;
    public TableColumn<AppliancesKitchen, String> colContactsAppliancesKitchen;
    public TableColumn<AppliancesKitchen, String> colNotesAppliancesKitchen;
    public TableColumn<AppliancesKitchen, String> colCharacteristicsAppliancesKitchen;
    private ObservableList<AppliancesKitchen> observableListAppliancesKitchen = FXCollections.observableArrayList();

    public TableView<AppliancesOther> appliancesTableViewOther;
    public TableColumn<AppliancesOther, String> colNameAppliancesOther;
    public TableColumn<AppliancesOther, Boolean> colActivePAppliancesOther;
    public TableColumn<AppliancesOther, Boolean> colActiveCAppliancesOther;
    public TableColumn<AppliancesOther, String> colUnitAppliancesOther;
    public TableColumn<AppliancesOther, String> colQuantityAppliancesOther;
    public TableColumn<AppliancesOther, String> colOrdinalPriceUnitAppliancesOther;
    public TableColumn<AppliancesOther, String> colPriceCPUnitAppliancesOther;
    public TableColumn<AppliancesOther, String> colPriceCPKeyAppliancesOther;
    public TableColumn<AppliancesOther, String> colCostCPUnitAppliancesOther;
    public TableColumn<AppliancesOther, String> colPriceOrderAppliancesOther;
    public TableColumn<AppliancesOther, String> colCostCPAppliancesOther;
    public TableColumn<AppliancesOther, String> colProductionTimeAppliancesOther;
    public TableColumn<AppliancesOther, String> colActualCostAppliancesOther;
    public TableColumn<AppliancesOther, String> colActualDifferenceAppliancesOther;
    public TableColumn<AppliancesOther, String> colPaidAppliancesOther;
    public TableColumn<AppliancesOther, String> colResidueAppliancesOther;
    public TableColumn<AppliancesOther, String> colDateOfDeliveryAppliancesOther;
    public TableColumn<AppliancesOther, String> colPlannedCPAppliancesOther;
    public TableColumn<AppliancesOther, String> colActualCPAppliancesOther;
    public TableColumn<AppliancesOther, String> colAccountAppliancesOther;
    public TableColumn<AppliancesOther, String> colContactsAppliancesOther;
    public TableColumn<AppliancesOther, String> colNotesAppliancesOther;
    public TableColumn<AppliancesOther, String> colCharacteristicsAppliancesOther;
    private ObservableList<AppliancesOther> observableListAppliancesOther = FXCollections.observableArrayList();

    public TableView<AppliancesDelivery> appliancesTableViewDelivery;
    public TableColumn<AppliancesDelivery, String> colNameAppliancesDelivery;
    public TableColumn<AppliancesDelivery, Boolean> colActivePAppliancesDelivery;
    public TableColumn<AppliancesDelivery, Boolean> colActiveCAppliancesDelivery;
    public TableColumn<AppliancesDelivery, String> colUnitAppliancesDelivery;
    public TableColumn<AppliancesDelivery, String> colQuantityAppliancesDelivery;
    public TableColumn<AppliancesDelivery, String> colOrdinalPriceUnitAppliancesDelivery;
    public TableColumn<AppliancesDelivery, String> colPriceCPUnitAppliancesDelivery;
    public TableColumn<AppliancesDelivery, String> colPriceCPKeyAppliancesDelivery;
    public TableColumn<AppliancesDelivery, String> colCostCPUnitAppliancesDelivery;
    public TableColumn<AppliancesDelivery, String> colPriceOrderAppliancesDelivery;
    public TableColumn<AppliancesDelivery, String> colCostCPAppliancesDelivery;
    public TableColumn<AppliancesDelivery, String> colProductionTimeAppliancesDelivery;
    public TableColumn<AppliancesDelivery, String> colActualCostAppliancesDelivery;
    public TableColumn<AppliancesDelivery, String> colActualDifferenceAppliancesDelivery;
    public TableColumn<AppliancesDelivery, String> colPaidAppliancesDelivery;
    public TableColumn<AppliancesDelivery, String> colResidueAppliancesDelivery;
    public TableColumn<AppliancesDelivery, String> colDateOfDeliveryAppliancesDelivery;
    public TableColumn<AppliancesDelivery, String> colPlannedCPAppliancesDelivery;
    public TableColumn<AppliancesDelivery, String> colActualCPAppliancesDelivery;
    public TableColumn<AppliancesDelivery, String> colAccountAppliancesDelivery;
    public TableColumn<AppliancesDelivery, String> colContactsAppliancesDelivery;
    public TableColumn<AppliancesDelivery, String> colNotesAppliancesDelivery;
    public TableColumn<AppliancesDelivery, String> colCharacteristicsAppliancesDelivery;
    private ObservableList<AppliancesDelivery> observableListAppliancesDelivery = FXCollections.observableArrayList();

    public TableView<AppliancesSuddenly> appliancesTableViewSuddenly;
    public TableColumn<AppliancesSuddenly, String> colNameAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, Boolean> colActivePAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, Boolean> colActiveCAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colUnitAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colQuantityAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colOrdinalPriceUnitAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colPriceCPUnitAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colPriceCPKeyAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colCostCPUnitAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colPriceOrderAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colCostCPAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colProductionTimeAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colActualCostAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colActualDifferenceAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colPaidAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colResidueAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colDateOfDeliveryAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colPlannedCPAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colActualCPAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colAccountAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colContactsAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colNotesAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colCharacteristicsAppliancesSuddenly;
    private ObservableList<AppliancesSuddenly> observableListAppliancesSuddenly = FXCollections.observableArrayList();


    public Button createRoomButton;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        AKTableView.setItems(observableListAK);
        Callback<TableColumn<AK, String>, TableCell<AK, String>> cellFactoryDoubleAK =
                new Callback<TableColumn<AK, String>, TableCell<AK, String>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellTextBox("\\d.\\d");
                    }
                };


        colRateAK.setCellFactory(cellFactoryDoubleAK);
        colRateAK.setCellValueFactory(new PropertyValueFactory<>("rateAK"));
        colRateAK.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<AK, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<AK, String> t) {
                ((AK) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())).setRateAK(t.getNewValue());
                t.getTableView().refresh();
            }
        });

        colTermAK.setCellFactory(cellFactoryDoubleAK);
        colTermAK.setCellValueFactory(new PropertyValueFactory<>("termAK"));
        colTermAK.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<AK, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<AK, String> t) {
                ((AK) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())).setTermAK(t.getNewValue());
                t.getTableView().refresh();
            }
        });

        colCostAK.setCellFactory(cellFactoryDoubleAK);
        colCostAK.setCellValueFactory(new PropertyValueFactory<>("costAK"));
        colCostAK.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<AK, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<AK, String> t) {
                ((AK) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())).setCostAK(t.getNewValue());
            }
        });

        AKTableView.setEditable(true);




        //Материалы - стена
        materialTableViewWall.setItems(observableListMaterialWall);
        Callback<TableColumn<MaterialWall, String>, TableCell<MaterialWall, String>> cellFactoryDoubleMaterialWall =
                new Callback<TableColumn<MaterialWall, String>, TableCell<MaterialWall, String>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellTextBox("\\d.\\d");
                    }
                };
        Callback<TableColumn<MaterialWall, Boolean>, TableCell<MaterialWall, Boolean>> cellFactoryCheckboxMaterialWall =
                new Callback<TableColumn<MaterialWall, Boolean>, TableCell<MaterialWall, Boolean>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellCheckBox();
                    }
                };


        colNameMaterialWall.setCellValueFactory(new PropertyValueFactory<>("nameMaterialWall"));
        colNameMaterialWall.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialWall, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialWall, String> t) {
                        ((MaterialWall) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setNameMaterialWall(t.getNewValue());
                    }
                });
        colActivePMaterialWall.setCellFactory(cellFactoryCheckboxMaterialWall);
        colActivePMaterialWall.setCellValueFactory(new PropertyValueFactory<>("activePMaterialWall"));
        colActivePMaterialWall.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialWall, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialWall, Boolean> t) {
                        ((MaterialWall) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActivePMaterialWall(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActiveCMaterialWall.setCellFactory(cellFactoryCheckboxMaterialWall);
        colActiveCMaterialWall.setCellValueFactory(new PropertyValueFactory<>("activeCMaterialWall"));
        colActiveCMaterialWall.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialWall, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialWall, Boolean> t) {
                        ((MaterialWall) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActiveCMaterialWall(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colUnitMaterialWall.setCellValueFactory(new PropertyValueFactory<>("unitMaterialWall"));
        colUnitMaterialWall.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialWall, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialWall, String> t) {
                        ((MaterialWall) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setUnitMaterialWall(t.getNewValue());
                    }
                });
        colQuantityMaterialWall.setCellFactory(cellFactoryDoubleMaterialWall);
        colQuantityMaterialWall.setCellValueFactory(new PropertyValueFactory<>("quantityMaterialWall"));
        colQuantityMaterialWall.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialWall, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialWall, String> t) {
                        ((MaterialWall) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setQuantityMaterialWall(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colOrdinalPriceUnitMaterialWall.setCellFactory(cellFactoryDoubleMaterialWall);
        colOrdinalPriceUnitMaterialWall.setCellValueFactory(new PropertyValueFactory<>("ordinalPriceUnitMaterialWall"));
        colOrdinalPriceUnitMaterialWall.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialWall, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialWall, String> t) {
                        ((MaterialWall) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setOrdinalPriceUnitMaterialWall(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPUnitMaterialWall.setCellFactory(cellFactoryDoubleMaterialWall);
        colPriceCPUnitMaterialWall.setCellValueFactory(new PropertyValueFactory<>("priceCPUnitMaterialWall"));
        colPriceCPUnitMaterialWall.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialWall, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialWall, String> t) {
                        ((MaterialWall) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPriceCPUnitMaterialWall(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPKeyMaterialWall.setCellFactory(cellFactoryDoubleMaterialWall);
        colPriceCPKeyMaterialWall.setCellValueFactory(new PropertyValueFactory<>("priceCPKeyMaterialWall"));
        colPriceCPKeyMaterialWall.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialWall, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialWall, String> t) {
                        ((MaterialWall) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPriceCPKeyMaterialWall(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPUnitMaterialWall.setCellFactory(cellFactoryDoubleMaterialWall);
        colCostCPUnitMaterialWall.setCellValueFactory(new PropertyValueFactory<>("costCPUnitMaterialWall"));
        colCostCPUnitMaterialWall.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialWall, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialWall, String> t) {
                        ((MaterialWall) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setCostCPUnitMaterialWall(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceOrderMaterialWall.setCellFactory(cellFactoryDoubleMaterialWall);
        colPriceOrderMaterialWall.setCellValueFactory(new PropertyValueFactory<>("priceOrderMaterialWall"));
        colPriceOrderMaterialWall.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialWall, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialWall, String> t) {
                        ((MaterialWall) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPriceOrderMaterialWall(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPMaterialWall.setCellFactory(cellFactoryDoubleMaterialWall);
        colCostCPMaterialWall.setCellValueFactory(new PropertyValueFactory<>("costCPMaterialWall"));
        colCostCPMaterialWall.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialWall, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialWall, String> t) {
                        ((MaterialWall) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setCostCPMaterialWall(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colProductionTimeMaterialWall.setCellFactory(cellFactoryDoubleMaterialWall);
        colProductionTimeMaterialWall.setCellValueFactory(new PropertyValueFactory<>("productionTimeMaterialWall"));
        colProductionTimeMaterialWall.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialWall, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialWall, String> t) {
                        ((MaterialWall) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setProductionTimeMaterialWall(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualCostMaterialWall.setCellFactory(cellFactoryDoubleMaterialWall);
        colActualCostMaterialWall.setCellValueFactory(new PropertyValueFactory<>("actualCostMaterialWall"));
        colActualCostMaterialWall.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialWall, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialWall, String> t) {
                        ((MaterialWall) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActualCostMaterialWall(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualDifferenceMaterialWall.setCellFactory(cellFactoryDoubleMaterialWall);
        colActualDifferenceMaterialWall.setCellValueFactory(new PropertyValueFactory<>("actualDifferenceMaterialWall"));
        colActualDifferenceMaterialWall.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialWall, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialWall, String> t) {
                        ((MaterialWall) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActualDifferenceMaterialWall(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPaidMaterialWall.setCellFactory(cellFactoryDoubleMaterialWall);
        colPaidMaterialWall.setCellValueFactory(new PropertyValueFactory<>("paidMaterialWall"));
        colPaidMaterialWall.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialWall, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialWall, String> t) {
                        ((MaterialWall) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPaidMaterialWall(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colResidueMaterialWall.setCellFactory(cellFactoryDoubleMaterialWall);
        colResidueMaterialWall.setCellValueFactory(new PropertyValueFactory<>("residueMaterialWall"));
        colResidueMaterialWall.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialWall, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialWall, String> t) {
                        ((MaterialWall) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setResidueMaterialWall(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colDateOfDeliveryMaterialWall.setCellValueFactory(new PropertyValueFactory<>("dateOfDeliveryMaterialWall"));
        colDateOfDeliveryMaterialWall.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialWall, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialWall, String> t) {
                        ((MaterialWall) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setDateOfDeliveryMaterialWall(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPlannedCPMaterialWall.setCellValueFactory(new PropertyValueFactory<>("plannedCPMaterialWall"));
        colPlannedCPMaterialWall.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialWall, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialWall, String> t) {
                        ((MaterialWall) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPlannedCPMaterialWall(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualCPMaterialWall.setCellValueFactory(new PropertyValueFactory<>("actualCPMaterialWall"));
        colActualCPMaterialWall.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialWall, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialWall, String> t) {
                        ((MaterialWall) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActualCPMaterialWall(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colAccountMaterialWall.setCellValueFactory(new PropertyValueFactory<>("accountMaterialWall"));
        colAccountMaterialWall.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialWall, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialWall, String> t) {
                        ((MaterialWall) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setAccountMaterialWall(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colContactsMaterialWall.setCellValueFactory(new PropertyValueFactory<>("contactsMaterialWall"));
        colContactsMaterialWall.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialWall, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialWall, String> t) {
                        ((MaterialWall) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setContactsMaterialWall(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colNotesMaterialWall.setCellValueFactory(new PropertyValueFactory<>("notesMaterialWall"));
        colNotesMaterialWall.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialWall, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialWall, String> t) {
                        ((MaterialWall) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setNotesMaterialWall(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCharacteristicsMaterialWall.setCellValueFactory(new PropertyValueFactory<>("characteristicsMaterialWall"));
        colCharacteristicsMaterialWall.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialWall, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialWall, String> t) {
                        ((MaterialWall) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setCharacteristicsMaterialWall(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });

        materialTableViewWall.setEditable(true);
        colNameMaterialWall.setCellFactory(TextFieldTableCell.forTableColumn());
        colUnitMaterialWall.setCellFactory(TextFieldTableCell.forTableColumn());
        colProductionTimeMaterialWall.setCellFactory(TextFieldTableCell.forTableColumn());
        colDateOfDeliveryMaterialWall.setCellFactory(TextFieldTableCell.forTableColumn());
        colPlannedCPMaterialWall.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCPMaterialWall.setCellFactory(TextFieldTableCell.forTableColumn());
        colAccountMaterialWall.setCellFactory(TextFieldTableCell.forTableColumn());
        colContactsMaterialWall.setCellFactory(TextFieldTableCell.forTableColumn());
        colNotesMaterialWall.setCellFactory(TextFieldTableCell.forTableColumn());
        colCharacteristicsMaterialWall.setCellFactory(TextFieldTableCell.forTableColumn());





        //Материалы - Пол!
        materialTableViewFloor.setItems(observableListMaterialFloor);
        Callback<TableColumn<MaterialFloor, String>, TableCell<MaterialFloor, String>> cellFactoryDoubleMaterialFloor =
                new Callback<TableColumn<MaterialFloor, String>, TableCell<MaterialFloor, String>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellTextBox("\\d.\\d");
                    }
                };
        Callback<TableColumn<MaterialFloor, Boolean>, TableCell<MaterialFloor, Boolean>> cellFactoryCheckboxMaterialFloor =
                new Callback<TableColumn<MaterialFloor, Boolean>, TableCell<MaterialFloor, Boolean>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellCheckBox();
                    }
                };


        colNameMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("nameMaterialFloor"));
        colNameMaterialFloor.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialFloor, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialFloor, String> t) {
                        ((MaterialFloor) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setNameMaterialFloor(t.getNewValue());
                    }
                });
        colActivePMaterialFloor.setCellFactory(cellFactoryCheckboxMaterialFloor);
        colActivePMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("activePMaterialFloor"));
        colActivePMaterialFloor.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialFloor, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialFloor, Boolean> t) {
                        ((MaterialFloor) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActivePMaterialFloor(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActiveCMaterialFloor.setCellFactory(cellFactoryCheckboxMaterialFloor);
        colActiveCMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("activeCMaterialFloor"));
        colActiveCMaterialFloor.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialFloor, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialFloor, Boolean> t) {
                        ((MaterialFloor) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActiveCMaterialFloor(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colUnitMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("unitMaterialFloor"));
        colUnitMaterialFloor.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialFloor, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialFloor, String> t) {
                        ((MaterialFloor) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setUnitMaterialFloor(t.getNewValue());
                    }
                });
        colQuantityMaterialFloor.setCellFactory(cellFactoryDoubleMaterialFloor);
        colQuantityMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("quantityMaterialFloor"));
        colQuantityMaterialFloor.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialFloor, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialFloor, String> t) {
                        ((MaterialFloor) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setQuantityMaterialFloor(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colOrdinalPriceUnitMaterialFloor.setCellFactory(cellFactoryDoubleMaterialFloor);
        colOrdinalPriceUnitMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("ordinalPriceUnitMaterialFloor"));
        colOrdinalPriceUnitMaterialFloor.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialFloor, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialFloor, String> t) {
                        ((MaterialFloor) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setOrdinalPriceUnitMaterialFloor(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPUnitMaterialFloor.setCellFactory(cellFactoryDoubleMaterialFloor);
        colPriceCPUnitMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("priceCPUnitMaterialFloor"));
        colPriceCPUnitMaterialFloor.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialFloor, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialFloor, String> t) {
                        ((MaterialFloor) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPriceCPUnitMaterialFloor(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPKeyMaterialFloor.setCellFactory(cellFactoryDoubleMaterialFloor);
        colPriceCPKeyMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("priceCPKeyMaterialFloor"));
        colPriceCPKeyMaterialFloor.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialFloor, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialFloor, String> t) {
                        ((MaterialFloor) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPriceCPKeyMaterialFloor(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPUnitMaterialFloor.setCellFactory(cellFactoryDoubleMaterialFloor);
        colCostCPUnitMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("costCPUnitMaterialFloor"));
        colCostCPUnitMaterialFloor.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialFloor, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialFloor, String> t) {
                        ((MaterialFloor) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setCostCPUnitMaterialFloor(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceOrderMaterialFloor.setCellFactory(cellFactoryDoubleMaterialFloor);
        colPriceOrderMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("priceOrderMaterialFloor"));
        colPriceOrderMaterialFloor.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialFloor, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialFloor, String> t) {
                        ((MaterialFloor) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPriceOrderMaterialFloor(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPMaterialFloor.setCellFactory(cellFactoryDoubleMaterialFloor);
        colCostCPMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("costCPMaterialFloor"));
        colCostCPMaterialFloor.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialFloor, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialFloor, String> t) {
                        ((MaterialFloor) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setCostCPMaterialFloor(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colProductionTimeMaterialFloor.setCellFactory(cellFactoryDoubleMaterialFloor);
        colProductionTimeMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("productionTimeMaterialFloor"));
        colProductionTimeMaterialFloor.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialFloor, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialFloor, String> t) {
                        ((MaterialFloor) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setProductionTimeMaterialFloor(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualCostMaterialFloor.setCellFactory(cellFactoryDoubleMaterialFloor);
        colActualCostMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("actualCostMaterialFloor"));
        colActualCostMaterialFloor.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialFloor, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialFloor, String> t) {
                        ((MaterialFloor) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActualCostMaterialFloor(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualDifferenceMaterialFloor.setCellFactory(cellFactoryDoubleMaterialFloor);
        colActualDifferenceMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("actualDifferenceMaterialFloor"));
        colActualDifferenceMaterialFloor.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialFloor, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialFloor, String> t) {
                        ((MaterialFloor) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActualDifferenceMaterialFloor(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPaidMaterialFloor.setCellFactory(cellFactoryDoubleMaterialFloor);
        colPaidMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("paidMaterialFloor"));
        colPaidMaterialFloor.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialFloor, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialFloor, String> t) {
                        ((MaterialFloor) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPaidMaterialFloor(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colResidueMaterialFloor.setCellFactory(cellFactoryDoubleMaterialFloor);
        colResidueMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("residueMaterialFloor"));
        colResidueMaterialFloor.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialFloor, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialFloor, String> t) {
                        ((MaterialFloor) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setResidueMaterialFloor(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colDateOfDeliveryMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("dateOfDeliveryMaterialFloor"));
        colDateOfDeliveryMaterialFloor.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialFloor, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialFloor, String> t) {
                        ((MaterialFloor) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setDateOfDeliveryMaterialFloor(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPlannedCPMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("plannedCPMaterialFloor"));
        colPlannedCPMaterialFloor.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialFloor, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialFloor, String> t) {
                        ((MaterialFloor) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPlannedCPMaterialFloor(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualCPMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("actualCPMaterialFloor"));
        colActualCPMaterialFloor.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialFloor, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialFloor, String> t) {
                        ((MaterialFloor) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActualCPMaterialFloor(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colAccountMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("accountMaterialFloor"));
        colAccountMaterialFloor.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialFloor, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialFloor, String> t) {
                        ((MaterialFloor) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setAccountMaterialFloor(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colContactsMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("contactsMaterialFloor"));
        colContactsMaterialFloor.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialFloor, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialFloor, String> t) {
                        ((MaterialFloor) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setContactsMaterialFloor(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colNotesMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("notesMaterialFloor"));
        colNotesMaterialFloor.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialFloor, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialFloor, String> t) {
                        ((MaterialFloor) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setNotesMaterialFloor(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCharacteristicsMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("characteristicsMaterialFloor"));
        colCharacteristicsMaterialFloor.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialFloor, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialFloor, String> t) {
                        ((MaterialFloor) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setCharacteristicsMaterialFloor(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });

        materialTableViewFloor.setEditable(true);
        colNameMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());
        colUnitMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());
        colProductionTimeMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());
        colDateOfDeliveryMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());
        colPlannedCPMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCPMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());
        colAccountMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());
        colContactsMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());
        colNotesMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());
        colCharacteristicsMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());


        //Материалы - Потолок!
        materialTableViewCeiling.setItems(observableListMaterialCeiling);
        Callback<TableColumn<MaterialCeiling, String>, TableCell<MaterialCeiling, String>> cellFactoryDoubleMaterialCeiling =
                new Callback<TableColumn<MaterialCeiling, String>, TableCell<MaterialCeiling, String>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellTextBox("\\d.\\d");
                    }
                };
        Callback<TableColumn<MaterialCeiling, Boolean>, TableCell<MaterialCeiling, Boolean>> cellFactoryCheckboxMaterialCeiling =
                new Callback<TableColumn<MaterialCeiling, Boolean>, TableCell<MaterialCeiling, Boolean>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellCheckBox();
                    }
                };


        colNameMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("nameMaterialCeiling"));
        colNameMaterialCeiling.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialCeiling, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialCeiling, String> t) {
                        ((MaterialCeiling) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setNameMaterialCeiling(t.getNewValue());
                    }
                });
        colActivePMaterialCeiling.setCellFactory(cellFactoryCheckboxMaterialCeiling);
        colActivePMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("activePMaterialCeiling"));
        colActivePMaterialCeiling.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialCeiling, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialCeiling, Boolean> t) {
                        ((MaterialCeiling) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActivePMaterialCeiling(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActiveCMaterialCeiling.setCellFactory(cellFactoryCheckboxMaterialCeiling);
        colActiveCMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("activeCMaterialCeiling"));
        colActiveCMaterialCeiling.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialCeiling, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialCeiling, Boolean> t) {
                        ((MaterialCeiling) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActiveCMaterialCeiling(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colUnitMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("unitMaterialCeiling"));
        colUnitMaterialCeiling.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialCeiling, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialCeiling, String> t) {
                        ((MaterialCeiling) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setUnitMaterialCeiling(t.getNewValue());
                    }
                });
        colQuantityMaterialCeiling.setCellFactory(cellFactoryDoubleMaterialCeiling);
        colQuantityMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("quantityMaterialCeiling"));
        colQuantityMaterialCeiling.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialCeiling, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialCeiling, String> t) {
                        ((MaterialCeiling) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setQuantityMaterialCeiling(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colOrdinalPriceUnitMaterialCeiling.setCellFactory(cellFactoryDoubleMaterialCeiling);
        colOrdinalPriceUnitMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("ordinalPriceUnitMaterialCeiling"));
        colOrdinalPriceUnitMaterialCeiling.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialCeiling, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialCeiling, String> t) {
                        ((MaterialCeiling) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setOrdinalPriceUnitMaterialCeiling(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPUnitMaterialCeiling.setCellFactory(cellFactoryDoubleMaterialCeiling);
        colPriceCPUnitMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("priceCPUnitMaterialCeiling"));
        colPriceCPUnitMaterialCeiling.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialCeiling, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialCeiling, String> t) {
                        ((MaterialCeiling) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPriceCPUnitMaterialCeiling(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPKeyMaterialCeiling.setCellFactory(cellFactoryDoubleMaterialCeiling);
        colPriceCPKeyMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("priceCPKeyMaterialCeiling"));
        colPriceCPKeyMaterialCeiling.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialCeiling, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialCeiling, String> t) {
                        ((MaterialCeiling) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPriceCPKeyMaterialCeiling(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPUnitMaterialCeiling.setCellFactory(cellFactoryDoubleMaterialCeiling);
        colCostCPUnitMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("costCPUnitMaterialCeiling"));
        colCostCPUnitMaterialCeiling.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialCeiling, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialCeiling, String> t) {
                        ((MaterialCeiling) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setCostCPUnitMaterialCeiling(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceOrderMaterialCeiling.setCellFactory(cellFactoryDoubleMaterialCeiling);
        colPriceOrderMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("priceOrderMaterialCeiling"));
        colPriceOrderMaterialCeiling.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialCeiling, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialCeiling, String> t) {
                        ((MaterialCeiling) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPriceOrderMaterialCeiling(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPMaterialCeiling.setCellFactory(cellFactoryDoubleMaterialCeiling);
        colCostCPMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("costCPMaterialCeiling"));
        colCostCPMaterialCeiling.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialCeiling, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialCeiling, String> t) {
                        ((MaterialCeiling) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setCostCPMaterialCeiling(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colProductionTimeMaterialCeiling.setCellFactory(cellFactoryDoubleMaterialCeiling);
        colProductionTimeMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("productionTimeMaterialCeiling"));
        colProductionTimeMaterialCeiling.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialCeiling, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialCeiling, String> t) {
                        ((MaterialCeiling) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setProductionTimeMaterialCeiling(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualCostMaterialCeiling.setCellFactory(cellFactoryDoubleMaterialCeiling);
        colActualCostMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("actualCostMaterialCeiling"));
        colActualCostMaterialCeiling.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialCeiling, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialCeiling, String> t) {
                        ((MaterialCeiling) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActualCostMaterialCeiling(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualDifferenceMaterialCeiling.setCellFactory(cellFactoryDoubleMaterialCeiling);
        colActualDifferenceMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("actualDifferenceMaterialCeiling"));
        colActualDifferenceMaterialCeiling.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialCeiling, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialCeiling, String> t) {
                        ((MaterialCeiling) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActualDifferenceMaterialCeiling(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPaidMaterialCeiling.setCellFactory(cellFactoryDoubleMaterialCeiling);
        colPaidMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("paidMaterialCeiling"));
        colPaidMaterialCeiling.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialCeiling, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialCeiling, String> t) {
                        ((MaterialCeiling) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPaidMaterialCeiling(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colResidueMaterialCeiling.setCellFactory(cellFactoryDoubleMaterialCeiling);
        colResidueMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("residueMaterialCeiling"));
        colResidueMaterialCeiling.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialCeiling, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialCeiling, String> t) {
                        ((MaterialCeiling) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setResidueMaterialCeiling(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colDateOfDeliveryMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("dateOfDeliveryMaterialCeiling"));
        colDateOfDeliveryMaterialCeiling.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialCeiling, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialCeiling, String> t) {
                        ((MaterialCeiling) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setDateOfDeliveryMaterialCeiling(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPlannedCPMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("plannedCPMaterialCeiling"));
        colPlannedCPMaterialCeiling.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialCeiling, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialCeiling, String> t) {
                        ((MaterialCeiling) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPlannedCPMaterialCeiling(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualCPMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("actualCPMaterialCeiling"));
        colActualCPMaterialCeiling.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialCeiling, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialCeiling, String> t) {
                        ((MaterialCeiling) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActualCPMaterialCeiling(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colAccountMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("accountMaterialCeiling"));
        colAccountMaterialCeiling.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialCeiling, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialCeiling, String> t) {
                        ((MaterialCeiling) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setAccountMaterialCeiling(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colContactsMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("contactsMaterialCeiling"));
        colContactsMaterialCeiling.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialCeiling, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialCeiling, String> t) {
                        ((MaterialCeiling) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setContactsMaterialCeiling(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colNotesMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("notesMaterialCeiling"));
        colNotesMaterialCeiling.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialCeiling, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialCeiling, String> t) {
                        ((MaterialCeiling) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setNotesMaterialCeiling(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCharacteristicsMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("characteristicsMaterialCeiling"));
        colCharacteristicsMaterialCeiling.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialCeiling, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialCeiling, String> t) {
                        ((MaterialCeiling) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setCharacteristicsMaterialCeiling(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });

        materialTableViewCeiling.setEditable(true);
        colNameMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colUnitMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colProductionTimeMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colDateOfDeliveryMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colPlannedCPMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCPMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colAccountMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colContactsMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colNotesMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colCharacteristicsMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());







    }

    public void On_tabCalculatorClickedActionAK(MouseEvent mouseEvent) {
        if (observableListAK.filtered(x -> "0.0".equals(x.getRateAK()) && "0.0".equals(x.getTermAK())).size() == 0) {
            observableListAK.add(new AK(0, 0, 0));
        }

    }

    public void On_tabCalculatorClickedActionMaterialWall(MouseEvent mouseEvent) {
        if (observableListMaterialWall.filtered(x -> "0.0".equals(x.getQuantityMaterialWall()) && "0.0".equals(x.getOrdinalPriceUnitMaterialWall())).size() == 0) {
            observableListMaterialWall.add(new MaterialWall("", false, false, "", 0, 0,
                    0, 0, 0, 0, 0, "", 0, 0,
                    0, 0, "", "", "", "", "", "", ""));
        }
    }

    public void On_tabCalculatorClickedActionMaterialFloor(MouseEvent mouseEvent) {
        if (observableListMaterialFloor.filtered(x -> "0.0".equals(x.getQuantityMaterialFloor()) && "0.0".equals(x.getOrdinalPriceUnitMaterialFloor())).size() == 0) {
            observableListMaterialFloor.add(new MaterialFloor("", false, false, "", 0, 0,
                    0, 0, 0, 0, 0, "", 0, 0,
                    0, 0, "", "", "", "", "", "", ""));
        }
    }

    public void On_tabCalculatorClickedActionMaterialCeiling(MouseEvent mouseEvent) {
        if (observableListMaterialCeiling.filtered(x -> "0.0".equals(x.getQuantityMaterialCeiling()) && "0.0".equals(x.getOrdinalPriceUnitMaterialCeiling())).size() == 0) {
            observableListMaterialCeiling.add(new MaterialCeiling("", false, false, "", 0, 0,
                    0, 0, 0, 0, 0, "", 0, 0,
                    0, 0, "", "", "", "", "", "", ""));
        }
    }

//   //УДаление элементов таблицы
//    public void deleteElementFurniture(ActionEvent actionEvent) {
//        ObservableList<Furniture> allFurniture, singleFurniture;
//        allFurniture = furnitureTableView.getItems();
//        singleFurniture = furnitureTableView.getSelectionModel().getSelectedItems();
//        singleFurniture.forEach(allFurniture::remove);
//    }
//
//    public void saveElementFurniture(ActionEvent actionEvent) {
//    }

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


    public void On_tabCalculatorClickedActionMaterialOther(MouseEvent mouseEvent) {
    }

    public void On_tabCalculatorClickedActionMaterialSuddenly(MouseEvent mouseEvent) {
    }

    public void On_tabCalculatorClickedActionAppliancesKitchen(MouseEvent mouseEvent) {
    }

    public void On_tabCalculatorClickedActionAppliancesOther(MouseEvent mouseEvent) {
    }

    public void On_tabCalculatorClickedActionAppliancesDelivery(MouseEvent mouseEvent) {
    }

    public void On_tabCalculatorClickedActionAppliancesSuddenly(MouseEvent mouseEvent) {
    }
}
