package sqlquery;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sqlconnection.ConnectionFile;

class Account {
	String NAME, PASSWORD;
	double balance;

	public Account(String NAME, String PASSWORD, double balance) {
		this.NAME = NAME;
		this.PASSWORD = PASSWORD;
		this.balance = balance;

	}
}

public class InsertUpdareQuery {

	Connection con;
	ConnectionFile c = new ConnectionFile();

	public void insertData() {
		con = c.gConnection();
		// statement in java
		// statement -> create statement
		// prepared statement -> precompile the sql query
		// callable statement -> call the stored procedure

		try {
			PreparedStatement psmt = con.prepareStatement("insert into student(NAME,PASSWORD) values(?,?)");
			psmt.setString(1, "user345");
			psmt.setString(2, "987654@A");
			int i = psmt.executeUpdate();
			if (i > 0) {
				System.out.println("data inserted");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void updateData() {
		con = c.gConnection();
		try {
			PreparedStatement psmt = con.prepareStatement("update student set NAME=?,PASSWORD=? where ID=?");
			psmt.setString(1, "updateduser");
			psmt.setString(2, "updatedpwd");
			psmt.setInt(3, 1);

			int i = psmt.executeUpdate();
			if (i > 0) {
				System.out.println("Data updated");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteData() {
		con = c.gConnection();
		try {
			PreparedStatement psmt = con.prepareStatement("delete from student where ID=?");
			psmt.setInt(1, 5);// 5 is id
			int i = psmt.executeUpdate();
			if (i > 0) {
				System.out.println("data deleted");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void selectData() {
		con = c.gConnection();
		try {
			PreparedStatement psmt = con.prepareStatement("select * from student");//
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("id") + "  " + rs.getString("NAME") + "     " + rs.getString("PASSWORD"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void selectDataId() {
		con = c.gConnection();
		try {
			PreparedStatement psmt = con.prepareStatement("select * from student where id=?");
			psmt.setInt(1, 1);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("id") + "  " + rs.getString("NAME") + "     " + rs.getString("PASSWORD"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void loginData() {
		con = c.gConnection();
		try {
			PreparedStatement psmt = con.prepareStatement("select * from student where NAME=? and PASSWORD=?");
			psmt.setString(1, "user3");
			psmt.setString(2, "987654");

			ResultSet rs = psmt.executeQuery();

			if (rs.next()) {
				System.out.println("Login Successful!");
			} else {
				System.out.println("Invalid username or password. Try again!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insertBatchData() {
		con = c.gConnection();
		String sql = "insert into student(NAME,PASSWORD,balance) values(?,?,?)";
		// statement in java
		// statement -> create statement
		// prepared statement -> precompile the sql query
		// callable statement -> call the stored procedure
		// transaction -> a set of sql queries
		// commit -> save the data
		// rollback -> undo the data
		// auto commit -> by default true

		try {
			// set auto commit to false to use bathch processing
			con.setAutoCommit(false);

			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setString(1, "Ravi1");
			psmt.setString(2, "Ravi@123");
			psmt.setDouble(3, 1100000);
			psmt.addBatch();

			psmt.setString(1, "Raj1");
			psmt.setString(2, "Raj@123");
			psmt.setDouble(3, 20000);
			psmt.addBatch();

			psmt.setString(1, "Dev1");
			psmt.setString(2, "Dev@123");
			psmt.setDouble(3, 30000);
			psmt.addBatch();

			int i[] = psmt.executeBatch();
			// commit the transaction
			con.commit();
			if (i.length > 0) {// if data is inserted
				System.out.println("data inserted");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void addArraylist() {
		con = c.gConnection();
		try {
			con.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String sql = "insert into student(NAME,PASSWORD,balance) values(?,?,?)";
		ArrayList<Account> al = new ArrayList<>();
		al.add(new Account("Darshak", "Darshak@123", 10000));
		al.add(new Account("Karan", "Karan@123", 20000));
		al.add(new Account("Jigar", "Jigar@123", 30000));
		al.add(new Account("Yash", "Yash@123", 40000));
		al.add(new Account("Meet", "Meet@123", 50000));
		al.add(new Account("Hiren", "Hiren@123", 60000));

		for (Account a : al) {
			try {
				PreparedStatement psmt = con.prepareStatement(sql);
				psmt.setString(1, a.NAME);
				psmt.setString(2, a.PASSWORD);
				psmt.setDouble(3, a.balance);
				psmt.addBatch();
				int i[] = psmt.executeBatch();
				con.commit();
				if (i.length > 0) {// if data is inserted
					System.out.println("data inserted");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public void transfer() {
		con = c.gConnection();
		try {
			con.setAutoCommit(false);
			PreparedStatement psmt1 = con.prepareStatement("update student set balance=balance-? where id=?");
			psmt1.setDouble(1, 500);
			psmt1.setInt(2, 1);
			int i = psmt1.executeUpdate();
			if (i > 0) {
				System.out.println("Amount debited from account 1");
			}

			PreparedStatement psmt2 = con.prepareStatement("update student set balance=balance+? where id=?");
			psmt2.setDouble(1, 500);
			psmt2.setInt(2, 2);
			int j = psmt2.executeUpdate();
			if (j > 0) {
				System.out.println("Amount credited to account 2");
			}
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	public void displayDetails() {
	    con = c.gConnection();
	    try {
	        PreparedStatement psmt = con.prepareStatement(
	            "SELECT u.Acc_number, u.NAME, t.id AS transaction_id, " +
	            "t.amount, t.type, t.date " +
	            "FROM student u " +
	            "JOIN transaction t ON u.Acc_number = t.acc_no " +
	            "ORDER BY u.Acc_number, t.date"
	        );

	        ResultSet rs = psmt.executeQuery();

	        System.out.printf("%-10s %-10s %-15s %-10s %-10s %-20s\n",
	                "Acc_No", "Name", "Transaction_ID", "Amount", "Type", "Date");
	        System.out.println("---------------------------------------------------------------------------------");

	        while (rs.next()) {
	            System.out.printf("%-10d %-10s %-15d %-10.2f %-10s %-20s\n",
	                    rs.getInt("Acc_number"),
	                    rs.getString("NAME"),
	                    rs.getInt("transaction_id"),
	                    rs.getDouble("amount"),
	                    rs.getString("type"),
	                    rs.getDate("date"));
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}


	public static void main(String[] args) {
		InsertUpdareQuery iq = new InsertUpdareQuery();
		// iq.insertData();
		// iq.updateData();
		// iq.deleteData();
		// iq.selectData();
		// iq.selectDataId();
		// iq.loginData();
		// iq.insertBatchData();
		// iq.addArraylist();
		//iq.transfer();
		iq.displayDetails();
	}

}