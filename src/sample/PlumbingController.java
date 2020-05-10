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
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class PlumbingController implements Initializable {


    public TextField textFieldQuantity;
    public TextField textFieldName;

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
            new Plumbing("Краска", 1),
            new Plumbing("Клей", 2)
    );

    public void addElement(ActionEvent actionEvent) {
        Plumbing plumbing = new Plumbing(textFieldName.getText(), Integer.parseInt(textFieldQuantity.getText()));
        plumbingTable.getItems().add(plumbing);

    }

    //сохраняем элементы и выводим результат
    public void saveRoom(ActionEvent actionEvent) {
        Plumbing plumbing = new Plumbing();

        List<List<String>> arrList = new ArrayList<>();
        for (int i = 0; i < plumbingTable.getItems().size(); i++) {
            plumbing = plumbingTable.getItems().get(i);
            arrList.add(new ArrayList<>());
            arrList.get(i).add(plumbing.name.get());
            arrList.get(i).add("" + plumbing.quantity.get());//потому что инт значение в Plumbing приводим к Строке
        }

        for (int i = 0; i < arrList.size(); i++) {
            for (int j = 0; j < arrList.get(i).size(); j++) {
                System.out.println(arrList.get(i).get(j));
            }
        }

    }
        //удаляем элементы
    public void deleteElement(ActionEvent actionEvent) {

        ObservableList<Plumbing> allPlumbing, singlePlumbing;
        allPlumbing = plumbingTable.getItems();
        singlePlumbing = plumbingTable.getSelectionModel().getSelectedItems();
        singlePlumbing.forEach(allPlumbing::remove);
    }
}
