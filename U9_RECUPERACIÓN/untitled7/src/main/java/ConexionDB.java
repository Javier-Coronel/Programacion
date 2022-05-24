import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionDB {
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mariadb://localhost:3336/classicmodels?user=root&password=root&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
        }catch (Exception e){
            System.out.println(e);
        }
        return null;

    }
}