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

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/user?useUnicode=true&serverTimezone=UTC&useSSL=false", "root", "root");
        String query = "INSERT INTO users (phone, mail, login, password)" + "VALUES (? ,?,?,?)";

        try {

            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, signUpPhone.getText());
            pst.setString(2, signUpMail.getText());
            pst.setString(3, signUpLogin.getText());
            pst.setString(4, signUpPassword.getText());

            pst.executeUpdate();

        } catch (SQLException el) {
            el.printStackTrace();
        }


//        try {
//            String query = "INSERT INTO users (phone, mail, login, password) VALUES (?,?,?,?)";
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/user?useUnicode=true&serverTimezone=UTC&useSSL=false", "root", "root");
//
//            PreparedStatement pst = con.prepareStatement(query);
//            pst.setString(1, signUpPhone.getText());
//            pst.setString(2, signUpMail.getText());
//            pst.setString(3, signUpLogin.getText());
//            pst.setString(4, signUpPassword.getText());
//
//            pst.executeUpdate();
//
//        } catch (SQLException el) {
//            el.printStackTrace();
//        }


//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/user?useUnicode=true&serverTimezone=UTC&useSSL=false", "root", "root");
//            Statement statement = con.createStatement();
//            statement.execute("INSERT INTO users (phone, mail, login, password) VALUES (1212,2321,23,43)");
//        } catch (SQLException el) {
//            el.printStackTrace();
//        }


//            registrationButton.getScene().getWindow().hide();//после клика закрываекм окно

    }
}
