package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RegistrationController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private TextField signUpPhone;

    @FXML
    private TextField signUpMail;

    @FXML
    private TextField signUpLogin;

    @FXML
    private TextField signUpPassword;

    @FXML
    private URL location;

    @FXML
    private Button registrationButton;


    @FXML
    void initialize() {
//        DatabaseHandler databaseHandler = new DatabaseHandler();
//        registrationButton.setOnAction(actionEvent ->
//                databaseHandler.signUpUser(signUpPhone.getText(),signUpMail.getText(),signUpLogin.getText(),signUpPassword.getText()));

    }

    public void registration(ActionEvent actionEvent) throws Exception {
        DatabaseHandler dbHandler = new DatabaseHandler();
        dbHandler.signUpUser(signUpPhone.getText(),signUpMail.getText(),signUpLogin.getText(),signUpPassword.getText());

//            registrationButton.getScene().getWindow().hide();//после клика закрываекм окно

    }
}
