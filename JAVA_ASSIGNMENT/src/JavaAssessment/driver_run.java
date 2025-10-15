package JavaAssessment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class driver_run {

    Connection con;

    public Connection getConnection() {
        try {
            // Load MySQL driver class (Type 4 driver)
            Class.forName("com.mysql.cj.jdbc.Driver");  

            // Create connection object
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql", "root", "");  
            System.out.println("✅ Connection established");

        } catch (ClassNotFoundException e) {
            System.out.println("❌ Driver class not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("❌ Database connection failed!");
            e.printStackTrace();
        }

        return con;
    }
}