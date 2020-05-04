package sample;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.swing.*;
import javax.xml.parsers.ParserConfigurationException;

public class RegistrationController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    TextField signUpPhone;
    TextField signUpMail;
    TextField signUpLogin;
    TextField signUpPassword;
    
    Button registrationButton;


    @FXML
    void initialize() {

    }

    public void registration(ActionEvent actionEvent) throws Exception {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/user?useUnicode=true&serverTimezone=UTC&useSSL=false", "root", "root");
            Statement statement = con.createStatement();
            statement.execute("INSERT INTO users (phone, mail, login, password) VALUES (" + signUpPhone.getText() + "\', \'"
                    + signUpMail.getText() + "\', \'" + signUpLogin.getText() + "\', \'" + signUpPassword.getText() + "\', \'");
        } catch (SQLException el) {
            el.printStackTrace();
        }


//            registrationButton.getScene().getWindow().hide();//после клика закрываекм окно

    }
}
