package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class EditProjectController  {


    public Button createProjectButton;

    public void addElementPlumping(ActionEvent actionEvent) {
    }

    public void deleteElementPlumping(ActionEvent actionEvent) {
    }

    public void saveElementPlumping(ActionEvent actionEvent) {
    }

    public void createProject(ActionEvent actionEvent) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("NameProject.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("УД Бюджет");
        stage.setScene(new Scene(root));
        stage.show();
        createProjectButton.getScene().getWindow().hide();
    
    }
}
