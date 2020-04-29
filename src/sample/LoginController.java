package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class LoginController {

    public TextField loginUser;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button loginSignUpButton;

    @FXML
    private Button registrationSignUpButton;


    @FXML
    void initialize() {
    }

    public void login(ActionEvent actionEvent) throws Exception {
        System.out.println("ТЕСТ!");


        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CreateProject.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("УД Бюджет");
        stage.setScene(new Scene(root1));
        stage.show();
    }

    public void registration(ActionEvent actionEvent) throws Exception {
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Registration.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.initModality(Modality.NONE);
        stage.setTitle("УД Бюджет");
        stage.setScene(new Scene(root1));
        stage.show();
    }
}
