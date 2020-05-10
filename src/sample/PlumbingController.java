package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class PlumbingController implements Initializable {

    public TextField nameElement;
    public TableView<Plumbing> plumbingTable;

    public TableColumn<Plumbing, String> colName;
    public TableColumn<Plumbing, Integer> colQuantity;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colQuantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        plumbingTable.setItems(observableList);
    }

    ObservableList<Plumbing> observableList = FXCollections.observableArrayList(
            new Plumbing("214124",123),
            new Plumbing("21412esgds4",12613)
    );
}
