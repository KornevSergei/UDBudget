package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent login = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setTitle("УД Бюджет");
        primaryStage.setScene(new Scene(login, 250, 300));
        primaryStage.show();
        primaryStage.setResizable(false);//запрещаем менять размер окна
    }


    public static void main(String[] args) {
        launch(args);
    }
}
