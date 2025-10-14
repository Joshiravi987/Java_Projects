package sqlquery;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import sqlconnection.ConnectionFile;

public class InsertQuery {
	public static void main(String[] args) {
		//make objct of connection file
		Connection con;
		ConnectionFile cf=new ConnectionFile();
		con = cf.gConnection();
		
		//execute query
		try {
			PreparedStatement psmt = con.prepareStatement("insert into student(NAME,PASSWORD) values(?,?)");
			psmt.setString(1, "user3");
			psmt.setString(2, "987654");
			int i = psmt.executeUpdate();
			if(i>0) {
				System.out.println("data inserted");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
