package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;



public class RoomNameController implements Initializable {

    public TableView<Room> roomTableView;

    public TableColumn<Room, String> colNameRoom;
    public TableColumn<Room, String> colAreaRoom;
    public TableColumn<Room, Boolean> colSelectBathRoom;
    public ObservableList<Room> observableListRoom = FXCollections.observableArrayList();


    public Button saveRoomButton;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

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

    //Делаем элементы из помещений
    public void saveRoomElement(ActionEvent actionEvent) {

        //вызываем нужный статик метод
//        addRoomPlumbing();


//        for (Room room : observableListRoom.filtered(x -> !"".equals(x.getNameRoom()))) {
//            Button newButton = new Button();
//            newButton.setText(room.getAreaRoom());
//
//
//            VBox layout = new VBox(1);
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





//        for (Room room : observableListRoom.filtered(x -> !"".equals(x.getNameRoom()))) {
            Button newButton = new Button("Кнопка!");
            FlowPane flowPane = new FlowPane();
            flowPane.getChildren().add(newButton);

//            EditProjectController.class.getResource("EditProject");
            plumbing.setContent(flowPane);
//        }
    }
}
