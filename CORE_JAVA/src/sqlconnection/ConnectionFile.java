package sqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//jdbc api -> java to database connectivity
//jdbc driver	-> it has 4 types
//1. type 1 -> jdbc-odbc bridge driver(open datebase connectivity)->ms access
//2. type 2 -> native api driver -> c/c++ code
//3. type 3 -> network protocol driver -> middleware server => translates the jdbc calls to database specific calls
//4. type 4 -> pure java driver/thin driver -> it is written in java -> it converts jdbc calls to database specific calls
public class ConnectionFile {

	Connection con;
	public Connection gConnection() {
		
		try {
			//load driver class
			Class.forName("com.mysql.cj.jdbc.Driver");//type 4 driver =>remember to add mysql-connector jar file in build path
            //create conncection object
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			System.out.println("Connection established");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
}
