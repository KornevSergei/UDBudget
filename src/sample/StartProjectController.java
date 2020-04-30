package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartProjectController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void initialize() {

    }

    public void startEditProject(ActionEvent actionEvent) throws Exception {
        
        System.out.println("ЗАПУСТИЛИ РЕДАКТОР!");

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EditProject.fxml"));
        Parent root = (Parent) fxmlLoader.load();

//        Stage stage = (Stage) createProject().getScene().getWindow();
//        stage.close();



        Stage stage = new Stage();
        stage.setTitle("УД Бюджет");
        stage.setScene(new Scene(root));
        stage.show();
    }
}

