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


    //Блок Мебели
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

        colNameMaterialOther.setCellValueFactory(new PropertyValueFactory<>("nameMaterialOther"));
        colUnitMaterialOther.setCellValueFactory(new PropertyValueFactory<>("unitMaterialOther"));
        colQuantityMaterialOther.setCellValueFactory(new PropertyValueFactory<>("quantityMaterialOther"));
        colOrdinalPriceUnitMaterialOther.setCellValueFactory(new PropertyValueFactory<>("ordinalPriceUnitMaterialOther"));
        colPriceCPUnitMaterialOther.setCellValueFactory(new PropertyValueFactory<>("priceCPUnitMaterialOther"));
        colPriceCPKeyMaterialOther.setCellValueFactory(new PropertyValueFactory<>("priceCPKeyMaterialOther"));
        colCostCPUnitMaterialOther.setCellValueFactory(new PropertyValueFactory<>("costCPUnitMaterialOther"));
        colPriceOrderMaterialOther.setCellValueFactory(new PropertyValueFactory<>("priceOrderMaterialOther"));
        colCostCPMaterialOther.setCellValueFactory(new PropertyValueFactory<>("costCPMaterialOther"));
        colProductionTimeMaterialOther.setCellValueFactory(new PropertyValueFactory<>("productionTimeMaterialOther"));
        colActualCostMaterialOther.setCellValueFactory(new PropertyValueFactory<>("actualCostMaterialOther"));
        colActualDifferenceMaterialOther.setCellValueFactory(new PropertyValueFactory<>("actualDifferenceMaterialOther"));
        colPaidMaterialOther.setCellValueFactory(new PropertyValueFactory<>("paidMaterialOther"));
        colResidueMaterialOther.setCellValueFactory(new PropertyValueFactory<>("residueMaterialOther"));
        colDateOfDeliveryMaterialOther.setCellValueFactory(new PropertyValueFactory<>("dateOfDeliveryMaterialOther"));
        colPlannedCPMaterialOther.setCellValueFactory(new PropertyValueFactory<>("plannedCPMaterialOther"));
        colActualCPMaterialOther.setCellValueFactory(new PropertyValueFactory<>("actualCPMaterialOther"));
        colAccountMaterialOther.setCellValueFactory(new PropertyValueFactory<>("accountMaterialOther"));
        colContactsMaterialOther.setCellValueFactory(new PropertyValueFactory<>("contactsMaterialOther"));
        colNotesMaterialOther.setCellValueFactory(new PropertyValueFactory<>("notesMaterialOther"));
        colCharacteristicsMaterialOther.setCellValueFactory(new PropertyValueFactory<>("characteristicsMaterialOther"));

        colNameMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("nameMaterialSuddenly"));
        colUnitMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("unitMaterialSuddenly"));
        colQuantityMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("quantityMaterialSuddenly"));
        colOrdinalPriceUnitMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("ordinalPriceUnitMaterialSuddenly"));
        colPriceCPUnitMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("priceCPUnitMaterialSuddenly"));
        colPriceCPKeyMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("priceCPKeyMaterialSuddenly"));
        colCostCPUnitMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("costCPUnitMaterialSuddenly"));
        colPriceOrderMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("priceOrderMaterialSuddenly"));
        colCostCPMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("costCPMaterialSuddenly"));
        colProductionTimeMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("productionTimeMaterialSuddenly"));
        colActualCostMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("actualCostMaterialSuddenly"));
        colActualDifferenceMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("actualDifferenceMaterialSuddenly"));
        colPaidMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("paidMaterialSuddenly"));
        colResidueMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("residueMaterialSuddenly"));
        colDateOfDeliveryMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("dateOfDeliveryMaterialSuddenly"));
        colPlannedCPMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("plannedCPMaterialSuddenly"));
        colActualCPMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("actualCPMaterialSuddenly"));
        colAccountMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("accountMaterialSuddenly"));
        colContactsMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("contactsMaterialSuddenly"));
        colNotesMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("notesMaterialSuddenly"));
        colCharacteristicsMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("characteristicsMaterialSuddenly"));


        //Блок Техники
        colNameAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("nameAppliancesKitchen"));
        colUnitAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("unitAppliancesKitchen"));
        colQuantityAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("quantityAppliancesKitchen"));
        colOrdinalPriceUnitAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("ordinalPriceUnitAppliancesKitchen"));
        colPriceCPUnitAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("priceCPUnitAppliancesKitchen"));
        colPriceCPKeyAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("priceCPKeyAppliancesKitchen"));
        colCostCPUnitAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("costCPUnitAppliancesKitchen"));
        colPriceOrderAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("priceOrderAppliancesKitchen"));
        colCostCPAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("costCPAppliancesKitchen"));
        colProductionTimeAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("productionTimeAppliancesKitchen"));
        colActualCostAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("actualCostAppliancesKitchen"));
        colActualDifferenceAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("actualDifferenceAppliancesKitchen"));
        colPaidAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("paidAppliancesKitchen"));
        colResidueAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("residueAppliancesKitchen"));
        colDateOfDeliveryAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("dateOfDeliveryAppliancesKitchen"));
        colPlannedCPAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("plannedCPAppliancesKitchen"));
        colActualCPAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("actualCPAppliancesKitchen"));
        colAccountAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("accountAppliancesKitchen"));
        colContactsAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("contactsAppliancesKitchen"));
        colNotesAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("notesAppliancesKitchen"));
        colCharacteristicsAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("characteristicsAppliancesKitchen"));

        colNameAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("nameAppliancesOther"));
        colUnitAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("unitAppliancesOther"));
        colQuantityAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("quantityAppliancesOther"));
        colOrdinalPriceUnitAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("ordinalPriceUnitAppliancesOther"));
        colPriceCPUnitAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("priceCPUnitAppliancesOther"));
        colPriceCPKeyAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("priceCPKeyAppliancesOther"));
        colCostCPUnitAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("costCPUnitAppliancesOther"));
        colPriceOrderAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("priceOrderAppliancesOther"));
        colCostCPAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("costCPAppliancesOther"));
        colProductionTimeAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("productionTimeAppliancesOther"));
        colActualCostAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("actualCostAppliancesOther"));
        colActualDifferenceAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("actualDifferenceAppliancesOther"));
        colPaidAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("paidAppliancesOther"));
        colResidueAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("residueAppliancesOther"));
        colDateOfDeliveryAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("dateOfDeliveryAppliancesOther"));
        colPlannedCPAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("plannedCPAppliancesOther"));
        colActualCPAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("actualCPAppliancesOther"));
        colAccountAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("accountAppliancesOther"));
        colContactsAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("contactsAppliancesOther"));
        colNotesAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("notesAppliancesOther"));
        colCharacteristicsAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("characteristicsAppliancesOther"));

        colNameAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("nameAppliancesDelivery"));
        colUnitAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("unitAppliancesDelivery"));
        colQuantityAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("quantityAppliancesDelivery"));
        colOrdinalPriceUnitAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("ordinalPriceUnitAppliancesDelivery"));
        colPriceCPUnitAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("priceCPUnitAppliancesDelivery"));
        colPriceCPKeyAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("priceCPKeyAppliancesDelivery"));
        colCostCPUnitAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("costCPUnitAppliancesDelivery"));
        colPriceOrderAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("priceOrderAppliancesDelivery"));
        colCostCPAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("costCPAppliancesDelivery"));
        colProductionTimeAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("productionTimeAppliancesDelivery"));
        colActualCostAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("actualCostAppliancesDelivery"));
        colActualDifferenceAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("actualDifferenceAppliancesDelivery"));
        colPaidAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("paidAppliancesDelivery"));
        colResidueAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("residueAppliancesDelivery"));
        colDateOfDeliveryAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("dateOfDeliveryAppliancesDelivery"));
        colPlannedCPAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("plannedCPAppliancesDelivery"));
        colActualCPAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("actualCPAppliancesDelivery"));
        colAccountAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("accountAppliancesDelivery"));
        colContactsAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("contactsAppliancesDelivery"));
        colNotesAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("notesAppliancesDelivery"));
        colCharacteristicsAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("characteristicsAppliancesDelivery"));


        furnitureTableView.setItems(observableListFurniture);

        materialTableViewWall.setItems(observableListMaterialWall);
        materialTableViewFloor.setItems(observableListMaterialFloor);
        materialTableViewCeiling.setItems(observableListMaterialCeiling);
        materialTableViewOther.setItems(observableListMaterialOther);
        materialTableViewSuddenly.setItems(observableListMaterialSuddenly);

        appliancesTableViewKitchen.setItems(observableListAppliancesKitchen);
        appliancesTableViewOther.setItems(observableListAppliancesOther);
        appliancesTableViewDelivery.setItems(observableListAppliancesDelivery);


        furnitureTableView.setEditable(true);

        materialTableViewWall.setEditable(true);
        materialTableViewFloor.setEditable(true);
        materialTableViewCeiling.setEditable(true);
        materialTableViewOther.setEditable(true);
        materialTableViewSuddenly.setEditable(true);

        appliancesTableViewKitchen.setEditable(true);
        appliancesTableViewOther.setEditable(true);
        appliancesTableViewDelivery.setEditable(true);


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

        colNameMaterialOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colUnitMaterialOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colQuantityMaterialOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colOrdinalPriceUnitMaterialOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colPriceCPUnitMaterialOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colPriceCPKeyMaterialOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colCostCPUnitMaterialOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colPriceOrderMaterialOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colCostCPMaterialOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colProductionTimeMaterialOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCostMaterialOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualDifferenceMaterialOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colPaidMaterialOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colResidueMaterialOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colDateOfDeliveryMaterialOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colPlannedCPMaterialOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCPMaterialOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colAccountMaterialOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colContactsMaterialOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colNotesMaterialOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colCharacteristicsMaterialOther.setCellFactory(TextFieldTableCell.forTableColumn());

        colNameMaterialSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colUnitMaterialSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colQuantityMaterialSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colOrdinalPriceUnitMaterialSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colPriceCPUnitMaterialSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colPriceCPKeyMaterialSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colCostCPUnitMaterialSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colPriceOrderMaterialSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colCostCPMaterialSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colProductionTimeMaterialSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCostMaterialSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualDifferenceMaterialSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colPaidMaterialSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colResidueMaterialSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colDateOfDeliveryMaterialSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colPlannedCPMaterialSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCPMaterialSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colAccountMaterialSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colContactsMaterialSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colNotesMaterialSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colCharacteristicsMaterialSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());

        colNameAppliancesKitchen.setCellFactory(TextFieldTableCell.forTableColumn());
        colUnitAppliancesKitchen.setCellFactory(TextFieldTableCell.forTableColumn());
        colQuantityAppliancesKitchen.setCellFactory(TextFieldTableCell.forTableColumn());
        colOrdinalPriceUnitAppliancesKitchen.setCellFactory(TextFieldTableCell.forTableColumn());
        colPriceCPUnitAppliancesKitchen.setCellFactory(TextFieldTableCell.forTableColumn());
        colPriceCPKeyAppliancesKitchen.setCellFactory(TextFieldTableCell.forTableColumn());
        colCostCPUnitAppliancesKitchen.setCellFactory(TextFieldTableCell.forTableColumn());
        colPriceOrderAppliancesKitchen.setCellFactory(TextFieldTableCell.forTableColumn());
        colCostCPAppliancesKitchen.setCellFactory(TextFieldTableCell.forTableColumn());
        colProductionTimeAppliancesKitchen.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCostAppliancesKitchen.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualDifferenceAppliancesKitchen.setCellFactory(TextFieldTableCell.forTableColumn());
        colPaidAppliancesKitchen.setCellFactory(TextFieldTableCell.forTableColumn());
        colResidueAppliancesKitchen.setCellFactory(TextFieldTableCell.forTableColumn());
        colDateOfDeliveryAppliancesKitchen.setCellFactory(TextFieldTableCell.forTableColumn());
        colPlannedCPAppliancesKitchen.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCPAppliancesKitchen.setCellFactory(TextFieldTableCell.forTableColumn());
        colAccountAppliancesKitchen.setCellFactory(TextFieldTableCell.forTableColumn());
        colContactsAppliancesKitchen.setCellFactory(TextFieldTableCell.forTableColumn());
        colNotesAppliancesKitchen.setCellFactory(TextFieldTableCell.forTableColumn());
        colCharacteristicsAppliancesKitchen.setCellFactory(TextFieldTableCell.forTableColumn());

        colNameAppliancesOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colUnitAppliancesOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colQuantityAppliancesOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colOrdinalPriceUnitAppliancesOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colPriceCPUnitAppliancesOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colPriceCPKeyAppliancesOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colCostCPUnitAppliancesOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colPriceOrderAppliancesOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colCostCPAppliancesOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colProductionTimeAppliancesOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCostAppliancesOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualDifferenceAppliancesOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colPaidAppliancesOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colResidueAppliancesOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colDateOfDeliveryAppliancesOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colPlannedCPAppliancesOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCPAppliancesOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colAccountAppliancesOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colContactsAppliancesOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colNotesAppliancesOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colCharacteristicsAppliancesOther.setCellFactory(TextFieldTableCell.forTableColumn());
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

    ObservableList<MaterialOther> observableListMaterialOther = FXCollections.observableArrayList(
            new MaterialOther(),
            new MaterialOther(),
            new MaterialOther()
    );

    ObservableList<MaterialSuddenly> observableListMaterialSuddenly = FXCollections.observableArrayList(
            new MaterialSuddenly(),
            new MaterialSuddenly(),
            new MaterialSuddenly()
    );

    ObservableList<AppliancesKitchen> observableListAppliancesKitchen = FXCollections.observableArrayList(
            new AppliancesKitchen(),
            new AppliancesKitchen(),
            new AppliancesKitchen()
    );

    ObservableList<AppliancesOther> observableListAppliancesOther = FXCollections.observableArrayList(
            new AppliancesOther(),
            new AppliancesOther(),
            new AppliancesOther()
    );

    ObservableList<AppliancesDelivery> observableListAppliancesDelivery = FXCollections.observableArrayList(
            new AppliancesDelivery(),
            new AppliancesDelivery(),
            new AppliancesDelivery()
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
