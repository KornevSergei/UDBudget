package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.css.ParsedValue;
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
import javafx.scene.layout.VBox;
import javafx.scene.paint.Material;
import javafx.util.Callback;
import javafx.util.StringConverter;

import javax.xml.crypto.Data;
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
    public TextField roomSelectBathRoomTextField;
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
    //    public TableColumn<AppliancesSuddenly, Double> colQuantityAppliancesSuddenly;
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
        roomSelectBathRoomTextField.setVisible(true);
        addRoomButton.setVisible(true);
    }

    public void addRoom(ActionEvent actionEvent) {
        roomNameTextField.setVisible(false);
        roomAreaTextField.setVisible(false);
        roomSelectBathRoomTextField.setVisible(false);
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
//    public void saveRoomElement(TableColumn.CellEditEvent<Room, String> event) {

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


        //Добавили из цикла во вкладки
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


        //Не забыть доделать кнопки
        Button qwe = new Button("Чего то там");
        ToggleButton qwer = new ToggleButton("qwertyuiop");

//        titledPane.setContent(qwe);

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
        TableColumn<Room, String> colAccountMRoomTransmit = new TableColumn<>("Счёт");
        TableColumn<Room, String> colContactsRoomTransmit = new TableColumn<>("Контакты");
        TableColumn<Room, String> colNotesRoomTransmit = new TableColumn<>("Примечания");
        TableColumn<Room, String> colCharacteristicsRoomTransmit = new TableColumn<>("Характеристики");

//        //Вызоваем методы
        initStringColumn(colNameRoomTransmit, colPlannedCPRoomTransmit, colActualCPRoomTransmit, colAccountMRoomTransmit, colContactsRoomTransmit, colNotesRoomTransmit, colCharacteristicsRoomTransmit,colQuantityRoomTransmit, colOrdinalPriceUnitRoomTransmit, colPriceCPUnitRoomTransmit, colPriceCPKeyRoomTransmit, colCostCPUnitRoomTransmit, colPriceOrderRoomTransmit, colCostCPRoomTransmit, colActualCostRoomTransmit, colActualDifferenceRoomTransmit, colPaidRoomTransmit, colResidueRoomTransmit);
//        initDoubleColumn(colQuantityRoomTransmit, colOrdinalPriceUnitRoomTransmit, colPriceCPUnitRoomTransmit, colPriceCPKeyRoomTransmit, colCostCPUnitRoomTransmit, colPriceOrderRoomTransmit, colCostCPRoomTransmit, colActualCostRoomTransmit, colActualDifferenceRoomTransmit, colPaidRoomTransmit, colResidueRoomTransmit);
        initBooleanColumn(colActivePRoomTransmit, colActiveCRoomTransmit);
        initUnitTypeColumn(colUnitRoomTransmit);
        initTimeProductionColumn(colProductionTimeRoomTransmit);
        initDataColumn(colDateOfDeliveryRoomTransmit);

        tableViewRoomTransmit.getColumns().addAll(colNameRoomTransmit, colActivePRoomTransmit, colActiveCRoomTransmit, colUnitRoomTransmit,
                colQuantityRoomTransmit, colOrdinalPriceUnitRoomTransmit, colPriceCPUnitRoomTransmit, colPriceCPKeyRoomTransmit,
                colCostCPUnitRoomTransmit, colPriceOrderRoomTransmit, colCostCPRoomTransmit, colProductionTimeRoomTransmit, colActualCostRoomTransmit,
                colActualDifferenceRoomTransmit, colPaidRoomTransmit, colResidueRoomTransmit, colDateOfDeliveryRoomTransmit, colPlannedCPRoomTransmit,
                colActualCPRoomTransmit, colAccountMRoomTransmit, colContactsRoomTransmit, colNotesRoomTransmit, colCharacteristicsRoomTransmit);


        return tableViewRoomTransmit;
    }

    private void initStringColumn(TableColumn<Room, String> colNameRoomTransmit, TableColumn<Room, String> colPlannedCPRoomTransmit, TableColumn<Room, String> colActualCPRoomTransmit,
                                  TableColumn<Room, String> colAccountMRoomTransmit, TableColumn<Room, String> colContactsRoomTransmit, TableColumn<Room, String> colNotesRoomTransmit,
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

        colAccountMRoomTransmit.setCellValueFactory(new PropertyValueFactory<Room, String>("Счёт"));
        colAccountMRoomTransmit.setCellFactory(TextFieldTableCell.<Room>forTableColumn());
        colAccountMRoomTransmit.setOnEditCommit(this::onStringClick);

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
        updatedRoom.setNameRoomTransmit(comments);
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

//        updatedRoom.setRoom(room);
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


    public void On_tabCalculatorClickedSubcontractors(MouseEvent mouseEvent) {
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

    double sumPriceOrderMaterialWall = 0.0;
    double sumCostCPMaterialWall = 0.0;
    double sumActualCostMaterialWall = 0.0;
    double sumActualDifferenceMaterialWall = 0.0;
    double sumPaidMaterialWall = 0.0;
    double sumResidueMaterialWall = 0.0;


    public void On_tabCalculatorClickedActionMaterialWall(MouseEvent mouseEvent) {
        if (observableListMaterialWall.filtered(x -> "0.0".equals(x.getQuantityMaterialWall()) && "0.0".equals(x.getOrdinalPriceUnitMaterialWall())).size() == 0) {
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

    public void On_tabCalculatorClickedActionMaterialFloor(MouseEvent mouseEvent) {
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

    public void On_tabCalculatorClickedActionMaterialCeiling(MouseEvent mouseEvent) {
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

    public void On_tabCalculatorClickedActionMaterialOther(MouseEvent mouseEvent) {
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

    public void On_tabCalculatorClickedActionMaterialSuddenly(MouseEvent mouseEvent) {
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


    double sumPriceOrderAppliancesKitchen = 0.0;
    double sumCostCPAppliancesKitchen = 0.0;
    double sumActualCostAppliancesKitchen = 0.0;
    double sumActualDifferenceAppliancesKitchen = 0.0;
    double sumPaidAppliancesKitchen = 0.0;
    double sumResidueAppliancesKitchen = 0.0;

    public void On_tabCalculatorClickedActionAppliancesKitchen(MouseEvent mouseEvent) {
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

    public void On_tabCalculatorClickedActionAppliancesOther(MouseEvent mouseEvent) {
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

    public void On_tabCalculatorClickedActionAppliancesDelivery(MouseEvent mouseEvent) {
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

    public void On_tabCalculatorClickedActionAppliancesSuddenly(MouseEvent mouseEvent) {
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

    public void On_tabCalculatorClickedActionDecorationSuddenly(MouseEvent mouseEvent) {
    }

    public void deleteElementDecorationSuddenly(ActionEvent actionEvent) {
    }

    public void showDecorationSuddenly(ActionEvent actionEvent) {
    }
}
