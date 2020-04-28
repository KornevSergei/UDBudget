package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

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
    }
}
