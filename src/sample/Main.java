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


//        //делаем во весь экран
//        primaryStage.setScene(new Scene(login));
//        primaryStage.setMaximized(true);
        primaryStage.setResizable(false);//запрещаем менять размер окна
    }


    public static void main(String[] args) {
        launch(args);
    }
}
