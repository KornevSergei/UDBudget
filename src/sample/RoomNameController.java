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
    public TableColumn<Room, Integer> colBathroom;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colNameRoom.setCellValueFactory(new PropertyValueFactory<>("NameRoom"));
        colYardageRoom.setCellValueFactory(new PropertyValueFactory<>("YardageRoom"));
        colBathroom.setCellValueFactory(new PropertyValueFactory<>("BathroomRoom"));
        roomTableView.setItems(observableList);
    }

    ObservableList <Room> observableList = FXCollections.observableArrayList(
            new Room("dkonvwebvoi",25.6, 253),
            new Room("dkonvwei",36.6, 1)
    );
}
