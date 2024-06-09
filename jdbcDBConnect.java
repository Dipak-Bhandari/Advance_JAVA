import java.sql.Connection;
import java.sql.DriverManager;

public class jdbcDBConnect {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
            System.out.println(con);
        }catch (Exception e){
            System.out.println("Database not found!!");
        }

    }
}
