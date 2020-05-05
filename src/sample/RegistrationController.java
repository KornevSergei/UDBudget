package sample;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.swing.*;


public class RegistrationController {

    public TextField signUpPhone;
    public TextField signUpMail;
    public TextField signUpLogin;
    public TextField signUpPassword;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;


    @FXML
    Button registrationButton;


    @FXML
    void initialize() {

    }

    public void registration(ActionEvent actionEvent) throws Exception  {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/user?useUnicode=true&serverTimezone=UTC&useSSL=false", "root", "root");
            String query = "INSERT INTO users (phone, mail, login, password) VALUES (?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, signUpPhone.getText());
            pst.setString(2, signUpMail.getText());
            pst.setString(3, signUpLogin.getText());
            pst.setString(4, signUpPassword.getText());

            pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        registrationButton.getScene().getWindow().hide();//после клика закрываекм окно

    }
}
