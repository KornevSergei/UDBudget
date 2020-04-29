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
        String user = loginUser.getText();
        System.out.println("ТЕСТ!" + user);





        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CreateProject.fxml"));
        Parent root = (Parent) fxmlLoader.load();

        Stage stage = (Stage) loginSignUpButton.getScene().getWindow();
        stage.close();


//        Stage stage = new Stage();
//        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("УД Бюджет");
        stage.setScene(new Scene(root));
        stage.show();

    }

    public void registration(ActionEvent actionEvent) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Registration.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("УД Бюджет");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
