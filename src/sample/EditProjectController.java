package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.net.URL;
import java.util.ResourceBundle;


public class EditProjectController implements Initializable {

    public AnchorPane anchorPane;
    public TableView<Furniture> furnitureTableView;
    public TableColumn<Furniture, String> nameFurniture;
    public TableColumn<Furniture, Boolean> tabcolActiveP;
    public TableColumn<Furniture, Boolean> tabcolActiveC;
    public TableColumn<Furniture, String> unitFurniture;
    public TableColumn<Furniture, String> quantityFurniture;

    private ObservableList<Furniture> furnitureList = FXCollections.observableArrayList();


    public Button createRoomButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

//        furnitureTableView.setItems(furnitureList);
//        Callback<TableColumn<Furniture, String>, TableCell<Furniture, String>> cellFactoryInteger =
//                new Callback<TableColumn<Furniture, String>, TableCell<Furniture, String>>() {
//                    public TableCell call(TableColumn p) {
//                        return new EditingCellTextBox("\\d");
//                    }
//                };


    }


    public void addElementPlumping(ActionEvent actionEvent) {
    }

    public void deleteElementPlumping(ActionEvent actionEvent) {
    }

    public void saveElementPlumping(ActionEvent actionEvent) {
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
