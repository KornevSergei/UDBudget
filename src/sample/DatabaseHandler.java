package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//подключаемся к базе данных
public class DatabaseHandler extends Configs {
        Connection dbConnection;

        public Connection getDbConnection() throws ClassNotFoundException, SQLException{
            String connectionString = "jdbc:mysql://" + dbHost + ":"
                    + dbPort + "/" + dbName;

            Class.forName("com.mysql.jdbc.Driver");

            dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);

            return dbConnection;
        }


        //записываем в базу данных
        public void signUpUser(String phone, String mail,String login, String password ){
        String insert = "INSERT INTO" + Const.USER_TABLE + "(" + Const.USER_PHONE +
                "," + Const.USER_MAIL + "," + Const.USER_LOGIN +
                "," + Const.USER_PASSWORD + ")" + "VALUES(?,?,?,?)";


            try {
                PreparedStatement prST = getDbConnection().prepareStatement(insert);
                prST.setString(1,phone);
                prST.setString(2,mail);
                prST.setString(3,login);
                prST.setString(4,password);

                prST.executeUpdate();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
}
