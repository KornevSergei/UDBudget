package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EditProjectController {

//    public void createNameProject(ActionEvent actionEvent) throws Exception {
//        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("NameProject.fxml"));
//        Parent root = (Parent) fxmlLoader.load();
//        Stage stage = new Stage();
//        stage.setTitle("УД Бюджет");
//        stage.setScene(new Scene(root));
//        stage.show();
//
//    }


    public void createRoom(ActionEvent actionEvent) throws Exception {
        //добавление окна
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CreateRoomPlumbing.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("УД Бюджет");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void addElementPlumping(ActionEvent actionEvent) {
    }

    public void deleteElementPlumping(ActionEvent actionEvent) {
    }

    public void saveElementPlumping(ActionEvent actionEvent) {
    }
}
