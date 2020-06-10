package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;


public class EditProjectController implements Initializable {

    public TabPane tabPane;

    public Tab fileView;
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


    public TableView<Room> roomTableView;
    public TableColumn<Room, String> colNameRoom;
    public TableColumn<Room, String> colAreaRoom;
    public TableColumn<Room, Boolean> colSelectBathRoom;
    public ObservableList<Room> observableListRoom = FXCollections.observableArrayList();

    public TextField createProjectTextField;
    public Button createProjectButton;
    public Button selectProjectButton;
    public Button addProjectButton;
    public Button startProject;


    public TextField roomNameTextField;
    public TextField roomAreaTextField;
    public TextField roomSelectBathRoomTextField;
    public Button addRoomButton;
    public Button deleteProjectButton;


    public Button saveRoomButton;


    public int counterPlumping = 0;

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

    public void createProject(ActionEvent actionEvent) {
        createProjectTextField.setVisible(true);
        addProjectButton.setVisible(true);

    }

    public void addProject(ActionEvent actionEvent) {
        startProject.setVisible(true);
        deleteProjectButton.setVisible(true);
    }

    public void selectProject(ActionEvent actionEvent) {
        startProject.setVisible(true);
        deleteProjectButton.setVisible(true);
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
        colNameRoom.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<Room, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<Room, String> t) {
                        ((Room) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setNameRoom(t.getNewValue());
                    }
                });
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

        roomTableView.setEditable(true);
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
        colUnitMaterialOther.setCellValueFactory(new PropertyValueFactory<>("unitMaterialOther"));
        colUnitMaterialOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialOther, String> t) {
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
        colProductionTimeMaterialOther.setCellFactory(cellFactoryDoubleMaterialOther);
        colProductionTimeMaterialOther.setCellValueFactory(new PropertyValueFactory<>("productionTimeMaterialOther"));
        colProductionTimeMaterialOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialOther, String> t) {
                        ((MaterialOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setProductionTimeMaterialOther(t.getNewValue());
                        t.getTableView().refresh();
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
        colDateOfDeliveryMaterialOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialOther, String> t) {
                        ((MaterialOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setDateOfDeliveryMaterialOther(t.getNewValue());
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

        materialTableViewOther.setEditable(true);
        colNameMaterialOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colUnitMaterialOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colProductionTimeMaterialOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colDateOfDeliveryMaterialOther.setCellFactory(TextFieldTableCell.forTableColumn());
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
        colUnitMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("unitMaterialSuddenly"));
        colUnitMaterialSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialSuddenly, String> t) {
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
        colProductionTimeMaterialSuddenly.setCellFactory(cellFactoryDoubleMaterialSuddenly);
        colProductionTimeMaterialSuddenly.setCellValueFactory(new PropertyValueFactory<>("productionTimeMaterialSuddenly"));
        colProductionTimeMaterialSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialSuddenly, String> t) {
                        ((MaterialSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setProductionTimeMaterialSuddenly(t.getNewValue());
                        t.getTableView().refresh();
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
        colDateOfDeliveryMaterialSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<MaterialSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<MaterialSuddenly, String> t) {
                        ((MaterialSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setDateOfDeliveryMaterialSuddenly(t.getNewValue());
                        t.getTableView().refresh();
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

        materialTableViewSuddenly.setEditable(true);
        colNameMaterialSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colUnitMaterialSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colProductionTimeMaterialSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colDateOfDeliveryMaterialSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
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
        colUnitAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("unitAppliancesKitchen"));
        colUnitAppliancesKitchen.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesKitchen, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesKitchen, String> t) {
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
        colProductionTimeAppliancesKitchen.setCellFactory(cellFactoryDoubleAppliancesKitchen);
        colProductionTimeAppliancesKitchen.setCellValueFactory(new PropertyValueFactory<>("productionTimeAppliancesKitchen"));
        colProductionTimeAppliancesKitchen.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesKitchen, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesKitchen, String> t) {
                        ((AppliancesKitchen) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setProductionTimeAppliancesKitchen(t.getNewValue());
                        t.getTableView().refresh();
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
        colDateOfDeliveryAppliancesKitchen.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesKitchen, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesKitchen, String> t) {
                        ((AppliancesKitchen) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setDateOfDeliveryAppliancesKitchen(t.getNewValue());
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

        appliancesTableViewKitchen.setEditable(true);
        colNameAppliancesKitchen.setCellFactory(TextFieldTableCell.forTableColumn());
        colUnitAppliancesKitchen.setCellFactory(TextFieldTableCell.forTableColumn());
        colProductionTimeAppliancesKitchen.setCellFactory(TextFieldTableCell.forTableColumn());
        colDateOfDeliveryAppliancesKitchen.setCellFactory(TextFieldTableCell.forTableColumn());
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
        colUnitAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("unitAppliancesOther"));
        colUnitAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
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
                        ((AppliancesOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setOrdinalPriceUnitAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPUnitAppliancesOther.setCellFactory(cellFactoryDoubleAppliancesOther);
        colPriceCPUnitAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("priceCPUnitAppliancesOther"));
        colPriceCPUnitAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        ((AppliancesOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPriceCPUnitAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPKeyAppliancesOther.setCellFactory(cellFactoryDoubleAppliancesOther);
        colPriceCPKeyAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("priceCPKeyAppliancesOther"));
        colPriceCPKeyAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        ((AppliancesOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPriceCPKeyAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPUnitAppliancesOther.setCellFactory(cellFactoryDoubleAppliancesOther);
        colCostCPUnitAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("costCPUnitAppliancesOther"));
        colCostCPUnitAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        ((AppliancesOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setCostCPUnitAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceOrderAppliancesOther.setCellFactory(cellFactoryDoubleAppliancesOther);
        colPriceOrderAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("priceOrderAppliancesOther"));
        colPriceOrderAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        ((AppliancesOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPriceOrderAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPAppliancesOther.setCellFactory(cellFactoryDoubleAppliancesOther);
        colCostCPAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("costCPAppliancesOther"));
        colCostCPAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        ((AppliancesOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setCostCPAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colProductionTimeAppliancesOther.setCellFactory(cellFactoryDoubleAppliancesOther);
        colProductionTimeAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("productionTimeAppliancesOther"));
        colProductionTimeAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        ((AppliancesOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setProductionTimeAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualCostAppliancesOther.setCellFactory(cellFactoryDoubleAppliancesOther);
        colActualCostAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("actualCostAppliancesOther"));
        colActualCostAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        ((AppliancesOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActualCostAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualDifferenceAppliancesOther.setCellFactory(cellFactoryDoubleAppliancesOther);
        colActualDifferenceAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("actualDifferenceAppliancesOther"));
        colActualDifferenceAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        ((AppliancesOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActualDifferenceAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPaidAppliancesOther.setCellFactory(cellFactoryDoubleAppliancesOther);
        colPaidAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("paidAppliancesOther"));
        colPaidAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        ((AppliancesOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPaidAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colResidueAppliancesOther.setCellFactory(cellFactoryDoubleAppliancesOther);
        colResidueAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("residueAppliancesOther"));
        colResidueAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        ((AppliancesOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setResidueAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colDateOfDeliveryAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("dateOfDeliveryAppliancesOther"));
        colDateOfDeliveryAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        ((AppliancesOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setDateOfDeliveryAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPlannedCPAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("plannedCPAppliancesOther"));
        colPlannedCPAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        ((AppliancesOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPlannedCPAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualCPAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("actualCPAppliancesOther"));
        colActualCPAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        ((AppliancesOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActualCPAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colAccountAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("accountAppliancesOther"));
        colAccountAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        ((AppliancesOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setAccountAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colContactsAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("contactsAppliancesOther"));
        colContactsAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        ((AppliancesOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setContactsAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colNotesAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("notesAppliancesOther"));
        colNotesAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        ((AppliancesOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setNotesAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCharacteristicsAppliancesOther.setCellValueFactory(new PropertyValueFactory<>("characteristicsAppliancesOther"));
        colCharacteristicsAppliancesOther.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesOther, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesOther, String> t) {
                        ((AppliancesOther) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setCharacteristicsAppliancesOther(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });

        appliancesTableViewOther.setEditable(true);
        colNameAppliancesOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colUnitAppliancesOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colProductionTimeAppliancesOther.setCellFactory(TextFieldTableCell.forTableColumn());
        colDateOfDeliveryAppliancesOther.setCellFactory(TextFieldTableCell.forTableColumn());
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
                        ((AppliancesDelivery) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setNameAppliancesDelivery(t.getNewValue());
                    }
                });
        colActivePAppliancesDelivery.setCellFactory(cellFactoryCheckboxAppliancesDelivery);
        colActivePAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("activePAppliancesDelivery"));
        colActivePAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, Boolean> t) {
                        ((AppliancesDelivery) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActivePAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActiveCAppliancesDelivery.setCellFactory(cellFactoryCheckboxAppliancesDelivery);
        colActiveCAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("activeCAppliancesDelivery"));
        colActiveCAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, Boolean> t) {
                        ((AppliancesDelivery) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActiveCAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colUnitAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("unitAppliancesDelivery"));
        colUnitAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        ((AppliancesDelivery) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setUnitAppliancesDelivery(t.getNewValue());
                    }
                });
        colQuantityAppliancesDelivery.setCellFactory(cellFactoryDoubleAppliancesDelivery);
        colQuantityAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("quantityAppliancesDelivery"));
        colQuantityAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        ((AppliancesDelivery) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setQuantityAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colOrdinalPriceUnitAppliancesDelivery.setCellFactory(cellFactoryDoubleAppliancesDelivery);
        colOrdinalPriceUnitAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("ordinalPriceUnitAppliancesDelivery"));
        colOrdinalPriceUnitAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        ((AppliancesDelivery) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setOrdinalPriceUnitAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPUnitAppliancesDelivery.setCellFactory(cellFactoryDoubleAppliancesDelivery);
        colPriceCPUnitAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("priceCPUnitAppliancesDelivery"));
        colPriceCPUnitAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        ((AppliancesDelivery) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPriceCPUnitAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPKeyAppliancesDelivery.setCellFactory(cellFactoryDoubleAppliancesDelivery);
        colPriceCPKeyAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("priceCPKeyAppliancesDelivery"));
        colPriceCPKeyAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        ((AppliancesDelivery) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPriceCPKeyAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPUnitAppliancesDelivery.setCellFactory(cellFactoryDoubleAppliancesDelivery);
        colCostCPUnitAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("costCPUnitAppliancesDelivery"));
        colCostCPUnitAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        ((AppliancesDelivery) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setCostCPUnitAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceOrderAppliancesDelivery.setCellFactory(cellFactoryDoubleAppliancesDelivery);
        colPriceOrderAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("priceOrderAppliancesDelivery"));
        colPriceOrderAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        ((AppliancesDelivery) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPriceOrderAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPAppliancesDelivery.setCellFactory(cellFactoryDoubleAppliancesDelivery);
        colCostCPAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("costCPAppliancesDelivery"));
        colCostCPAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        ((AppliancesDelivery) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setCostCPAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colProductionTimeAppliancesDelivery.setCellFactory(cellFactoryDoubleAppliancesDelivery);
        colProductionTimeAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("productionTimeAppliancesDelivery"));
        colProductionTimeAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        ((AppliancesDelivery) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setProductionTimeAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualCostAppliancesDelivery.setCellFactory(cellFactoryDoubleAppliancesDelivery);
        colActualCostAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("actualCostAppliancesDelivery"));
        colActualCostAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        ((AppliancesDelivery) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActualCostAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualDifferenceAppliancesDelivery.setCellFactory(cellFactoryDoubleAppliancesDelivery);
        colActualDifferenceAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("actualDifferenceAppliancesDelivery"));
        colActualDifferenceAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        ((AppliancesDelivery) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActualDifferenceAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPaidAppliancesDelivery.setCellFactory(cellFactoryDoubleAppliancesDelivery);
        colPaidAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("paidAppliancesDelivery"));
        colPaidAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        ((AppliancesDelivery) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPaidAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colResidueAppliancesDelivery.setCellFactory(cellFactoryDoubleAppliancesDelivery);
        colResidueAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("residueAppliancesDelivery"));
        colResidueAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        ((AppliancesDelivery) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setResidueAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colDateOfDeliveryAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("dateOfDeliveryAppliancesDelivery"));
        colDateOfDeliveryAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        ((AppliancesDelivery) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setDateOfDeliveryAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPlannedCPAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("plannedCPAppliancesDelivery"));
        colPlannedCPAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        ((AppliancesDelivery) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPlannedCPAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualCPAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("actualCPAppliancesDelivery"));
        colActualCPAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        ((AppliancesDelivery) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActualCPAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colAccountAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("accountAppliancesDelivery"));
        colAccountAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        ((AppliancesDelivery) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setAccountAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colContactsAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("contactsAppliancesDelivery"));
        colContactsAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        ((AppliancesDelivery) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setContactsAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colNotesAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("notesAppliancesDelivery"));
        colNotesAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        ((AppliancesDelivery) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setNotesAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCharacteristicsAppliancesDelivery.setCellValueFactory(new PropertyValueFactory<>("characteristicsAppliancesDelivery"));
        colCharacteristicsAppliancesDelivery.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesDelivery, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesDelivery, String> t) {
                        ((AppliancesDelivery) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setCharacteristicsAppliancesDelivery(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });

        appliancesTableViewDelivery.setEditable(true);
        colNameAppliancesDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colUnitAppliancesDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colProductionTimeAppliancesDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
        colDateOfDeliveryAppliancesDelivery.setCellFactory(TextFieldTableCell.forTableColumn());
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
                        ((AppliancesSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setNameAppliancesSuddenly(t.getNewValue());
                    }
                });
        colActivePAppliancesSuddenly.setCellFactory(cellFactoryCheckboxAppliancesSuddenly);
        colActivePAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("activePAppliancesSuddenly"));
        colActivePAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, Boolean> t) {
                        ((AppliancesSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActivePAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActiveCAppliancesSuddenly.setCellFactory(cellFactoryCheckboxAppliancesSuddenly);
        colActiveCAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("activeCAppliancesSuddenly"));
        colActiveCAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, Boolean>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, Boolean> t) {
                        ((AppliancesSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActiveCAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colUnitAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("unitAppliancesSuddenly"));
        colUnitAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        ((AppliancesSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setUnitAppliancesSuddenly(t.getNewValue());
                    }
                });
        colQuantityAppliancesSuddenly.setCellFactory(cellFactoryDoubleAppliancesSuddenly);
        colQuantityAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("quantityAppliancesSuddenly"));
        colQuantityAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        ((AppliancesSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setQuantityAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colOrdinalPriceUnitAppliancesSuddenly.setCellFactory(cellFactoryDoubleAppliancesSuddenly);
        colOrdinalPriceUnitAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("ordinalPriceUnitAppliancesSuddenly"));
        colOrdinalPriceUnitAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        ((AppliancesSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setOrdinalPriceUnitAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPUnitAppliancesSuddenly.setCellFactory(cellFactoryDoubleAppliancesSuddenly);
        colPriceCPUnitAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("priceCPUnitAppliancesSuddenly"));
        colPriceCPUnitAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        ((AppliancesSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPriceCPUnitAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceCPKeyAppliancesSuddenly.setCellFactory(cellFactoryDoubleAppliancesSuddenly);
        colPriceCPKeyAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("priceCPKeyAppliancesSuddenly"));
        colPriceCPKeyAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        ((AppliancesSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPriceCPKeyAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPUnitAppliancesSuddenly.setCellFactory(cellFactoryDoubleAppliancesSuddenly);
        colCostCPUnitAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("costCPUnitAppliancesSuddenly"));
        colCostCPUnitAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        ((AppliancesSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setCostCPUnitAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPriceOrderAppliancesSuddenly.setCellFactory(cellFactoryDoubleAppliancesSuddenly);
        colPriceOrderAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("priceOrderAppliancesSuddenly"));
        colPriceOrderAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        ((AppliancesSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPriceOrderAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCostCPAppliancesSuddenly.setCellFactory(cellFactoryDoubleAppliancesSuddenly);
        colCostCPAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("costCPAppliancesSuddenly"));
        colCostCPAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        ((AppliancesSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setCostCPAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colProductionTimeAppliancesSuddenly.setCellFactory(cellFactoryDoubleAppliancesSuddenly);
        colProductionTimeAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("productionTimeAppliancesSuddenly"));
        colProductionTimeAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        ((AppliancesSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setProductionTimeAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualCostAppliancesSuddenly.setCellFactory(cellFactoryDoubleAppliancesSuddenly);
        colActualCostAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("actualCostAppliancesSuddenly"));
        colActualCostAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        ((AppliancesSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActualCostAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualDifferenceAppliancesSuddenly.setCellFactory(cellFactoryDoubleAppliancesSuddenly);
        colActualDifferenceAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("actualDifferenceAppliancesSuddenly"));
        colActualDifferenceAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        ((AppliancesSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActualDifferenceAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPaidAppliancesSuddenly.setCellFactory(cellFactoryDoubleAppliancesSuddenly);
        colPaidAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("paidAppliancesSuddenly"));
        colPaidAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        ((AppliancesSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPaidAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colResidueAppliancesSuddenly.setCellFactory(cellFactoryDoubleAppliancesSuddenly);
        colResidueAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("residueAppliancesSuddenly"));
        colResidueAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        ((AppliancesSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setResidueAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colDateOfDeliveryAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("dateOfDeliveryAppliancesSuddenly"));
        colDateOfDeliveryAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        ((AppliancesSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setDateOfDeliveryAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colPlannedCPAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("plannedCPAppliancesSuddenly"));
        colPlannedCPAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        ((AppliancesSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setPlannedCPAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colActualCPAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("actualCPAppliancesSuddenly"));
        colActualCPAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        ((AppliancesSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setActualCPAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colAccountAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("accountAppliancesSuddenly"));
        colAccountAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        ((AppliancesSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setAccountAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colContactsAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("contactsAppliancesSuddenly"));
        colContactsAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        ((AppliancesSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setContactsAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colNotesAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("notesAppliancesSuddenly"));
        colNotesAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        ((AppliancesSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setNotesAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });
        colCharacteristicsAppliancesSuddenly.setCellValueFactory(new PropertyValueFactory<>("characteristicsAppliancesSuddenly"));
        colCharacteristicsAppliancesSuddenly.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<AppliancesSuddenly, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<AppliancesSuddenly, String> t) {
                        ((AppliancesSuddenly) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())).setCharacteristicsAppliancesSuddenly(t.getNewValue());
                        t.getTableView().refresh();
                    }
                });

        appliancesTableViewSuddenly.setEditable(true);
        colNameAppliancesSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colUnitAppliancesSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colProductionTimeAppliancesSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
        colDateOfDeliveryAppliancesSuddenly.setCellFactory(TextFieldTableCell.forTableColumn());
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


//        for (Room room : observableListRoom.filtered(x -> !"".equals(x.getNameRoom()))) {
//            Button newButton = new Button();
//            newButton.setText(room.getAreaRoom());
//
//
//            VBox layout = new VBox();
//
//            layout.getChildren().add(newButton);
//
//            Scene newScene = new Scene(layout, 250, 50);
//
//            Stage newStage = new Stage();
//            newStage.setTitle(room.getNameRoom());
//            newStage.setScene(newScene);
//
//            newStage.show();
//        }


        for (Room room : observableListRoom.filtered(x -> !"".equals(x.getNameRoom()))) {

            Button buttonDeletePlumbing = new Button("Удалить");
            Button buttonDeleteFurniture = new Button("Удалить");
            Button buttonDeleteLight = new Button("Удалить");
            Button buttonDeleteDecoration = new Button("Удалить");

            Accordion accordionPlumbing = new Accordion();
            Accordion accordionFurniture = new Accordion();
            Accordion accordionLight = new Accordion();
            Accordion accordionDecoration = new Accordion();

            TitledPane titledPanePlumbing = new TitledPane();
            TitledPane titledPaneFurniture = new TitledPane();
            TitledPane titledPaneLight = new TitledPane();
            TitledPane titledPaneDecoration = new TitledPane();

            //получаем имя + "ТЕКСТ!"
            titledPanePlumbing.setText(room.getNameRoom());
            titledPaneFurniture.setText(room.getNameRoom());
            titledPaneLight.setText(room.getNameRoom());
            titledPaneDecoration.setText(room.getNameRoom());


            //присваиваем имя
            accordionPlumbing.getPanes().add(titledPanePlumbing);
            accordionFurniture.getPanes().add(titledPaneFurniture);
            accordionLight.getPanes().add(titledPaneLight);
            accordionDecoration.getPanes().add(titledPaneDecoration);


            VBox vBoxPlumbing = new VBox();
            vBoxPlumbing.getChildren().addAll(buttonDeletePlumbing);

            VBox vBoxFurniture = new VBox();
            vBoxFurniture.getChildren().addAll(buttonDeleteFurniture);

            VBox vBoxLight = new VBox();
            vBoxLight.getChildren().addAll(buttonDeleteLight);

            VBox vBoxDecoration = new VBox();
            vBoxDecoration.getChildren().addAll(buttonDeleteDecoration);


            TableView<Plumbing> plumbingTableView = new TableView<>();
            TableColumn<Plumbing, String> colNamePlumbing = new TableColumn<Plumbing, String>("Наименование");
//            TableColumn<Plumbing, Boolean> colActivePPlumbing = new TableColumn<Plumbing, String>("П");
//            TableColumn<Plumbing, Boolean> colActiveCPlumbing = new TableColumn<Plumbing, String>("С");
            TableColumn<Plumbing, String> colUnitPlumbing = new TableColumn<Plumbing, String>("Ед. изм.");
            //делаем фикс на длинну
            colUnitPlumbing.setMinWidth(200);
            colUnitPlumbing.setMaxWidth(200);
            TableColumn<Plumbing, String> colQuantityPlumbing = new TableColumn<Plumbing, String>("Количество");
            TableColumn<Plumbing, String> colOrdinalPriceUnitPlumbing = new TableColumn<Plumbing, String>("Цена порядковая за ед.");
            TableColumn<Plumbing, String> colPriceCPUnitPlumbing = new TableColumn<Plumbing, String>("Цена по КП за ед.");
            TableColumn<Plumbing, String> colPriceCPKeyPlumbing = new TableColumn<Plumbing, String>("Цена по КП под ключ");
            TableColumn<Plumbing, String> colCostCPUnitPlumbing = new TableColumn<Plumbing, String>("Стоимость по КП за ед.");
            TableColumn<Plumbing, String> colPriceOrderPlumbing = new TableColumn<Plumbing, String>("Порядок цен");
            TableColumn<Plumbing, String> colCostCPPlumbing = new TableColumn<Plumbing, String>("Стоимость по КП");
            TableColumn<Plumbing, String> colProductionTimePlumbing = new TableColumn<Plumbing, String>("Срок доставки");
            TableColumn<Plumbing, String> colActualCostPlumbing = new TableColumn<Plumbing, String>("Стоимость фактическая");
            TableColumn<Plumbing, String> colActualDifferencePlumbing = new TableColumn<Plumbing, String>("Разница фактическая");
            TableColumn<Plumbing, String> colPaidPlumbing = new TableColumn<Plumbing, String>("Оплачено");
            TableColumn<Plumbing, String> colResiduePlumbing = new TableColumn<Plumbing, String>("Остаток");
            TableColumn<Plumbing, String> colDateOfDeliveryPlumbing = new TableColumn<Plumbing, String>("Дата поставки");
            TableColumn<Plumbing, String> colPlannedCPPlumbing = new TableColumn<Plumbing, String>("КП плановое");
            TableColumn<Plumbing, String> colActualCPPlumbing = new TableColumn<Plumbing, String>("КП фактическое");
            TableColumn<Plumbing, String> colAccountMPlumbing = new TableColumn<Plumbing, String>("Счёт");
            TableColumn<Plumbing, String> colContactsPlumbing = new TableColumn<Plumbing, String>("Контакты");
            TableColumn<Plumbing, String> colNotesPlumbing = new TableColumn<Plumbing, String>("Примечания");
            TableColumn<Plumbing, String> colCharacteristicsPlumbing = new TableColumn<Plumbing, String>("Характеристики");
            plumbingTableView.getColumns().addAll(colNamePlumbing, colUnitPlumbing, colQuantityPlumbing, colOrdinalPriceUnitPlumbing, colPriceCPUnitPlumbing, colPriceCPKeyPlumbing,
                    colCostCPUnitPlumbing, colPriceOrderPlumbing, colCostCPPlumbing, colProductionTimePlumbing, colActualCostPlumbing, colActualDifferencePlumbing, colPaidPlumbing,
                    colResiduePlumbing, colDateOfDeliveryPlumbing, colPlannedCPPlumbing, colActualCPPlumbing, colAccountMPlumbing, colContactsPlumbing, colNotesPlumbing, colCharacteristicsPlumbing);

            TableView<Furniture> furnitureTableView = new TableView<>();
            TableColumn<Furniture, String> colNameFurniture = new TableColumn<Furniture, String>("Наименование");
//            TableColumn<Furniture, Boolean> colActivePFurniture = new TableColumn<Furniture, String>("П");
//            TableColumn<Furniture, Boolean> colActiveCFurniture = new TableColumn<Furniture, String>("С");
            TableColumn<Furniture, String> colUnitFurniture = new TableColumn<Furniture, String>("Ед. изм.");
            TableColumn<Furniture, String> colQuantityFurniture = new TableColumn<Furniture, String>("Количество");
            TableColumn<Furniture, String> colOrdinalPriceUnitFurniture = new TableColumn<Furniture, String>("Цена порядковая за ед.");
            TableColumn<Furniture, String> colPriceCPUnitFurniture = new TableColumn<Furniture, String>("Цена по КП за ед.");
            TableColumn<Furniture, String> colPriceCPKeyFurniture = new TableColumn<Furniture, String>("Цена по КП под ключ");
            TableColumn<Furniture, String> colCostCPUnitFurniture = new TableColumn<Furniture, String>("Стоимость по КП за ед.");
            TableColumn<Furniture, String> colPriceOrderFurniture = new TableColumn<Furniture, String>("Порядок цен");
            TableColumn<Furniture, String> colCostCPFurniture = new TableColumn<Furniture, String>("Стоимость по КП");
            TableColumn<Furniture, String> colProductionTimeFurniture = new TableColumn<Furniture, String>("Срок доставки");
            TableColumn<Furniture, String> colActualCostFurniture = new TableColumn<Furniture, String>("Стоимость фактическая");
            TableColumn<Furniture, String> colActualDifferenceFurniture = new TableColumn<Furniture, String>("Разница фактическая");
            TableColumn<Furniture, String> colPaidFurniture = new TableColumn<Furniture, String>("Оплачено");
            TableColumn<Furniture, String> colResidueFurniture = new TableColumn<Furniture, String>("Остаток");
            TableColumn<Furniture, String> colDateOfDeliveryFurniture = new TableColumn<Furniture, String>("Дата поставки");
            TableColumn<Furniture, String> colPlannedCPFurniture = new TableColumn<Furniture, String>("КП плановое");
            TableColumn<Furniture, String> colActualCPFurniture = new TableColumn<Furniture, String>("КП фактическое");
            TableColumn<Furniture, String> colAccountMFurniture = new TableColumn<Furniture, String>("Счёт");
            TableColumn<Furniture, String> colContactsFurniture = new TableColumn<Furniture, String>("Контакты");
            TableColumn<Furniture, String> colNotesFurniture = new TableColumn<Furniture, String>("Примечания");
            TableColumn<Furniture, String> colCharacteristicsFurniture = new TableColumn<Furniture, String>("Характеристики");
            furnitureTableView.getColumns().addAll(colNameFurniture, colUnitFurniture, colQuantityFurniture, colOrdinalPriceUnitFurniture, colPriceCPUnitFurniture, colPriceCPKeyFurniture,
                    colCostCPUnitFurniture, colPriceOrderFurniture, colCostCPFurniture, colProductionTimeFurniture, colActualCostFurniture, colActualDifferenceFurniture, colPaidFurniture,
                    colResidueFurniture, colDateOfDeliveryFurniture, colPlannedCPFurniture, colActualCPFurniture, colAccountMFurniture, colContactsFurniture, colNotesFurniture, colCharacteristicsFurniture);


            TableView<Light> lightTableView = new TableView<>();
            TableColumn<Light, String> colNameLight = new TableColumn<Light, String>("Наименование");
//            TableColumn<Light, Boolean> colActivePLight = new TableColumn<Light, String>("П");
//            TableColumn<Light, Boolean> colActiveCLight = new TableColumn<Light, String>("С");
            TableColumn<Light, String> colUnitLight = new TableColumn<Light, String>("Ед. изм.");
            TableColumn<Light, String> colQuantityLight = new TableColumn<Light, String>("Количество");
            TableColumn<Light, String> colOrdinalPriceUnitLight = new TableColumn<Light, String>("Цена порядковая за ед.");
            TableColumn<Light, String> colPriceCPUnitLight = new TableColumn<Light, String>("Цена по КП за ед.");
            TableColumn<Light, String> colPriceCPKeyLight = new TableColumn<Light, String>("Цена по КП под ключ");
            TableColumn<Light, String> colCostCPUnitLight = new TableColumn<Light, String>("Стоимость по КП за ед.");
            TableColumn<Light, String> colPriceOrderLight = new TableColumn<Light, String>("Порядок цен");
            TableColumn<Light, String> colCostCPLight = new TableColumn<Light, String>("Стоимость по КП");
            TableColumn<Light, String> colProductionTimeLight = new TableColumn<Light, String>("Срок доставки");
            TableColumn<Light, String> colActualCostLight = new TableColumn<Light, String>("Стоимость фактическая");
            TableColumn<Light, String> colActualDifferenceLight = new TableColumn<Light, String>("Разница фактическая");
            TableColumn<Light, String> colPaidLight = new TableColumn<Light, String>("Оплачено");
            TableColumn<Light, String> colResidueLight = new TableColumn<Light, String>("Остаток");
            TableColumn<Light, String> colDateOfDeliveryLight = new TableColumn<Light, String>("Дата поставки");
            TableColumn<Light, String> colPlannedCPLight = new TableColumn<Light, String>("КП плановое");
            TableColumn<Light, String> colActualCPLight = new TableColumn<Light, String>("КП фактическое");
            TableColumn<Light, String> colAccountMLight = new TableColumn<Light, String>("Счёт");
            TableColumn<Light, String> colContactsLight = new TableColumn<Light, String>("Контакты");
            TableColumn<Light, String> colNotesLight = new TableColumn<Light, String>("Примечания");
            TableColumn<Light, String> colCharacteristicsLight = new TableColumn<Light, String>("Характеристики");
            lightTableView.getColumns().addAll(colNameLight, colUnitLight, colQuantityLight, colOrdinalPriceUnitLight, colPriceCPUnitLight, colPriceCPKeyLight,
                    colCostCPUnitLight, colPriceOrderLight, colCostCPLight, colProductionTimeLight, colActualCostLight, colActualDifferenceLight, colPaidLight,
                    colResidueLight, colDateOfDeliveryLight, colPlannedCPLight, colActualCPLight, colAccountMLight, colContactsLight, colNotesLight, colCharacteristicsLight);


            TableView<Decoration> decorationTableView = new TableView<>();
            TableColumn<Decoration, String> colNameDecoration = new TableColumn<Decoration, String>("Наименование");
//            TableColumn<Decoration, Boolean> colActivePDecoration = new TableColumn<Decoration, String>("П");
//            TableColumn<Decoration, Boolean> colActiveCDecoration = new TableColumn<Decoration, String>("С");
            TableColumn<Decoration, String> colUnitDecoration = new TableColumn<Decoration, String>("Ед. изм.");
            TableColumn<Decoration, String> colQuantityDecoration = new TableColumn<Decoration, String>("Количество");
            TableColumn<Decoration, String> colOrdinalPriceUnitDecoration = new TableColumn<Decoration, String>("Цена порядковая за ед.");
            TableColumn<Decoration, String> colPriceCPUnitDecoration = new TableColumn<Decoration, String>("Цена по КП за ед.");
            TableColumn<Decoration, String> colPriceCPKeyDecoration = new TableColumn<Decoration, String>("Цена по КП под ключ");
            TableColumn<Decoration, String> colCostCPUnitDecoration = new TableColumn<Decoration, String>("Стоимость по КП за ед.");
            TableColumn<Decoration, String> colPriceOrderDecoration = new TableColumn<Decoration, String>("Порядок цен");
            TableColumn<Decoration, String> colCostCPDecoration = new TableColumn<Decoration, String>("Стоимость по КП");
            TableColumn<Decoration, String> colProductionTimeDecoration = new TableColumn<Decoration, String>("Срок доставки");
            TableColumn<Decoration, String> colActualCostDecoration = new TableColumn<Decoration, String>("Стоимость фактическая");
            TableColumn<Decoration, String> colActualDifferenceDecoration = new TableColumn<Decoration, String>("Разница фактическая");
            TableColumn<Decoration, String> colPaidDecoration = new TableColumn<Decoration, String>("Оплачено");
            TableColumn<Decoration, String> colResidueDecoration = new TableColumn<Decoration, String>("Остаток");
            TableColumn<Decoration, String> colDateOfDeliveryDecoration = new TableColumn<Decoration, String>("Дата поставки");
            TableColumn<Decoration, String> colPlannedCPDecoration = new TableColumn<Decoration, String>("КП плановое");
            TableColumn<Decoration, String> colActualCPDecoration = new TableColumn<Decoration, String>("КП фактическое");
            TableColumn<Decoration, String> colAccountMDecoration = new TableColumn<Decoration, String>("Счёт");
            TableColumn<Decoration, String> colContactsDecoration = new TableColumn<Decoration, String>("Контакты");
            TableColumn<Decoration, String> colNotesDecoration = new TableColumn<Decoration, String>("Примечания");
            TableColumn<Decoration, String> colCharacteristicsDecoration = new TableColumn<Decoration, String>("Характеристики");
            decorationTableView.getColumns().addAll(colNameDecoration, colUnitDecoration, colQuantityDecoration, colOrdinalPriceUnitDecoration, colPriceCPUnitDecoration, colPriceCPKeyDecoration,
                    colCostCPUnitDecoration, colPriceOrderDecoration, colCostCPDecoration, colProductionTimeDecoration, colActualCostDecoration, colActualDifferenceDecoration, colPaidDecoration,
                    colResidueDecoration, colDateOfDeliveryDecoration, colPlannedCPDecoration, colActualCPDecoration, colAccountMDecoration, colContactsDecoration, colNotesDecoration, colCharacteristicsDecoration);


            vBoxPlumbing.getChildren().add(accordionPlumbing);
            vBoxFurniture.getChildren().add(accordionFurniture);
            vBoxLight.getChildren().add(accordionLight);
            vBoxDecoration.getChildren().add(accordionDecoration);

            //добавляем в аккардион
            titledPanePlumbing.setContent(plumbingTableView);
            titledPaneFurniture.setContent(furnitureTableView);
            titledPaneLight.setContent(lightTableView);
            titledPaneDecoration.setContent(decorationTableView);


            plumbingView.setContent(vBoxPlumbing);
            furnitureView.setContent(vBoxFurniture);
            lightView.setContent(vBoxLight);
            decorationView.setContent(vBoxDecoration);

        }
    }


//    double sum = Arrays.stream(colOrdinalPriceUnitMaterialWall).sum();
//    double sum = 2 +15;

    public void On_tabCalculatorClickedActionMaterialWall(MouseEvent mouseEvent) {
        if (observableListMaterialWall.filtered(x -> "0.0".equals(x.getQuantityMaterialWall()) && "0.0".equals(x.getOrdinalPriceUnitMaterialWall())).size() == 0) {
            observableListMaterialWall.add(new MaterialWall("", false, false, "", 0, 0,
                    0, 0, 0, 0, 0, "", 0, 0,
                    0, 0, "", "", "", "", "", "", ""));
        }
    }

    public void deleteElementMaterialWall(ActionEvent actionEvent) {
        ObservableList<MaterialWall> allMaterialWall, singleMaterialWall;
        allMaterialWall = materialTableViewWall.getItems();
        singleMaterialWall = materialTableViewWall.getSelectionModel().getSelectedItems();
        singleMaterialWall.forEach(allMaterialWall::remove);
    }

    public void On_tabCalculatorClickedActionMaterialFloor(MouseEvent mouseEvent) {
        if (observableListMaterialFloor.filtered(x -> "0.0".equals(x.getQuantityMaterialFloor()) && "0.0".equals(x.getOrdinalPriceUnitMaterialFloor())).size() == 0) {
            observableListMaterialFloor.add(new MaterialFloor("", false, false, "", 0, 0,
                    0, 0, 0, 0, 0, "", 0, 0,
                    0, 0, "", "", "", "", "", "", ""));
        }
    }

    public void deleteElementMaterialFloor(ActionEvent actionEvent) {
        ObservableList<MaterialFloor> allMaterialFloor, singleMaterialFloor;
        allMaterialFloor = materialTableViewFloor.getItems();
        singleMaterialFloor = materialTableViewFloor.getSelectionModel().getSelectedItems();
        singleMaterialFloor.forEach(allMaterialFloor::remove);
    }


    public void On_tabCalculatorClickedActionMaterialCeiling(MouseEvent mouseEvent) {
        if (observableListMaterialCeiling.filtered(x -> "0.0".equals(x.getQuantityMaterialCeiling()) && "0.0".equals(x.getOrdinalPriceUnitMaterialCeiling())).size() == 0) {
            observableListMaterialCeiling.add(new MaterialCeiling("", false, false, "", 0, 0,
                    0, 0, 0, 0, 0, "", 0, 0,
                    0, 0, "", "", "", "", "", "", ""));
        }
    }

    public void deleteElementMaterialCeiling(ActionEvent actionEvent) {
        ObservableList<MaterialCeiling> allMaterialCeiling, singleMaterialCeiling;
        allMaterialCeiling = materialTableViewCeiling.getItems();
        singleMaterialCeiling = materialTableViewCeiling.getSelectionModel().getSelectedItems();
        singleMaterialCeiling.forEach(allMaterialCeiling::remove);
    }

    public void On_tabCalculatorClickedActionMaterialOther(MouseEvent mouseEvent) {
        if (observableListMaterialOther.filtered(x -> "0.0".equals(x.getQuantityMaterialOther()) && "0.0".equals(x.getOrdinalPriceUnitMaterialOther())).size() == 0) {
            observableListMaterialOther.add(new MaterialOther("", false, false, "", 0, 0,
                    0, 0, 0, 0, 0, "", 0, 0,
                    0, 0, "", "", "", "", "", "", ""));
        }
    }

    public void deleteElementMaterialOther(ActionEvent actionEvent) {
        ObservableList<MaterialOther> allMaterialOther, singleMaterialOther;
        allMaterialOther = materialTableViewOther.getItems();
        singleMaterialOther = materialTableViewOther.getSelectionModel().getSelectedItems();
        singleMaterialOther.forEach(allMaterialOther::remove);
    }

    public void On_tabCalculatorClickedActionMaterialSuddenly(MouseEvent mouseEvent) {
        if (observableListMaterialSuddenly.filtered(x -> "0.0".equals(x.getQuantityMaterialSuddenly()) && "0.0".equals(x.getOrdinalPriceUnitMaterialSuddenly())).size() == 0) {
            observableListMaterialSuddenly.add(new MaterialSuddenly("", false, false, "", 0, 0,
                    0, 0, 0, 0, 0, "", 0, 0,
                    0, 0, "", "", "", "", "", "", ""));
        }
    }

    public void deleteElementMaterialSuddenly(ActionEvent actionEvent) {
        ObservableList<MaterialSuddenly> allMaterialSuddenly, singleMaterialSuddenly;
        allMaterialSuddenly = materialTableViewSuddenly.getItems();
        singleMaterialSuddenly = materialTableViewSuddenly.getSelectionModel().getSelectedItems();
        singleMaterialSuddenly.forEach(allMaterialSuddenly::remove);
    }

    public void On_tabCalculatorClickedActionAppliancesKitchen(MouseEvent mouseEvent) {
        if (observableListAppliancesKitchen.filtered(x -> "0.0".equals(x.getQuantityAppliancesKitchen()) && "0.0".equals(x.getOrdinalPriceUnitAppliancesKitchen())).size() == 0) {
            observableListAppliancesKitchen.add(new AppliancesKitchen("", false, false, "", 0, 0,
                    0, 0, 0, 0, 0, "", 0, 0,
                    0, 0, "", "", "", "", "", "", ""));
        }
    }

    public void deleteElementAppliancesKitchen(ActionEvent actionEvent) {
        ObservableList<AppliancesKitchen> allAppliancesKitchen, singleAppliancesKitchen;
        allAppliancesKitchen = appliancesTableViewKitchen.getItems();
        singleAppliancesKitchen = appliancesTableViewKitchen.getSelectionModel().getSelectedItems();
        singleAppliancesKitchen.forEach(allAppliancesKitchen::remove);
    }

    public void On_tabCalculatorClickedActionAppliancesOther(MouseEvent mouseEvent) {
        if (observableListAppliancesOther.filtered(x -> "0.0".equals(x.getQuantityAppliancesOther()) && "0.0".equals(x.getOrdinalPriceUnitAppliancesOther())).size() == 0) {
            observableListAppliancesOther.add(new AppliancesOther("", false, false, "", 0, 0,
                    0, 0, 0, 0, 0, "", 0, 0,
                    0, 0, "", "", "", "", "", "", ""));
        }
    }

    public void deleteElementAppliancesOther(ActionEvent actionEvent) {
        ObservableList<AppliancesOther> allAppliancesOther, singleAppliancesOther;
        allAppliancesOther = appliancesTableViewOther.getItems();
        singleAppliancesOther = appliancesTableViewOther.getSelectionModel().getSelectedItems();
        singleAppliancesOther.forEach(allAppliancesOther::remove);
    }

    public void On_tabCalculatorClickedActionAppliancesDelivery(MouseEvent mouseEvent) {
        if (observableListAppliancesDelivery.filtered(x -> "0.0".equals(x.getQuantityAppliancesDelivery()) && "0.0".equals(x.getOrdinalPriceUnitAppliancesDelivery())).size() == 0) {
            observableListAppliancesDelivery.add(new AppliancesDelivery("", false, false, "", 0, 0,
                    0, 0, 0, 0, 0, "", 0, 0,
                    0, 0, "", "", "", "", "", "", ""));
        }
    }

    public void deleteElementAppliancesDelivery(ActionEvent actionEvent) {
        ObservableList<AppliancesDelivery> allAppliancesDelivery, singleAppliancesDelivery;
        allAppliancesDelivery = appliancesTableViewDelivery.getItems();
        singleAppliancesDelivery = appliancesTableViewDelivery.getSelectionModel().getSelectedItems();
        singleAppliancesDelivery.forEach(allAppliancesDelivery::remove);
    }

    public void On_tabCalculatorClickedActionAppliancesSuddenly(MouseEvent mouseEvent) {
        if (observableListAppliancesSuddenly.filtered(x -> "0.0".equals(x.getQuantityAppliancesSuddenly()) && "0.0".equals(x.getOrdinalPriceUnitAppliancesSuddenly())).size() == 0) {
            observableListAppliancesSuddenly.add(new AppliancesSuddenly("", false, false, "", 0, 0,
                    0, 0, 0, 0, 0, "", 0, 0,
                    0, 0, "", "", "", "", "", "", ""));
        }
    }

    public void deleteElementAppliancesSuddenly(ActionEvent actionEvent) {
        ObservableList<AppliancesSuddenly> allAppliancesSuddenly, singleAppliancesSuddenly;
        allAppliancesSuddenly = appliancesTableViewSuddenly.getItems();
        singleAppliancesSuddenly = appliancesTableViewSuddenly.getSelectionModel().getSelectedItems();
        singleAppliancesSuddenly.forEach(allAppliancesSuddenly::remove);
    }


//    public void createProject(ActionEvent actionEvent) {
//    }
//
//    public void selectProject(ActionEvent actionEvent) {
//    }
}
