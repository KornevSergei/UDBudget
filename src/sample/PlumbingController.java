package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class PlumbingController {

    public TextField nameElement;
    public TableView<Plumbing> plumbingTable;

    public TableColumn<Plumbing, String> name;
    public TableColumn<Plumbing, Integer> quantity;


    public void addElement(ActionEvent actionEvent) throws Exception {
        Plumbing plumbing = new Plumbing();
        String s = nameElement.getText();
        plumbing.setName(s);
        plumbingTable.getItems().add(plumbing);
    }
}
