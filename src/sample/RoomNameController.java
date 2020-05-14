package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class RoomNameController implements Initializable {

    public TableView<Room> roomTableView;

    public TableColumn<Room, String> colNameRoom;
    public TableColumn<Room, Double> colYardageRoom;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colNameRoom.setCellValueFactory(new PropertyValueFactory<>("name"));
        colYardageRoom.setCellValueFactory(new PropertyValueFactory<>("yardage"));

        roomTableView.setItems(observableList);

    }

    ObservableList<Room> observableList = FXCollections.observableArrayList(
            new Room("Санузел", 10.6),
            new Room("Зал", 36.8)
    );

//    даём возможность редактировать в строчке
//        roomTableView.setEditable(true);
//        colNameRoom.setCellFactory(TextFieldTableCell.forTableColumn());


//    public void addRoom(ActionEvent actionEvent) {
//    }
//
//    public void deleteRoom(ActionEvent actionEvent) {
//    }
//
//    public void saveRoom(ActionEvent actionEvent) {
//    }
}
