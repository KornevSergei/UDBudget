package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent login = FXMLLoader.load(getClass().getResource("Login.fxml"));
        primaryStage.setTitle("УД Бюджет");
        primaryStage.setScene(new Scene(login, 250, 300));
        primaryStage.show();
        //запрещаем менять размер окна
        primaryStage.setResizable(false);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
