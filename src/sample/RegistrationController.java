package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class RegistrationController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button registrationButton;


    @FXML
    void initialize() {

    }
    public void registration(ActionEvent actionEvent) throws Exception {
            registrationButton.getScene().getWindow().hide();//после клика закрываекм окно



    }
}
