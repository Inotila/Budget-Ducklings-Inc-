import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    public static Connection getConnection() throws SQLException {
        String jdbcUrl = "jdbc:mysql://localhost:3306/Budget-Ducklings-Inc-/";
        String username = "root";
        String password = "Chicken1sDaB3st@1010";
        return DriverManager.getConnection(jdbcUrl, username, password);
    }
}