package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DatabaseConnection {

    
    private static final String URL = "jdbc:mysql://localhost:3306/votingsystemdb";
    private static final String USERNAME = "admin"; 
    private static final String PASSWORD = "aemtracorps123"; 
   
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Cannot connect to the database: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        return connection;
    }

   
    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Cannot close the database connection: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);    
            }
        }
    }
}
