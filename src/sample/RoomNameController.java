package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class RoomNameController implements Initializable {

    public TableView<Room> roomTableView;

    public TableColumn<Room, String> colNameRoom;
    public TableColumn<Room, Double> colYardageRoom;
//    public TableColumn<Room, Integer> colBathroom;

    public Button saveRoom;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        colNameRoom.setCellValueFactory(new PropertyValueFactory<>("NameRoom"));
        colYardageRoom.setCellValueFactory(new PropertyValueFactory<>("YardageRoom"));
//        colBathroom.setCellValueFactory(new PropertyValueFactory<>("BathroomRoom"));
        roomTableView.setItems(observableList);



        roomTableView.setEditable(true);
        colNameRoom.setCellFactory(TextFieldTableCell.forTableColumn());

    }


    ObservableList<Room> observableList = FXCollections.observableArrayList(
            new Room("Помещение 1", 25.6),
            new Room("Помещение 2", 36.6)
    );

    //Добавляем
    public void addRoomName(ActionEvent actionEvent) {
        Room room = new Room("", 0);//либо данные из тексфилд
        roomTableView.getItems().add(room);
    }

    //выводим результат в консоль
    public void saveRoomElement(ActionEvent actionEvent) {
        Room room = new Room();

        List<List<String>> arrList = new ArrayList<>();


        for (int i = 0; i < roomTableView.getItems().size(); i++) {
            room = roomTableView.getItems().get(i);
            arrList.add(new ArrayList<>());
            arrList.get(i).add(room.nameRoom.get());
            arrList.get(i).add("" + room.yardageRoom.get());
//            arrList.get(i).add("" + room.bathroomRoom.get());
        }
        for (int i = 0; i < arrList.size(); i++) {
            for (int j = 0; j < arrList.size(); j++) {
                System.out.println(arrList.get(i).get(j));
            }

        }

//        saveRoom.getScene().getWindow().hide();//после клика закрываекм окно
    }

    //удаляем элементы
    public void deleteRoomElement(ActionEvent actionEvent) {
        ObservableList<Room> allRoom, singleRoom;
        allRoom = roomTableView.getItems();
        singleRoom = roomTableView.getSelectionModel().getSelectedItems();
        singleRoom.forEach(allRoom::remove);
    }

    public void onEditChanged(TableColumn.CellEditEvent<Room, String> roomStringCellEditEvent) {
        Room room = roomTableView.getSelectionModel().getSelectedItem();
        room.setNameRoom(roomStringCellEditEvent.getNewValue());
    }
}
