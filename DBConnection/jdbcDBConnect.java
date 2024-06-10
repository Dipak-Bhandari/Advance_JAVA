package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbcDBConnect {
    public static void main(String[] args) {

        try {

            // for connection of database using Url to database, Username and Password
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");

            //Prints the connection status
            System.out.println("Sucessful "+con);
        }catch (Exception e){

            System.out.println("Database not found!!");
        }


    }

}
