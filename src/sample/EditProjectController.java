package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.table.TableColumn;
import java.awt.*;

public class EditProjectController {
    public void createNameProject(ActionEvent actionEvent) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("nameProject.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("УД Бюджет");
        stage.setScene(new Scene(root));
        stage.show();

    }


    public void createRoom(ActionEvent actionEvent) throws Exception {
        //добавление окна
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("nameRoom.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("УД Бюджет");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
