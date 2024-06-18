package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDoperations {

    public static final String sqlURL = "jdbc:mysql://localhost:3306/";
    public static final String db= "NEW_C";
    public static final String user = "NewUser";
    public static final String  psd= "1234!!";

    public static void main(String[] args) throws Exception{
        try ( Connection con = DriverManager.getConnection(sqlURL,user,psd);
              Statement statement= con.createStatement();
        ){
            //table creation
            String sql = "CREATE TABLE REGISTRATION " +
                    "(id INTEGER not NULL, " +
                    " first VARCHAR(255), " +
                    " last VARCHAR(255), " +
                    " age INTEGER, " +
                    " PRIMARY KEY ( id ))";

            statement.executeUpdate(sql);
            System.out.println(" Tables created in "+db);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
