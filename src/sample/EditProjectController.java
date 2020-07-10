package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.ComboBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;
import javafx.util.Callback;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;


public class EditProjectController implements Initializable {


    public TabPane tabPane;

    public Tab plumbingView;
    public Tab furnitureView;
    public Tab lightView;
    public Tab decorationView;
    public Tab totalView;
    public Tab DPView;
    public Tab buildersView;
    public Tab subcontractorsView;
    public Tab AKView;
    public Tab materialView;
    public Tab appliancesView;
    public Tab statisticsView;
    public Tab diagramView;

    public TitledPane titleMaterialWall;
    public TitledPane titleMaterialFloor;
    public TitledPane titleMaterialCeiling;
    public TitledPane titleMaterialOther;
    public TitledPane titleMaterialSuddenly;
    public TitledPane titleAppliancesKitchen;
    public TitledPane titleAppliancesOther;
    public TitledPane titleAppliancesDelivery;
    public TitledPane titleAppliancesSuddenly;
    public TitledPane titleDecorationSuddenly;
    public TitledPane titleDecorationDelivery;
    public TitledPane titlePlumbingDelivery;
    public TitledPane titlePlumbingSuddenly;
    public TitledPane titleFurnitureDelivery;
    public TitledPane titleFurnitureSuddenly;
    public TitledPane titleLightDelivery;
    public TitledPane titleLightSuddenly;


    public TableView<Room> roomTableView;
    public TableColumn<Room, String> colNameRoom;
    public TableColumn<Room, String> colAreaRoom;
    public TableColumn<Room, Boolean> colSelectBathRoom;
    public ObservableList<Room> observableListRoom = FXCollections.observableArrayList();


    //Для теста во вкладке Проект
    public TextField totalArea;
    public TextField costDP;
    public TextField discountDP;
    public TableView<Project> projectTableView;
    public TableColumn<Project, String> colNameProject;

    private ObservableList<Project> observableListProject = FXCollections.observableArrayList();
    public TextField createProjectTextField;
    public Button backRoomButton;
    public Button deleteRoomButton;
    public Button createProjectButton;
    public Button selectProjectButton;
    public Button addProjectButton;
    public Button startProject;
    public Button deleteProjectButton;


    public TextField roomNameTextField;
    public TextField roomAreaTextField;
    public Button addRoomButton;


    public ToggleButton showSubcontractorsButton;
    public ToggleButton showMaterialWallButton;
    public ToggleButton showMaterialFloorButton;
    public ToggleButton showMaterialCeilingButton;
    public ToggleButton showMaterialOtherButton;
    public ToggleButton showMaterialSuddenlyButton;
    public ToggleButton showAppliancesKitchenButton;
    public ToggleButton showAppliancesOtherButton;
    public ToggleButton showAppliancesDeliveryButton;
    public ToggleButton showAppliancesSuddenlyButton;
    public ToggleButton showPlumbingDeliveryButton;
    public ToggleButton showPlumbingSuddenlyButton;
    public ToggleButton showFurnitureDeliveryButton;
    public ToggleButton showFurnitureSuddenlyButton;
    public ToggleButton showLightDeliveryButton;
    public ToggleButton showLightSuddenlyButton;
    public ToggleButton showDecorationDeliveryButton;
    public ToggleButton showDecorationSuddenlyButton;


    public Button saveRoomButton;
    public Button addPaymentButton;


    public TableView<Subcontractors> subcontractorsTableView;
    public TableColumn<Subcontractors, String> colNameCategorySubcontractors;
    public TableColumn<Subcontractors, String> colCostPlannedSubcontractors;
    public TableColumn<Subcontractors, String> colCostCPSubcontractors;
    public TableColumn<Subcontractors, String> colCostActualSubcontractors;
    public TableColumn<Subcontractors, String> colActualDifferenceSubcontractors;
    public TableColumn<Subcontractors, String> colPaidSubcontractors;
    public TableColumn<Subcontractors, String> colResidueSubcontractors;
    public TableColumn<Subcontractors, String> colPlannedCPSubcontractors;
    public TableColumn<Subcontractors, String> colActualCPSubcontractors;
    public TableColumn<Subcontractors, String> colAccountSubcontractors;
    public TableColumn<Subcontractors, String> colContactsSubcontractors;
    public TableColumn<Subcontractors, String> colNotesSubcontractors;
    public TableColumn<Subcontractors, String> colCharacteristicsSubcontractors;
    private ObservableList<Subcontractors> observableListSubcontractors = FXCollections.observableArrayList();


    public TableView<AK> AKTableView;
    public TableColumn<AK, String> colRateAK;
    public TableColumn<AK, String> colTermAK;
    public TableColumn<AK, String> colCostAK;
    private ObservableList<AK> observableListAK = FXCollections.observableArrayList();

    //Блок сантехники
    public TableView<PlumbingDelivery> plumbingTableViewDelivery;
    public TableColumn<PlumbingDelivery, String> colNamePlumbingDelivery;
    public TableColumn<PlumbingDelivery, Boolean> colActivePPlumbingDelivery;
    public TableColumn<PlumbingDelivery, Boolean> colActiveCPlumbingDelivery;
    public TableColumn<PlumbingDelivery, UnitType> colUnitPlumbingDelivery;
    public TableColumn<PlumbingDelivery, String> colQuantityPlumbingDelivery;
    public TableColumn<PlumbingDelivery, String> colOrdinalPriceUnitPlumbingDelivery;
    public TableColumn<PlumbingDelivery, String> colPriceCPUnitPlumbingDelivery;
    public TableColumn<PlumbingDelivery, String> colPriceCPKeyPlumbingDelivery;
    public TableColumn<PlumbingDelivery, String> colCostCPUnitPlumbingDelivery;
    public TableColumn<PlumbingDelivery, String> colPriceOrderPlumbingDelivery;
    public TableColumn<PlumbingDelivery, String> colCostCPPlumbingDelivery;
    public TableColumn<PlumbingDelivery, TimeProduction> colProductionTimePlumbingDelivery;
    public TableColumn<PlumbingDelivery, String> colActualCostPlumbingDelivery;
    public TableColumn<PlumbingDelivery, String> colActualDifferencePlumbingDelivery;
    public TableColumn<PlumbingDelivery, String> colPaidPlumbingDelivery;
    public TableColumn<PlumbingDelivery, String> colResiduePlumbingDelivery;
    public TableColumn<PlumbingDelivery, Date> colDateOfDeliveryPlumbingDelivery;
    public TableColumn<PlumbingDelivery, String> colNameRoomPlumbingDelivery;
    public TableColumn<PlumbingDelivery, String> colPlannedCPPlumbingDelivery;
    public TableColumn<PlumbingDelivery, String> colActualCPPlumbingDelivery;
    public TableColumn<PlumbingDelivery, String> colAccountPlumbingDelivery;
    public TableColumn<PlumbingDelivery, String> colContactsPlumbingDelivery;
    public TableColumn<PlumbingDelivery, String> colNotesPlumbingDelivery;
    public TableColumn<PlumbingDelivery, String> colCharacteristicsPlumbingDelivery;
    private ObservableList<PlumbingDelivery> observableListPlumbingDelivery = FXCollections.observableArrayList();

    public TableView<PlumbingSuddenly> plumbingTableViewSuddenly;
    public TableColumn<PlumbingSuddenly, String> colNamePlumbingSuddenly;
    public TableColumn<PlumbingSuddenly, Boolean> colActivePPlumbingSuddenly;
    public TableColumn<PlumbingSuddenly, Boolean> colActiveCPlumbingSuddenly;
    public TableColumn<PlumbingSuddenly, UnitType> colUnitPlumbingSuddenly;
    public TableColumn<PlumbingSuddenly, String> colQuantityPlumbingSuddenly;
    public TableColumn<PlumbingSuddenly, String> colOrdinalPriceUnitPlumbingSuddenly;
    public TableColumn<PlumbingSuddenly, String> colPriceCPUnitPlumbingSuddenly;
    public TableColumn<PlumbingSuddenly, String> colPriceCPKeyPlumbingSuddenly;
    public TableColumn<PlumbingSuddenly, String> colCostCPUnitPlumbingSuddenly;
    public TableColumn<PlumbingSuddenly, String> colPriceOrderPlumbingSuddenly;
    public TableColumn<PlumbingSuddenly, String> colCostCPPlumbingSuddenly;
    public TableColumn<PlumbingSuddenly, TimeProduction> colProductionTimePlumbingSuddenly;
    public TableColumn<PlumbingSuddenly, String> colActualCostPlumbingSuddenly;
    public TableColumn<PlumbingSuddenly, String> colActualDifferencePlumbingSuddenly;
    public TableColumn<PlumbingSuddenly, String> colPaidPlumbingSuddenly;
    public TableColumn<PlumbingSuddenly, String> colResiduePlumbingSuddenly;
    public TableColumn<PlumbingSuddenly, Date> colDateOfDeliveryPlumbingSuddenly;
    public TableColumn<PlumbingSuddenly, String> colNameRoomPlumbingSuddenly;
    public TableColumn<PlumbingSuddenly, String> colPlannedCPPlumbingSuddenly;
    public TableColumn<PlumbingSuddenly, String> colActualCPPlumbingSuddenly;
    public TableColumn<PlumbingSuddenly, String> colAccountPlumbingSuddenly;
    public TableColumn<PlumbingSuddenly, String> colContactsPlumbingSuddenly;
    public TableColumn<PlumbingSuddenly, String> colNotesPlumbingSuddenly;
    public TableColumn<PlumbingSuddenly, String> colCharacteristicsPlumbingSuddenly;
    private ObservableList<PlumbingSuddenly> observableListPlumbingSuddenly = FXCollections.observableArrayList();

    //Блок материалов
    public TableView<MaterialWall> materialTableViewWall;
    public TableColumn<MaterialWall, String> colNameMaterialWall;
    public TableColumn<MaterialWall, Boolean> colActivePMaterialWall;
    public TableColumn<MaterialWall, Boolean> colActiveCMaterialWall;
    public TableColumn<MaterialWall, UnitType> colUnitMaterialWall;
    public TableColumn<MaterialWall, String> colQuantityMaterialWall;
    public TableColumn<MaterialWall, String> colOrdinalPriceUnitMaterialWall;
    public TableColumn<MaterialWall, String> colPriceCPUnitMaterialWall;
    public TableColumn<MaterialWall, String> colPriceCPKeyMaterialWall;
    public TableColumn<MaterialWall, String> colCostCPUnitMaterialWall;
    public TableColumn<MaterialWall, String> colPriceOrderMaterialWall;
    public TableColumn<MaterialWall, String> colCostCPMaterialWall;
    public TableColumn<MaterialWall, TimeProduction> colProductionTimeMaterialWall;
    public TableColumn<MaterialWall, String> colActualCostMaterialWall;
    public TableColumn<MaterialWall, String> colActualDifferenceMaterialWall;
    public TableColumn<MaterialWall, String> colPaidMaterialWall;
    public TableColumn<MaterialWall, String> colResidueMaterialWall;
    public TableColumn<MaterialWall, Date> colDateOfDeliveryMaterialWall;
    public TableColumn<MaterialWall, String> colNameRoomMaterialWall;
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
    public TableColumn<MaterialFloor, UnitType> colUnitMaterialFloor;
    public TableColumn<MaterialFloor, String> colQuantityMaterialFloor;
    public TableColumn<MaterialFloor, String> colOrdinalPriceUnitMaterialFloor;
    public TableColumn<MaterialFloor, String> colPriceCPUnitMaterialFloor;
    public TableColumn<MaterialFloor, String> colPriceCPKeyMaterialFloor;
    public TableColumn<MaterialFloor, String> colCostCPUnitMaterialFloor;
    public TableColumn<MaterialFloor, String> colPriceOrderMaterialFloor;
    public TableColumn<MaterialFloor, String> colCostCPMaterialFloor;
    public TableColumn<MaterialFloor, TimeProduction> colProductionTimeMaterialFloor;
    public TableColumn<MaterialFloor, String> colActualCostMaterialFloor;
    public TableColumn<MaterialFloor, String> colActualDifferenceMaterialFloor;
    public TableColumn<MaterialFloor, String> colPaidMaterialFloor;
    public TableColumn<MaterialFloor, String> colResidueMaterialFloor;
    public TableColumn<MaterialFloor, Date> colDateOfDeliveryMaterialFloor;
    public TableColumn<MaterialFloor, String> colNameRoomMaterialFloor;
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
    public TableColumn<MaterialCeiling, UnitType> colUnitMaterialCeiling;
    public TableColumn<MaterialCeiling, String> colQuantityMaterialCeiling;
    public TableColumn<MaterialCeiling, String> colOrdinalPriceUnitMaterialCeiling;
    public TableColumn<MaterialCeiling, String> colPriceCPUnitMaterialCeiling;
    public TableColumn<MaterialCeiling, String> colPriceCPKeyMaterialCeiling;
    public TableColumn<MaterialCeiling, String> colCostCPUnitMaterialCeiling;
    public TableColumn<MaterialCeiling, String> colPriceOrderMaterialCeiling;
    public TableColumn<MaterialCeiling, String> colCostCPMaterialCeiling;
    public TableColumn<MaterialCeiling, TimeProduction> colProductionTimeMaterialCeiling;
    public TableColumn<MaterialCeiling, String> colActualCostMaterialCeiling;
    public TableColumn<MaterialCeiling, String> colActualDifferenceMaterialCeiling;
    public TableColumn<MaterialCeiling, String> colPaidMaterialCeiling;
    public TableColumn<MaterialCeiling, String> colResidueMaterialCeiling;
    public TableColumn<MaterialCeiling, Date> colDateOfDeliveryMaterialCeiling;
    public TableColumn<MaterialCeiling, String> colNameRoomMaterialCeiling;
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
    public TableColumn<MaterialOther, UnitType> colUnitMaterialOther;
    public TableColumn<MaterialOther, String> colQuantityMaterialOther;
    public TableColumn<MaterialOther, String> colOrdinalPriceUnitMaterialOther;
    public TableColumn<MaterialOther, String> colPriceCPUnitMaterialOther;
    public TableColumn<MaterialOther, String> colPriceCPKeyMaterialOther;
    public TableColumn<MaterialOther, String> colCostCPUnitMaterialOther;
    public TableColumn<MaterialOther, String> colPriceOrderMaterialOther;
    public TableColumn<MaterialOther, String> colCostCPMaterialOther;
    public TableColumn<MaterialOther, TimeProduction> colProductionTimeMaterialOther;
    public TableColumn<MaterialOther, String> colActualCostMaterialOther;
    public TableColumn<MaterialOther, String> colActualDifferenceMaterialOther;
    public TableColumn<MaterialOther, String> colPaidMaterialOther;
    public TableColumn<MaterialOther, String> colResidueMaterialOther;
    public TableColumn<MaterialOther, Date> colDateOfDeliveryMaterialOther;
    public TableColumn<MaterialOther, String> colNameRoomMaterialOther;
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
    public TableColumn<MaterialSuddenly, UnitType> colUnitMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colQuantityMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colOrdinalPriceUnitMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colPriceCPUnitMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colPriceCPKeyMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colCostCPUnitMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colPriceOrderMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colCostCPMaterialSuddenly;
    public TableColumn<MaterialSuddenly, TimeProduction> colProductionTimeMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colActualCostMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colActualDifferenceMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colPaidMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colResidueMaterialSuddenly;
    public TableColumn<MaterialSuddenly, Date> colDateOfDeliveryMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colNameRoomMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colPlannedCPMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colActualCPMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colAccountMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colContactsMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colNotesMaterialSuddenly;
    public TableColumn<MaterialSuddenly, String> colCharacteristicsMaterialSuddenly;
    private ObservableList<MaterialSuddenly> observableListMaterialSuddenly = FXCollections.observableArrayList();

    //Блок Мебели
    public TableView<FurnitureDelivery> furnitureTableViewDelivery;
    public TableColumn<FurnitureDelivery, String> colNameFurnitureDelivery;
    public TableColumn<FurnitureDelivery, Boolean> colActivePFurnitureDelivery;
    public TableColumn<FurnitureDelivery, Boolean> colActiveCFurnitureDelivery;
    public TableColumn<FurnitureDelivery, UnitType> colUnitFurnitureDelivery;
    public TableColumn<FurnitureDelivery, String> colQuantityFurnitureDelivery;
    public TableColumn<FurnitureDelivery, String> colOrdinalPriceUnitFurnitureDelivery;
    public TableColumn<FurnitureDelivery, String> colPriceCPUnitFurnitureDelivery;
    public TableColumn<FurnitureDelivery, String> colPriceCPKeyFurnitureDelivery;
    public TableColumn<FurnitureDelivery, String> colCostCPUnitFurnitureDelivery;
    public TableColumn<FurnitureDelivery, String> colPriceOrderFurnitureDelivery;
    public TableColumn<FurnitureDelivery, String> colCostCPFurnitureDelivery;
    public TableColumn<FurnitureDelivery, TimeProduction> colProductionTimeFurnitureDelivery;
    public TableColumn<FurnitureDelivery, String> colActualCostFurnitureDelivery;
    public TableColumn<FurnitureDelivery, String> colActualDifferenceFurnitureDelivery;
    public TableColumn<FurnitureDelivery, String> colPaidFurnitureDelivery;
    public TableColumn<FurnitureDelivery, String> colResidueFurnitureDelivery;
    public TableColumn<FurnitureDelivery, Date> colDateOfDeliveryFurnitureDelivery;
    public TableColumn<FurnitureDelivery, String> colNameRoomFurnitureDelivery;
    public TableColumn<FurnitureDelivery, String> colPlannedCPFurnitureDelivery;
    public TableColumn<FurnitureDelivery, String> colActualCPFurnitureDelivery;
    public TableColumn<FurnitureDelivery, String> colAccountFurnitureDelivery;
    public TableColumn<FurnitureDelivery, String> colContactsFurnitureDelivery;
    public TableColumn<FurnitureDelivery, String> colNotesFurnitureDelivery;
    public TableColumn<FurnitureDelivery, String> colCharacteristicsFurnitureDelivery;
    private ObservableList<FurnitureDelivery> observableListFurnitureDelivery = FXCollections.observableArrayList();

    public TableView<FurnitureSuddenly> furnitureTableViewSuddenly;
    public TableColumn<FurnitureSuddenly, String> colNameFurnitureSuddenly;
    public TableColumn<FurnitureSuddenly, Boolean> colActivePFurnitureSuddenly;
    public TableColumn<FurnitureSuddenly, Boolean> colActiveCFurnitureSuddenly;
    public TableColumn<FurnitureSuddenly, UnitType> colUnitFurnitureSuddenly;
    public TableColumn<FurnitureSuddenly, String> colQuantityFurnitureSuddenly;
    public TableColumn<FurnitureSuddenly, String> colOrdinalPriceUnitFurnitureSuddenly;
    public TableColumn<FurnitureSuddenly, String> colPriceCPUnitFurnitureSuddenly;
    public TableColumn<FurnitureSuddenly, String> colPriceCPKeyFurnitureSuddenly;
    public TableColumn<FurnitureSuddenly, String> colCostCPUnitFurnitureSuddenly;
    public TableColumn<FurnitureSuddenly, String> colPriceOrderFurnitureSuddenly;
    public TableColumn<FurnitureSuddenly, String> colCostCPFurnitureSuddenly;
    public TableColumn<FurnitureSuddenly, TimeProduction> colProductionTimeFurnitureSuddenly;
    public TableColumn<FurnitureSuddenly, String> colActualCostFurnitureSuddenly;
    public TableColumn<FurnitureSuddenly, String> colActualDifferenceFurnitureSuddenly;
    public TableColumn<FurnitureSuddenly, String> colPaidFurnitureSuddenly;
    public TableColumn<FurnitureSuddenly, String> colResidueFurnitureSuddenly;
    public TableColumn<FurnitureSuddenly, Date> colDateOfDeliveryFurnitureSuddenly;
    public TableColumn<FurnitureSuddenly, String> colNameRoomFurnitureSuddenly;
    public TableColumn<FurnitureSuddenly, String> colPlannedCPFurnitureSuddenly;
    public TableColumn<FurnitureSuddenly, String> colActualCPFurnitureSuddenly;
    public TableColumn<FurnitureSuddenly, String> colAccountFurnitureSuddenly;
    public TableColumn<FurnitureSuddenly, String> colContactsFurnitureSuddenly;
    public TableColumn<FurnitureSuddenly, String> colNotesFurnitureSuddenly;
    public TableColumn<FurnitureSuddenly, String> colCharacteristicsFurnitureSuddenly;
    private ObservableList<FurnitureSuddenly> observableListFurnitureSuddenly = FXCollections.observableArrayList();


    //Блок Света
    public TableView<LightDelivery> lightTableViewDelivery;
    public TableColumn<LightDelivery, String> colNameLightDelivery;
    public TableColumn<LightDelivery, Boolean> colActivePLightDelivery;
    public TableColumn<LightDelivery, Boolean> colActiveCLightDelivery;
    public TableColumn<LightDelivery, UnitType> colUnitLightDelivery;
    public TableColumn<LightDelivery, String> colQuantityLightDelivery;
    public TableColumn<LightDelivery, String> colOrdinalPriceUnitLightDelivery;
    public TableColumn<LightDelivery, String> colPriceCPUnitLightDelivery;
    public TableColumn<LightDelivery, String> colPriceCPKeyLightDelivery;
    public TableColumn<LightDelivery, String> colCostCPUnitLightDelivery;
    public TableColumn<LightDelivery, String> colPriceOrderLightDelivery;
    public TableColumn<LightDelivery, String> colCostCPLightDelivery;
    public TableColumn<LightDelivery, TimeProduction> colProductionTimeLightDelivery;
    public TableColumn<LightDelivery, String> colActualCostLightDelivery;
    public TableColumn<LightDelivery, String> colActualDifferenceLightDelivery;
    public TableColumn<LightDelivery, String> colPaidLightDelivery;
    public TableColumn<LightDelivery, String> colResidueLightDelivery;
    public TableColumn<LightDelivery, Date> colDateOfDeliveryLightDelivery;
    public TableColumn<LightDelivery, String> colNameRoomLightDelivery;
    public TableColumn<LightDelivery, String> colPlannedCPLightDelivery;
    public TableColumn<LightDelivery, String> colActualCPLightDelivery;
    public TableColumn<LightDelivery, String> colAccountLightDelivery;
    public TableColumn<LightDelivery, String> colContactsLightDelivery;
    public TableColumn<LightDelivery, String> colNotesLightDelivery;
    public TableColumn<LightDelivery, String> colCharacteristicsLightDelivery;
    private ObservableList<LightDelivery> observableListLightDelivery = FXCollections.observableArrayList();

    public TableView<LightSuddenly> lightTableViewSuddenly;
    public TableColumn<LightSuddenly, String> colNameLightSuddenly;
    public TableColumn<LightSuddenly, Boolean> colActivePLightSuddenly;
    public TableColumn<LightSuddenly, Boolean> colActiveCLightSuddenly;
    public TableColumn<LightSuddenly, UnitType> colUnitLightSuddenly;
    public TableColumn<LightSuddenly, String> colQuantityLightSuddenly;
    public TableColumn<LightSuddenly, String> colOrdinalPriceUnitLightSuddenly;
    public TableColumn<LightSuddenly, String> colPriceCPUnitLightSuddenly;
    public TableColumn<LightSuddenly, String> colPriceCPKeyLightSuddenly;
    public TableColumn<LightSuddenly, String> colCostCPUnitLightSuddenly;
    public TableColumn<LightSuddenly, String> colPriceOrderLightSuddenly;
    public TableColumn<LightSuddenly, String> colCostCPLightSuddenly;
    public TableColumn<LightSuddenly, TimeProduction> colProductionTimeLightSuddenly;
    public TableColumn<LightSuddenly, String> colActualCostLightSuddenly;
    public TableColumn<LightSuddenly, String> colActualDifferenceLightSuddenly;
    public TableColumn<LightSuddenly, String> colPaidLightSuddenly;
    public TableColumn<LightSuddenly, String> colResidueLightSuddenly;
    public TableColumn<LightSuddenly, Date> colDateOfDeliveryLightSuddenly;
    public TableColumn<LightSuddenly, String> colNameRoomLightSuddenly;
    public TableColumn<LightSuddenly, String> colPlannedCPLightSuddenly;
    public TableColumn<LightSuddenly, String> colActualCPLightSuddenly;
    public TableColumn<LightSuddenly, String> colAccountLightSuddenly;
    public TableColumn<LightSuddenly, String> colContactsLightSuddenly;
    public TableColumn<LightSuddenly, String> colNotesLightSuddenly;
    public TableColumn<LightSuddenly, String> colCharacteristicsLightSuddenly;
    private ObservableList<LightSuddenly> observableListLightSuddenly = FXCollections.observableArrayList();


    //Блок Техники
    public TableView<AppliancesKitchen> appliancesTableViewKitchen;
    public TableColumn<AppliancesKitchen, String> colNameAppliancesKitchen;
    public TableColumn<AppliancesKitchen, Boolean> colActivePAppliancesKitchen;
    public TableColumn<AppliancesKitchen, Boolean> colActiveCAppliancesKitchen;
    public TableColumn<AppliancesKitchen, UnitType> colUnitAppliancesKitchen;
    public TableColumn<AppliancesKitchen, String> colQuantityAppliancesKitchen;
    public TableColumn<AppliancesKitchen, String> colOrdinalPriceUnitAppliancesKitchen;
    public TableColumn<AppliancesKitchen, String> colPriceCPUnitAppliancesKitchen;
    public TableColumn<AppliancesKitchen, String> colPriceCPKeyAppliancesKitchen;
    public TableColumn<AppliancesKitchen, String> colCostCPUnitAppliancesKitchen;
    public TableColumn<AppliancesKitchen, String> colPriceOrderAppliancesKitchen;
    public TableColumn<AppliancesKitchen, String> colCostCPAppliancesKitchen;
    public TableColumn<AppliancesKitchen, TimeProduction> colProductionTimeAppliancesKitchen;
    public TableColumn<AppliancesKitchen, String> colActualCostAppliancesKitchen;
    public TableColumn<AppliancesKitchen, String> colActualDifferenceAppliancesKitchen;
    public TableColumn<AppliancesKitchen, String> colPaidAppliancesKitchen;
    public TableColumn<AppliancesKitchen, String> colResidueAppliancesKitchen;
    public TableColumn<AppliancesKitchen, Date> colDateOfDeliveryAppliancesKitchen;
    public TableColumn<AppliancesKitchen, String> colNameRoomAppliancesKitchen;
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
    public TableColumn<AppliancesOther, UnitType> colUnitAppliancesOther;
    public TableColumn<AppliancesOther, String> colQuantityAppliancesOther;
    public TableColumn<AppliancesOther, String> colOrdinalPriceUnitAppliancesOther;
    public TableColumn<AppliancesOther, String> colPriceCPUnitAppliancesOther;
    public TableColumn<AppliancesOther, String> colPriceCPKeyAppliancesOther;
    public TableColumn<AppliancesOther, String> colCostCPUnitAppliancesOther;
    public TableColumn<AppliancesOther, String> colPriceOrderAppliancesOther;
    public TableColumn<AppliancesOther, String> colCostCPAppliancesOther;
    public TableColumn<AppliancesOther, TimeProduction> colProductionTimeAppliancesOther;
    public TableColumn<AppliancesOther, String> colActualCostAppliancesOther;
    public TableColumn<AppliancesOther, String> colActualDifferenceAppliancesOther;
    public TableColumn<AppliancesOther, String> colPaidAppliancesOther;
    public TableColumn<AppliancesOther, String> colResidueAppliancesOther;
    public TableColumn<AppliancesOther, Date> colDateOfDeliveryAppliancesOther;
    public TableColumn<AppliancesOther, String> colNameRoomAppliancesOther;
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
    public TableColumn<AppliancesDelivery, UnitType> colUnitAppliancesDelivery;
    public TableColumn<AppliancesDelivery, String> colQuantityAppliancesDelivery;
    public TableColumn<AppliancesDelivery, String> colOrdinalPriceUnitAppliancesDelivery;
    public TableColumn<AppliancesDelivery, String> colPriceCPUnitAppliancesDelivery;
    public TableColumn<AppliancesDelivery, String> colPriceCPKeyAppliancesDelivery;
    public TableColumn<AppliancesDelivery, String> colCostCPUnitAppliancesDelivery;
    public TableColumn<AppliancesDelivery, String> colPriceOrderAppliancesDelivery;
    public TableColumn<AppliancesDelivery, String> colCostCPAppliancesDelivery;
    public TableColumn<AppliancesDelivery, TimeProduction> colProductionTimeAppliancesDelivery;
    public TableColumn<AppliancesDelivery, String> colActualCostAppliancesDelivery;
    public TableColumn<AppliancesDelivery, String> colActualDifferenceAppliancesDelivery;
    public TableColumn<AppliancesDelivery, String> colPaidAppliancesDelivery;
    public TableColumn<AppliancesDelivery, String> colResidueAppliancesDelivery;
    public TableColumn<AppliancesDelivery, Date> colDateOfDeliveryAppliancesDelivery;
    public TableColumn<AppliancesDelivery, String> colNameRoomAppliancesDelivery;
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
    public TableColumn<AppliancesSuddenly, UnitType> colUnitAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colQuantityAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colOrdinalPriceUnitAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colPriceCPUnitAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colPriceCPKeyAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colCostCPUnitAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colPriceOrderAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colCostCPAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, TimeProduction> colProductionTimeAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colActualCostAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colActualDifferenceAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colPaidAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colResidueAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, Date> colDateOfDeliveryAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colNameRoomAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colPlannedCPAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colActualCPAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colAccountAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colContactsAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colNotesAppliancesSuddenly;
    public TableColumn<AppliancesSuddenly, String> colCharacteristicsAppliancesSuddenly;
    private ObservableList<AppliancesSuddenly> observableListAppliancesSuddenly = FXCollections.observableArrayList();

    //Блок Декора
    public TableView<DecorationDelivery> decorationTableViewDelivery;
    public TableColumn<DecorationDelivery, String> colNameDecorationDelivery;
    public TableColumn<DecorationDelivery, Boolean> colActivePDecorationDelivery;
    public TableColumn<DecorationDelivery, Boolean> colActiveCDecorationDelivery;
    public TableColumn<DecorationDelivery, UnitType> colUnitDecorationDelivery;
    public TableColumn<DecorationDelivery, String> colQuantityDecorationDelivery;
    public TableColumn<DecorationDelivery, String> colOrdinalPriceUnitDecorationDelivery;
    public TableColumn<DecorationDelivery, String> colPriceCPUnitDecorationDelivery;
    public TableColumn<DecorationDelivery, String> colPriceCPKeyDecorationDelivery;
    public TableColumn<DecorationDelivery, String> colCostCPUnitDecorationDelivery;
    public TableColumn<DecorationDelivery, String> colPriceOrderDecorationDelivery;
    public TableColumn<DecorationDelivery, String> colCostCPDecorationDelivery;
    public TableColumn<DecorationDelivery, TimeProduction> colProductionTimeDecorationDelivery;
    public TableColumn<DecorationDelivery, String> colActualCostDecorationDelivery;
    public TableColumn<DecorationDelivery, String> colActualDifferenceDecorationDelivery;
    public TableColumn<DecorationDelivery, String> colPaidDecorationDelivery;
    public TableColumn<DecorationDelivery, String> colResidueDecorationDelivery;
    public TableColumn<DecorationDelivery, Date> colDateOfDeliveryDecorationDelivery;
    public TableColumn<DecorationDelivery, String> colNameRoomDecorationDelivery;
    public TableColumn<DecorationDelivery, String> colPlannedCPDecorationDelivery;
    public TableColumn<DecorationDelivery, String> colActualCPDecorationDelivery;
    public TableColumn<DecorationDelivery, String> colAccountDecorationDelivery;
    public TableColumn<DecorationDelivery, String> colContactsDecorationDelivery;
    public TableColumn<DecorationDelivery, String> colNotesDecorationDelivery;
    public TableColumn<DecorationDelivery, String> colCharacteristicsDecorationDelivery;
    private ObservableList<DecorationDelivery> observableListDecorationDelivery = FXCollections.observableArrayList();

    public TableView<DecorationSuddenly> decorationTableViewSuddenly;
    public TableColumn<DecorationSuddenly, String> colNameDecorationSuddenly;
    public TableColumn<DecorationSuddenly, Boolean> colActivePDecorationSuddenly;
    public TableColumn<DecorationSuddenly, Boolean> colActiveCDecorationSuddenly;
    public TableColumn<DecorationSuddenly, UnitType> colUnitDecorationSuddenly;
    public TableColumn<DecorationSuddenly, String> colQuantityDecorationSuddenly;
    public TableColumn<DecorationSuddenly, String> colOrdinalPriceUnitDecorationSuddenly;
    public TableColumn<DecorationSuddenly, String> colPriceCPUnitDecorationSuddenly;
    public TableColumn<DecorationSuddenly, String> colPriceCPKeyDecorationSuddenly;
    public TableColumn<DecorationSuddenly, String> colCostCPUnitDecorationSuddenly;
    public TableColumn<DecorationSuddenly, String> colPriceOrderDecorationSuddenly;
    public TableColumn<DecorationSuddenly, String> colCostCPDecorationSuddenly;
    public TableColumn<DecorationSuddenly, TimeProduction> colProductionTimeDecorationSuddenly;
    public TableColumn<DecorationSuddenly, String> colActualCostDecorationSuddenly;
    public TableColumn<DecorationSuddenly, String> colActualDifferenceDecorationSuddenly;
    public TableColumn<DecorationSuddenly, String> colPaidDecorationSuddenly;
    public TableColumn<DecorationSuddenly, String> colResidueDecorationSuddenly;
    public TableColumn<DecorationSuddenly, Date> colDateOfDeliveryDecorationSuddenly;
    public TableColumn<DecorationSuddenly, String> colNameRoomDecorationSuddenly;
    public TableColumn<DecorationSuddenly, String> colPlannedCPDecorationSuddenly;
    public TableColumn<DecorationSuddenly, String> colActualCPDecorationSuddenly;
    public TableColumn<DecorationSuddenly, String> colAccountDecorationSuddenly;
    public TableColumn<DecorationSuddenly, String> colContactsDecorationSuddenly;
    public TableColumn<DecorationSuddenly, String> colNotesDecorationSuddenly;
    public TableColumn<DecorationSuddenly, String> colCharacteristicsDecorationSuddenly;
    private ObservableList<DecorationSuddenly> observableListDecorationSuddenly = FXCollections.observableArrayList();

    public TableView<Statistic> statisticTableView;
    public TableColumn<Statistic, String> colNameCategory;
    public TableColumn<Statistic, String> colTotalCost;
    public TableColumn<Statistic, String> colCostSGM;
    private ObservableList<Statistic> observableListStatistic = FXCollections.observableArrayList();


    public Button createRoomButton;


    public Accordion roomPlumbing;
    public Accordion roomFurniture;
    public Accordion roomLight;
    public Accordion roomDecoration;


    public void createProject(ActionEvent actionEvent) {
        createProjectTextField.setVisible(true);
        addProjectButton.setVisible(true);
    }

    public void addProject(ActionEvent actionEvent) {
        startProject.setVisible(true);
        deleteProjectButton.setVisible(true);
        projectTableView.setVisible(true);
        Project project = new Project();
        project.setNameProject(createProjectTextField.getText());
        projectTableView.getItems().add(project);
        createProjectTextField.setVisible(false);
        addProjectButton.setVisible(false);



        //Заложить в кнопки на увеличение и уменьшение высоты таблицы
//            materialTableViewWall.setMinHeight(materialTableViewWall.getHeight()+ 50.0);

//        Неправильный метод для увелмичение таблицы
//        if (!createProjectTextField.getText().equals("")) {
//            projectTableView.setMinHeight(projectTableView.getHeight() + 25);
//        }
    }


    public void deleteElementProject(ActionEvent actionEvent) {
        ObservableList<Project> allProject, singleProject;
        allProject = projectTableView.getItems();
        singleProject = projectTableView.getSelectionModel().getSelectedItems();
        singleProject.forEach(allProject::remove);
    }


    public void selectProject(ActionEvent actionEvent) {
        startProject.setVisible(true);
        deleteProjectButton.setVisible(true);
        projectTableView.setVisible(true);
    }

    public void createRoom(ActionEvent actionEvent) {
        roomNameTextField.setVisible(true);
        roomAreaTextField.setVisible(true);
        addRoomButton.setVisible(true);
    }

    public void addRoom(ActionEvent actionEvent) {
        roomNameTextField.setVisible(false);
        roomAreaTextField.setVisible(false);
        addRoomButton.setVisible(false);
    }

    //Для теста, не забыть переделать!!!!!!!!!!!
    public void chooseProject(ActionEvent actionEvent) {
        totalArea.setVisible(true);
        costDP.setVisible(true);
        discountDP.setVisible(true);
        createRoomButton.setVisible(true);
        addPaymentButton.setVisible(true);
        deleteRoomButton.setVisible(true);
        saveRoomButton.setVisible(true);
        backRoomButton.setVisible(true);
        roomTableView.setVisible(true);

        createProjectButton.setVisible(false);
        selectProjectButton.setVisible(false);
        createProjectTextField.setVisible(false);
        addProjectButton.setVisible(false);
        startProject.setVisible(false);
        deleteProjectButton.setVisible(false);
        projectTableView.setVisible(false);
    }

    public void backProject(ActionEvent actionEvent) {
        totalArea.setVisible(false);
        costDP.setVisible(false);
        discountDP.setVisible(false);
        createRoomButton.setVisible(false);
        addPaymentButton.setVisible(false);
        deleteRoomButton.setVisible(false);
        saveRoomButton.setVisible(false);
        backRoomButton.setVisible(false);
        roomTableView.setVisible(false);

        createProjectButton.setVisible(true);
        selectProjectButton.setVisible(true);
        createProjectTextField.setVisible(true);
        addProjectButton.setVisible(true);
        startProject.setVisible(true);
        deleteProjectButton.setVisible(true);
        projectTableView.setVisible(true);

        totalView.setDisable(true);
        DPView.setDisable(true);
        buildersView.setDisable(true);
        subcontractorsView.setDisable(true);
        AKView.setDisable(true);
        materialView.setDisable(true);
        plumbingView.setDisable(true);
        furnitureView.setDisable(true);
        lightView.setDisable(true);
        appliancesView.setDisable(true);
        decorationView.setDisable(true);
        statisticsView.setDisable(true);
        diagramView.setDisable(true);
    }

    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        colNameProject.setCellValueFactory(new PropertyValueFactory<>("nameProject"));
        ObservableList<Project> observableListProject = FXCollections.observableArrayList(
                new Project("Проект 1"),
                new Project("Проект 2"),
                new Project("Проект 3")
        );
        projectTableView.setEditable(true);
        projectTableView.setItems(observableListProject);


        //Тест расчетов статистики, не забыть про отдельную переменную!
        double a = 555.0;
        //Статистика

        colNameCategory.setCellValueFactory(new PropertyValueFactory<>("nameCategory"));
        colTotalCost.setCellValueFactory(new PropertyValueFactory<>("totalCost"));
        colCostSGM.setCellValueFactory(new PropertyValueFactory<>("costSGM"));

        ObservableList<Statistic> observableListStatistic = FXCollections.observableArrayList(
                new Statistic("Дизайн-проект", a, a / 5),
                new Statistic("Строители", 0, 0),
                new Statistic("Черновые материалы", 0, 0),
                new Statistic("Смежники", 0, 0),
                new Statistic("Авторский контроль", 0, 0),
                new Statistic("Чистовые материалы", 0, 0),
                new Statistic("Сантехника", 0, 0),
                new Statistic("Мебель", 0, 0),
                new Statistic("Освещение", 0, 0),
                new Statistic("Техника", 0, 0),
                new Statistic("Декор", 0, 0),
                new Statistic("ИТОГО:", 0, 0)
        );

        statisticTableView.setItems(observableListStatistic);
        statisticTableView.setEditable(true);


        //Смежники
        subcontractorsTableView.setItems(observableListSubcontractors);
        Callback<TableColumn<Subcontractors, String>, TableCell<Subcontractors, String>> cellFactoryDoubleSubcontractors =
                new Callback<TableColumn<Subcontractors, String>, TableCell<Subcontractors, String>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellTextBox("\\d.\\d");
                    }
                };

        colNameCategorySubcontractors.setCellValueFactory(new PropertyValueFactory<>("nameCategorySubcontractors"));
        colNameCategorySubcontractors.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<Subcontractors, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<Subcontractors, String> t) {
                        ((Subcontractors) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setNameCategorySubcontractors(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });

        colCostPlannedSubcontractors.setCellFactory(cellFactoryDoubleSubcontractors);
        colCostPlannedSubcontractors.setCellValueFactory(new PropertyValueFactory<>("costPlannedSubcontractors"));
        colCostPlannedSubcontractors.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Subcontractors, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Subcontractors, String> t) {
                ((Subcontractors) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())).setCostPlannedSubcontractors(t.getNewValue());
                t.getTableView().refresh();
            }
        });

        colCostCPSubcontractors.setCellFactory(cellFactoryDoubleSubcontractors);
        colCostCPSubcontractors.setCellValueFactory(new PropertyValueFactory<>("costCPSubcontractors"));
        colCostCPSubcontractors.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Subcontractors, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Subcontractors, String> t) {
                ((Subcontractors) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())).setCostCPSubcontractors(t.getNewValue());
                t.getTableView().refresh();
            }
        });
        colCostActualSubcontractors.setCellFactory(cellFactoryDoubleSubcontractors);
        colCostActualSubcontractors.setCellValueFactory(new PropertyValueFactory<>("costActualSubcontractors"));
        colCostActualSubcontractors.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Subcontractors, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Subcontractors, String> t) {
                ((Subcontractors) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())).setCostActualSubcontractors(t.getNewValue());
                t.getTableView().refresh();
            }
        });
        colActualDifferenceSubcontractors.setCellFactory(cellFactoryDoubleSubcontractors);
        colActualDifferenceSubcontractors.setCellValueFactory(new PropertyValueFactory<>("actualDifferenceSubcontractors"));
        colActualDifferenceSubcontractors.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Subcontractors, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Subcontractors, String> t) {
                ((Subcontractors) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())).setActualDifferenceSubcontractors(t.getNewValue());
                t.getTableView().refresh();
            }
        });
        colPaidSubcontractors.setCellFactory(cellFactoryDoubleSubcontractors);
        colPaidSubcontractors.setCellValueFactory(new PropertyValueFactory<>("paidSubcontractors"));
        colPaidSubcontractors.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Subcontractors, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Subcontractors, String> t) {
                ((Subcontractors) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())).setPaidSubcontractors(t.getNewValue());
                t.getTableView().refresh();
            }
        });
        colResidueSubcontractors.setCellFactory(cellFactoryDoubleSubcontractors);
        colResidueSubcontractors.setCellValueFactory(new PropertyValueFactory<>("residueSubcontractors"));
        colResidueSubcontractors.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Subcontractors, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Subcontractors, String> t) {
                ((Subcontractors) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())).setResidueSubcontractors(t.getNewValue());
                t.getTableView().refresh();
            }
        });

        colPlannedCPSubcontractors.setCellValueFactory(new PropertyValueFactory<>("plannedCPSubcontractors"));
        colPlannedCPSubcontractors.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<Subcontractors, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<Subcontractors, String> t) {
                        ((Subcontractors) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPlannedCPSubcontractors(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualCPSubcontractors.setCellValueFactory(new PropertyValueFactory<>("actualCPSubcontractors"));
        colActualCPSubcontractors.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<Subcontractors, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<Subcontractors, String> t) {
                        ((Subcontractors) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActualCPSubcontractors(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colAccountSubcontractors.setCellValueFactory(new PropertyValueFactory<>("accountSubcontractors"));
        colAccountSubcontractors.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<Subcontractors, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<Subcontractors, String> t) {
                        ((Subcontractors) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setAccountSubcontractors(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colContactsSubcontractors.setCellValueFactory(new PropertyValueFactory<>("contactsSubcontractors"));
        colContactsSubcontractors.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<Subcontractors, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<Subcontractors, String> t) {
                        ((Subcontractors) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setContactsSubcontractors(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colNotesSubcontractors.setCellValueFactory(new PropertyValueFactory<>("notesSubcontractors"));
        colNotesSubcontractors.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<Subcontractors, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<Subcontractors, String> t) {
                        ((Subcontractors) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setNotesSubcontractors(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCharacteristicsSubcontractors.setCellValueFactory(new PropertyValueFactory<>("characteristicsSubcontractors"));
        colCharacteristicsSubcontractors.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<Subcontractors, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<Subcontractors, String> t) {
                        ((Subcontractors) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setCharacteristicsSubcontractors(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });

        colNameCategorySubcontractors.setCellFactory(TextFieldTableCell.forTableColumn());
        colPlannedCPSubcontractors.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCPSubcontractors.setCellFactory(TextFieldTableCell.forTableColumn());
        colAccountSubcontractors.setCellFactory(TextFieldTableCell.forTableColumn());
        colContactsSubcontractors.setCellFactory(TextFieldTableCell.forTableColumn());
        colNotesSubcontractors.setCellFactory(TextFieldTableCell.forTableColumn());
        colCharacteristicsSubcontractors.setCellFactory(TextFieldTableCell.forTableColumn());


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


        //Помещения
        roomTableView.setItems(observableListRoom);
        Callback<TableColumn<Room, String>, TableCell<Room, String>> cellFactoryDoubleRoom =
                new Callback<TableColumn<Room, String>, TableCell<Room, String>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellTextBox("\\d.\\d");
                    }
                };
        Callback<TableColumn<Room, Boolean>, TableCell<Room, Boolean>> cellFactoryCheckboxRoom =
                new Callback<TableColumn<Room, Boolean>, TableCell<Room, Boolean>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellCheckBox();
                    }
                };

        colNameRoom.setCellValueFactory(new PropertyValueFactory<>("nameRoom"));
        colNameRoom.setOnEditCommit(this::onClick);

        colAreaRoom.setCellFactory(cellFactoryDoubleRoom);
        colAreaRoom.setCellValueFactory(new PropertyValueFactory<>("areaRoom"));
        colAreaRoom.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<Room, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<Room, String> t) {
                        ((Room) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setAreaRoom(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colSelectBathRoom.setCellFactory(cellFactoryCheckboxRoom);
        colSelectBathRoom.setCellValueFactory(new PropertyValueFactory<>("selectBathRoom"));
        colSelectBathRoom.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<Room, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<Room, Boolean> t) {
                        ((Room) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setSelectBathRoom(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colNameRoom.setCellFactory(TextFieldTableCell.forTableColumn());



        //Сантехника - Доставка
        plumbingTableViewDelivery.setItems(observableListPlumbingDelivery);
        Callback<TableColumn<PlumbingDelivery, String>, TableCell<PlumbingDelivery, String>> cellFactoryDoublePlumbingDelivery =
                new Callback<TableColumn<PlumbingDelivery, String>, TableCell<PlumbingDelivery, String>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellTextBox("\\d.\\d");
                    }
                };
        Callback<TableColumn<PlumbingDelivery, Boolean>, TableCell<PlumbingDelivery, Boolean>> cellFactoryCheckboxPlumbingDelivery =
                new Callback<TableColumn<PlumbingDelivery, Boolean>, TableCell<PlumbingDelivery, Boolean>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellCheckBox();
                    }
                };


        colNamePlumbingDelivery.setCellValueFactory(new PropertyValueFactory<>("namePlumbingDelivery"));
        colNamePlumbingDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setNamePlumbingDelivery(t.getNewValue());
                    }
                });
        colActivePPlumbingDelivery.setCellFactory(cellFactoryCheckboxPlumbingDelivery);
        colActivePPlumbingDelivery.setCellValueFactory(new PropertyValueFactory<>("activePPlumbingDelivery"));
        colActivePPlumbingDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingDelivery, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingDelivery, Boolean> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActivePPlumbingDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActiveCPlumbingDelivery.setCellFactory(cellFactoryCheckboxPlumbingDelivery);
        colActiveCPlumbingDelivery.setCellValueFactory(new PropertyValueFactory<>("activeCPlumbingDelivery"));
        colActiveCPlumbingDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingDelivery, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingDelivery, Boolean> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActiveCPlumbingDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        ObservableList<UnitType> typeListPlumbingDelivery = FXCollections.observableArrayList(UnitType.values());
        colUnitPlumbingDelivery.setCellValueFactory(new PropertyValueFactory<>("unitPlumbingDelivery"));
        colUnitPlumbingDelivery.setCellFactory(ComboBoxTableCell.forTableColumn(typeListPlumbingDelivery));
        colUnitPlumbingDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingDelivery, UnitType>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingDelivery, UnitType> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setUnitPlumbingDelivery(t.getNewValue());
                    }
                });
        colQuantityPlumbingDelivery.setCellFactory(cellFactoryDoublePlumbingDelivery);
        colQuantityPlumbingDelivery.setCellValueFactory(new PropertyValueFactory<>("quantityPlumbingDelivery"));
        colQuantityPlumbingDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setQuantityPlumbingDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colOrdinalPriceUnitPlumbingDelivery.setCellFactory(cellFactoryDoublePlumbingDelivery);
        colOrdinalPriceUnitPlumbingDelivery.setCellValueFactory(new PropertyValueFactory<>("ordinalPriceUnitPlumbingDelivery"));
        colOrdinalPriceUnitPlumbingDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setOrdinalPriceUnitPlumbingDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPUnitPlumbingDelivery.setCellFactory(cellFactoryDoublePlumbingDelivery);
        colPriceCPUnitPlumbingDelivery.setCellValueFactory(new PropertyValueFactory<>("priceCPUnitPlumbingDelivery"));
        colPriceCPUnitPlumbingDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPriceCPUnitPlumbingDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPKeyPlumbingDelivery.setCellFactory(cellFactoryDoublePlumbingDelivery);
        colPriceCPKeyPlumbingDelivery.setCellValueFactory(new PropertyValueFactory<>("priceCPKeyPlumbingDelivery"));
        colPriceCPKeyPlumbingDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPriceCPKeyPlumbingDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPUnitPlumbingDelivery.setCellFactory(cellFactoryDoublePlumbingDelivery);
        colCostCPUnitPlumbingDelivery.setCellValueFactory(new PropertyValueFactory<>("costCPUnitPlumbingDelivery"));
        colCostCPUnitPlumbingDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setCostCPUnitPlumbingDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceOrderPlumbingDelivery.setCellFactory(cellFactoryDoublePlumbingDelivery);
        colPriceOrderPlumbingDelivery.setCellValueFactory(new PropertyValueFactory<>("priceOrderPlumbingDelivery"));
        colPriceOrderPlumbingDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPriceOrderPlumbingDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPPlumbingDelivery.setCellFactory(cellFactoryDoublePlumbingDelivery);
        colCostCPPlumbingDelivery.setCellValueFactory(new PropertyValueFactory<>("costCPPlumbingDelivery"));
        colCostCPPlumbingDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setCostCPPlumbingDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        ObservableList<TimeProduction> timeProductionListPlumbingDelivery = FXCollections.observableArrayList(TimeProduction.values());
        colProductionTimePlumbingDelivery.setCellValueFactory(new PropertyValueFactory<>("productionTimePlumbingDelivery"));
        colProductionTimePlumbingDelivery.setCellFactory(ComboBoxTableCell.forTableColumn(timeProductionListPlumbingDelivery));
        colProductionTimePlumbingDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingDelivery, TimeProduction>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingDelivery, TimeProduction> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setProductionTimePlumbingDelivery(t.getNewValue());
                    }
                });
        colActualCostPlumbingDelivery.setCellFactory(cellFactoryDoublePlumbingDelivery);
        colActualCostPlumbingDelivery.setCellValueFactory(new PropertyValueFactory<>("actualCostPlumbingDelivery"));
        colActualCostPlumbingDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActualCostPlumbingDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualDifferencePlumbingDelivery.setCellFactory(cellFactoryDoublePlumbingDelivery);
        colActualDifferencePlumbingDelivery.setCellValueFactory(new PropertyValueFactory<>("actualDifferencePlumbingDelivery"));
        colActualDifferencePlumbingDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActualDifferencePlumbingDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPaidPlumbingDelivery.setCellFactory(cellFactoryDoublePlumbingDelivery);
        colPaidPlumbingDelivery.setCellValueFactory(new PropertyValueFactory<>("paidPlumbingDelivery"));
        colPaidPlumbingDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPaidPlumbingDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colResiduePlumbingDelivery.setCellFactory(cellFactoryDoublePlumbingDelivery);
        colResiduePlumbingDelivery.setCellValueFactory(new PropertyValueFactory<>("residuePlumbingDelivery"));
        colResiduePlumbingDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setResiduePlumbingDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colDateOfDeliveryPlumbingDelivery.setCellValueFactory(new PropertyValueFactory<>("dateOfDeliveryPlumbingDelivery"));
        colDateOfDeliveryPlumbingDelivery.setCellFactory(p -> {
            return new PlumbingDelivery.DatePickerCell<>();
        });
        colNameRoomPlumbingDelivery.setCellValueFactory(new PropertyValueFactory<>("nameRoomPlumbingDelivery"));
        colNameRoomPlumbingDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setNameRoomPlumbingDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPlannedCPPlumbingDelivery.setCellValueFactory(new PropertyValueFactory<>("plannedCPPlumbingDelivery"));
        colPlannedCPPlumbingDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPlannedCPPlumbingDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualCPPlumbingDelivery.setCellValueFactory(new PropertyValueFactory<>("actualCPPlumbingDelivery"));
        colActualCPPlumbingDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActualCPPlumbingDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colAccountPlumbingDelivery.setCellValueFactory(new PropertyValueFactory<>("accountPlumbingDelivery"));
        colAccountPlumbingDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setAccountPlumbingDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colContactsPlumbingDelivery.setCellValueFactory(new PropertyValueFactory<>("contactsPlumbingDelivery"));
        colContactsPlumbingDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setContactsPlumbingDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colNotesPlumbingDelivery.setCellValueFactory(new PropertyValueFactory<>("notesPlumbingDelivery"));
        colNotesPlumbingDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setNotesPlumbingDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCharacteristicsPlumbingDelivery.setCellValueFactory(new PropertyValueFactory<>("characteristicsPlumbingDelivery"));
        colCharacteristicsPlumbingDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setCharacteristicsPlumbingDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });

        colNamePlumbingDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colNameRoomPlumbingDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colPlannedCPPlumbingDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCPPlumbingDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colAccountPlumbingDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colContactsPlumbingDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colNotesPlumbingDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colCharacteristicsPlumbingDelivery.setCellFactory(TextFieldTableCell.forTableColumn());


        //Сантехника- Нежданчик
        plumbingTableViewSuddenly.setItems(observableListPlumbingSuddenly);
        Callback<TableColumn<PlumbingSuddenly, String>, TableCell<PlumbingSuddenly, String>> cellFactoryDoublePlumbingSuddenly =
                new Callback<TableColumn<PlumbingSuddenly, String>, TableCell<PlumbingSuddenly, String>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellTextBox("\\d.\\d");
                    }
                };
        Callback<TableColumn<PlumbingSuddenly, Boolean>, TableCell<PlumbingSuddenly, Boolean>> cellFactoryCheckboxPlumbingSuddenly =
                new Callback<TableColumn<PlumbingSuddenly, Boolean>, TableCell<PlumbingSuddenly, Boolean>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellCheckBox();
                    }
                };


        colNamePlumbingSuddenly.setCellValueFactory(new PropertyValueFactory<>("namePlumbingSuddenly"));
        colNamePlumbingSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setNamePlumbingSuddenly(t.getNewValue());
                    }
                });
        colActivePPlumbingSuddenly.setCellFactory(cellFactoryCheckboxPlumbingSuddenly);
        colActivePPlumbingSuddenly.setCellValueFactory(new PropertyValueFactory<>("activePPlumbingSuddenly"));
        colActivePPlumbingSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingSuddenly, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingSuddenly, Boolean> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActivePPlumbingSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActiveCPlumbingSuddenly.setCellFactory(cellFactoryCheckboxPlumbingSuddenly);
        colActiveCPlumbingSuddenly.setCellValueFactory(new PropertyValueFactory<>("activeCPlumbingSuddenly"));
        colActiveCPlumbingSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingSuddenly, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingSuddenly, Boolean> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActiveCPlumbingSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        ObservableList<UnitType> typeListPlumbingSuddenly = FXCollections.observableArrayList(UnitType.values());
        colUnitPlumbingSuddenly.setCellValueFactory(new PropertyValueFactory<>("unitPlumbingSuddenly"));
        colUnitPlumbingSuddenly.setCellFactory(ComboBoxTableCell.forTableColumn(typeListPlumbingSuddenly));
        colUnitPlumbingSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingSuddenly, UnitType>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingSuddenly, UnitType> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setUnitPlumbingSuddenly(t.getNewValue());
                    }
                });
        colQuantityPlumbingSuddenly.setCellFactory(cellFactoryDoublePlumbingSuddenly);
        colQuantityPlumbingSuddenly.setCellValueFactory(new PropertyValueFactory<>("quantityPlumbingSuddenly"));
        colQuantityPlumbingSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setQuantityPlumbingSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colOrdinalPriceUnitPlumbingSuddenly.setCellFactory(cellFactoryDoublePlumbingSuddenly);
        colOrdinalPriceUnitPlumbingSuddenly.setCellValueFactory(new PropertyValueFactory<>("ordinalPriceUnitPlumbingSuddenly"));
        colOrdinalPriceUnitPlumbingSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setOrdinalPriceUnitPlumbingSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPUnitPlumbingSuddenly.setCellFactory(cellFactoryDoublePlumbingSuddenly);
        colPriceCPUnitPlumbingSuddenly.setCellValueFactory(new PropertyValueFactory<>("priceCPUnitPlumbingSuddenly"));
        colPriceCPUnitPlumbingSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPriceCPUnitPlumbingSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPKeyPlumbingSuddenly.setCellFactory(cellFactoryDoublePlumbingSuddenly);
        colPriceCPKeyPlumbingSuddenly.setCellValueFactory(new PropertyValueFactory<>("priceCPKeyPlumbingSuddenly"));
        colPriceCPKeyPlumbingSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPriceCPKeyPlumbingSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPUnitPlumbingSuddenly.setCellFactory(cellFactoryDoublePlumbingSuddenly);
        colCostCPUnitPlumbingSuddenly.setCellValueFactory(new PropertyValueFactory<>("costCPUnitPlumbingSuddenly"));
        colCostCPUnitPlumbingSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setCostCPUnitPlumbingSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceOrderPlumbingSuddenly.setCellFactory(cellFactoryDoublePlumbingSuddenly);
        colPriceOrderPlumbingSuddenly.setCellValueFactory(new PropertyValueFactory<>("priceOrderPlumbingSuddenly"));
        colPriceOrderPlumbingSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPriceOrderPlumbingSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPPlumbingSuddenly.setCellFactory(cellFactoryDoublePlumbingSuddenly);
        colCostCPPlumbingSuddenly.setCellValueFactory(new PropertyValueFactory<>("costCPPlumbingSuddenly"));
        colCostCPPlumbingSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setCostCPPlumbingSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        ObservableList<TimeProduction> timeProductionListPlumbingSuddenly = FXCollections.observableArrayList(TimeProduction.values());
        colProductionTimePlumbingSuddenly.setCellValueFactory(new PropertyValueFactory<>("productionTimePlumbingSuddenly"));
        colProductionTimePlumbingSuddenly.setCellFactory(ComboBoxTableCell.forTableColumn(timeProductionListPlumbingSuddenly));
        colProductionTimePlumbingSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingSuddenly, TimeProduction>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingSuddenly, TimeProduction> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setProductionTimePlumbingSuddenly(t.getNewValue());
                    }
                });
        colActualCostPlumbingSuddenly.setCellFactory(cellFactoryDoublePlumbingSuddenly);
        colActualCostPlumbingSuddenly.setCellValueFactory(new PropertyValueFactory<>("actualCostPlumbingSuddenly"));
        colActualCostPlumbingSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActualCostPlumbingSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualDifferencePlumbingSuddenly.setCellFactory(cellFactoryDoublePlumbingSuddenly);
        colActualDifferencePlumbingSuddenly.setCellValueFactory(new PropertyValueFactory<>("actualDifferencePlumbingSuddenly"));
        colActualDifferencePlumbingSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActualDifferencePlumbingSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPaidPlumbingSuddenly.setCellFactory(cellFactoryDoublePlumbingSuddenly);
        colPaidPlumbingSuddenly.setCellValueFactory(new PropertyValueFactory<>("paidPlumbingSuddenly"));
        colPaidPlumbingSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPaidPlumbingSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colResiduePlumbingSuddenly.setCellFactory(cellFactoryDoublePlumbingSuddenly);
        colResiduePlumbingSuddenly.setCellValueFactory(new PropertyValueFactory<>("residuePlumbingSuddenly"));
        colResiduePlumbingSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setResiduePlumbingSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colDateOfDeliveryPlumbingSuddenly.setCellValueFactory(new PropertyValueFactory<>("dateOfDeliveryPlumbingSuddenly"));
        colDateOfDeliveryPlumbingSuddenly.setCellFactory(p -> {
            return new PlumbingSuddenly.DatePickerCell<>();
        });
        colNameRoomPlumbingSuddenly.setCellValueFactory(new PropertyValueFactory<>("nameRoomPlumbingSuddenly"));
        colNameRoomPlumbingSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setNameRoomPlumbingSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPlannedCPPlumbingSuddenly.setCellValueFactory(new PropertyValueFactory<>("plannedCPPlumbingSuddenly"));
        colPlannedCPPlumbingSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPlannedCPPlumbingSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualCPPlumbingSuddenly.setCellValueFactory(new PropertyValueFactory<>("actualCPPlumbingSuddenly"));
        colActualCPPlumbingSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActualCPPlumbingSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colAccountPlumbingSuddenly.setCellValueFactory(new PropertyValueFactory<>("accountPlumbingSuddenly"));
        colAccountPlumbingSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setAccountPlumbingSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colContactsPlumbingSuddenly.setCellValueFactory(new PropertyValueFactory<>("contactsPlumbingSuddenly"));
        colContactsPlumbingSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setContactsPlumbingSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colNotesPlumbingSuddenly.setCellValueFactory(new PropertyValueFactory<>("notesPlumbingSuddenly"));
        colNotesPlumbingSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setNotesPlumbingSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCharacteristicsPlumbingSuddenly.setCellValueFactory(new PropertyValueFactory<>("characteristicsPlumbingSuddenly"));
        colCharacteristicsPlumbingSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<PlumbingSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<PlumbingSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setCharacteristicsPlumbingSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });

        colNamePlumbingSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colNameRoomPlumbingSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colPlannedCPPlumbingSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCPPlumbingSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colAccountPlumbingSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colContactsPlumbingSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colNotesPlumbingSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colCharacteristicsPlumbingSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());


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

        ObservableList<UnitType> typeListMaterialWall = FXCollections.observableArrayList(UnitType.values());
        colUnitMaterialWall.setCellValueFactory(new PropertyValueFactory<>("unitMaterialWall"));
        colUnitMaterialWall.setCellFactory(ComboBoxTableCell.forTableColumn(typeListMaterialWall));
        colUnitMaterialWall.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialWall, UnitType>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialWall, UnitType> t) {
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


        ObservableList<TimeProduction> timeProductionListMaterialWall = FXCollections.observableArrayList(TimeProduction.values());
        colProductionTimeMaterialWall.setCellValueFactory(new PropertyValueFactory<>("productionTimeMaterialWall"));
        colProductionTimeMaterialWall.setCellFactory(ComboBoxTableCell.forTableColumn(timeProductionListMaterialWall));
        colProductionTimeMaterialWall.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialWall, TimeProduction>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialWall, TimeProduction> t) {
                        ((MaterialWall) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setProductionTimeMaterialWall(t.getNewValue());
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
        colDateOfDeliveryMaterialWall.setCellFactory(p -> {
            return new MaterialWall.DatePickerCell<>();
        });
        colNameRoomMaterialWall.setCellValueFactory(new PropertyValueFactory<>("nameRoomMaterialWall"));
        colNameRoomMaterialWall.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialWall, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialWall, String> t) {
                        ((MaterialWall) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setNameRoomMaterialWall(t.getNewValue());
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

        colNameMaterialWall.setCellFactory(TextFieldTableCell.forTableColumn());
        colNameRoomMaterialWall.setCellFactory(TextFieldTableCell.forTableColumn());
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

        ObservableList<UnitType> typeListMaterialFloor = FXCollections.observableArrayList(UnitType.values());
        colUnitMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("unitMaterialFloor"));
        colUnitMaterialFloor.setCellFactory(ComboBoxTableCell.forTableColumn(typeListMaterialFloor));
        colUnitMaterialFloor.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialFloor, UnitType>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialFloor, UnitType> t) {
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
        ObservableList<TimeProduction> timeProductionListMaterialFloor = FXCollections.observableArrayList(TimeProduction.values());
        colProductionTimeMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("productionTimeMaterialFloor"));
        colProductionTimeMaterialFloor.setCellFactory(ComboBoxTableCell.forTableColumn(timeProductionListMaterialFloor));
        colProductionTimeMaterialFloor.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialFloor, TimeProduction>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialFloor, TimeProduction> t) {
                        ((MaterialFloor) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setProductionTimeMaterialFloor(t.getNewValue());
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
        colDateOfDeliveryMaterialFloor.setCellFactory(p -> {
            return new MaterialFloor.DatePickerCell<>();
        });
        colNameRoomMaterialFloor.setCellValueFactory(new PropertyValueFactory<>("nameRoomMaterialFloor"));
        colNameRoomMaterialFloor.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialFloor, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialFloor, String> t) {
                        ((MaterialFloor) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setNameRoomMaterialFloor(t.getNewValue());
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

        colNameMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());
        colPlannedCPMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());
        colNameRoomMaterialFloor.setCellFactory(TextFieldTableCell.forTableColumn());
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
        ObservableList<UnitType> typeListMaterialCeiling = FXCollections.observableArrayList(UnitType.values());
        colUnitMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("unitMaterialCeiling"));
        colUnitMaterialCeiling.setCellFactory(ComboBoxTableCell.forTableColumn(typeListMaterialCeiling));
        colUnitMaterialCeiling.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialCeiling, UnitType>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialCeiling, UnitType> t) {
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
        ObservableList<TimeProduction> timeProductionListMaterialCeiling = FXCollections.observableArrayList(TimeProduction.values());
        colProductionTimeMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("productionTimeMaterialCeiling"));
        colProductionTimeMaterialCeiling.setCellFactory(ComboBoxTableCell.forTableColumn(timeProductionListMaterialCeiling));
        colProductionTimeMaterialCeiling.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialCeiling, TimeProduction>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialCeiling, TimeProduction> t) {
                        ((MaterialCeiling) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setProductionTimeMaterialCeiling(t.getNewValue());
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
        colDateOfDeliveryMaterialCeiling.setCellFactory(p -> {
            return new MaterialCeiling.DatePickerCell<>();
        });
        colNameRoomMaterialCeiling.setCellValueFactory(new PropertyValueFactory<>("nameRoomMaterialCeiling"));
        colNameRoomMaterialCeiling.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialCeiling, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialCeiling, String> t) {
                        ((MaterialCeiling) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setNameRoomMaterialCeiling(t.getNewValue());
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

        colNameMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colNameRoomMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colPlannedCPMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCPMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colAccountMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colContactsMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colNotesMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());
        colCharacteristicsMaterialCeiling.setCellFactory(TextFieldTableCell.forTableColumn());


        //Материалы - Другое!
        materialTableViewOther.setItems(observableListMaterialOther);
        Callback<TableColumn<MaterialOther, String>, TableCell<MaterialOther, String>> cellFactoryDoubleMaterialOther =
                new Callback<TableColumn<MaterialOther, String>, TableCell<MaterialOther, String>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellTextBox("\\d.\\d");
                    }
                };
        Callback<TableColumn<MaterialOther, Boolean>, TableCell<MaterialOther, Boolean>> cellFactoryCheckboxMaterialOther =
                new Callback<TableColumn<MaterialOther, Boolean>, TableCell<MaterialOther, Boolean>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellCheckBox();
                    }
                };


        colNameMaterialOther.setCellValueFactory(new PropertyValueFactory<>("nameMaterialOther"));
        colNameMaterialOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialOther, String> t) {
                        ((MaterialOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setNameMaterialOther(t.getNewValue());
                    }
                });
        colActivePMaterialOther.setCellFactory(cellFactoryCheckboxMaterialOther);
        colActivePMaterialOther.setCellValueFactory(new PropertyValueFactory<>("activePMaterialOther"));
        colActivePMaterialOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialOther, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialOther, Boolean> t) {
                        ((MaterialOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActivePMaterialOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActiveCMaterialOther.setCellFactory(cellFactoryCheckboxMaterialOther);
        colActiveCMaterialOther.setCellValueFactory(new PropertyValueFactory<>("activeCMaterialOther"));
        colActiveCMaterialOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialOther, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialOther, Boolean> t) {
                        ((MaterialOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActiveCMaterialOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        ObservableList<UnitType> typeListMaterialOther = FXCollections.observableArrayList(UnitType.values());
        colUnitMaterialOther.setCellValueFactory(new PropertyValueFactory<>("unitMaterialOther"));
        colUnitMaterialOther.setCellFactory(ComboBoxTableCell.forTableColumn(typeListMaterialOther));
        colUnitMaterialOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialOther, UnitType>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialOther, UnitType> t) {
                        ((MaterialOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setUnitMaterialOther(t.getNewValue());
                    }
                });
        colQuantityMaterialOther.setCellFactory(cellFactoryDoubleMaterialOther);
        colQuantityMaterialOther.setCellValueFactory(new PropertyValueFactory<>("quantityMaterialOther"));
        colQuantityMaterialOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialOther, String> t) {
                        ((MaterialOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setQuantityMaterialOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colOrdinalPriceUnitMaterialOther.setCellFactory(cellFactoryDoubleMaterialOther);
        colOrdinalPriceUnitMaterialOther.setCellValueFactory(new PropertyValueFactory<>("ordinalPriceUnitMaterialOther"));
        colOrdinalPriceUnitMaterialOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialOther, String> t) {
                        ((MaterialOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setOrdinalPriceUnitMaterialOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPUnitMaterialOther.setCellFactory(cellFactoryDoubleMaterialOther);
        colPriceCPUnitMaterialOther.setCellValueFactory(new PropertyValueFactory<>("priceCPUnitMaterialOther"));
        colPriceCPUnitMaterialOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialOther, String> t) {
                        ((MaterialOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPriceCPUnitMaterialOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPKeyMaterialOther.setCellFactory(cellFactoryDoubleMaterialOther);
        colPriceCPKeyMaterialOther.setCellValueFactory(new PropertyValueFactory<>("priceCPKeyMaterialOther"));
        colPriceCPKeyMaterialOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialOther, String> t) {
                        ((MaterialOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPriceCPKeyMaterialOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPUnitMaterialOther.setCellFactory(cellFactoryDoubleMaterialOther);
        colCostCPUnitMaterialOther.setCellValueFactory(new PropertyValueFactory<>("costCPUnitMaterialOther"));
        colCostCPUnitMaterialOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialOther, String> t) {
                        ((MaterialOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setCostCPUnitMaterialOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceOrderMaterialOther.setCellFactory(cellFactoryDoubleMaterialOther);
        colPriceOrderMaterialOther.setCellValueFactory(new PropertyValueFactory<>("priceOrderMaterialOther"));
        colPriceOrderMaterialOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialOther, String> t) {
                        ((MaterialOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPriceOrderMaterialOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPMaterialOther.setCellFactory(cellFactoryDoubleMaterialOther);
        colCostCPMaterialOther.setCellValueFactory(new PropertyValueFactory<>("costCPMaterialOther"));
        colCostCPMaterialOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialOther, String> t) {
                        ((MaterialOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setCostCPMaterialOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        ObservableList<TimeProduction> timeProductionListMaterialOther = FXCollections.observableArrayList(TimeProduction.values());
        colProductionTimeMaterialOther.setCellValueFactory(new PropertyValueFactory<>("productionTimeMaterialOther"));
        colProductionTimeMaterialOther.setCellFactory(ComboBoxTableCell.forTableColumn(timeProductionListMaterialOther));
        colProductionTimeMaterialOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialOther, TimeProduction>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialOther, TimeProduction> t) {
                        ((MaterialOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setProductionTimeMaterialOther(t.getNewValue());
                    }
                });
        colActualCostMaterialOther.setCellFactory(cellFactoryDoubleMaterialOther);
        colActualCostMaterialOther.setCellValueFactory(new PropertyValueFactory<>("actualCostMaterialOther"));
        colActualCostMaterialOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialOther, String> t) {
                        ((MaterialOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActualCostMaterialOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualDifferenceMaterialOther.setCellFactory(cellFactoryDoubleMaterialOther);
        colActualDifferenceMaterialOther.setCellValueFactory(new PropertyValueFactory<>("actualDifferenceMaterialOther"));
        colActualDifferenceMaterialOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialOther, String> t) {
                        ((MaterialOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActualDifferenceMaterialOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPaidMaterialOther.setCellFactory(cellFactoryDoubleMaterialOther);
        colPaidMaterialOther.setCellValueFactory(new PropertyValueFactory<>("paidMaterialOther"));
        colPaidMaterialOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialOther, String> t) {
                        ((MaterialOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPaidMaterialOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colResidueMaterialOther.setCellFactory(cellFactoryDoubleMaterialOther);
        colResidueMaterialOther.setCellValueFactory(new PropertyValueFactory<>("residueMaterialOther"));
        colResidueMaterialOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialOther, String> t) {
                        ((MaterialOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setResidueMaterialOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colDateOfDeliveryMaterialOther.setCellValueFactory(new PropertyValueFactory<>("dateOfDeliveryMaterialOther"));
        colDateOfDeliveryMaterialOther.setCellFactory(p -> {
            return new MaterialOther.DatePickerCell<>();
        });
        colNameRoomMaterialOther.setCellValueFactory(new PropertyValueFactory<>("nameRoomMaterialOther"));
        colNameRoomMaterialOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialOther, String> t) {
                        ((MaterialOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setNameRoomMaterialOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPlannedCPMaterialOther.setCellValueFactory(new PropertyValueFactory<>("plannedCPMaterialOther"));
        colPlannedCPMaterialOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialOther, String> t) {
                        ((MaterialOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPlannedCPMaterialOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualCPMaterialOther.setCellValueFactory(new PropertyValueFactory<>("actualCPMaterialOther"));
        colActualCPMaterialOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialOther, String> t) {
                        ((MaterialOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActualCPMaterialOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colAccountMaterialOther.setCellValueFactory(new PropertyValueFactory<>("accountMaterialOther"));
        colAccountMaterialOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialOther, String> t) {
                        ((MaterialOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setAccountMaterialOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colContactsMaterialOther.setCellValueFactory(new PropertyValueFactory<>("contactsMaterialOther"));
        colContactsMaterialOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialOther, String> t) {
                        ((MaterialOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setContactsMaterialOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colNotesMaterialOther.setCellValueFactory(new PropertyValueFactory<>("notesMaterialOther"));
        colNotesMaterialOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialOther, String> t) {
                        ((MaterialOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setNotesMaterialOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCharacteristicsMaterialOther.setCellValueFactory(new PropertyValueFactory<>("characteristicsMaterialOther"));
        colCharacteristicsMaterialOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialOther, String> t) {
                        ((MaterialOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setCharacteristicsMaterialOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });

        colNameMaterialOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colNameRoomMaterialOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colPlannedCPMaterialOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCPMaterialOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colAccountMaterialOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colContactsMaterialOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colNotesMaterialOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colCharacteristicsMaterialOther.setCellFactory(TextFieldTableCell.forTableColumn());


        //Материалы - Нежданчик!
        materialTableViewSuddenly.setItems(observableListMaterialSuddenly);
        Callback<TableColumn<MaterialSuddenly, String>, TableCell<MaterialSuddenly, String>> cellFactoryDoubleMaterialSuddenly =
                new Callback<TableColumn<MaterialSuddenly, String>, TableCell<MaterialSuddenly, String>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellTextBox("\\d.\\d");
                    }
                };
        Callback<TableColumn<MaterialSuddenly, Boolean>, TableCell<MaterialSuddenly, Boolean>> cellFactoryCheckboxMaterialSuddenly =
                new Callback<TableColumn<MaterialSuddenly, Boolean>, TableCell<MaterialSuddenly, Boolean>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellCheckBox();
                    }
                };


        colNameMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("nameMaterialSuddenly"));
        colNameMaterialSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialSuddenly, String> t) {
                        ((MaterialSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setNameMaterialSuddenly(t.getNewValue());
                    }
                });
        colActivePMaterialSuddenly.setCellFactory(cellFactoryCheckboxMaterialSuddenly);
        colActivePMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("activePMaterialSuddenly"));
        colActivePMaterialSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialSuddenly, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialSuddenly, Boolean> t) {
                        ((MaterialSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActivePMaterialSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActiveCMaterialSuddenly.setCellFactory(cellFactoryCheckboxMaterialSuddenly);
        colActiveCMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("activeCMaterialSuddenly"));
        colActiveCMaterialSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialSuddenly, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialSuddenly, Boolean> t) {
                        ((MaterialSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActiveCMaterialSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        ObservableList<UnitType> typeListMaterialSuddenly = FXCollections.observableArrayList(UnitType.values());
        colUnitMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("unitMaterialSuddenly"));
        colUnitMaterialSuddenly.setCellFactory(ComboBoxTableCell.forTableColumn(typeListMaterialSuddenly));
        colUnitMaterialSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialSuddenly, UnitType>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialSuddenly, UnitType> t) {
                        ((MaterialSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setUnitMaterialSuddenly(t.getNewValue());
                    }
                });
        colQuantityMaterialSuddenly.setCellFactory(cellFactoryDoubleMaterialSuddenly);
        colQuantityMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("quantityMaterialSuddenly"));
        colQuantityMaterialSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialSuddenly, String> t) {
                        ((MaterialSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setQuantityMaterialSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colOrdinalPriceUnitMaterialSuddenly.setCellFactory(cellFactoryDoubleMaterialSuddenly);
        colOrdinalPriceUnitMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("ordinalPriceUnitMaterialSuddenly"));
        colOrdinalPriceUnitMaterialSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialSuddenly, String> t) {
                        ((MaterialSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setOrdinalPriceUnitMaterialSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPUnitMaterialSuddenly.setCellFactory(cellFactoryDoubleMaterialSuddenly);
        colPriceCPUnitMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("priceCPUnitMaterialSuddenly"));
        colPriceCPUnitMaterialSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialSuddenly, String> t) {
                        ((MaterialSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPriceCPUnitMaterialSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPKeyMaterialSuddenly.setCellFactory(cellFactoryDoubleMaterialSuddenly);
        colPriceCPKeyMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("priceCPKeyMaterialSuddenly"));
        colPriceCPKeyMaterialSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialSuddenly, String> t) {
                        ((MaterialSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPriceCPKeyMaterialSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPUnitMaterialSuddenly.setCellFactory(cellFactoryDoubleMaterialSuddenly);
        colCostCPUnitMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("costCPUnitMaterialSuddenly"));
        colCostCPUnitMaterialSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialSuddenly, String> t) {
                        ((MaterialSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setCostCPUnitMaterialSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceOrderMaterialSuddenly.setCellFactory(cellFactoryDoubleMaterialSuddenly);
        colPriceOrderMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("priceOrderMaterialSuddenly"));
        colPriceOrderMaterialSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialSuddenly, String> t) {
                        ((MaterialSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPriceOrderMaterialSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPMaterialSuddenly.setCellFactory(cellFactoryDoubleMaterialSuddenly);
        colCostCPMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("costCPMaterialSuddenly"));
        colCostCPMaterialSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialSuddenly, String> t) {
                        ((MaterialSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setCostCPMaterialSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        ObservableList<TimeProduction> timeProductionListMaterialSuddenly = FXCollections.observableArrayList(TimeProduction.values());
        colProductionTimeMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("productionTimeMaterialSuddenly"));
        colProductionTimeMaterialSuddenly.setCellFactory(ComboBoxTableCell.forTableColumn(timeProductionListMaterialSuddenly));
        colProductionTimeMaterialSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialSuddenly, TimeProduction>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialSuddenly, TimeProduction> t) {
                        ((MaterialSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setProductionTimeMaterialSuddenly(t.getNewValue());
                    }
                });
        colActualCostMaterialSuddenly.setCellFactory(cellFactoryDoubleMaterialSuddenly);
        colActualCostMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("actualCostMaterialSuddenly"));
        colActualCostMaterialSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialSuddenly, String> t) {
                        ((MaterialSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActualCostMaterialSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualDifferenceMaterialSuddenly.setCellFactory(cellFactoryDoubleMaterialSuddenly);
        colActualDifferenceMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("actualDifferenceMaterialSuddenly"));
        colActualDifferenceMaterialSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialSuddenly, String> t) {
                        ((MaterialSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActualDifferenceMaterialSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPaidMaterialSuddenly.setCellFactory(cellFactoryDoubleMaterialSuddenly);
        colPaidMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("paidMaterialSuddenly"));
        colPaidMaterialSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialSuddenly, String> t) {
                        ((MaterialSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPaidMaterialSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colResidueMaterialSuddenly.setCellFactory(cellFactoryDoubleMaterialSuddenly);
        colResidueMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("residueMaterialSuddenly"));
        colResidueMaterialSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialSuddenly, String> t) {
                        ((MaterialSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setResidueMaterialSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colDateOfDeliveryMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("dateOfDeliveryMaterialSuddenly"));
        colDateOfDeliveryMaterialSuddenly.setCellFactory(p -> {
            return new MaterialSuddenly.DatePickerCell<>();
        });
        colNameMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("nameMaterialSuddenly"));
        colNameMaterialSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialSuddenly, String> t) {
                        ((MaterialSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setNameMaterialSuddenly(t.getNewValue());
                    }
                });
        colPlannedCPMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("plannedCPMaterialSuddenly"));
        colPlannedCPMaterialSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialSuddenly, String> t) {
                        ((MaterialSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPlannedCPMaterialSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualCPMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("actualCPMaterialSuddenly"));
        colActualCPMaterialSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialSuddenly, String> t) {
                        ((MaterialSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActualCPMaterialSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colAccountMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("accountMaterialSuddenly"));
        colAccountMaterialSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialSuddenly, String> t) {
                        ((MaterialSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setAccountMaterialSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colContactsMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("contactsMaterialSuddenly"));
        colContactsMaterialSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialSuddenly, String> t) {
                        ((MaterialSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setContactsMaterialSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colNotesMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("notesMaterialSuddenly"));
        colNotesMaterialSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialSuddenly, String> t) {
                        ((MaterialSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setNotesMaterialSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCharacteristicsMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("characteristicsMaterialSuddenly"));
        colCharacteristicsMaterialSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialSuddenly, String> t) {
                        ((MaterialSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setCharacteristicsMaterialSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });

        colNameMaterialSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colNameRoomMaterialSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colPlannedCPMaterialSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCPMaterialSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colAccountMaterialSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colContactsMaterialSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colNotesMaterialSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colCharacteristicsMaterialSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());

        //Мебель - Доставка
        furnitureTableViewDelivery.setItems(observableListFurnitureDelivery);
        Callback<TableColumn<FurnitureDelivery, String>, TableCell<FurnitureDelivery, String>> cellFactoryDoubleFurnitureDelivery =
                new Callback<TableColumn<FurnitureDelivery, String>, TableCell<FurnitureDelivery, String>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellTextBox("\\d.\\d");
                    }
                };
        Callback<TableColumn<FurnitureDelivery, Boolean>, TableCell<FurnitureDelivery, Boolean>> cellFactoryCheckboxFurnitureDelivery =
                new Callback<TableColumn<FurnitureDelivery, Boolean>, TableCell<FurnitureDelivery, Boolean>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellCheckBox();
                    }
                };


        colNameFurnitureDelivery.setCellValueFactory(new PropertyValueFactory<>("nameFurnitureDelivery"));
        colNameFurnitureDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setNameFurnitureDelivery(t.getNewValue());
                    }
                });
        colActivePFurnitureDelivery.setCellFactory(cellFactoryCheckboxFurnitureDelivery);
        colActivePFurnitureDelivery.setCellValueFactory(new PropertyValueFactory<>("activePFurnitureDelivery"));
        colActivePFurnitureDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureDelivery, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureDelivery, Boolean> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActivePFurnitureDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActiveCFurnitureDelivery.setCellFactory(cellFactoryCheckboxFurnitureDelivery);
        colActiveCFurnitureDelivery.setCellValueFactory(new PropertyValueFactory<>("activeCFurnitureDelivery"));
        colActiveCFurnitureDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureDelivery, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureDelivery, Boolean> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActiveCFurnitureDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        ObservableList<UnitType> typeListFurnitureDelivery = FXCollections.observableArrayList(UnitType.values());
        colUnitFurnitureDelivery.setCellValueFactory(new PropertyValueFactory<>("unitFurnitureDelivery"));
        colUnitFurnitureDelivery.setCellFactory(ComboBoxTableCell.forTableColumn(typeListFurnitureDelivery));
        colUnitFurnitureDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureDelivery, UnitType>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureDelivery, UnitType> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setUnitFurnitureDelivery(t.getNewValue());
                    }
                });
        colQuantityFurnitureDelivery.setCellFactory(cellFactoryDoubleFurnitureDelivery);
        colQuantityFurnitureDelivery.setCellValueFactory(new PropertyValueFactory<>("quantityFurnitureDelivery"));
        colQuantityFurnitureDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setQuantityFurnitureDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colOrdinalPriceUnitFurnitureDelivery.setCellFactory(cellFactoryDoubleFurnitureDelivery);
        colOrdinalPriceUnitFurnitureDelivery.setCellValueFactory(new PropertyValueFactory<>("ordinalPriceUnitFurnitureDelivery"));
        colOrdinalPriceUnitFurnitureDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setOrdinalPriceUnitFurnitureDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPUnitFurnitureDelivery.setCellFactory(cellFactoryDoubleFurnitureDelivery);
        colPriceCPUnitFurnitureDelivery.setCellValueFactory(new PropertyValueFactory<>("priceCPUnitFurnitureDelivery"));
        colPriceCPUnitFurnitureDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPriceCPUnitFurnitureDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPKeyFurnitureDelivery.setCellFactory(cellFactoryDoubleFurnitureDelivery);
        colPriceCPKeyFurnitureDelivery.setCellValueFactory(new PropertyValueFactory<>("priceCPKeyFurnitureDelivery"));
        colPriceCPKeyFurnitureDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPriceCPKeyFurnitureDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPUnitFurnitureDelivery.setCellFactory(cellFactoryDoubleFurnitureDelivery);
        colCostCPUnitFurnitureDelivery.setCellValueFactory(new PropertyValueFactory<>("costCPUnitFurnitureDelivery"));
        colCostCPUnitFurnitureDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setCostCPUnitFurnitureDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceOrderFurnitureDelivery.setCellFactory(cellFactoryDoubleFurnitureDelivery);
        colPriceOrderFurnitureDelivery.setCellValueFactory(new PropertyValueFactory<>("priceOrderFurnitureDelivery"));
        colPriceOrderFurnitureDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPriceOrderFurnitureDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPFurnitureDelivery.setCellFactory(cellFactoryDoubleFurnitureDelivery);
        colCostCPFurnitureDelivery.setCellValueFactory(new PropertyValueFactory<>("costCPFurnitureDelivery"));
        colCostCPFurnitureDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setCostCPFurnitureDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        ObservableList<TimeProduction> timeProductionListFurnitureDelivery = FXCollections.observableArrayList(TimeProduction.values());
        colProductionTimeFurnitureDelivery.setCellValueFactory(new PropertyValueFactory<>("productionTimeFurnitureDelivery"));
        colProductionTimeFurnitureDelivery.setCellFactory(ComboBoxTableCell.forTableColumn(timeProductionListFurnitureDelivery));
        colProductionTimeFurnitureDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureDelivery, TimeProduction>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureDelivery, TimeProduction> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setProductionTimeFurnitureDelivery(t.getNewValue());
                    }
                });
        colActualCostFurnitureDelivery.setCellFactory(cellFactoryDoubleFurnitureDelivery);
        colActualCostFurnitureDelivery.setCellValueFactory(new PropertyValueFactory<>("actualCostFurnitureDelivery"));
        colActualCostFurnitureDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActualCostFurnitureDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualDifferenceFurnitureDelivery.setCellFactory(cellFactoryDoubleFurnitureDelivery);
        colActualDifferenceFurnitureDelivery.setCellValueFactory(new PropertyValueFactory<>("actualDifferenceFurnitureDelivery"));
        colActualDifferenceFurnitureDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActualDifferenceFurnitureDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPaidFurnitureDelivery.setCellFactory(cellFactoryDoubleFurnitureDelivery);
        colPaidFurnitureDelivery.setCellValueFactory(new PropertyValueFactory<>("paidFurnitureDelivery"));
        colPaidFurnitureDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPaidFurnitureDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colResidueFurnitureDelivery.setCellFactory(cellFactoryDoubleFurnitureDelivery);
        colResidueFurnitureDelivery.setCellValueFactory(new PropertyValueFactory<>("residueFurnitureDelivery"));
        colResidueFurnitureDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setResidueFurnitureDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colDateOfDeliveryFurnitureDelivery.setCellValueFactory(new PropertyValueFactory<>("dateOfDeliveryFurnitureDelivery"));
        colDateOfDeliveryFurnitureDelivery.setCellFactory(p -> {
            return new FurnitureDelivery.DatePickerCell<>();
        });
        colNameRoomFurnitureDelivery.setCellValueFactory(new PropertyValueFactory<>("nameRoomFurnitureDelivery"));
        colNameRoomFurnitureDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setNameRoomFurnitureDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPlannedCPFurnitureDelivery.setCellValueFactory(new PropertyValueFactory<>("plannedCPFurnitureDelivery"));
        colPlannedCPFurnitureDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPlannedCPFurnitureDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualCPFurnitureDelivery.setCellValueFactory(new PropertyValueFactory<>("actualCPFurnitureDelivery"));
        colActualCPFurnitureDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActualCPFurnitureDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colAccountFurnitureDelivery.setCellValueFactory(new PropertyValueFactory<>("accountFurnitureDelivery"));
        colAccountFurnitureDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setAccountFurnitureDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colContactsFurnitureDelivery.setCellValueFactory(new PropertyValueFactory<>("contactsFurnitureDelivery"));
        colContactsFurnitureDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setContactsFurnitureDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colNotesFurnitureDelivery.setCellValueFactory(new PropertyValueFactory<>("notesFurnitureDelivery"));
        colNotesFurnitureDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setNotesFurnitureDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCharacteristicsFurnitureDelivery.setCellValueFactory(new PropertyValueFactory<>("characteristicsFurnitureDelivery"));
        colCharacteristicsFurnitureDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setCharacteristicsFurnitureDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });

        colNameFurnitureDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colNameRoomFurnitureDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colPlannedCPFurnitureDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCPFurnitureDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colAccountFurnitureDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colContactsFurnitureDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colNotesFurnitureDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colCharacteristicsFurnitureDelivery.setCellFactory(TextFieldTableCell.forTableColumn());


        furnitureTableViewSuddenly.setItems(observableListFurnitureSuddenly);
        Callback<TableColumn<FurnitureSuddenly, String>, TableCell<FurnitureSuddenly, String>> cellFactoryDoubleFurnitureSuddenly =
                new Callback<TableColumn<FurnitureSuddenly, String>, TableCell<FurnitureSuddenly, String>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellTextBox("\\d.\\d");
                    }
                };
        Callback<TableColumn<FurnitureSuddenly, Boolean>, TableCell<FurnitureSuddenly, Boolean>> cellFactoryCheckboxFurnitureSuddenly =
                new Callback<TableColumn<FurnitureSuddenly, Boolean>, TableCell<FurnitureSuddenly, Boolean>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellCheckBox();
                    }
                };


        colNameFurnitureSuddenly.setCellValueFactory(new PropertyValueFactory<>("nameFurnitureSuddenly"));
        colNameFurnitureSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setNameFurnitureSuddenly(t.getNewValue());
                    }
                });
        colActivePFurnitureSuddenly.setCellFactory(cellFactoryCheckboxFurnitureSuddenly);
        colActivePFurnitureSuddenly.setCellValueFactory(new PropertyValueFactory<>("activePFurnitureSuddenly"));
        colActivePFurnitureSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureSuddenly, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureSuddenly, Boolean> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActivePFurnitureSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActiveCFurnitureSuddenly.setCellFactory(cellFactoryCheckboxFurnitureSuddenly);
        colActiveCFurnitureSuddenly.setCellValueFactory(new PropertyValueFactory<>("activeCFurnitureSuddenly"));
        colActiveCFurnitureSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureSuddenly, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureSuddenly, Boolean> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActiveCFurnitureSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        ObservableList<UnitType> typeListFurnitureSuddenly = FXCollections.observableArrayList(UnitType.values());
        colUnitFurnitureSuddenly.setCellValueFactory(new PropertyValueFactory<>("unitFurnitureSuddenly"));
        colUnitFurnitureSuddenly.setCellFactory(ComboBoxTableCell.forTableColumn(typeListFurnitureSuddenly));
        colUnitFurnitureSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureSuddenly, UnitType>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureSuddenly, UnitType> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setUnitFurnitureSuddenly(t.getNewValue());
                    }
                });
        colQuantityFurnitureSuddenly.setCellFactory(cellFactoryDoubleFurnitureSuddenly);
        colQuantityFurnitureSuddenly.setCellValueFactory(new PropertyValueFactory<>("quantityFurnitureSuddenly"));
        colQuantityFurnitureSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setQuantityFurnitureSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colOrdinalPriceUnitFurnitureSuddenly.setCellFactory(cellFactoryDoubleFurnitureSuddenly);
        colOrdinalPriceUnitFurnitureSuddenly.setCellValueFactory(new PropertyValueFactory<>("ordinalPriceUnitFurnitureSuddenly"));
        colOrdinalPriceUnitFurnitureSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setOrdinalPriceUnitFurnitureSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPUnitFurnitureSuddenly.setCellFactory(cellFactoryDoubleFurnitureSuddenly);
        colPriceCPUnitFurnitureSuddenly.setCellValueFactory(new PropertyValueFactory<>("priceCPUnitFurnitureSuddenly"));
        colPriceCPUnitFurnitureSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPriceCPUnitFurnitureSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPKeyFurnitureSuddenly.setCellFactory(cellFactoryDoubleFurnitureSuddenly);
        colPriceCPKeyFurnitureSuddenly.setCellValueFactory(new PropertyValueFactory<>("priceCPKeyFurnitureSuddenly"));
        colPriceCPKeyFurnitureSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPriceCPKeyFurnitureSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPUnitFurnitureSuddenly.setCellFactory(cellFactoryDoubleFurnitureSuddenly);
        colCostCPUnitFurnitureSuddenly.setCellValueFactory(new PropertyValueFactory<>("costCPUnitFurnitureSuddenly"));
        colCostCPUnitFurnitureSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setCostCPUnitFurnitureSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceOrderFurnitureSuddenly.setCellFactory(cellFactoryDoubleFurnitureSuddenly);
        colPriceOrderFurnitureSuddenly.setCellValueFactory(new PropertyValueFactory<>("priceOrderFurnitureSuddenly"));
        colPriceOrderFurnitureSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPriceOrderFurnitureSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPFurnitureSuddenly.setCellFactory(cellFactoryDoubleFurnitureSuddenly);
        colCostCPFurnitureSuddenly.setCellValueFactory(new PropertyValueFactory<>("costCPFurnitureSuddenly"));
        colCostCPFurnitureSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setCostCPFurnitureSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        ObservableList<TimeProduction> timeProductionListFurnitureSuddenly = FXCollections.observableArrayList(TimeProduction.values());
        colProductionTimeFurnitureSuddenly.setCellValueFactory(new PropertyValueFactory<>("productionTimeFurnitureSuddenly"));
        colProductionTimeFurnitureSuddenly.setCellFactory(ComboBoxTableCell.forTableColumn(timeProductionListFurnitureSuddenly));
        colProductionTimeFurnitureSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureSuddenly, TimeProduction>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureSuddenly, TimeProduction> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setProductionTimeFurnitureSuddenly(t.getNewValue());
                    }
                });
        colActualCostFurnitureSuddenly.setCellFactory(cellFactoryDoubleFurnitureSuddenly);
        colActualCostFurnitureSuddenly.setCellValueFactory(new PropertyValueFactory<>("actualCostFurnitureSuddenly"));
        colActualCostFurnitureSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActualCostFurnitureSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualDifferenceFurnitureSuddenly.setCellFactory(cellFactoryDoubleFurnitureSuddenly);
        colActualDifferenceFurnitureSuddenly.setCellValueFactory(new PropertyValueFactory<>("actualDifferenceFurnitureSuddenly"));
        colActualDifferenceFurnitureSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActualDifferenceFurnitureSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPaidFurnitureSuddenly.setCellFactory(cellFactoryDoubleFurnitureSuddenly);
        colPaidFurnitureSuddenly.setCellValueFactory(new PropertyValueFactory<>("paidFurnitureSuddenly"));
        colPaidFurnitureSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPaidFurnitureSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colResidueFurnitureSuddenly.setCellFactory(cellFactoryDoubleFurnitureSuddenly);
        colResidueFurnitureSuddenly.setCellValueFactory(new PropertyValueFactory<>("residueFurnitureSuddenly"));
        colResidueFurnitureSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setResidueFurnitureSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colDateOfDeliveryFurnitureSuddenly.setCellValueFactory(new PropertyValueFactory<>("dateOfDeliveryFurnitureSuddenly"));
        colDateOfDeliveryFurnitureSuddenly.setCellFactory(p -> {
            return new FurnitureSuddenly.DatePickerCell<>();
        });
        colNameRoomFurnitureSuddenly.setCellValueFactory(new PropertyValueFactory<>("nameRoomFurnitureSuddenly"));
        colNameRoomFurnitureSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setNameRoomFurnitureSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPlannedCPFurnitureSuddenly.setCellValueFactory(new PropertyValueFactory<>("plannedCPFurnitureSuddenly"));
        colPlannedCPFurnitureSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPlannedCPFurnitureSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualCPFurnitureSuddenly.setCellValueFactory(new PropertyValueFactory<>("actualCPFurnitureSuddenly"));
        colActualCPFurnitureSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActualCPFurnitureSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colAccountFurnitureSuddenly.setCellValueFactory(new PropertyValueFactory<>("accountFurnitureSuddenly"));
        colAccountFurnitureSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setAccountFurnitureSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colContactsFurnitureSuddenly.setCellValueFactory(new PropertyValueFactory<>("contactsFurnitureSuddenly"));
        colContactsFurnitureSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setContactsFurnitureSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colNotesFurnitureSuddenly.setCellValueFactory(new PropertyValueFactory<>("notesFurnitureSuddenly"));
        colNotesFurnitureSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setNotesFurnitureSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCharacteristicsFurnitureSuddenly.setCellValueFactory(new PropertyValueFactory<>("characteristicsFurnitureSuddenly"));
        colCharacteristicsFurnitureSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<FurnitureSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<FurnitureSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setCharacteristicsFurnitureSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });

        colNameFurnitureSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colNameRoomFurnitureSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colPlannedCPFurnitureSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCPFurnitureSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colAccountFurnitureSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colContactsFurnitureSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colNotesFurnitureSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colCharacteristicsFurnitureSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());


        //Свет-Доставка
        lightTableViewDelivery.setItems(observableListLightDelivery);
        Callback<TableColumn<LightDelivery, String>, TableCell<LightDelivery, String>> cellFactoryDoubleLightDelivery =
                new Callback<TableColumn<LightDelivery, String>, TableCell<LightDelivery, String>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellTextBox("\\d.\\d");
                    }
                };
        Callback<TableColumn<LightDelivery, Boolean>, TableCell<LightDelivery, Boolean>> cellFactoryCheckboxLightDelivery =
                new Callback<TableColumn<LightDelivery, Boolean>, TableCell<LightDelivery, Boolean>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellCheckBox();
                    }
                };


        colNameLightDelivery.setCellValueFactory(new PropertyValueFactory<>("nameLightDelivery"));
        colNameLightDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setNameLightDelivery(t.getNewValue());
                    }
                });
        colActivePLightDelivery.setCellFactory(cellFactoryCheckboxLightDelivery);
        colActivePLightDelivery.setCellValueFactory(new PropertyValueFactory<>("activePLightDelivery"));
        colActivePLightDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightDelivery, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightDelivery, Boolean> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActivePLightDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActiveCLightDelivery.setCellFactory(cellFactoryCheckboxLightDelivery);
        colActiveCLightDelivery.setCellValueFactory(new PropertyValueFactory<>("activeCLightDelivery"));
        colActiveCLightDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightDelivery, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightDelivery, Boolean> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActiveCLightDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        ObservableList<UnitType> typeListLightDelivery = FXCollections.observableArrayList(UnitType.values());
        colUnitLightDelivery.setCellValueFactory(new PropertyValueFactory<>("unitLightDelivery"));
        colUnitLightDelivery.setCellFactory(ComboBoxTableCell.forTableColumn(typeListLightDelivery));
        colUnitLightDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightDelivery, UnitType>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightDelivery, UnitType> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setUnitLightDelivery(t.getNewValue());
                    }
                });
        colQuantityLightDelivery.setCellFactory(cellFactoryDoubleLightDelivery);
        colQuantityLightDelivery.setCellValueFactory(new PropertyValueFactory<>("quantityLightDelivery"));
        colQuantityLightDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setQuantityLightDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colOrdinalPriceUnitLightDelivery.setCellFactory(cellFactoryDoubleLightDelivery);
        colOrdinalPriceUnitLightDelivery.setCellValueFactory(new PropertyValueFactory<>("ordinalPriceUnitLightDelivery"));
        colOrdinalPriceUnitLightDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setOrdinalPriceUnitLightDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPUnitLightDelivery.setCellFactory(cellFactoryDoubleLightDelivery);
        colPriceCPUnitLightDelivery.setCellValueFactory(new PropertyValueFactory<>("priceCPUnitLightDelivery"));
        colPriceCPUnitLightDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPriceCPUnitLightDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPKeyLightDelivery.setCellFactory(cellFactoryDoubleLightDelivery);
        colPriceCPKeyLightDelivery.setCellValueFactory(new PropertyValueFactory<>("priceCPKeyLightDelivery"));
        colPriceCPKeyLightDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPriceCPKeyLightDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPUnitLightDelivery.setCellFactory(cellFactoryDoubleLightDelivery);
        colCostCPUnitLightDelivery.setCellValueFactory(new PropertyValueFactory<>("costCPUnitLightDelivery"));
        colCostCPUnitLightDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setCostCPUnitLightDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceOrderLightDelivery.setCellFactory(cellFactoryDoubleLightDelivery);
        colPriceOrderLightDelivery.setCellValueFactory(new PropertyValueFactory<>("priceOrderLightDelivery"));
        colPriceOrderLightDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPriceOrderLightDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPLightDelivery.setCellFactory(cellFactoryDoubleLightDelivery);
        colCostCPLightDelivery.setCellValueFactory(new PropertyValueFactory<>("costCPLightDelivery"));
        colCostCPLightDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setCostCPLightDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        ObservableList<TimeProduction> timeProductionListLightDelivery = FXCollections.observableArrayList(TimeProduction.values());
        colProductionTimeLightDelivery.setCellValueFactory(new PropertyValueFactory<>("productionTimeLightDelivery"));
        colProductionTimeLightDelivery.setCellFactory(ComboBoxTableCell.forTableColumn(timeProductionListLightDelivery));
        colProductionTimeLightDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightDelivery, TimeProduction>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightDelivery, TimeProduction> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setProductionTimeLightDelivery(t.getNewValue());
                    }
                });
        colActualCostLightDelivery.setCellFactory(cellFactoryDoubleLightDelivery);
        colActualCostLightDelivery.setCellValueFactory(new PropertyValueFactory<>("actualCostLightDelivery"));
        colActualCostLightDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActualCostLightDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualDifferenceLightDelivery.setCellFactory(cellFactoryDoubleLightDelivery);
        colActualDifferenceLightDelivery.setCellValueFactory(new PropertyValueFactory<>("actualDifferenceLightDelivery"));
        colActualDifferenceLightDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActualDifferenceLightDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPaidLightDelivery.setCellFactory(cellFactoryDoubleLightDelivery);
        colPaidLightDelivery.setCellValueFactory(new PropertyValueFactory<>("paidLightDelivery"));
        colPaidLightDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPaidLightDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colResidueLightDelivery.setCellFactory(cellFactoryDoubleLightDelivery);
        colResidueLightDelivery.setCellValueFactory(new PropertyValueFactory<>("residueLightDelivery"));
        colResidueLightDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setResidueLightDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colDateOfDeliveryLightDelivery.setCellValueFactory(new PropertyValueFactory<>("dateOfDeliveryLightDelivery"));
        colDateOfDeliveryLightDelivery.setCellFactory(p -> {
            return new LightDelivery.DatePickerCell<>();
        });
        colNameRoomLightDelivery.setCellValueFactory(new PropertyValueFactory<>("nameRoomLightDelivery"));
        colNameRoomLightDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setNameRoomLightDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPlannedCPLightDelivery.setCellValueFactory(new PropertyValueFactory<>("plannedCPLightDelivery"));
        colPlannedCPLightDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPlannedCPLightDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualCPLightDelivery.setCellValueFactory(new PropertyValueFactory<>("actualCPLightDelivery"));
        colActualCPLightDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActualCPLightDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colAccountLightDelivery.setCellValueFactory(new PropertyValueFactory<>("accountLightDelivery"));
        colAccountLightDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setAccountLightDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colContactsLightDelivery.setCellValueFactory(new PropertyValueFactory<>("contactsLightDelivery"));
        colContactsLightDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setContactsLightDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colNotesLightDelivery.setCellValueFactory(new PropertyValueFactory<>("notesLightDelivery"));
        colNotesLightDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setNotesLightDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCharacteristicsLightDelivery.setCellValueFactory(new PropertyValueFactory<>("characteristicsLightDelivery"));
        colCharacteristicsLightDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setCharacteristicsLightDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });

        colNameLightDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colNameRoomLightDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colPlannedCPLightDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCPLightDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colAccountLightDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colContactsLightDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colNotesLightDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colCharacteristicsLightDelivery.setCellFactory(TextFieldTableCell.forTableColumn());


        lightTableViewSuddenly.setItems(observableListLightSuddenly);
        Callback<TableColumn<LightSuddenly, String>, TableCell<LightSuddenly, String>> cellFactoryDoubleLightSuddenly =
                new Callback<TableColumn<LightSuddenly, String>, TableCell<LightSuddenly, String>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellTextBox("\\d.\\d");
                    }
                };
        Callback<TableColumn<LightSuddenly, Boolean>, TableCell<LightSuddenly, Boolean>> cellFactoryCheckboxLightSuddenly =
                new Callback<TableColumn<LightSuddenly, Boolean>, TableCell<LightSuddenly, Boolean>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellCheckBox();
                    }
                };


        colNameLightSuddenly.setCellValueFactory(new PropertyValueFactory<>("nameLightSuddenly"));
        colNameLightSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setNameLightSuddenly(t.getNewValue());
                    }
                });
        colActivePLightSuddenly.setCellFactory(cellFactoryCheckboxLightSuddenly);
        colActivePLightSuddenly.setCellValueFactory(new PropertyValueFactory<>("activePLightSuddenly"));
        colActivePLightSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightSuddenly, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightSuddenly, Boolean> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActivePLightSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActiveCLightSuddenly.setCellFactory(cellFactoryCheckboxLightSuddenly);
        colActiveCLightSuddenly.setCellValueFactory(new PropertyValueFactory<>("activeCLightSuddenly"));
        colActiveCLightSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightSuddenly, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightSuddenly, Boolean> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActiveCLightSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        ObservableList<UnitType> typeListLightSuddenly = FXCollections.observableArrayList(UnitType.values());
        colUnitLightSuddenly.setCellValueFactory(new PropertyValueFactory<>("unitLightSuddenly"));
        colUnitLightSuddenly.setCellFactory(ComboBoxTableCell.forTableColumn(typeListLightSuddenly));
        colUnitLightSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightSuddenly, UnitType>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightSuddenly, UnitType> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setUnitLightSuddenly(t.getNewValue());
                    }
                });
        colQuantityLightSuddenly.setCellFactory(cellFactoryDoubleLightSuddenly);
        colQuantityLightSuddenly.setCellValueFactory(new PropertyValueFactory<>("quantityLightSuddenly"));
        colQuantityLightSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setQuantityLightSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colOrdinalPriceUnitLightSuddenly.setCellFactory(cellFactoryDoubleLightSuddenly);
        colOrdinalPriceUnitLightSuddenly.setCellValueFactory(new PropertyValueFactory<>("ordinalPriceUnitLightSuddenly"));
        colOrdinalPriceUnitLightSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setOrdinalPriceUnitLightSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPUnitLightSuddenly.setCellFactory(cellFactoryDoubleLightSuddenly);
        colPriceCPUnitLightSuddenly.setCellValueFactory(new PropertyValueFactory<>("priceCPUnitLightSuddenly"));
        colPriceCPUnitLightSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPriceCPUnitLightSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPKeyLightSuddenly.setCellFactory(cellFactoryDoubleLightSuddenly);
        colPriceCPKeyLightSuddenly.setCellValueFactory(new PropertyValueFactory<>("priceCPKeyLightSuddenly"));
        colPriceCPKeyLightSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPriceCPKeyLightSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPUnitLightSuddenly.setCellFactory(cellFactoryDoubleLightSuddenly);
        colCostCPUnitLightSuddenly.setCellValueFactory(new PropertyValueFactory<>("costCPUnitLightSuddenly"));
        colCostCPUnitLightSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setCostCPUnitLightSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceOrderLightSuddenly.setCellFactory(cellFactoryDoubleLightSuddenly);
        colPriceOrderLightSuddenly.setCellValueFactory(new PropertyValueFactory<>("priceOrderLightSuddenly"));
        colPriceOrderLightSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPriceOrderLightSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPLightSuddenly.setCellFactory(cellFactoryDoubleLightSuddenly);
        colCostCPLightSuddenly.setCellValueFactory(new PropertyValueFactory<>("costCPLightSuddenly"));
        colCostCPLightSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setCostCPLightSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        ObservableList<TimeProduction> timeProductionListLightSuddenly = FXCollections.observableArrayList(TimeProduction.values());
        colProductionTimeLightSuddenly.setCellValueFactory(new PropertyValueFactory<>("productionTimeLightSuddenly"));
        colProductionTimeLightSuddenly.setCellFactory(ComboBoxTableCell.forTableColumn(timeProductionListLightSuddenly));
        colProductionTimeLightSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightSuddenly, TimeProduction>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightSuddenly, TimeProduction> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setProductionTimeLightSuddenly(t.getNewValue());
                    }
                });
        colActualCostLightSuddenly.setCellFactory(cellFactoryDoubleLightSuddenly);
        colActualCostLightSuddenly.setCellValueFactory(new PropertyValueFactory<>("actualCostLightSuddenly"));
        colActualCostLightSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActualCostLightSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualDifferenceLightSuddenly.setCellFactory(cellFactoryDoubleLightSuddenly);
        colActualDifferenceLightSuddenly.setCellValueFactory(new PropertyValueFactory<>("actualDifferenceLightSuddenly"));
        colActualDifferenceLightSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActualDifferenceLightSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPaidLightSuddenly.setCellFactory(cellFactoryDoubleLightSuddenly);
        colPaidLightSuddenly.setCellValueFactory(new PropertyValueFactory<>("paidLightSuddenly"));
        colPaidLightSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPaidLightSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colResidueLightSuddenly.setCellFactory(cellFactoryDoubleLightSuddenly);
        colResidueLightSuddenly.setCellValueFactory(new PropertyValueFactory<>("residueLightSuddenly"));
        colResidueLightSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setResidueLightSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colDateOfDeliveryLightSuddenly.setCellValueFactory(new PropertyValueFactory<>("dateOfDeliveryLightSuddenly"));
        colDateOfDeliveryLightSuddenly.setCellFactory(p -> {
            return new LightSuddenly.DatePickerCell<>();
        });
        colNameRoomLightSuddenly.setCellValueFactory(new PropertyValueFactory<>("nameRoomLightSuddenly"));
        colNameRoomLightSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setNameRoomLightSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPlannedCPLightSuddenly.setCellValueFactory(new PropertyValueFactory<>("plannedCPLightSuddenly"));
        colPlannedCPLightSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPlannedCPLightSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualCPLightSuddenly.setCellValueFactory(new PropertyValueFactory<>("actualCPLightSuddenly"));
        colActualCPLightSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActualCPLightSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colAccountLightSuddenly.setCellValueFactory(new PropertyValueFactory<>("accountLightSuddenly"));
        colAccountLightSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setAccountLightSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colContactsLightSuddenly.setCellValueFactory(new PropertyValueFactory<>("contactsLightSuddenly"));
        colContactsLightSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setContactsLightSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colNotesLightSuddenly.setCellValueFactory(new PropertyValueFactory<>("notesLightSuddenly"));
        colNotesLightSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setNotesLightSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCharacteristicsLightSuddenly.setCellValueFactory(new PropertyValueFactory<>("characteristicsLightSuddenly"));
        colCharacteristicsLightSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<LightSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<LightSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setCharacteristicsLightSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });

        colNameLightSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colNameRoomLightSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colPlannedCPLightSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCPLightSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colAccountLightSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colContactsLightSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colNotesLightSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colCharacteristicsLightSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());






        //Техника - Кухня!
        appliancesTableViewKitchen.setItems(observableListAppliancesKitchen);
        Callback<TableColumn<AppliancesKitchen, String>, TableCell<AppliancesKitchen, String>> cellFactoryDoubleAppliancesKitchen =
                new Callback<TableColumn<AppliancesKitchen, String>, TableCell<AppliancesKitchen, String>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellTextBox("\\d.\\d");
                    }
                };
        Callback<TableColumn<AppliancesKitchen, Boolean>, TableCell<AppliancesKitchen, Boolean>> cellFactoryCheckboxAppliancesKitchen =
                new Callback<TableColumn<AppliancesKitchen, Boolean>, TableCell<AppliancesKitchen, Boolean>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellCheckBox();
                    }
                };


        colNameAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("nameAppliancesKitchen"));
        colNameAppliancesKitchen.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesKitchen, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesKitchen, String> t) {
                        ((AppliancesKitchen) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setNameAppliancesKitchen(t.getNewValue());
                    }
                });
        colActivePAppliancesKitchen.setCellFactory(cellFactoryCheckboxAppliancesKitchen);
        colActivePAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("activePAppliancesKitchen"));
        colActivePAppliancesKitchen.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesKitchen, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesKitchen, Boolean> t) {
                        ((AppliancesKitchen) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActivePAppliancesKitchen(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActiveCAppliancesKitchen.setCellFactory(cellFactoryCheckboxAppliancesKitchen);
        colActiveCAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("activeCAppliancesKitchen"));
        colActiveCAppliancesKitchen.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesKitchen, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesKitchen, Boolean> t) {
                        ((AppliancesKitchen) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActiveCAppliancesKitchen(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        ObservableList<UnitType> typeListAppliancesKitchen = FXCollections.observableArrayList(UnitType.values());
        colUnitAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("unitAppliancesKitchen"));
        colUnitAppliancesKitchen.setCellFactory(ComboBoxTableCell.forTableColumn(typeListAppliancesKitchen));
        colUnitAppliancesKitchen.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesKitchen, UnitType>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesKitchen, UnitType> t) {
                        ((AppliancesKitchen) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setUnitAppliancesKitchen(t.getNewValue());
                    }
                });
        colQuantityAppliancesKitchen.setCellFactory(cellFactoryDoubleAppliancesKitchen);
        colQuantityAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("quantityAppliancesKitchen"));
        colQuantityAppliancesKitchen.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesKitchen, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesKitchen, String> t) {
                        ((AppliancesKitchen) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setQuantityAppliancesKitchen(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colOrdinalPriceUnitAppliancesKitchen.setCellFactory(cellFactoryDoubleAppliancesKitchen);
        colOrdinalPriceUnitAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("ordinalPriceUnitAppliancesKitchen"));
        colOrdinalPriceUnitAppliancesKitchen.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesKitchen, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesKitchen, String> t) {
                        ((AppliancesKitchen) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setOrdinalPriceUnitAppliancesKitchen(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPUnitAppliancesKitchen.setCellFactory(cellFactoryDoubleAppliancesKitchen);
        colPriceCPUnitAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("priceCPUnitAppliancesKitchen"));
        colPriceCPUnitAppliancesKitchen.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesKitchen, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesKitchen, String> t) {
                        ((AppliancesKitchen) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPriceCPUnitAppliancesKitchen(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPKeyAppliancesKitchen.setCellFactory(cellFactoryDoubleAppliancesKitchen);
        colPriceCPKeyAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("priceCPKeyAppliancesKitchen"));
        colPriceCPKeyAppliancesKitchen.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesKitchen, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesKitchen, String> t) {
                        ((AppliancesKitchen) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPriceCPKeyAppliancesKitchen(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPUnitAppliancesKitchen.setCellFactory(cellFactoryDoubleAppliancesKitchen);
        colCostCPUnitAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("costCPUnitAppliancesKitchen"));
        colCostCPUnitAppliancesKitchen.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesKitchen, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesKitchen, String> t) {
                        ((AppliancesKitchen) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setCostCPUnitAppliancesKitchen(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceOrderAppliancesKitchen.setCellFactory(cellFactoryDoubleAppliancesKitchen);
        colPriceOrderAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("priceOrderAppliancesKitchen"));
        colPriceOrderAppliancesKitchen.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesKitchen, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesKitchen, String> t) {
                        ((AppliancesKitchen) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPriceOrderAppliancesKitchen(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPAppliancesKitchen.setCellFactory(cellFactoryDoubleAppliancesKitchen);
        colCostCPAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("costCPAppliancesKitchen"));
        colCostCPAppliancesKitchen.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesKitchen, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesKitchen, String> t) {
                        ((AppliancesKitchen) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setCostCPAppliancesKitchen(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        ObservableList<TimeProduction> timeProductionListAppliancesKitchen = FXCollections.observableArrayList(TimeProduction.values());
        colProductionTimeAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("productionTimeAppliancesKitchen"));
        colProductionTimeAppliancesKitchen.setCellFactory(ComboBoxTableCell.forTableColumn(timeProductionListAppliancesKitchen));
        colProductionTimeAppliancesKitchen.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesKitchen, TimeProduction>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesKitchen, TimeProduction> t) {
                        ((AppliancesKitchen) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setProductionTimeAppliancesKitchen(t.getNewValue());
                    }
                });
        colActualCostAppliancesKitchen.setCellFactory(cellFactoryDoubleAppliancesKitchen);
        colActualCostAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("actualCostAppliancesKitchen"));
        colActualCostAppliancesKitchen.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesKitchen, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesKitchen, String> t) {
                        ((AppliancesKitchen) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActualCostAppliancesKitchen(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualDifferenceAppliancesKitchen.setCellFactory(cellFactoryDoubleAppliancesKitchen);
        colActualDifferenceAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("actualDifferenceAppliancesKitchen"));
        colActualDifferenceAppliancesKitchen.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesKitchen, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesKitchen, String> t) {
                        ((AppliancesKitchen) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActualDifferenceAppliancesKitchen(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPaidAppliancesKitchen.setCellFactory(cellFactoryDoubleAppliancesKitchen);
        colPaidAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("paidAppliancesKitchen"));
        colPaidAppliancesKitchen.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesKitchen, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesKitchen, String> t) {
                        ((AppliancesKitchen) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPaidAppliancesKitchen(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colResidueAppliancesKitchen.setCellFactory(cellFactoryDoubleAppliancesKitchen);
        colResidueAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("residueAppliancesKitchen"));
        colResidueAppliancesKitchen.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesKitchen, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesKitchen, String> t) {
                        ((AppliancesKitchen) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setResidueAppliancesKitchen(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colDateOfDeliveryAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("dateOfDeliveryAppliancesKitchen"));
        colDateOfDeliveryAppliancesKitchen.setCellFactory(p -> {
            return new AppliancesKitchen.DatePickerCell<>();
        });
        colNameRoomAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("nameRoomAppliancesKitchen"));
        colNameRoomAppliancesKitchen.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesKitchen, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesKitchen, String> t) {
                        ((AppliancesKitchen) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setNameRoomAppliancesKitchen(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPlannedCPAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("plannedCPAppliancesKitchen"));
        colPlannedCPAppliancesKitchen.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesKitchen, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesKitchen, String> t) {
                        ((AppliancesKitchen) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPlannedCPAppliancesKitchen(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualCPAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("actualCPAppliancesKitchen"));
        colActualCPAppliancesKitchen.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesKitchen, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesKitchen, String> t) {
                        ((AppliancesKitchen) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActualCPAppliancesKitchen(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colAccountAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("accountAppliancesKitchen"));
        colAccountAppliancesKitchen.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesKitchen, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesKitchen, String> t) {
                        ((AppliancesKitchen) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setAccountAppliancesKitchen(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colContactsAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("contactsAppliancesKitchen"));
        colContactsAppliancesKitchen.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesKitchen, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesKitchen, String> t) {
                        ((AppliancesKitchen) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setContactsAppliancesKitchen(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colNotesAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("notesAppliancesKitchen"));
        colNotesAppliancesKitchen.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesKitchen, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesKitchen, String> t) {
                        ((AppliancesKitchen) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setNotesAppliancesKitchen(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCharacteristicsAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("characteristicsAppliancesKitchen"));
        colCharacteristicsAppliancesKitchen.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesKitchen, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesKitchen, String> t) {
                        ((AppliancesKitchen) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setCharacteristicsAppliancesKitchen(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });

        colNameAppliancesKitchen.setCellFactory(TextFieldTableCell.forTableColumn());
        colNameRoomAppliancesKitchen.setCellFactory(TextFieldTableCell.forTableColumn());
        colPlannedCPAppliancesKitchen.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCPAppliancesKitchen.setCellFactory(TextFieldTableCell.forTableColumn());
        colAccountAppliancesKitchen.setCellFactory(TextFieldTableCell.forTableColumn());
        colContactsAppliancesKitchen.setCellFactory(TextFieldTableCell.forTableColumn());
        colNotesAppliancesKitchen.setCellFactory(TextFieldTableCell.forTableColumn());
        colCharacteristicsAppliancesKitchen.setCellFactory(TextFieldTableCell.forTableColumn());


        //Техника - Другое!
        appliancesTableViewOther.setItems(observableListAppliancesOther);
        Callback<TableColumn<AppliancesOther, String>, TableCell<AppliancesOther, String>> cellFactoryDoubleAppliancesOther =
                new Callback<TableColumn<AppliancesOther, String>, TableCell<AppliancesOther, String>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellTextBox("\\d.\\d");
                    }
                };
        Callback<TableColumn<AppliancesOther, Boolean>, TableCell<AppliancesOther, Boolean>> cellFactoryCheckboxAppliancesOther =
                new Callback<TableColumn<AppliancesOther, Boolean>, TableCell<AppliancesOther, Boolean>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellCheckBox();
                    }
                };


        colNameAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("nameAppliancesOther"));
        colNameAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        ((AppliancesOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setNameAppliancesOther(t.getNewValue());
                    }
                });
        colActivePAppliancesOther.setCellFactory(cellFactoryCheckboxAppliancesOther);
        colActivePAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("activePAppliancesOther"));
        colActivePAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, Boolean> t) {
                        ((AppliancesOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActivePAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActiveCAppliancesOther.setCellFactory(cellFactoryCheckboxAppliancesOther);
        colActiveCAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("activeCAppliancesOther"));
        colActiveCAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, Boolean> t) {
                        ((AppliancesOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActiveCAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        ObservableList<UnitType> typeListAppliancesOther = FXCollections.observableArrayList(UnitType.values());
        colUnitAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("unitAppliancesOther"));
        colUnitAppliancesOther.setCellFactory(ComboBoxTableCell.forTableColumn(typeListAppliancesOther));
        colUnitAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, UnitType>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, UnitType> t) {
                        ((AppliancesOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setUnitAppliancesOther(t.getNewValue());
                    }
                });
        colQuantityAppliancesOther.setCellFactory(cellFactoryDoubleAppliancesOther);
        colQuantityAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("quantityAppliancesOther"));
        colQuantityAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        ((AppliancesOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setQuantityAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colOrdinalPriceUnitAppliancesOther.setCellFactory(cellFactoryDoubleAppliancesOther);
        colOrdinalPriceUnitAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("ordinalPriceUnitAppliancesOther"));
        colOrdinalPriceUnitAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setOrdinalPriceUnitAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPUnitAppliancesOther.setCellFactory(cellFactoryDoubleAppliancesOther);
        colPriceCPUnitAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("priceCPUnitAppliancesOther"));
        colPriceCPUnitAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPriceCPUnitAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPKeyAppliancesOther.setCellFactory(cellFactoryDoubleAppliancesOther);
        colPriceCPKeyAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("priceCPKeyAppliancesOther"));
        colPriceCPKeyAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPriceCPKeyAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPUnitAppliancesOther.setCellFactory(cellFactoryDoubleAppliancesOther);
        colCostCPUnitAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("costCPUnitAppliancesOther"));
        colCostCPUnitAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setCostCPUnitAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceOrderAppliancesOther.setCellFactory(cellFactoryDoubleAppliancesOther);
        colPriceOrderAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("priceOrderAppliancesOther"));
        colPriceOrderAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPriceOrderAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPAppliancesOther.setCellFactory(cellFactoryDoubleAppliancesOther);
        colCostCPAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("costCPAppliancesOther"));
        colCostCPAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setCostCPAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        ObservableList<TimeProduction> timeProductionListAppliancesOther = FXCollections.observableArrayList(TimeProduction.values());
        colProductionTimeAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("productionTimeAppliancesOther"));
        colProductionTimeAppliancesOther.setCellFactory(ComboBoxTableCell.forTableColumn(timeProductionListAppliancesOther));
        colProductionTimeAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, TimeProduction>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, TimeProduction> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setProductionTimeAppliancesOther(t.getNewValue());
                    }
                });
        colActualCostAppliancesOther.setCellFactory(cellFactoryDoubleAppliancesOther);
        colActualCostAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("actualCostAppliancesOther"));
        colActualCostAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActualCostAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualDifferenceAppliancesOther.setCellFactory(cellFactoryDoubleAppliancesOther);
        colActualDifferenceAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("actualDifferenceAppliancesOther"));
        colActualDifferenceAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActualDifferenceAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPaidAppliancesOther.setCellFactory(cellFactoryDoubleAppliancesOther);
        colPaidAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("paidAppliancesOther"));
        colPaidAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPaidAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colResidueAppliancesOther.setCellFactory(cellFactoryDoubleAppliancesOther);
        colResidueAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("residueAppliancesOther"));
        colResidueAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setResidueAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colDateOfDeliveryAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("dateOfDeliveryAppliancesOther"));
        colDateOfDeliveryAppliancesOther.setCellFactory(p -> {
            return new AppliancesOther.DatePickerCell<>();
        });
        colNameRoomAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("nameRoomAppliancesOther"));
        colNameRoomAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setNameRoomAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPlannedCPAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("plannedCPAppliancesOther"));
        colPlannedCPAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPlannedCPAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualCPAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("actualCPAppliancesOther"));
        colActualCPAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActualCPAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colAccountAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("accountAppliancesOther"));
        colAccountAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setAccountAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colContactsAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("contactsAppliancesOther"));
        colContactsAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setContactsAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colNotesAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("notesAppliancesOther"));
        colNotesAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setNotesAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCharacteristicsAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("characteristicsAppliancesOther"));
        colCharacteristicsAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setCharacteristicsAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });

        colNameAppliancesOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colNameRoomAppliancesOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colPlannedCPAppliancesOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCPAppliancesOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colAccountAppliancesOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colContactsAppliancesOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colNotesAppliancesOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colCharacteristicsAppliancesOther.setCellFactory(TextFieldTableCell.forTableColumn());


        //Техника = Доставка!
        appliancesTableViewDelivery.setItems(observableListAppliancesDelivery);
        Callback<TableColumn<AppliancesDelivery, String>, TableCell<AppliancesDelivery, String>> cellFactoryDoubleAppliancesDelivery =
                new Callback<TableColumn<AppliancesDelivery, String>, TableCell<AppliancesDelivery, String>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellTextBox("\\d.\\d");
                    }
                };
        Callback<TableColumn<AppliancesDelivery, Boolean>, TableCell<AppliancesDelivery, Boolean>> cellFactoryCheckboxAppliancesDelivery =
                new Callback<TableColumn<AppliancesDelivery, Boolean>, TableCell<AppliancesDelivery, Boolean>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellCheckBox();
                    }
                };


        colNameAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("nameAppliancesDelivery"));
        colNameAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setNameAppliancesDelivery(t.getNewValue());
                    }
                });
        colActivePAppliancesDelivery.setCellFactory(cellFactoryCheckboxAppliancesDelivery);
        colActivePAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("activePAppliancesDelivery"));
        colActivePAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, Boolean> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActivePAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActiveCAppliancesDelivery.setCellFactory(cellFactoryCheckboxAppliancesDelivery);
        colActiveCAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("activeCAppliancesDelivery"));
        colActiveCAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, Boolean> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActiveCAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        ObservableList<UnitType> typeListAppliancesDelivery = FXCollections.observableArrayList(UnitType.values());
        colUnitAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("unitAppliancesDelivery"));
        colUnitAppliancesDelivery.setCellFactory(ComboBoxTableCell.forTableColumn(typeListAppliancesDelivery));
        colUnitAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, UnitType>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, UnitType> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setUnitAppliancesDelivery(t.getNewValue());
                    }
                });
        colQuantityAppliancesDelivery.setCellFactory(cellFactoryDoubleAppliancesDelivery);
        colQuantityAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("quantityAppliancesDelivery"));
        colQuantityAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setQuantityAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colOrdinalPriceUnitAppliancesDelivery.setCellFactory(cellFactoryDoubleAppliancesDelivery);
        colOrdinalPriceUnitAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("ordinalPriceUnitAppliancesDelivery"));
        colOrdinalPriceUnitAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setOrdinalPriceUnitAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPUnitAppliancesDelivery.setCellFactory(cellFactoryDoubleAppliancesDelivery);
        colPriceCPUnitAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("priceCPUnitAppliancesDelivery"));
        colPriceCPUnitAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPriceCPUnitAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPKeyAppliancesDelivery.setCellFactory(cellFactoryDoubleAppliancesDelivery);
        colPriceCPKeyAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("priceCPKeyAppliancesDelivery"));
        colPriceCPKeyAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPriceCPKeyAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPUnitAppliancesDelivery.setCellFactory(cellFactoryDoubleAppliancesDelivery);
        colCostCPUnitAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("costCPUnitAppliancesDelivery"));
        colCostCPUnitAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setCostCPUnitAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceOrderAppliancesDelivery.setCellFactory(cellFactoryDoubleAppliancesDelivery);
        colPriceOrderAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("priceOrderAppliancesDelivery"));
        colPriceOrderAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPriceOrderAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPAppliancesDelivery.setCellFactory(cellFactoryDoubleAppliancesDelivery);
        colCostCPAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("costCPAppliancesDelivery"));
        colCostCPAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setCostCPAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        ObservableList<TimeProduction> timeProductionListAppliancesDelivery = FXCollections.observableArrayList(TimeProduction.values());
        colProductionTimeAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("productionTimeAppliancesDelivery"));
        colProductionTimeAppliancesDelivery.setCellFactory(ComboBoxTableCell.forTableColumn(timeProductionListAppliancesDelivery));
        colProductionTimeAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, TimeProduction>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, TimeProduction> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setProductionTimeAppliancesDelivery(t.getNewValue());
                    }
                });
        colActualCostAppliancesDelivery.setCellFactory(cellFactoryDoubleAppliancesDelivery);
        colActualCostAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("actualCostAppliancesDelivery"));
        colActualCostAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActualCostAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualDifferenceAppliancesDelivery.setCellFactory(cellFactoryDoubleAppliancesDelivery);
        colActualDifferenceAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("actualDifferenceAppliancesDelivery"));
        colActualDifferenceAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActualDifferenceAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPaidAppliancesDelivery.setCellFactory(cellFactoryDoubleAppliancesDelivery);
        colPaidAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("paidAppliancesDelivery"));
        colPaidAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPaidAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colResidueAppliancesDelivery.setCellFactory(cellFactoryDoubleAppliancesDelivery);
        colResidueAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("residueAppliancesDelivery"));
        colResidueAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setResidueAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colDateOfDeliveryAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("dateOfDeliveryAppliancesDelivery"));
        colDateOfDeliveryAppliancesDelivery.setCellFactory(p -> {
            return new AppliancesDelivery.DatePickerCell<>();
        });
        colNameRoomAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("nameRoomAppliancesDelivery"));
        colNameRoomAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setNameRoomAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPlannedCPAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("plannedCPAppliancesDelivery"));
        colPlannedCPAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPlannedCPAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualCPAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("actualCPAppliancesDelivery"));
        colActualCPAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActualCPAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colAccountAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("accountAppliancesDelivery"));
        colAccountAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setAccountAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colContactsAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("contactsAppliancesDelivery"));
        colContactsAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setContactsAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colNotesAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("notesAppliancesDelivery"));
        colNotesAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setNotesAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCharacteristicsAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("characteristicsAppliancesDelivery"));
        colCharacteristicsAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setCharacteristicsAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });

        colNameAppliancesDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colNameRoomAppliancesDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colPlannedCPAppliancesDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCPAppliancesDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colAccountAppliancesDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colContactsAppliancesDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colNotesAppliancesDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colCharacteristicsAppliancesDelivery.setCellFactory(TextFieldTableCell.forTableColumn());


        //Техника - Нежданчик!
        appliancesTableViewSuddenly.setItems(observableListAppliancesSuddenly);
        Callback<TableColumn<AppliancesSuddenly, String>, TableCell<AppliancesSuddenly, String>> cellFactoryDoubleAppliancesSuddenly =
                new Callback<TableColumn<AppliancesSuddenly, String>, TableCell<AppliancesSuddenly, String>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellTextBox("\\d.\\d");
                    }
                };
        Callback<TableColumn<AppliancesSuddenly, Boolean>, TableCell<AppliancesSuddenly, Boolean>> cellFactoryCheckboxAppliancesSuddenly =
                new Callback<TableColumn<AppliancesSuddenly, Boolean>, TableCell<AppliancesSuddenly, Boolean>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellCheckBox();
                    }
                };


        colNameAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("nameAppliancesSuddenly"));
        colNameAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setNameAppliancesSuddenly(t.getNewValue());
                    }
                });
        colActivePAppliancesSuddenly.setCellFactory(cellFactoryCheckboxAppliancesSuddenly);
        colActivePAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("activePAppliancesSuddenly"));
        colActivePAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, Boolean> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActivePAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActiveCAppliancesSuddenly.setCellFactory(cellFactoryCheckboxAppliancesSuddenly);
        colActiveCAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("activeCAppliancesSuddenly"));
        colActiveCAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, Boolean> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActiveCAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        ObservableList<UnitType> typeListAppliancesSuddenly = FXCollections.observableArrayList(UnitType.values());
        colUnitAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("unitAppliancesSuddenly"));
        colUnitAppliancesSuddenly.setCellFactory(ComboBoxTableCell.forTableColumn(typeListAppliancesSuddenly));
        colUnitAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, UnitType>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, UnitType> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setUnitAppliancesSuddenly(t.getNewValue());
                    }
                });
        colQuantityAppliancesSuddenly.setCellFactory(cellFactoryDoubleAppliancesSuddenly);
        colQuantityAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("quantityAppliancesSuddenly"));
        colQuantityAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setQuantityAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colOrdinalPriceUnitAppliancesSuddenly.setCellFactory(cellFactoryDoubleAppliancesSuddenly);
        colOrdinalPriceUnitAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("ordinalPriceUnitAppliancesSuddenly"));
        colOrdinalPriceUnitAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setOrdinalPriceUnitAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPUnitAppliancesSuddenly.setCellFactory(cellFactoryDoubleAppliancesSuddenly);
        colPriceCPUnitAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("priceCPUnitAppliancesSuddenly"));
        colPriceCPUnitAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPriceCPUnitAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPKeyAppliancesSuddenly.setCellFactory(cellFactoryDoubleAppliancesSuddenly);
        colPriceCPKeyAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("priceCPKeyAppliancesSuddenly"));
        colPriceCPKeyAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPriceCPKeyAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPUnitAppliancesSuddenly.setCellFactory(cellFactoryDoubleAppliancesSuddenly);
        colCostCPUnitAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("costCPUnitAppliancesSuddenly"));
        colCostCPUnitAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setCostCPUnitAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceOrderAppliancesSuddenly.setCellFactory(cellFactoryDoubleAppliancesSuddenly);
        colPriceOrderAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("priceOrderAppliancesSuddenly"));
        colPriceOrderAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPriceOrderAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPAppliancesSuddenly.setCellFactory(cellFactoryDoubleAppliancesSuddenly);
        colCostCPAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("costCPAppliancesSuddenly"));
        colCostCPAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setCostCPAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        ObservableList<TimeProduction> timeProductionListAppliancesSuddenly = FXCollections.observableArrayList(TimeProduction.values());
        colProductionTimeAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("productionTimeAppliancesSuddenly"));
        colProductionTimeAppliancesSuddenly.setCellFactory(ComboBoxTableCell.forTableColumn(timeProductionListAppliancesSuddenly));
        colProductionTimeAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, TimeProduction>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, TimeProduction> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setProductionTimeAppliancesSuddenly(t.getNewValue());
                    }
                });
        colActualCostAppliancesSuddenly.setCellFactory(cellFactoryDoubleAppliancesSuddenly);
        colActualCostAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("actualCostAppliancesSuddenly"));
        colActualCostAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActualCostAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualDifferenceAppliancesSuddenly.setCellFactory(cellFactoryDoubleAppliancesSuddenly);
        colActualDifferenceAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("actualDifferenceAppliancesSuddenly"));
        colActualDifferenceAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActualDifferenceAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPaidAppliancesSuddenly.setCellFactory(cellFactoryDoubleAppliancesSuddenly);
        colPaidAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("paidAppliancesSuddenly"));
        colPaidAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPaidAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colResidueAppliancesSuddenly.setCellFactory(cellFactoryDoubleAppliancesSuddenly);
        colResidueAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("residueAppliancesSuddenly"));
        colResidueAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setResidueAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colDateOfDeliveryAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("dateOfDeliveryAppliancesSuddenly"));
        colDateOfDeliveryAppliancesSuddenly.setCellFactory(p -> {
            return new AppliancesSuddenly.DatePickerCell<>();
        });
        colNameRoomAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("nameRoomAppliancesSuddenly"));
        colNameRoomAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setNameRoomAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPlannedCPAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("plannedCPAppliancesSuddenly"));
        colPlannedCPAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPlannedCPAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualCPAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("actualCPAppliancesSuddenly"));
        colActualCPAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActualCPAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colAccountAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("accountAppliancesSuddenly"));
        colAccountAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setAccountAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colContactsAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("contactsAppliancesSuddenly"));
        colContactsAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setContactsAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colNotesAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("notesAppliancesSuddenly"));
        colNotesAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setNotesAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCharacteristicsAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("characteristicsAppliancesSuddenly"));
        colCharacteristicsAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setCharacteristicsAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });

        colNameAppliancesSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colNameRoomAppliancesSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colPlannedCPAppliancesSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCPAppliancesSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colAccountAppliancesSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colContactsAppliancesSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colNotesAppliancesSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colCharacteristicsAppliancesSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());


        //Декор - Доставка
        decorationTableViewDelivery.setItems(observableListDecorationDelivery);
        Callback<TableColumn<DecorationDelivery, String>, TableCell<DecorationDelivery, String>> cellFactoryDoubleDecorationDelivery =
                new Callback<TableColumn<DecorationDelivery, String>, TableCell<DecorationDelivery, String>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellTextBox("\\d.\\d");
                    }
                };
        Callback<TableColumn<DecorationDelivery, Boolean>, TableCell<DecorationDelivery, Boolean>> cellFactoryCheckboxDecorationDelivery =
                new Callback<TableColumn<DecorationDelivery, Boolean>, TableCell<DecorationDelivery, Boolean>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellCheckBox();
                    }
                };


        colNameDecorationDelivery.setCellValueFactory(new PropertyValueFactory<>("nameDecorationDelivery"));
        colNameDecorationDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setNameDecorationDelivery(t.getNewValue());
                    }
                });
        colActivePDecorationDelivery.setCellFactory(cellFactoryCheckboxDecorationDelivery);
        colActivePDecorationDelivery.setCellValueFactory(new PropertyValueFactory<>("activePDecorationDelivery"));
        colActivePDecorationDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationDelivery, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationDelivery, Boolean> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActivePDecorationDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActiveCDecorationDelivery.setCellFactory(cellFactoryCheckboxDecorationDelivery);
        colActiveCDecorationDelivery.setCellValueFactory(new PropertyValueFactory<>("activeCDecorationDelivery"));
        colActiveCDecorationDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationDelivery, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationDelivery, Boolean> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActiveCDecorationDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        ObservableList<UnitType> typeListDecorationDelivery = FXCollections.observableArrayList(UnitType.values());
        colUnitDecorationDelivery.setCellValueFactory(new PropertyValueFactory<>("unitDecorationDelivery"));
        colUnitDecorationDelivery.setCellFactory(ComboBoxTableCell.forTableColumn(typeListDecorationDelivery));
        colUnitDecorationDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationDelivery, UnitType>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationDelivery, UnitType> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setUnitDecorationDelivery(t.getNewValue());
                    }
                });
        colQuantityDecorationDelivery.setCellFactory(cellFactoryDoubleDecorationDelivery);
        colQuantityDecorationDelivery.setCellValueFactory(new PropertyValueFactory<>("quantityDecorationDelivery"));
        colQuantityDecorationDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setQuantityDecorationDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colOrdinalPriceUnitDecorationDelivery.setCellFactory(cellFactoryDoubleDecorationDelivery);
        colOrdinalPriceUnitDecorationDelivery.setCellValueFactory(new PropertyValueFactory<>("ordinalPriceUnitDecorationDelivery"));
        colOrdinalPriceUnitDecorationDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setOrdinalPriceUnitDecorationDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPUnitDecorationDelivery.setCellFactory(cellFactoryDoubleDecorationDelivery);
        colPriceCPUnitDecorationDelivery.setCellValueFactory(new PropertyValueFactory<>("priceCPUnitDecorationDelivery"));
        colPriceCPUnitDecorationDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPriceCPUnitDecorationDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPKeyDecorationDelivery.setCellFactory(cellFactoryDoubleDecorationDelivery);
        colPriceCPKeyDecorationDelivery.setCellValueFactory(new PropertyValueFactory<>("priceCPKeyDecorationDelivery"));
        colPriceCPKeyDecorationDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPriceCPKeyDecorationDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPUnitDecorationDelivery.setCellFactory(cellFactoryDoubleDecorationDelivery);
        colCostCPUnitDecorationDelivery.setCellValueFactory(new PropertyValueFactory<>("costCPUnitDecorationDelivery"));
        colCostCPUnitDecorationDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setCostCPUnitDecorationDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceOrderDecorationDelivery.setCellFactory(cellFactoryDoubleDecorationDelivery);
        colPriceOrderDecorationDelivery.setCellValueFactory(new PropertyValueFactory<>("priceOrderDecorationDelivery"));
        colPriceOrderDecorationDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPriceOrderDecorationDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPDecorationDelivery.setCellFactory(cellFactoryDoubleDecorationDelivery);
        colCostCPDecorationDelivery.setCellValueFactory(new PropertyValueFactory<>("costCPDecorationDelivery"));
        colCostCPDecorationDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setCostCPDecorationDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        ObservableList<TimeProduction> timeProductionListDecorationDelivery = FXCollections.observableArrayList(TimeProduction.values());
        colProductionTimeDecorationDelivery.setCellValueFactory(new PropertyValueFactory<>("productionTimeDecorationDelivery"));
        colProductionTimeDecorationDelivery.setCellFactory(ComboBoxTableCell.forTableColumn(timeProductionListDecorationDelivery));
        colProductionTimeDecorationDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationDelivery, TimeProduction>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationDelivery, TimeProduction> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setProductionTimeDecorationDelivery(t.getNewValue());
                    }
                });
        colActualCostDecorationDelivery.setCellFactory(cellFactoryDoubleDecorationDelivery);
        colActualCostDecorationDelivery.setCellValueFactory(new PropertyValueFactory<>("actualCostDecorationDelivery"));
        colActualCostDecorationDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActualCostDecorationDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualDifferenceDecorationDelivery.setCellFactory(cellFactoryDoubleDecorationDelivery);
        colActualDifferenceDecorationDelivery.setCellValueFactory(new PropertyValueFactory<>("actualDifferenceDecorationDelivery"));
        colActualDifferenceDecorationDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActualDifferenceDecorationDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPaidDecorationDelivery.setCellFactory(cellFactoryDoubleDecorationDelivery);
        colPaidDecorationDelivery.setCellValueFactory(new PropertyValueFactory<>("paidDecorationDelivery"));
        colPaidDecorationDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPaidDecorationDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colResidueDecorationDelivery.setCellFactory(cellFactoryDoubleDecorationDelivery);
        colResidueDecorationDelivery.setCellValueFactory(new PropertyValueFactory<>("residueDecorationDelivery"));
        colResidueDecorationDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setResidueDecorationDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colDateOfDeliveryDecorationDelivery.setCellValueFactory(new PropertyValueFactory<>("dateOfDeliveryDecorationDelivery"));
        colDateOfDeliveryDecorationDelivery.setCellFactory(p -> {
            return new DecorationDelivery.DatePickerCell<>();
        });
        colNameRoomDecorationDelivery.setCellValueFactory(new PropertyValueFactory<>("nameRoomDecorationDelivery"));
        colNameRoomDecorationDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setNameRoomDecorationDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPlannedCPDecorationDelivery.setCellValueFactory(new PropertyValueFactory<>("plannedCPDecorationDelivery"));
        colPlannedCPDecorationDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPlannedCPDecorationDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualCPDecorationDelivery.setCellValueFactory(new PropertyValueFactory<>("actualCPDecorationDelivery"));
        colActualCPDecorationDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActualCPDecorationDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colAccountDecorationDelivery.setCellValueFactory(new PropertyValueFactory<>("accountDecorationDelivery"));
        colAccountDecorationDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setAccountDecorationDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colContactsDecorationDelivery.setCellValueFactory(new PropertyValueFactory<>("contactsDecorationDelivery"));
        colContactsDecorationDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setContactsDecorationDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colNotesDecorationDelivery.setCellValueFactory(new PropertyValueFactory<>("notesDecorationDelivery"));
        colNotesDecorationDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setNotesDecorationDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCharacteristicsDecorationDelivery.setCellValueFactory(new PropertyValueFactory<>("characteristicsDecorationDelivery"));
        colCharacteristicsDecorationDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationDelivery, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setCharacteristicsDecorationDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });

        colNameDecorationDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colNameRoomDecorationDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colPlannedCPDecorationDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCPDecorationDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colAccountDecorationDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colContactsDecorationDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colNotesDecorationDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colCharacteristicsDecorationDelivery.setCellFactory(TextFieldTableCell.forTableColumn());



        //Декор - Нежданчик
        decorationTableViewSuddenly.setItems(observableListDecorationSuddenly);
        Callback<TableColumn<DecorationSuddenly, String>, TableCell<DecorationSuddenly, String>> cellFactoryDoubleDecorationSuddenly =
                new Callback<TableColumn<DecorationSuddenly, String>, TableCell<DecorationSuddenly, String>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellTextBox("\\d.\\d");
                    }
                };
        Callback<TableColumn<DecorationSuddenly, Boolean>, TableCell<DecorationSuddenly, Boolean>> cellFactoryCheckboxDecorationSuddenly =
                new Callback<TableColumn<DecorationSuddenly, Boolean>, TableCell<DecorationSuddenly, Boolean>>() {
                    public TableCell call(TableColumn p) {
                        return new EditingCellCheckBox();
                    }
                };


        colNameDecorationSuddenly.setCellValueFactory(new PropertyValueFactory<>("nameDecorationSuddenly"));
        colNameDecorationSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setNameDecorationSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActivePDecorationSuddenly.setCellFactory(cellFactoryCheckboxDecorationSuddenly);
        colActivePDecorationSuddenly.setCellValueFactory(new PropertyValueFactory<>("activePDecorationSuddenly"));
        colActivePDecorationSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationSuddenly, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationSuddenly, Boolean> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActivePDecorationSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActiveCDecorationSuddenly.setCellFactory(cellFactoryCheckboxDecorationSuddenly);
        colActiveCDecorationSuddenly.setCellValueFactory(new PropertyValueFactory<>("activeCDecorationSuddenly"));
        colActiveCDecorationSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationSuddenly, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationSuddenly, Boolean> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActiveCDecorationSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        ObservableList<UnitType> typeListDecorationSuddenly = FXCollections.observableArrayList(UnitType.values());
        colUnitDecorationSuddenly.setCellValueFactory(new PropertyValueFactory<>("unitDecorationSuddenly"));
        colUnitDecorationSuddenly.setCellFactory(ComboBoxTableCell.forTableColumn(typeListDecorationSuddenly));
        colUnitDecorationSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationSuddenly, UnitType>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationSuddenly, UnitType> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setUnitDecorationSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colQuantityDecorationSuddenly.setCellFactory(cellFactoryDoubleDecorationSuddenly);
        colQuantityDecorationSuddenly.setCellValueFactory(new PropertyValueFactory<>("quantityDecorationSuddenly"));
        colQuantityDecorationSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setQuantityDecorationSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colOrdinalPriceUnitDecorationSuddenly.setCellFactory(cellFactoryDoubleDecorationSuddenly);
        colOrdinalPriceUnitDecorationSuddenly.setCellValueFactory(new PropertyValueFactory<>("ordinalPriceUnitDecorationSuddenly"));
        colOrdinalPriceUnitDecorationSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setOrdinalPriceUnitDecorationSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPUnitDecorationSuddenly.setCellFactory(cellFactoryDoubleDecorationSuddenly);
        colPriceCPUnitDecorationSuddenly.setCellValueFactory(new PropertyValueFactory<>("priceCPUnitDecorationSuddenly"));
        colPriceCPUnitDecorationSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPriceCPUnitDecorationSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPKeyDecorationSuddenly.setCellFactory(cellFactoryDoubleDecorationSuddenly);
        colPriceCPKeyDecorationSuddenly.setCellValueFactory(new PropertyValueFactory<>("priceCPKeyDecorationSuddenly"));
        colPriceCPKeyDecorationSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPriceCPKeyDecorationSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPUnitDecorationSuddenly.setCellFactory(cellFactoryDoubleDecorationSuddenly);
        colCostCPUnitDecorationSuddenly.setCellValueFactory(new PropertyValueFactory<>("costCPUnitDecorationSuddenly"));
        colCostCPUnitDecorationSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setCostCPUnitDecorationSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceOrderDecorationSuddenly.setCellFactory(cellFactoryDoubleDecorationSuddenly);
        colPriceOrderDecorationSuddenly.setCellValueFactory(new PropertyValueFactory<>("priceOrderDecorationSuddenly"));
        colPriceOrderDecorationSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPriceOrderDecorationSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPDecorationSuddenly.setCellFactory(cellFactoryDoubleDecorationSuddenly);
        colCostCPDecorationSuddenly.setCellValueFactory(new PropertyValueFactory<>("costCPDecorationSuddenly"));
        colCostCPDecorationSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setCostCPDecorationSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        ObservableList<TimeProduction> timeProductionListDecorationSuddenly = FXCollections.observableArrayList(TimeProduction.values());
        colProductionTimeDecorationSuddenly.setCellValueFactory(new PropertyValueFactory<>("productionTimeDecorationSuddenly"));
        colProductionTimeDecorationSuddenly.setCellFactory(ComboBoxTableCell.forTableColumn(timeProductionListDecorationSuddenly));
        colProductionTimeDecorationSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationSuddenly, TimeProduction>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationSuddenly, TimeProduction> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setProductionTimeDecorationSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualCostDecorationSuddenly.setCellFactory(cellFactoryDoubleDecorationSuddenly);
        colActualCostDecorationSuddenly.setCellValueFactory(new PropertyValueFactory<>("actualCostDecorationSuddenly"));
        colActualCostDecorationSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActualCostDecorationSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualDifferenceDecorationSuddenly.setCellFactory(cellFactoryDoubleDecorationSuddenly);
        colActualDifferenceDecorationSuddenly.setCellValueFactory(new PropertyValueFactory<>("actualDifferenceDecorationSuddenly"));
        colActualDifferenceDecorationSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActualDifferenceDecorationSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPaidDecorationSuddenly.setCellFactory(cellFactoryDoubleDecorationSuddenly);
        colPaidDecorationSuddenly.setCellValueFactory(new PropertyValueFactory<>("paidDecorationSuddenly"));
        colPaidDecorationSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPaidDecorationSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colResidueDecorationSuddenly.setCellFactory(cellFactoryDoubleDecorationSuddenly);
        colResidueDecorationSuddenly.setCellValueFactory(new PropertyValueFactory<>("residueDecorationSuddenly"));
        colResidueDecorationSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setResidueDecorationSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colDateOfDeliveryDecorationSuddenly.setCellValueFactory(new PropertyValueFactory<>("dateOfDeliveryDecorationSuddenly"));
        colDateOfDeliveryDecorationSuddenly.setCellFactory(p -> {
            return new DecorationSuddenly.DatePickerCell<>();
        });
        colNameRoomDecorationSuddenly.setCellValueFactory(new PropertyValueFactory<>("nameRoomDecorationSuddenly"));
        colNameRoomDecorationSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setNameRoomDecorationSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPlannedCPDecorationSuddenly.setCellValueFactory(new PropertyValueFactory<>("plannedCPDecorationSuddenly"));
        colPlannedCPDecorationSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setPlannedCPDecorationSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualCPDecorationSuddenly.setCellValueFactory(new PropertyValueFactory<>("actualCPDecorationSuddenly"));
        colActualCPDecorationSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setActualCPDecorationSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colAccountDecorationSuddenly.setCellValueFactory(new PropertyValueFactory<>("accountDecorationSuddenly"));
        colAccountDecorationSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setAccountDecorationSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colContactsDecorationSuddenly.setCellValueFactory(new PropertyValueFactory<>("contactsDecorationSuddenly"));
        colContactsDecorationSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setContactsDecorationSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colNotesDecorationSuddenly.setCellValueFactory(new PropertyValueFactory<>("notesDecorationSuddenly"));
        colNotesDecorationSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setNotesDecorationSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCharacteristicsDecorationSuddenly.setCellValueFactory(new PropertyValueFactory<>("characteristicsDecorationSuddenly"));
        colCharacteristicsDecorationSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DecorationSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DecorationSuddenly, String> t) {
                        t.getTableView().getItems().get(
                                t.getTablePosition().getRow()).setCharacteristicsDecorationSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });

        colNameDecorationSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colNameRoomDecorationSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colPlannedCPDecorationSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colActualCPDecorationSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colAccountDecorationSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colContactsDecorationSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colNotesDecorationSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colCharacteristicsDecorationSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());





    }




    public void On_tabCalculatorClickedActionAK(MouseEvent mouseEvent) {
        if (observableListAK.filtered(x -> "0.0".equals(x.getRateAK()) && "0.0".equals(x.getTermAK())).size() == 0) {
            observableListAK.add(new AK(0, 0, 0));
        }
    }

    public void On_tabCalculatorClickedActionRoom(MouseEvent mouseEvent) {
        if (observableListRoom.filtered(x -> "".equals(x.getNameRoom()) && "0.0".equals(x.getAreaRoom())).size() == 0) {
            observableListRoom.add(new Room("", 0, false));
        }
    }

    public void deleteRoomElement(ActionEvent actionEvent) {
        ObservableList<Room> allRoom, singleRoom;
        allRoom = roomTableView.getItems();
        singleRoom = roomTableView.getSelectionModel().getSelectedItems();
        singleRoom.forEach(allRoom::remove);
    }

    public void saveRoomElement(ActionEvent actionEvent) {

        totalView.setDisable(false);
        DPView.setDisable(false);
        buildersView.setDisable(false);
        subcontractorsView.setDisable(false);
        AKView.setDisable(false);
        materialView.setDisable(false);
        plumbingView.setDisable(false);
        furnitureView.setDisable(false);
        lightView.setDisable(false);
        appliancesView.setDisable(false);
        decorationView.setDisable(false);
        statisticsView.setDisable(false);
        diagramView.setDisable(false);
    }

    //!!!!!НАЧАЛО ДИ !!!!!!
    private void onClick(TableColumn.CellEditEvent<Room, String> event) {

        TablePosition<Room, String> pos = event.getTablePosition();

        String newName = event.getNewValue();

        int row = pos.getRow();
        Room updatedRoom = event.getTableView().getItems().get(row);

        updatedRoom.setNameRoom(newName);

        //решить проблему с сантехникой, должно быть имя + чекбокс
        roomPlumbing.getPanes().clear();
        initAccordion(roomPlumbing);

        roomFurniture.getPanes().clear();
        initAccordion(roomFurniture);

        roomLight.getPanes().clear();
        initAccordion(roomLight);

        roomDecoration.getPanes().clear();
        initAccordion(roomDecoration);

    }

    private void initAccordion(Accordion accordion) {
        for (Room room : observableListRoom) {
            if (!room.getNameRoom().isEmpty()) {
                accordion.getPanes().add(createTitledPane(room));
            }
        }
    }

    TitledPane createTitledPane(Room room) {
        TitledPane titledPane = new TitledPane();

        titledPane.setText(room.getNameRoom());
        titledPane.setContent(createRoomPropertiesTable(room));

        return titledPane;
    }

    TableView<Room> createRoomPropertiesTable(Room room) {

        TableView<Room> tableViewRoomTransmit = new TableView<>(FXCollections.observableArrayList(room));

        tableViewRoomTransmit.setEditable(true);

        TableColumn<Room, String> colNameRoomTransmit = new TableColumn<>("Наименование");
        TableColumn<Room, Boolean> colActivePRoomTransmit = new TableColumn<>("П");
        TableColumn<Room, Boolean> colActiveCRoomTransmit = new TableColumn<>("С");
        TableColumn<Room, UnitType> colUnitRoomTransmit = new TableColumn<>("Ед. изм.");
        TableColumn<Room, String> colQuantityRoomTransmit = new TableColumn<>("Количество");
        TableColumn<Room, String> colOrdinalPriceUnitRoomTransmit = new TableColumn<>("Цена порядковая за ед.");
        TableColumn<Room, String> colPriceCPUnitRoomTransmit = new TableColumn<>("Цена по КП за ед.");
        TableColumn<Room, String> colPriceCPKeyRoomTransmit = new TableColumn<>("Цена по КП под ключ");
        TableColumn<Room, String> colCostCPUnitRoomTransmit = new TableColumn<>("Стоимость по КП за ед.");
        TableColumn<Room, String> colPriceOrderRoomTransmit = new TableColumn<>("Порядок цен");
        TableColumn<Room, String> colCostCPRoomTransmit = new TableColumn<>("Стоимость по КП");
        TableColumn<Room, TimeProduction> colProductionTimeRoomTransmit = new TableColumn<>("Срок доставки");
        TableColumn<Room, String> colActualCostRoomTransmit = new TableColumn<>("Стоимость фактическая");
        TableColumn<Room, String> colActualDifferenceRoomTransmit = new TableColumn<>("Разница фактическая");
        TableColumn<Room, String> colPaidRoomTransmit = new TableColumn<>("Оплачено");
        TableColumn<Room, String> colResidueRoomTransmit = new TableColumn<>("Остаток");
        TableColumn<Room, Date> colDateOfDeliveryRoomTransmit = new TableColumn<>("Дата поставки");
        TableColumn<Room, String> colPlannedCPRoomTransmit = new TableColumn<>("КП плановое");
        TableColumn<Room, String> colActualCPRoomTransmit = new TableColumn<>("КП фактическое");
        TableColumn<Room, String> colAccountRoomTransmit = new TableColumn<>("Счёт");
        TableColumn<Room, String> colContactsRoomTransmit = new TableColumn<>("Контакты");
        TableColumn<Room, String> colNotesRoomTransmit = new TableColumn<>("Примечания");
        TableColumn<Room, String> colCharacteristicsRoomTransmit = new TableColumn<>("Характеристики");

//        //Вызоваем методы
        initStringColumn(colNameRoomTransmit, colPlannedCPRoomTransmit, colActualCPRoomTransmit, colAccountRoomTransmit, colContactsRoomTransmit, colNotesRoomTransmit, colCharacteristicsRoomTransmit, colQuantityRoomTransmit, colOrdinalPriceUnitRoomTransmit, colPriceCPUnitRoomTransmit, colPriceCPKeyRoomTransmit, colCostCPUnitRoomTransmit, colPriceOrderRoomTransmit, colCostCPRoomTransmit, colActualCostRoomTransmit, colActualDifferenceRoomTransmit, colPaidRoomTransmit, colResidueRoomTransmit);
//        initDoubleColumn(colQuantityRoomTransmit, colOrdinalPriceUnitRoomTransmit, colPriceCPUnitRoomTransmit, colPriceCPKeyRoomTransmit, colCostCPUnitRoomTransmit, colPriceOrderRoomTransmit, colCostCPRoomTransmit, colActualCostRoomTransmit, colActualDifferenceRoomTransmit, colPaidRoomTransmit, colResidueRoomTransmit);
        initBooleanColumn(colActivePRoomTransmit, colActiveCRoomTransmit);
        initUnitTypeColumn(colUnitRoomTransmit);
        initTimeProductionColumn(colProductionTimeRoomTransmit);
        initDataColumn(colDateOfDeliveryRoomTransmit);

        tableViewRoomTransmit.getColumns().addAll(colNameRoomTransmit, colActivePRoomTransmit, colActiveCRoomTransmit, colUnitRoomTransmit,
                colQuantityRoomTransmit, colOrdinalPriceUnitRoomTransmit, colPriceCPUnitRoomTransmit, colPriceCPKeyRoomTransmit,
                colCostCPUnitRoomTransmit, colPriceOrderRoomTransmit, colCostCPRoomTransmit, colProductionTimeRoomTransmit, colActualCostRoomTransmit,
                colActualDifferenceRoomTransmit, colPaidRoomTransmit, colResidueRoomTransmit, colDateOfDeliveryRoomTransmit, colPlannedCPRoomTransmit,
                colActualCPRoomTransmit, colAccountRoomTransmit, colContactsRoomTransmit, colNotesRoomTransmit, colCharacteristicsRoomTransmit);

        return tableViewRoomTransmit;
    }

    private void initStringColumn(TableColumn<Room, String> colNameRoomTransmit, TableColumn<Room, String> colPlannedCPRoomTransmit, TableColumn<Room, String> colActualCPRoomTransmit,
                                  TableColumn<Room, String> colAccountRoomTransmit, TableColumn<Room, String> colContactsRoomTransmit, TableColumn<Room, String> colNotesRoomTransmit,
                                  TableColumn<Room, String> colCharacteristicsRoomTransmit,
                                  //Пошли дабл!
                                  TableColumn<Room, String> colQuantityRoomTransmit, TableColumn<Room, String> colOrdinalPriceUnitRoomTransmit,
                                  TableColumn<Room, String> colPriceCPUnitRoomTransmit, TableColumn<Room, String> colPriceCPKeyRoomTransmit,
                                  TableColumn<Room, String> colCostCPUnitRoomTransmit, TableColumn<Room, String> colPriceOrderRoomTransmit,
                                  TableColumn<Room, String> colCostCPRoomTransmit, TableColumn<Room, String> colActualCostRoomTransmit,
                                  TableColumn<Room, String> colActualDifferenceRoomTransmit, TableColumn<Room, String> colPaidRoomTransmit,
                                  TableColumn<Room, String> colResidueRoomTransmit) {
        colNameRoomTransmit.setCellValueFactory(new PropertyValueFactory<Room, String>("Наименование"));
        colNameRoomTransmit.setCellFactory(TextFieldTableCell.<Room>forTableColumn());
        colNameRoomTransmit.setOnEditCommit(this::onStringClick);

        colPlannedCPRoomTransmit.setCellValueFactory(new PropertyValueFactory<Room, String>("КП плановое"));
        colPlannedCPRoomTransmit.setCellFactory(TextFieldTableCell.<Room>forTableColumn());
        colPlannedCPRoomTransmit.setOnEditCommit(this::onStringClick);

        colActualCPRoomTransmit.setCellValueFactory(new PropertyValueFactory<Room, String>("КП фактическое"));
        colActualCPRoomTransmit.setCellFactory(TextFieldTableCell.<Room>forTableColumn());
        colActualCPRoomTransmit.setOnEditCommit(this::onStringClick);

        colAccountRoomTransmit.setCellValueFactory(new PropertyValueFactory<Room, String>("Счёт"));
        colAccountRoomTransmit.setCellFactory(TextFieldTableCell.<Room>forTableColumn());
        colAccountRoomTransmit.setOnEditCommit(this::onStringClick);

        colContactsRoomTransmit.setCellValueFactory(new PropertyValueFactory<Room, String>("Контакты"));
        colContactsRoomTransmit.setCellFactory(TextFieldTableCell.<Room>forTableColumn());
        colContactsRoomTransmit.setOnEditCommit(this::onStringClick);

        colNotesRoomTransmit.setCellValueFactory(new PropertyValueFactory<Room, String>("Примечания"));
        colNotesRoomTransmit.setCellFactory(TextFieldTableCell.<Room>forTableColumn());
        colNotesRoomTransmit.setOnEditCommit(this::onStringClick);

        colCharacteristicsRoomTransmit.setCellValueFactory(new PropertyValueFactory<Room, String>("Характеристики"));
        colCharacteristicsRoomTransmit.setCellFactory(TextFieldTableCell.<Room>forTableColumn());
        colCharacteristicsRoomTransmit.setOnEditCommit(this::onStringClick);

        //Дабл
        colQuantityRoomTransmit.setCellValueFactory(new PropertyValueFactory<Room, String>("Количество"));
        colQuantityRoomTransmit.setCellFactory(TextFieldTableCell.<Room>forTableColumn());
        colQuantityRoomTransmit.setOnEditCommit(this::onStringClick);

        colOrdinalPriceUnitRoomTransmit.setCellValueFactory(new PropertyValueFactory<Room, String>("Цена порядковая за ед."));
        colOrdinalPriceUnitRoomTransmit.setCellFactory(TextFieldTableCell.<Room>forTableColumn());
        colOrdinalPriceUnitRoomTransmit.setOnEditCommit(this::onStringClick);

        colPriceCPUnitRoomTransmit.setCellValueFactory(new PropertyValueFactory<Room, String>("Цена по КП за ед."));
        colPriceCPUnitRoomTransmit.setCellFactory(TextFieldTableCell.<Room>forTableColumn());
        colPriceCPUnitRoomTransmit.setOnEditCommit(this::onStringClick);

        colPriceCPKeyRoomTransmit.setCellValueFactory(new PropertyValueFactory<Room, String>("Цена по КП под ключ"));
        colPriceCPKeyRoomTransmit.setCellFactory(TextFieldTableCell.<Room>forTableColumn());
        colPriceCPKeyRoomTransmit.setOnEditCommit(this::onStringClick);

        colCostCPUnitRoomTransmit.setCellValueFactory(new PropertyValueFactory<Room, String>("Стоимость по КП за ед."));
        colCostCPUnitRoomTransmit.setCellFactory(TextFieldTableCell.<Room>forTableColumn());
        colCostCPUnitRoomTransmit.setOnEditCommit(this::onStringClick);

        colPriceOrderRoomTransmit.setCellValueFactory(new PropertyValueFactory<Room, String>("Порядок цен"));
        colPriceOrderRoomTransmit.setCellFactory(TextFieldTableCell.<Room>forTableColumn());
        colPriceOrderRoomTransmit.setOnEditCommit(this::onStringClick);

        colCostCPRoomTransmit.setCellValueFactory(new PropertyValueFactory<Room, String>("Стоимость по КП"));
        colCostCPRoomTransmit.setCellFactory(TextFieldTableCell.<Room>forTableColumn());
        colCostCPRoomTransmit.setOnEditCommit(this::onStringClick);

        colActualCostRoomTransmit.setCellValueFactory(new PropertyValueFactory<Room, String>("Стоимость фактическая"));
        colActualCostRoomTransmit.setCellFactory(TextFieldTableCell.<Room>forTableColumn());
        colActualCostRoomTransmit.setOnEditCommit(this::onStringClick);

        colActualDifferenceRoomTransmit.setCellValueFactory(new PropertyValueFactory<Room, String>("Разница фактическая"));
        colActualDifferenceRoomTransmit.setCellFactory(TextFieldTableCell.<Room>forTableColumn());
        colActualDifferenceRoomTransmit.setOnEditCommit(this::onStringClick);

        colPaidRoomTransmit.setCellValueFactory(new PropertyValueFactory<Room, String>("Оплачено"));
        colPaidRoomTransmit.setCellFactory(TextFieldTableCell.<Room>forTableColumn());
        colPaidRoomTransmit.setOnEditCommit(this::onStringClick);

        colResidueRoomTransmit.setCellValueFactory(new PropertyValueFactory<Room, String>("Остаток"));
        colResidueRoomTransmit.setCellFactory(TextFieldTableCell.<Room>forTableColumn());
        colResidueRoomTransmit.setOnEditCommit(this::onStringClick);
    }

    private void onStringClick(TableColumn.CellEditEvent<Room, String> event) {
        TablePosition<Room, String> pos = event.getTablePosition();

        String comments = event.getNewValue();

        int row = pos.getRow();
        Room updatedRoom = event.getTableView().getItems().get(row);


        //Дописать стринговые столбцы!
//        updatedRoom.setNameRoomTransmit(comments);
        updatedRoom.setNameRoomTransmit(comments);
        updatedRoom.setAccountRoomTransmit(comments);

    }

//    //Не забыть доделать!
//    private void initDoubleColumn(TableColumn<Room, Double> colQuantityRoomTransmit, TableColumn<Room, Double> colOrdinalPriceUnitRoomTransmit,
//                                  TableColumn<Room, Double> colPriceCPUnitRoomTransmit, TableColumn<Room, Double> colPriceCPKeyRoomTransmit,
//                                  TableColumn<Room, Double> colCostCPUnitRoomTransmit, TableColumn<Room, Double> colPriceOrderRoomTransmit,
//                                  TableColumn<Room, Double> colCostCPRoomTransmit, TableColumn<Room, Double> colActualCostRoomTransmit,
//                                  TableColumn<Room, Double> colActualDifferenceRoomTransmit, TableColumn<Room, Double> colPaidRoomTransmit,
//                                  TableColumn<Room, Double> colResidueRoomTransmit) {
//
//        colQuantityRoomTransmit.setCellValueFactory(new PropertyValueFactory<Room, Double>("Количество"));
////        colQuantityRoomTransmit.setCellFactory(TextFieldTableCell.forTableColumn());
//
//        colQuantityRoomTransmit.setOnEditCommit(this::onDoubleClick);
//    }
//
//    private void onDoubleClick(TableColumn.CellEditEvent<Room, Double> event) {
//        TablePosition<Room, Double> pos = event.getTablePosition();
//
//        Double comments = event.getNewValue();
//
//        int row = pos.getRow();
//        Room updatedUser = event.getTableView().getItems().get(row);
//
////        updatedUser.setComments(comments);
//    }


    private void initBooleanColumn(TableColumn<Room, Boolean> colActivePRoomTransmit, TableColumn<Room, Boolean> colActiveCRoomTransmit) {
        colActivePRoomTransmit.setCellValueFactory(new PropertyValueFactory<Room, Boolean>("П"));
        colActivePRoomTransmit.setCellFactory(p -> {
            return new CheckBoxTableCell<Room, Boolean>();
        });
        colActiveCRoomTransmit.setCellValueFactory(new PropertyValueFactory<Room, Boolean>("С"));
        colActiveCRoomTransmit.setCellFactory(p -> {
            return new CheckBoxTableCell<Room, Boolean>();
        });
        colActivePRoomTransmit.setOnEditStart(this::onRoomBooleanClick);
//        colActiveCRoomTransmit.setOnEditStart(this::onRoomClick);
    }

    private void onRoomBooleanClick(TableColumn.CellEditEvent<Room, Boolean> event) {
        TablePosition<Room, Boolean> pos = event.getTablePosition();
        Boolean room = event.getNewValue();

        int row = pos.getRow();
        Room updatedRoom = event.getTableView().getItems().get(row);

        updatedRoom.setActivePRoomTransmit(room);
    }


    private void initUnitTypeColumn(TableColumn<Room, UnitType> colUnitRoomTransmit) {
        ObservableList<UnitType> typeList = FXCollections.observableArrayList(UnitType.values());

        colUnitRoomTransmit.setCellValueFactory(new PropertyValueFactory<Room, UnitType>("Ед. изм."));
        colUnitRoomTransmit.setCellFactory(ComboBoxTableCell.forTableColumn(typeList));
        colUnitRoomTransmit.setOnEditCommit(this::onUnitTypeClick);
    }

    private void onUnitTypeClick(TableColumn.CellEditEvent<Room, UnitType> event) {
        TablePosition<Room, UnitType> pos = event.getTablePosition();

        UnitType unitType = event.getNewValue();

        int row = pos.getRow();
        Room updatedRoom = event.getTableView().getItems().get(row);

//        updatedRoom.setType(unitType);
    }

    private void initTimeProductionColumn(TableColumn<Room, TimeProduction> colProductionTimeRoomTransmit) {
        ObservableList<TimeProduction> timeProductionList = FXCollections.observableArrayList(TimeProduction.values());

        colProductionTimeRoomTransmit.setCellValueFactory(new PropertyValueFactory<Room, TimeProduction>("Срок доставки"));
        colProductionTimeRoomTransmit.setCellFactory(ComboBoxTableCell.forTableColumn(timeProductionList));
        colProductionTimeRoomTransmit.setOnEditCommit(this::onTimeProductionClick);
    }

    private void onTimeProductionClick(TableColumn.CellEditEvent<Room, TimeProduction> event) {
        TablePosition<Room, TimeProduction> pos = event.getTablePosition();

        TimeProduction timeProduction = event.getNewValue();

        int row = pos.getRow();
        Room updatedRoom = event.getTableView().getItems().get(row);

//        updatedRoom.setType(timeProduction);
    }

    private void initDataColumn(TableColumn<Room, Date> colDateOfDeliveryRoomTransmit) {
        colDateOfDeliveryRoomTransmit.setCellValueFactory(new PropertyValueFactory<Room, Date>("Дата поставки"));
//        colDateOfDeliveryRoomTransmit.setCellFactory(p -> {
//            return new DatePickerCell<>();
//        });
        colDateOfDeliveryRoomTransmit.setEditable(true);
        colDateOfDeliveryRoomTransmit.setOnEditCommit(this::onDateClick);
    }

    private void onDateClick(TableColumn.CellEditEvent<Room, Date> event) {
        TablePosition<Room, Date> pos = event.getTablePosition();

        Date date = event.getNewValue();

        int row = pos.getRow();
        Room updatedRoom = event.getTableView().getItems().get(row);

        updatedRoom.setDateOfDeliveryRoomTransmit(date);
    }

    //!!!!!!!!!! КОНЕЦ ДИ !!!!!!!!!!


    public void On_tabCalculatorClickedSubcontractors(ActionEvent actionEvent) {
        if (observableListSubcontractors.filtered(x -> "0.0".equals(x.getCostPlannedSubcontractors()) && "0.0".equals(x.getCostCPSubcontractors())).size() == 0) {
            observableListSubcontractors.add(new Subcontractors("", 0, 0, 0, 0,
                    0, 0, "", "", "", "", "", ""));
        }
    }

    public void deleteElementSubcontractors(ActionEvent actionEvent) {
        ObservableList<Subcontractors> allSubcontractors, singleSubcontractors;
        allSubcontractors = subcontractorsTableView.getItems();
        singleSubcontractors = subcontractorsTableView.getSelectionModel().getSelectedItems();
        singleSubcontractors.forEach(allSubcontractors::remove);
    }

    public void showSubcontractors(ActionEvent actionEvent) {
        if (showSubcontractorsButton.isSelected()) {
            showSubcontractorsButton.setText("Скрыть");
            //Доделать
//            subcontractorsTableView.setMaxWidth(200);

            colCostActualSubcontractors.setVisible(true);
            colActualDifferenceSubcontractors.setVisible(true);
            colPaidSubcontractors.setVisible(true);
            colResidueSubcontractors.setVisible(true);

            colActualCPSubcontractors.setVisible(true);
            colAccountSubcontractors.setVisible(true);

        } else {
            showSubcontractorsButton.setText("Показать");
//            subcontractorsTableView.setMaxWidth(2000);

            colCostActualSubcontractors.setVisible(false);
            colActualDifferenceSubcontractors.setVisible(false);
            colPaidSubcontractors.setVisible(false);
            colResidueSubcontractors.setVisible(false);

            colActualCPSubcontractors.setVisible(false);
            colAccountSubcontractors.setVisible(false);
        }
    }

    double sumPriceOrderPlumbingDelivery = 0.0;
    double sumCostCPPlumbingDelivery = 0.0;
    double sumActualCostPlumbingDelivery = 0.0;
    double sumActualDifferencePlumbingDelivery = 0.0;
    double sumPaidPlumbingDelivery = 0.0;
    double sumResiduePlumbingDelivery = 0.0;

    public void On_tabCalculatorClickedActionPlumbingDelivery(ActionEvent actionEvent) {
        if (observableListPlumbingDelivery.filtered(x -> "0.0".equals(x.getQuantityPlumbingDelivery()) && "0.0".equals(x.getOrdinalPriceUnitPlumbingDelivery())).size() == 0) {
            observableListPlumbingDelivery.add(new PlumbingDelivery("", false, false, "", 0, 0,
                    0, 0, 0, 0, 0, "", 0, 0,
                    0, 0, "", "", "", "", "", "", "", ""));

            titlePlumbingDelivery.setText("Доставка/сборка        /Порядок цен: " + String.format("%.2f", sumPriceOrderPlumbingDelivery) + "        /Стоимость по КП: " + String.format("%.2f", sumCostCPPlumbingDelivery) +
                    "        /Стоимость фактическая: " + String.format("%.2f", sumActualCostPlumbingDelivery) + "        /Разница фактическая: " + String.format("%.2f", sumActualDifferencePlumbingDelivery) +
                    "        /Оплачено: " + String.format("%.2f", sumPaidPlumbingDelivery) + "        /Остаток: " + String.format("%.2f", sumResiduePlumbingDelivery));
        }
    }

    public void deleteElementPlumbingDelivery(ActionEvent actionEvent) {
        ObservableList<PlumbingDelivery> allPlumbingDelivery, singlePlumbingDelivery;
        allPlumbingDelivery = plumbingTableViewDelivery.getItems();
        singlePlumbingDelivery = plumbingTableViewDelivery.getSelectionModel().getSelectedItems();
        singlePlumbingDelivery.forEach(allPlumbingDelivery::remove);
    }

    public void showPlumbingDelivery(ActionEvent actionEvent) {
        if (showPlumbingDeliveryButton.isSelected()) {
            showPlumbingDeliveryButton.setText("Скрыть");

            colActualCostPlumbingDelivery.setVisible(true);
            colActualDifferencePlumbingDelivery.setVisible(true);
            colPaidPlumbingDelivery.setVisible(true);
            colResiduePlumbingDelivery.setVisible(true);
            colDateOfDeliveryPlumbingDelivery.setVisible(true);

            colActualCPPlumbingDelivery.setVisible(true);
            colAccountPlumbingDelivery.setVisible(true);

        } else {
            showPlumbingDeliveryButton.setText("Показать");

            colActualCostPlumbingDelivery.setVisible(false);
            colActualDifferencePlumbingDelivery.setVisible(false);
            colPaidPlumbingDelivery.setVisible(false);
            colResiduePlumbingDelivery.setVisible(false);
            colDateOfDeliveryPlumbingDelivery.setVisible(false);

            colActualCPPlumbingDelivery.setVisible(false);
            colAccountPlumbingDelivery.setVisible(false);
        }
    }


    double sumPriceOrderPlumbingSuddenly = 0.0;
    double sumCostCPPlumbingSuddenly = 0.0;
    double sumActualCostPlumbingSuddenly = 0.0;
    double sumActualDifferencePlumbingSuddenly = 0.0;
    double sumPaidPlumbingSuddenly = 0.0;
    double sumResiduePlumbingSuddenly = 0.0;

    public void On_tabCalculatorClickedActionPlumbingSuddenly(ActionEvent actionEvent) {
        if (observableListPlumbingSuddenly.filtered(x -> "0.0".equals(x.getQuantityPlumbingSuddenly()) && "0.0".equals(x.getOrdinalPriceUnitPlumbingSuddenly())).size() == 0) {
            observableListPlumbingSuddenly.add(new PlumbingSuddenly("", false, false, "", 0, 0,
                    0, 0, 0, 0, 0, "", 0, 0,
                    0, 0, "", "", "", "", "", "", "", ""));

            titlePlumbingSuddenly.setText("Нежданчик        /Порядок цен: " + String.format("%.2f", sumPriceOrderPlumbingSuddenly) + "        /Стоимость по КП: " + String.format("%.2f", sumCostCPPlumbingSuddenly) +
                    "        /Стоимость фактическая: " + String.format("%.2f", sumActualCostPlumbingSuddenly) + "        /Разница фактическая: " + String.format("%.2f", sumActualDifferencePlumbingSuddenly) +
                    "        /Оплачено: " + String.format("%.2f", sumPaidPlumbingSuddenly) + "        /Остаток: " + String.format("%.2f", sumResiduePlumbingSuddenly));
        }
    }

    public void deleteElementPlumbingSuddenly(ActionEvent actionEvent) {
        ObservableList<PlumbingSuddenly> allPlumbingSuddenly, singlePlumbingSuddenly;
        allPlumbingSuddenly = plumbingTableViewSuddenly.getItems();
        singlePlumbingSuddenly = plumbingTableViewSuddenly.getSelectionModel().getSelectedItems();
        singlePlumbingSuddenly.forEach(allPlumbingSuddenly::remove);
    }

    public void showPlumbingSuddenly(ActionEvent actionEvent) {
        if (showPlumbingSuddenlyButton.isSelected()) {
            showPlumbingSuddenlyButton.setText("Скрыть");

            colActualCostPlumbingSuddenly.setVisible(true);
            colActualDifferencePlumbingSuddenly.setVisible(true);
            colPaidPlumbingSuddenly.setVisible(true);
            colResiduePlumbingSuddenly.setVisible(true);
            colDateOfDeliveryPlumbingSuddenly.setVisible(true);

            colActualCPPlumbingSuddenly.setVisible(true);
            colAccountPlumbingSuddenly.setVisible(true);

        } else {
            showPlumbingSuddenlyButton.setText("Показать");

            colActualCostPlumbingSuddenly.setVisible(false);
            colActualDifferencePlumbingSuddenly.setVisible(false);
            colPaidPlumbingSuddenly.setVisible(false);
            colResiduePlumbingSuddenly.setVisible(false);
            colDateOfDeliveryPlumbingSuddenly.setVisible(false);

            colActualCPPlumbingSuddenly.setVisible(false);
            colAccountPlumbingSuddenly.setVisible(false);
        }
    }

    double sumPriceOrderMaterialWall = 0.0;
    double sumCostCPMaterialWall = 0.0;
    double sumActualCostMaterialWall = 0.0;
    double sumActualDifferenceMaterialWall = 0.0;
    double sumPaidMaterialWall = 0.0;
    double sumResidueMaterialWall = 0.0;


//    public void On_tabCalculatorClickedActionMaterialWall(MouseEvent mouseEvent) {
    public void On_tabCalculatorClickedActionMaterialWall(ActionEvent actionEvent) {
        if (observableListMaterialWall.filtered(x -> "0.0".equals(x.getQuantityMaterialWall()) && "0.0".equals(x.getOrdinalPriceUnitMaterialWall())).size() == 0) {
            //фиксируем по названию и цене
//        if (observableListMaterialWall.filtered(x -> "11".equals(x.getNameMaterialWall()) && "0.0".equals(x.getOrdinalPriceUnitMaterialWall())).size() == 0) {
            observableListMaterialWall.add(new MaterialWall("", false, false, "", 0, 0,
                    0, 0, 0, 0, 0, "", 0, 0,
                    0, 0, "", "", "", "", "", "", "", ""));

            titleMaterialWall.setText("Стены        /Порядок цен: " + String.format("%.2f", sumPriceOrderMaterialWall) + "        /Стоимость по КП: " + String.format("%.2f", sumCostCPMaterialWall) +
                    "        /Стоимость фактическая: " + String.format("%.2f", sumActualCostMaterialWall) + "        /Разница фактическая: " + String.format("%.2f", sumActualDifferenceMaterialWall) +
                    "        /Оплачено: " + String.format("%.2f", sumPaidMaterialWall) + "        /Остаток: " + String.format("%.2f", sumResidueMaterialWall));

        }
    }


    public void deleteElementMaterialWall(ActionEvent actionEvent) {
        ObservableList<MaterialWall> allMaterialWall, singleMaterialWall;
        allMaterialWall = materialTableViewWall.getItems();
        singleMaterialWall = materialTableViewWall.getSelectionModel().getSelectedItems();
        singleMaterialWall.forEach(allMaterialWall::remove);
    }

    public void showMaterialWall(ActionEvent actionEvent) {
        if (showMaterialWallButton.isSelected()) {
            showMaterialWallButton.setText("Скрыть");

            colActualCostMaterialWall.setVisible(true);
            colActualDifferenceMaterialWall.setVisible(true);
            colPaidMaterialWall.setVisible(true);
            colResidueMaterialWall.setVisible(true);
            colDateOfDeliveryMaterialWall.setVisible(true);

            colActualCPMaterialWall.setVisible(true);
            colAccountMaterialWall.setVisible(true);

        } else {
            showMaterialWallButton.setText("Показать");

            colActualCostMaterialWall.setVisible(false);
            colActualDifferenceMaterialWall.setVisible(false);
            colPaidMaterialWall.setVisible(false);
            colResidueMaterialWall.setVisible(false);
            colDateOfDeliveryMaterialWall.setVisible(false);

            colActualCPMaterialWall.setVisible(false);
            colAccountMaterialWall.setVisible(false);
        }
    }

    double sumPriceOrderMaterialFloor = 0.0;
    double sumCostCPMaterialFloor = 0.0;
    double sumActualCostMaterialFloor = 0.0;
    double sumActualDifferenceMaterialFloor = 0.0;
    double sumPaidMaterialFloor = 0.0;
    double sumResidueMaterialFloor = 0.0;

    public void On_tabCalculatorClickedActionMaterialFloor(ActionEvent actionEvent) {
        if (observableListMaterialFloor.filtered(x -> "0.0".equals(x.getQuantityMaterialFloor()) && "0.0".equals(x.getOrdinalPriceUnitMaterialFloor())).size() == 0) {
            observableListMaterialFloor.add(new MaterialFloor("", false, false, "", 0, 0,
                    0, 0, 0, 0, 0, "", 0, 0,
                    0, 0, "", "", "", "", "", "", "", ""));

            titleMaterialFloor.setText("Пол        /Порядок цен: " + String.format("%.2f", sumPriceOrderMaterialFloor) + "        /Стоимость по КП: " + String.format("%.2f", sumCostCPMaterialFloor) +
                    "        /Стоимость фактическая: " + String.format("%.2f", sumActualCostMaterialFloor) + "        /Разница фактическая: " + String.format("%.2f", sumActualDifferenceMaterialFloor) +
                    "        /Оплачено: " + String.format("%.2f", sumPaidMaterialFloor) + "        /Остаток: " + String.format("%.2f", sumResidueMaterialFloor));
        }
    }

    public void deleteElementMaterialFloor(ActionEvent actionEvent) {
        ObservableList<MaterialFloor> allMaterialFloor, singleMaterialFloor;
        allMaterialFloor = materialTableViewFloor.getItems();
        singleMaterialFloor = materialTableViewFloor.getSelectionModel().getSelectedItems();
        singleMaterialFloor.forEach(allMaterialFloor::remove);
    }

    public void showMaterialFloor(ActionEvent actionEvent) {
        if (showMaterialFloorButton.isSelected()) {
            showMaterialFloorButton.setText("Скрыть");

            colActualCostMaterialFloor.setVisible(true);
            colActualDifferenceMaterialFloor.setVisible(true);
            colPaidMaterialFloor.setVisible(true);
            colResidueMaterialFloor.setVisible(true);
            colDateOfDeliveryMaterialFloor.setVisible(true);

            colActualCPMaterialFloor.setVisible(true);
            colAccountMaterialFloor.setVisible(true);

        } else {
            showMaterialFloorButton.setText("Показать");

            colActualCostMaterialFloor.setVisible(false);
            colActualDifferenceMaterialFloor.setVisible(false);
            colPaidMaterialFloor.setVisible(false);
            colResidueMaterialFloor.setVisible(false);
            colDateOfDeliveryMaterialFloor.setVisible(false);

            colActualCPMaterialFloor.setVisible(false);
            colAccountMaterialFloor.setVisible(false);
        }
    }

    double sumPriceOrderMaterialCeiling = 0.0;
    double sumCostCPMaterialCeiling = 0.0;
    double sumActualCostMaterialCeiling = 0.0;
    double sumActualDifferenceMaterialCeiling = 0.0;
    double sumPaidMaterialCeiling = 0.0;
    double sumResidueMaterialCeiling = 0.0;

    public void On_tabCalculatorClickedActionMaterialCeiling(ActionEvent actionEvent) {
        if (observableListMaterialCeiling.filtered(x -> "0.0".equals(x.getQuantityMaterialCeiling()) && "0.0".equals(x.getOrdinalPriceUnitMaterialCeiling())).size() == 0) {
            observableListMaterialCeiling.add(new MaterialCeiling("", false, false, "", 0, 0,
                    0, 0, 0, 0, 0, "", 0, 0,
                    0, 0, "", "", "", "", "", "", "", ""));

            titleMaterialCeiling.setText("Потолок        /Порядок цен: " + String.format("%.2f", sumPriceOrderMaterialCeiling) + "        /Стоимость по КП: " + String.format("%.2f", sumCostCPMaterialCeiling) +
                    "        /Стоимость фактическая: " + String.format("%.2f", sumActualCostMaterialCeiling) + "        /Разница фактическая: " + String.format("%.2f", sumActualDifferenceMaterialCeiling) +
                    "        /Оплачено: " + String.format("%.2f", sumPaidMaterialCeiling) + "        /Остаток: " + String.format("%.2f", sumResidueMaterialCeiling));
        }
    }

    public void deleteElementMaterialCeiling(ActionEvent actionEvent) {
        ObservableList<MaterialCeiling> allMaterialCeiling, singleMaterialCeiling;
        allMaterialCeiling = materialTableViewCeiling.getItems();
        singleMaterialCeiling = materialTableViewCeiling.getSelectionModel().getSelectedItems();
        singleMaterialCeiling.forEach(allMaterialCeiling::remove);
    }

    public void showMaterialCeiling(ActionEvent actionEvent) {
        if (showMaterialCeilingButton.isSelected()) {
            showMaterialCeilingButton.setText("Скрыть");

            colActualCostMaterialCeiling.setVisible(true);
            colActualDifferenceMaterialCeiling.setVisible(true);
            colPaidMaterialCeiling.setVisible(true);
            colResidueMaterialCeiling.setVisible(true);
            colDateOfDeliveryMaterialCeiling.setVisible(true);

            colActualCPMaterialCeiling.setVisible(true);
            colAccountMaterialCeiling.setVisible(true);

        } else {
            showMaterialCeilingButton.setText("Показать");

            colActualCostMaterialCeiling.setVisible(false);
            colActualDifferenceMaterialCeiling.setVisible(false);
            colPaidMaterialCeiling.setVisible(false);
            colResidueMaterialCeiling.setVisible(false);
            colDateOfDeliveryMaterialCeiling.setVisible(false);

            colActualCPMaterialCeiling.setVisible(false);
            colAccountMaterialCeiling.setVisible(false);
        }
    }

    double sumPriceOrderMaterialOther = 0.0;
    double sumCostCPMaterialOther = 0.0;
    double sumActualCostMaterialOther = 0.0;
    double sumActualDifferenceMaterialOther = 0.0;
    double sumPaidMaterialOther = 0.0;
    double sumResidueMaterialOther = 0.0;

    public void On_tabCalculatorClickedActionMaterialOther(ActionEvent actionEvent) {
        if (observableListMaterialOther.filtered(x -> "0.0".equals(x.getQuantityMaterialOther()) && "0.0".equals(x.getOrdinalPriceUnitMaterialOther())).size() == 0) {
            observableListMaterialOther.add(new MaterialOther("", false, false, "", 0, 0,
                    0, 0, 0, 0, 0, "", 0, 0,
                    0, 0, "", "", "", "", "", "", "", ""));

            titleMaterialOther.setText("Другое        /Порядок цен: " + String.format("%.2f", sumPriceOrderMaterialOther) + "        /Стоимость по КП: " + String.format("%.2f", sumCostCPMaterialOther) +
                    "        /Стоимость фактическая: " + String.format("%.2f", sumActualCostMaterialOther) + "        /Разница фактическая: " + String.format("%.2f", sumActualDifferenceMaterialOther) +
                    "        /Оплачено: " + String.format("%.2f", sumPaidMaterialOther) + "        /Остаток: " + String.format("%.2f", sumResidueMaterialOther));
        }
    }

    public void deleteElementMaterialOther(ActionEvent actionEvent) {
        ObservableList<MaterialOther> allMaterialOther, singleMaterialOther;
        allMaterialOther = materialTableViewOther.getItems();
        singleMaterialOther = materialTableViewOther.getSelectionModel().getSelectedItems();
        singleMaterialOther.forEach(allMaterialOther::remove);
    }

    public void showMaterialOther(ActionEvent actionEvent) {
        if (showMaterialOtherButton.isSelected()) {
            showMaterialOtherButton.setText("Скрыть");

            colActualCostMaterialOther.setVisible(true);
            colActualDifferenceMaterialOther.setVisible(true);
            colPaidMaterialOther.setVisible(true);
            colResidueMaterialOther.setVisible(true);
            colDateOfDeliveryMaterialOther.setVisible(true);

            colActualCPMaterialOther.setVisible(true);
            colAccountMaterialOther.setVisible(true);

        } else {
            showMaterialOtherButton.setText("Показать");

            colActualCostMaterialOther.setVisible(false);
            colActualDifferenceMaterialOther.setVisible(false);
            colPaidMaterialOther.setVisible(false);
            colResidueMaterialOther.setVisible(false);
            colDateOfDeliveryMaterialOther.setVisible(false);

            colActualCPMaterialOther.setVisible(false);
            colAccountMaterialOther.setVisible(false);
        }
    }

    double sumPriceOrderMaterialSuddenly = 0.0;
    double sumCostCPMaterialSuddenly = 0.0;
    double sumActualCostMaterialSuddenly = 0.0;
    double sumActualDifferenceMaterialSuddenly = 0.0;
    double sumPaidMaterialSuddenly = 0.0;
    double sumResidueMaterialSuddenly = 0.0;

    public void On_tabCalculatorClickedActionMaterialSuddenly(ActionEvent actionEvent) {
        if (observableListMaterialSuddenly.filtered(x -> "0.0".equals(x.getQuantityMaterialSuddenly()) && "0.0".equals(x.getOrdinalPriceUnitMaterialSuddenly())).size() == 0) {
            observableListMaterialSuddenly.add(new MaterialSuddenly("", false, false, "", 0, 0,
                    0, 0, 0, 0, 0, "", 0, 0,
                    0, 0, "", "", "", "", "", "", "", ""));

            titleMaterialSuddenly.setText("Нежданчик        /Порядок цен: " + String.format("%.2f", sumPriceOrderMaterialSuddenly) + "        /Стоимость по КП: " + String.format("%.2f", sumCostCPMaterialSuddenly) +
                    "        /Стоимость фактическая: " + String.format("%.2f", sumActualCostMaterialSuddenly) + "        /Разница фактическая: " + String.format("%.2f", sumActualDifferenceMaterialSuddenly) +
                    "        /Оплачено: " + String.format("%.2f", sumPaidMaterialSuddenly) + "        /Остаток: " + String.format("%.2f", sumResidueMaterialSuddenly));
        }
    }

    public void deleteElementMaterialSuddenly(ActionEvent actionEvent) {
        ObservableList<MaterialSuddenly> allMaterialSuddenly, singleMaterialSuddenly;
        allMaterialSuddenly = materialTableViewSuddenly.getItems();
        singleMaterialSuddenly = materialTableViewSuddenly.getSelectionModel().getSelectedItems();
        singleMaterialSuddenly.forEach(allMaterialSuddenly::remove);
    }

    public void showMaterialSuddenly(ActionEvent actionEvent) {
        if (showMaterialSuddenlyButton.isSelected()) {
            showMaterialSuddenlyButton.setText("Скрыть");

            colActualCostMaterialSuddenly.setVisible(true);
            colActualDifferenceMaterialSuddenly.setVisible(true);
            colPaidMaterialSuddenly.setVisible(true);
            colResidueMaterialSuddenly.setVisible(true);
            colDateOfDeliveryMaterialSuddenly.setVisible(true);

            colActualCPMaterialSuddenly.setVisible(true);
            colAccountMaterialSuddenly.setVisible(true);

        } else {
            showMaterialSuddenlyButton.setText("Показать");

            colActualCostMaterialSuddenly.setVisible(false);
            colActualDifferenceMaterialSuddenly.setVisible(false);
            colPaidMaterialSuddenly.setVisible(false);
            colResidueMaterialSuddenly.setVisible(false);
            colDateOfDeliveryMaterialSuddenly.setVisible(false);

            colActualCPMaterialSuddenly.setVisible(false);
            colAccountMaterialSuddenly.setVisible(false);
        }
    }


    double sumPriceOrderFurnitureDelivery = 0.0;
    double sumCostCPFurnitureDelivery = 0.0;
    double sumActualCostFurnitureDelivery = 0.0;
    double sumActualDifferenceFurnitureDelivery = 0.0;
    double sumPaidFurnitureDelivery = 0.0;
    double sumResidueFurnitureDelivery = 0.0;

    public void On_tabCalculatorClickedActionFurnitureDelivery(ActionEvent actionEvent) {
        if (observableListFurnitureDelivery.filtered(x -> "0.0".equals(x.getQuantityFurnitureDelivery()) && "0.0".equals(x.getOrdinalPriceUnitFurnitureDelivery())).size() == 0) {
            observableListFurnitureDelivery.add(new FurnitureDelivery("", false, false, "", 0, 0,
                    0, 0, 0, 0, 0, "", 0, 0,
                    0, 0, "", "", "", "", "", "", "", ""));

            titleFurnitureDelivery.setText("Доставка/сборка        /Порядок цен: " + String.format("%.2f", sumPriceOrderFurnitureDelivery) + "        /Стоимость по КП: " + String.format("%.2f", sumCostCPFurnitureDelivery) +
                    "        /Стоимость фактическая: " + String.format("%.2f", sumActualCostFurnitureDelivery) + "        /Разница фактическая: " + String.format("%.2f", sumActualDifferenceFurnitureDelivery) +
                    "        /Оплачено: " + String.format("%.2f", sumPaidFurnitureDelivery) + "        /Остаток: " + String.format("%.2f", sumResidueFurnitureDelivery));
        }
    }

    public void deleteElementFurnitureDelivery(ActionEvent actionEvent) {
        ObservableList<FurnitureDelivery> allFurnitureDelivery, singleFurnitureDelivery;
        allFurnitureDelivery = furnitureTableViewDelivery.getItems();
        singleFurnitureDelivery = furnitureTableViewDelivery.getSelectionModel().getSelectedItems();
        singleFurnitureDelivery.forEach(allFurnitureDelivery::remove);
    }

    public void showFurnitureDelivery(ActionEvent actionEvent) {
        if (showFurnitureDeliveryButton.isSelected()) {
            showFurnitureDeliveryButton.setText("Скрыть");

            colActualCostFurnitureDelivery.setVisible(true);
            colActualDifferenceFurnitureDelivery.setVisible(true);
            colPaidFurnitureDelivery.setVisible(true);
            colResidueFurnitureDelivery.setVisible(true);
            colDateOfDeliveryFurnitureDelivery.setVisible(true);

            colActualCPFurnitureDelivery.setVisible(true);
            colAccountFurnitureDelivery.setVisible(true);

        } else {
            showFurnitureDeliveryButton.setText("Показать");

            colActualCostFurnitureDelivery.setVisible(false);
            colActualDifferenceFurnitureDelivery.setVisible(false);
            colPaidFurnitureDelivery.setVisible(false);
            colResidueFurnitureDelivery.setVisible(false);
            colDateOfDeliveryFurnitureDelivery.setVisible(false);

            colActualCPFurnitureDelivery.setVisible(false);
            colAccountFurnitureDelivery.setVisible(false);
        }
    }

    double sumPriceOrderFurnitureSuddenly = 0.0;
    double sumCostCPFurnitureSuddenly = 0.0;
    double sumActualCostFurnitureSuddenly = 0.0;
    double sumActualDifferenceFurnitureSuddenly = 0.0;
    double sumPaidFurnitureSuddenly = 0.0;
    double sumResidueFurnitureSuddenly = 0.0;

    public void On_tabCalculatorClickedActionFurnitureSuddenly(ActionEvent actionEvent) {
        if (observableListFurnitureSuddenly.filtered(x -> "0.0".equals(x.getQuantityFurnitureSuddenly()) && "0.0".equals(x.getOrdinalPriceUnitFurnitureSuddenly())).size() == 0) {
            observableListFurnitureSuddenly.add(new FurnitureSuddenly("", false, false, "", 0, 0,
                    0, 0, 0, 0, 0, "", 0, 0,
                    0, 0, "", "", "", "", "", "", "", ""));

            titleFurnitureSuddenly.setText("Нежданчик        /Порядок цен: " + String.format("%.2f", sumPriceOrderFurnitureSuddenly) + "        /Стоимость по КП: " + String.format("%.2f", sumCostCPFurnitureSuddenly) +
                    "        /Стоимость фактическая: " + String.format("%.2f", sumActualCostFurnitureSuddenly) + "        /Разница фактическая: " + String.format("%.2f", sumActualDifferenceFurnitureSuddenly) +
                    "        /Оплачено: " + String.format("%.2f", sumPaidFurnitureSuddenly) + "        /Остаток: " + String.format("%.2f", sumResidueFurnitureSuddenly));
        }
    }

    public void deleteElementFurnitureSuddenly(ActionEvent actionEvent) {
        ObservableList<FurnitureSuddenly> allFurnitureSuddenly, singleFurnitureSuddenly;
        allFurnitureSuddenly = furnitureTableViewSuddenly.getItems();
        singleFurnitureSuddenly = furnitureTableViewSuddenly.getSelectionModel().getSelectedItems();
        singleFurnitureSuddenly.forEach(allFurnitureSuddenly::remove);
    }

    public void showFurnitureSuddenly(ActionEvent actionEvent) {
        if (showFurnitureSuddenlyButton.isSelected()) {
            showFurnitureSuddenlyButton.setText("Скрыть");

            colActualCostFurnitureSuddenly.setVisible(true);
            colActualDifferenceFurnitureSuddenly.setVisible(true);
            colPaidFurnitureSuddenly.setVisible(true);
            colResidueFurnitureSuddenly.setVisible(true);
            colDateOfDeliveryFurnitureSuddenly.setVisible(true);

            colActualCPFurnitureSuddenly.setVisible(true);
            colAccountFurnitureSuddenly.setVisible(true);

        } else {
            showFurnitureSuddenlyButton.setText("Показать");

            colActualCostFurnitureSuddenly.setVisible(false);
            colActualDifferenceFurnitureSuddenly.setVisible(false);
            colPaidFurnitureSuddenly.setVisible(false);
            colResidueFurnitureSuddenly.setVisible(false);
            colDateOfDeliveryFurnitureSuddenly.setVisible(false);

            colActualCPFurnitureSuddenly.setVisible(false);
            colAccountFurnitureSuddenly.setVisible(false);
        }
    }

    double sumPriceOrderLightDelivery = 0.0;
    double sumCostCPLightDelivery = 0.0;
    double sumActualCostLightDelivery = 0.0;
    double sumActualDifferenceLightDelivery = 0.0;
    double sumPaidLightDelivery = 0.0;
    double sumResidueLightDelivery = 0.0;

    public void On_tabCalculatorClickedActionLightDelivery(ActionEvent actionEvent) {
        if (observableListLightDelivery.filtered(x -> "0.0".equals(x.getQuantityLightDelivery()) && "0.0".equals(x.getOrdinalPriceUnitLightDelivery())).size() == 0) {
            observableListLightDelivery.add(new LightDelivery("", false, false, "", 0, 0,
                    0, 0, 0, 0, 0, "", 0, 0,
                    0, 0, "", "", "", "", "", "", "", ""));

            titleLightDelivery.setText("Доставка/сборка        /Порядок цен: " + String.format("%.2f", sumPriceOrderLightDelivery) + "        /Стоимость по КП: " + String.format("%.2f", sumCostCPLightDelivery) +
                    "        /Стоимость фактическая: " + String.format("%.2f", sumActualCostLightDelivery) + "        /Разница фактическая: " + String.format("%.2f", sumActualDifferenceLightDelivery) +
                    "        /Оплачено: " + String.format("%.2f", sumPaidLightDelivery) + "        /Остаток: " + String.format("%.2f", sumResidueLightDelivery));
        }
    }

    public void deleteElementLightDelivery(ActionEvent actionEvent) {
        ObservableList<LightDelivery> allLightDelivery, singleLightDelivery;
        allLightDelivery = lightTableViewDelivery.getItems();
        singleLightDelivery = lightTableViewDelivery.getSelectionModel().getSelectedItems();
        singleLightDelivery.forEach(allLightDelivery::remove);
    }

    public void showLightDelivery(ActionEvent actionEvent) {
        if (showLightDeliveryButton.isSelected()) {
            showLightDeliveryButton.setText("Скрыть");

            colActualCostLightDelivery.setVisible(true);
            colActualDifferenceLightDelivery.setVisible(true);
            colPaidLightDelivery.setVisible(true);
            colResidueLightDelivery.setVisible(true);
            colDateOfDeliveryLightDelivery.setVisible(true);

            colActualCPLightDelivery.setVisible(true);
            colAccountLightDelivery.setVisible(true);

        } else {
            showLightDeliveryButton.setText("Показать");

            colActualCostLightDelivery.setVisible(false);
            colActualDifferenceLightDelivery.setVisible(false);
            colPaidLightDelivery.setVisible(false);
            colResidueLightDelivery.setVisible(false);
            colDateOfDeliveryLightDelivery.setVisible(false);

            colActualCPLightDelivery.setVisible(false);
            colAccountLightDelivery.setVisible(false);
        }
    }
    double sumPriceOrderLightSuddenly = 0.0;
    double sumCostCPLightSuddenly = 0.0;
    double sumActualCostLightSuddenly = 0.0;
    double sumActualDifferenceLightSuddenly = 0.0;
    double sumPaidLightSuddenly = 0.0;
    double sumResidueLightSuddenly = 0.0;

    public void On_tabCalculatorClickedActionLightSuddenly(ActionEvent actionEvent) {
        if (observableListLightSuddenly.filtered(x -> "0.0".equals(x.getQuantityLightSuddenly()) && "0.0".equals(x.getOrdinalPriceUnitLightSuddenly())).size() == 0) {
            observableListLightSuddenly.add(new LightSuddenly("", false, false, "", 0, 0,
                    0, 0, 0, 0, 0, "", 0, 0,
                    0, 0, "", "", "", "", "", "", "", ""));

            titleLightSuddenly.setText("Нежданчик        /Порядок цен: " + String.format("%.2f", sumPriceOrderLightSuddenly) + "        /Стоимость по КП: " + String.format("%.2f", sumCostCPLightSuddenly) +
                    "        /Стоимость фактическая: " + String.format("%.2f", sumActualCostLightSuddenly) + "        /Разница фактическая: " + String.format("%.2f", sumActualDifferenceLightSuddenly) +
                    "        /Оплачено: " + String.format("%.2f", sumPaidLightSuddenly) + "        /Остаток: " + String.format("%.2f", sumResidueLightSuddenly));
        }
    }

    public void deleteElementLightSuddenly(ActionEvent actionEvent) {
        ObservableList<LightSuddenly> allLightSuddenly, singleLightSuddenly;
        allLightSuddenly = lightTableViewSuddenly.getItems();
        singleLightSuddenly = lightTableViewSuddenly.getSelectionModel().getSelectedItems();
        singleLightSuddenly.forEach(allLightSuddenly::remove);
    }

    public void showLightSuddenly(ActionEvent actionEvent) {
        if (showLightSuddenlyButton.isSelected()) {
            showLightSuddenlyButton.setText("Скрыть");

            colActualCostLightSuddenly.setVisible(true);
            colActualDifferenceLightSuddenly.setVisible(true);
            colPaidLightSuddenly.setVisible(true);
            colResidueLightSuddenly.setVisible(true);
            colDateOfDeliveryLightSuddenly.setVisible(true);

            colActualCPLightSuddenly.setVisible(true);
            colAccountLightSuddenly.setVisible(true);

        } else {
            showLightSuddenlyButton.setText("Показать");

            colActualCostLightSuddenly.setVisible(false);
            colActualDifferenceLightSuddenly.setVisible(false);
            colPaidLightSuddenly.setVisible(false);
            colResidueLightSuddenly.setVisible(false);
            colDateOfDeliveryLightSuddenly.setVisible(false);

            colActualCPLightSuddenly.setVisible(false);
            colAccountLightSuddenly.setVisible(false);
        }
    }
    double sumPriceOrderAppliancesKitchen = 0.0;
    double sumCostCPAppliancesKitchen = 0.0;
    double sumActualCostAppliancesKitchen = 0.0;
    double sumActualDifferenceAppliancesKitchen = 0.0;
    double sumPaidAppliancesKitchen = 0.0;
    double sumResidueAppliancesKitchen = 0.0;

    public void On_tabCalculatorClickedActionAppliancesKitchen(ActionEvent actionEvent) {
        if (observableListAppliancesKitchen.filtered(x -> "0.0".equals(x.getQuantityAppliancesKitchen()) && "0.0".equals(x.getOrdinalPriceUnitAppliancesKitchen())).size() == 0) {
            observableListAppliancesKitchen.add(new AppliancesKitchen("", false, false, "", 0, 0,
                    0, 0, 0, 0, 0, "", 0, 0,
                    0, 0, "", "", "", "", "", "", "", ""));

            titleAppliancesKitchen.setText("Кухонная техника        /Порядок цен: " + String.format("%.2f", sumPriceOrderAppliancesKitchen) + "        /Стоимость по КП: " + String.format("%.2f", sumCostCPAppliancesKitchen) +
                    "        /Стоимость фактическая: " + String.format("%.2f", sumActualCostAppliancesKitchen) + "        /Разница фактическая: " + String.format("%.2f", sumActualDifferenceAppliancesKitchen) +
                    "        /Оплачено: " + String.format("%.2f", sumPaidAppliancesKitchen) + "        /Остаток: " + String.format("%.2f", sumResidueAppliancesKitchen));
        }
    }

    public void deleteElementAppliancesKitchen(ActionEvent actionEvent) {
        ObservableList<AppliancesKitchen> allAppliancesKitchen, singleAppliancesKitchen;
        allAppliancesKitchen = appliancesTableViewKitchen.getItems();
        singleAppliancesKitchen = appliancesTableViewKitchen.getSelectionModel().getSelectedItems();
        singleAppliancesKitchen.forEach(allAppliancesKitchen::remove);
    }

    public void showAppliancesKitchen(ActionEvent actionEvent) {
        if (showAppliancesKitchenButton.isSelected()) {
            showAppliancesKitchenButton.setText("Скрыть");

            colActualCostAppliancesKitchen.setVisible(true);
            colActualDifferenceAppliancesKitchen.setVisible(true);
            colPaidAppliancesKitchen.setVisible(true);
            colResidueAppliancesKitchen.setVisible(true);
            colDateOfDeliveryAppliancesKitchen.setVisible(true);

            colActualCPAppliancesKitchen.setVisible(true);
            colAccountAppliancesKitchen.setVisible(true);

        } else {
            showAppliancesKitchenButton.setText("Показать");

            colActualCostAppliancesKitchen.setVisible(false);
            colActualDifferenceAppliancesKitchen.setVisible(false);
            colPaidAppliancesKitchen.setVisible(false);
            colResidueAppliancesKitchen.setVisible(false);
            colDateOfDeliveryAppliancesKitchen.setVisible(false);

            colActualCPAppliancesKitchen.setVisible(false);
            colAccountAppliancesKitchen.setVisible(false);
        }
    }

    double sumPriceOrderAppliancesOther = 0.0;
    double sumCostCPAppliancesOther = 0.0;
    double sumActualCostAppliancesOther = 0.0;
    double sumActualDifferenceAppliancesOther = 0.0;
    double sumPaidAppliancesOther = 0.0;
    double sumResidueAppliancesOther = 0.0;

    public void On_tabCalculatorClickedActionAppliancesOther(ActionEvent actionEvent) {
        if (observableListAppliancesOther.filtered(x -> "0.0".equals(x.getQuantityAppliancesOther()) && "0.0".equals(x.getOrdinalPriceUnitAppliancesOther())).size() == 0) {
            observableListAppliancesOther.add(new AppliancesOther("", false, false, "", 0, 0,
                    0, 0, 0, 0, 0, "", 0, 0,
                    0, 0, "", "", "", "", "", "", "", ""));

            titleAppliancesOther.setText("Другая техника        /Порядок цен: " + String.format("%.2f", sumPriceOrderAppliancesOther) + "        /Стоимость по КП: " + String.format("%.2f", sumCostCPAppliancesOther) +
                    "        /Стоимость фактическая: " + String.format("%.2f", sumActualCostAppliancesOther) + "        /Разница фактическая: " + String.format("%.2f", sumActualDifferenceAppliancesOther) +
                    "        /Оплачено: " + String.format("%.2f", sumPaidAppliancesOther) + "        /Остаток: " + String.format("%.2f", sumResidueAppliancesOther));

        }
    }

    public void deleteElementAppliancesOther(ActionEvent actionEvent) {
        ObservableList<AppliancesOther> allAppliancesOther, singleAppliancesOther;
        allAppliancesOther = appliancesTableViewOther.getItems();
        singleAppliancesOther = appliancesTableViewOther.getSelectionModel().getSelectedItems();
        singleAppliancesOther.forEach(allAppliancesOther::remove);
    }

    public void showAppliancesOther(ActionEvent actionEvent) {
        if (showAppliancesOtherButton.isSelected()) {
            showAppliancesOtherButton.setText("Скрыть");

            colActualCostAppliancesOther.setVisible(true);
            colActualDifferenceAppliancesOther.setVisible(true);
            colPaidAppliancesOther.setVisible(true);
            colResidueAppliancesOther.setVisible(true);
            colDateOfDeliveryAppliancesOther.setVisible(true);

            colActualCPAppliancesOther.setVisible(true);
            colAccountAppliancesOther.setVisible(true);

        } else {
            showAppliancesOtherButton.setText("Показать");

            colActualCostAppliancesOther.setVisible(false);
            colActualDifferenceAppliancesOther.setVisible(false);
            colPaidAppliancesOther.setVisible(false);
            colResidueAppliancesOther.setVisible(false);
            colDateOfDeliveryAppliancesOther.setVisible(false);

            colActualCPAppliancesOther.setVisible(false);
            colAccountAppliancesOther.setVisible(false);
        }
    }

    double sumPriceOrderAppliancesDelivery = 0.0;
    double sumCostCPAppliancesDelivery = 0.0;
    double sumActualCostAppliancesDelivery = 0.0;
    double sumActualDifferenceAppliancesDelivery = 0.0;
    double sumPaidAppliancesDelivery = 0.0;
    double sumResidueAppliancesDelivery = 0.0;

    public void On_tabCalculatorClickedActionAppliancesDelivery(ActionEvent actionEvent) {
        if (observableListAppliancesDelivery.filtered(x -> "0.0".equals(x.getQuantityAppliancesDelivery()) && "0.0".equals(x.getOrdinalPriceUnitAppliancesDelivery())).size() == 0) {
            observableListAppliancesDelivery.add(new AppliancesDelivery("", false, false, "", 0, 0,
                    0, 0, 0, 0, 0, "", 0, 0,
                    0, 0, "", "", "", "", "", "", "", ""));

            titleAppliancesDelivery.setText("Доставка/сборка        /Порядок цен: " + String.format("%.2f", sumPriceOrderAppliancesDelivery) + "        /Стоимость по КП: " + String.format("%.2f", sumCostCPAppliancesDelivery) +
                    "        /Стоимость фактическая: " + String.format("%.2f", sumActualCostAppliancesDelivery) + "        /Разница фактическая: " + String.format("%.2f", sumActualDifferenceAppliancesDelivery) +
                    "        /Оплачено: " + String.format("%.2f", sumPaidAppliancesDelivery) + "        /Остаток: " + String.format("%.2f", sumResidueAppliancesDelivery));

        }
    }

    public void deleteElementAppliancesDelivery(ActionEvent actionEvent) {
        ObservableList<AppliancesDelivery> allAppliancesDelivery, singleAppliancesDelivery;
        allAppliancesDelivery = appliancesTableViewDelivery.getItems();
        singleAppliancesDelivery = appliancesTableViewDelivery.getSelectionModel().getSelectedItems();
        singleAppliancesDelivery.forEach(allAppliancesDelivery::remove);
    }

    public void showAppliancesDelivery(ActionEvent actionEvent) {
        if (showAppliancesDeliveryButton.isSelected()) {
            showAppliancesDeliveryButton.setText("Скрыть");

            colActualCostAppliancesDelivery.setVisible(true);
            colActualDifferenceAppliancesDelivery.setVisible(true);
            colPaidAppliancesDelivery.setVisible(true);
            colResidueAppliancesDelivery.setVisible(true);
            colDateOfDeliveryAppliancesDelivery.setVisible(true);

            colActualCPAppliancesDelivery.setVisible(true);
            colAccountAppliancesDelivery.setVisible(true);

        } else {
            showAppliancesDeliveryButton.setText("Показать");

            colActualCostAppliancesDelivery.setVisible(false);
            colActualDifferenceAppliancesDelivery.setVisible(false);
            colPaidAppliancesDelivery.setVisible(false);
            colResidueAppliancesDelivery.setVisible(false);
            colDateOfDeliveryAppliancesDelivery.setVisible(false);

            colActualCPAppliancesDelivery.setVisible(false);
            colAccountAppliancesDelivery.setVisible(false);
        }
    }

    double sumPriceOrderAppliancesSuddenly = 0.0;
    double sumCostCPAppliancesSuddenly = 0.0;
    double sumActualCostAppliancesSuddenly = 0.0;
    double sumActualDifferenceAppliancesSuddenly = 0.0;
    double sumPaidAppliancesSuddenly = 0.0;
    double sumResidueAppliancesSuddenly = 0.0;

    public void On_tabCalculatorClickedActionAppliancesSuddenly(ActionEvent actionEvent) {
        if (observableListAppliancesSuddenly.filtered(x -> "0.0".equals(x.getQuantityAppliancesSuddenly()) && "0.0".equals(x.getOrdinalPriceUnitAppliancesSuddenly())).size() == 0) {
            observableListAppliancesSuddenly.add(new AppliancesSuddenly("", false, false, "", 0, 0,
                    0, 0, 0, 0, 0, "", 0, 0,
                    0, 0, "", "", "", "", "", "", "", ""));

            titleAppliancesSuddenly.setText("Нежданчик        /Порядок цен: " + String.format("%.2f", sumPriceOrderAppliancesSuddenly) + "        /Стоимость по КП: " + String.format("%.2f", sumCostCPAppliancesSuddenly) +
                    "        /Стоимость фактическая: " + String.format("%.2f", sumActualCostAppliancesSuddenly) + "        /Разница фактическая: " + String.format("%.2f", sumActualDifferenceAppliancesSuddenly) +
                    "        /Оплачено: " + String.format("%.2f", sumPaidAppliancesSuddenly) + "        /Остаток: " + String.format("%.2f", sumResidueAppliancesSuddenly));
        }
    }

    public void deleteElementAppliancesSuddenly(ActionEvent actionEvent) {
        ObservableList<AppliancesSuddenly> allAppliancesSuddenly, singleAppliancesSuddenly;
        allAppliancesSuddenly = appliancesTableViewSuddenly.getItems();
        singleAppliancesSuddenly = appliancesTableViewSuddenly.getSelectionModel().getSelectedItems();
        singleAppliancesSuddenly.forEach(allAppliancesSuddenly::remove);
    }

    public void showAppliancesSuddenly(ActionEvent actionEvent) {
        if (showAppliancesSuddenlyButton.isSelected()) {
            showAppliancesSuddenlyButton.setText("Скрыть");

            colActualCostAppliancesSuddenly.setVisible(true);
            colActualDifferenceAppliancesSuddenly.setVisible(true);
            colPaidAppliancesSuddenly.setVisible(true);
            colResidueAppliancesSuddenly.setVisible(true);
            colDateOfDeliveryAppliancesSuddenly.setVisible(true);

            colActualCPAppliancesSuddenly.setVisible(true);
            colAccountAppliancesSuddenly.setVisible(true);


//            for (AppliancesSuddenly d : colQuantityAppliancesSuddenly) {
//                sumPriceOrderAppliancesSuddenly += Double.parseDouble(d.getQuantityAppliancesSuddenly());
//                System.out.println("Tect");
//            }


//            for (TableColumn<AppliancesSuddenly, ?> d : colQuantityAppliancesSuddenly.getColumns()) {
//            for (AppliancesSuddenly d : colQuantityAppliancesSuddenly.getColumns()) {

//            for (AppliancesSuddenly d : colQuantityAppliancesSuddenly.get) {
//                System.out.println(d);
//            }


//            titleAppliancesSuddenly.setText(String.format("%.2f", sumPriceOrderAppliancesSuddenly));

        } else {
            showAppliancesSuddenlyButton.setText("Показать");

            colActualCostAppliancesSuddenly.setVisible(false);
            colActualDifferenceAppliancesSuddenly.setVisible(false);
            colPaidAppliancesSuddenly.setVisible(false);
            colResidueAppliancesSuddenly.setVisible(false);
            colDateOfDeliveryAppliancesSuddenly.setVisible(false);

            colActualCPAppliancesSuddenly.setVisible(false);
            colAccountAppliancesSuddenly.setVisible(false);
        }
    }
    double sumPriceOrderDecorationDelivery = 0.0;
    double sumCostCPDecorationDelivery = 0.0;
    double sumActualCostDecorationDelivery = 0.0;
    double sumActualDifferenceDecorationDelivery = 0.0;
    double sumPaidDecorationDelivery = 0.0;
    double sumResidueDecorationDelivery = 0.0;

    public void On_tabCalculatorClickedActionDecorationDelivery(ActionEvent actionEvent) {
        if (observableListDecorationDelivery.filtered(x -> "0.0".equals(x.getQuantityDecorationDelivery()) && "0.0".equals(x.getOrdinalPriceUnitDecorationDelivery())).size() == 0) {
            observableListDecorationDelivery.add(new DecorationDelivery("", false, false, "", 0, 0,
                    0, 0, 0, 0, 0, "", 0, 0,
                    0, 0, "", "", "", "", "", "", "", ""));

            titleDecorationDelivery.setText("Доставка/сборка        /Порядок цен: " + String.format("%.2f", sumPriceOrderDecorationDelivery) + "        /Стоимость по КП: " + String.format("%.2f", sumCostCPDecorationDelivery) +
                    "        /Стоимость фактическая: " + String.format("%.2f", sumActualCostDecorationDelivery) + "        /Разница фактическая: " + String.format("%.2f", sumActualDifferenceDecorationDelivery) +
                    "        /Оплачено: " + String.format("%.2f", sumPaidDecorationDelivery) + "        /Остаток: " + String.format("%.2f", sumResidueDecorationDelivery));
        }
    }

    public void deleteElementDecorationDelivery(ActionEvent actionEvent) {
        ObservableList<DecorationDelivery> allDecorationDelivery, singleDecorationDelivery;
        allDecorationDelivery = decorationTableViewDelivery.getItems();
        singleDecorationDelivery = decorationTableViewDelivery.getSelectionModel().getSelectedItems();
        singleDecorationDelivery.forEach(allDecorationDelivery::remove);
    }

    public void showDecorationDelivery(ActionEvent actionEvent) {
        if (showDecorationDeliveryButton.isSelected()) {
            showDecorationDeliveryButton.setText("Скрыть");

            colActualCostDecorationDelivery.setVisible(true);
            colActualDifferenceDecorationDelivery.setVisible(true);
            colPaidDecorationDelivery.setVisible(true);
            colResidueDecorationDelivery.setVisible(true);
            colDateOfDeliveryDecorationDelivery.setVisible(true);

            colActualCPDecorationDelivery.setVisible(true);
            colAccountDecorationDelivery.setVisible(true);

        } else {
            showDecorationDeliveryButton.setText("Показать");

            colActualCostDecorationDelivery.setVisible(false);
            colActualDifferenceDecorationDelivery.setVisible(false);
            colPaidDecorationDelivery.setVisible(false);
            colResidueDecorationDelivery.setVisible(false);
            colDateOfDeliveryDecorationDelivery.setVisible(false);

            colActualCPDecorationDelivery.setVisible(false);
            colAccountDecorationDelivery.setVisible(false);
        }
    }

    double sumPriceOrderDecorationSuddenly = 0.0;
    double sumCostCPDecorationSuddenly = 0.0;
    double sumActualCostDecorationSuddenly = 0.0;
    double sumActualDifferenceDecorationSuddenly = 0.0;
    double sumPaidDecorationSuddenly = 0.0;
    double sumResidueDecorationSuddenly = 0.0;

    public void On_tabCalculatorClickedActionDecorationSuddenly(ActionEvent actionEvent) {
        if (observableListDecorationSuddenly.filtered(x -> "0.0".equals(x.getQuantityDecorationSuddenly()) && "0.0".equals(x.getOrdinalPriceUnitDecorationSuddenly())).size() == 0) {
            observableListDecorationSuddenly.add(new DecorationSuddenly("", false, false, "", 0, 0,
                    0, 0, 0, 0, 0, "", 0, 0,
                    0, 0, "", "", "", "", "", "", "", ""));

            titleDecorationSuddenly.setText("Нежданчик        /Порядок цен: " + String.format("%.2f", sumPriceOrderDecorationSuddenly) + "        /Стоимость по КП: " + String.format("%.2f", sumCostCPDecorationSuddenly) +
                    "        /Стоимость фактическая: " + String.format("%.2f", sumActualCostDecorationSuddenly) + "        /Разница фактическая: " + String.format("%.2f", sumActualDifferenceDecorationSuddenly) +
                    "        /Оплачено: " + String.format("%.2f", sumPaidDecorationSuddenly) + "        /Остаток: " + String.format("%.2f", sumResidueDecorationSuddenly));
        }
    }

    public void deleteElementDecorationSuddenly(ActionEvent actionEvent) {
        ObservableList<DecorationSuddenly> allDecorationSuddenly, singleDecorationSuddenly;
        allDecorationSuddenly = decorationTableViewSuddenly.getItems();
        singleDecorationSuddenly = decorationTableViewSuddenly.getSelectionModel().getSelectedItems();
        singleDecorationSuddenly.forEach(allDecorationSuddenly::remove);
    }

    public void showDecorationSuddenly(ActionEvent actionEvent) {
        if (showDecorationSuddenlyButton.isSelected()) {
            showDecorationSuddenlyButton.setText("Скрыть");

            colActualCostDecorationSuddenly.setVisible(true);
            colActualDifferenceDecorationSuddenly.setVisible(true);
            colPaidDecorationSuddenly.setVisible(true);
            colResidueDecorationSuddenly.setVisible(true);
            colDateOfDeliveryDecorationSuddenly.setVisible(true);

            colActualCPDecorationSuddenly.setVisible(true);
            colAccountDecorationSuddenly.setVisible(true);

        } else {
            showDecorationSuddenlyButton.setText("Показать");

            colActualCostDecorationSuddenly.setVisible(false);
            colActualDifferenceDecorationSuddenly.setVisible(false);
            colPaidDecorationSuddenly.setVisible(false);
            colResidueDecorationSuddenly.setVisible(false);
            colDateOfDeliveryDecorationSuddenly.setVisible(false);

            colActualCPDecorationSuddenly.setVisible(false);
            colAccountDecorationSuddenly.setVisible(false);
        }
    }
}
