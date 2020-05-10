package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class PlumbingController {

    public TextField userG;
    public TableView<Plumbing> PlumbingTable;

    public int tryCount = 0;


    public void go(ActionEvent actionEvent) throws Exception {
        Plumbing plumbing = new Plumbing();
        String s = userG.getText();
        plumbing.setName(s);
        PlumbingTable.getItems().add(plumbing);

        tryCount++;
        plumbing.setQuantity(tryCount);


    }
}
