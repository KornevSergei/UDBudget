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
import javafx.stage.Stage;

public class LoginController {

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

    public void login(ActionEvent actionEvent) {
        System.out.println("sdpmsnvoindob");
        loginSignUpButton.getScene().getWindow().hide();//прячем окно


        //создаём новое окно
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/sample/CreateProject.fxml"));

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();//отображение с задержкой прошлого окна

    }
}
