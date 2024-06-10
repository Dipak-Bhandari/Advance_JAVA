package DBConnection;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class createDB {
    public static void main(String[] args) {
        try {
            System.out.println("Loading MySQL JDBC driver...");
            // load JDBC Driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully.");

            // creating String Sql database all criteria
            String sqlURL = "jdbc:mysql://localhost:3306/";
            String db = "NEW_DB";
            String user = "NewUser";
            String psd = "1234!!";

            System.out.println("Connecting to MySQL server...");
            // connection establishment
            Connection con = DriverManager.getConnection(sqlURL, user, psd);
            System.out.println("Connection established.");

            String sql = "CREATE DATABASE " + db;
            // create db
            Statement statement = con.createStatement();
            System.out.println("Executing SQL: " + sql);
            statement.executeUpdate(sql);

            statement.close();
            con.close();

            JOptionPane.showMessageDialog(null, db + " Database has been created.");
        } catch (Exception e) {
            e.printStackTrace();  // Print stack trace for debugging
            System.out.println("Error : " + e);
        }
    }
}
