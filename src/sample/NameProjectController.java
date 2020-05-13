package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class NameProjectController {
    public Button addRoomButton;
    public Button addPaymentButton;
    public Button createProjectButton;

    public void createProject(ActionEvent actionEvent) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("EditProject.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("УД Бюджет");
        stage.setScene(new Scene(root));
        stage.show();
        createProjectButton.getScene().getWindow().hide();
    }

    public void addRoom(ActionEvent actionEvent) {
    }

    public void addPayment(ActionEvent actionEvent) {
    }
}
