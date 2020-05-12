package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    public TextField loginUser;
    public PasswordField passwordField;

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


        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EditProject.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("УД Бюджет");
        stage.setScene(new Scene(root));
        stage.show();

        loginUser.getScene().getWindow().hide();//после клика закрываекм окно
    }

    public void startRegistration(ActionEvent actionEvent) throws Exception {

        System.out.println("Открыли окно регистрации!");

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Registration.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("УД Бюджет");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
