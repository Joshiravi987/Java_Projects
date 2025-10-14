package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Connection.DbConn;
import com.model.User;

public class Datadao implements DatadaoI{

    // All methods use local, thread-safe connections

	@Override
	public String InsertData(User user) {
		DbConn db = new DbConn();
		String sql = "INSERT INTO bankapp(Username,Phone,Email,Password,Photo) VALUES(?,?,?,?,?)";
		
		try (Connection con = db.getConnection(); 
		     PreparedStatement psmt = con.prepareStatement(sql)) {
			
			psmt.setString(1, user.getUsername());
			psmt.setString(2, user.getPhone());
			psmt.setString(3, user.getEmail());
			psmt.setString(4, user.getPassword());
            
            // *** CRITICAL FIX: Use setBytes() for BLOB data ***
			psmt.setBytes(5, user.getPhoto()); 
			
			int i = psmt.executeUpdate();
			if(i > 0) {
				return "Success";
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}


	@Override
	public List<User> showalldata() {
		DbConn db = new DbConn();
		ArrayList<User> al = new ArrayList<>();
		String sql = "SELECT * FROM bankapp";
		
		try (Connection con = db.getConnection(); 
		     PreparedStatement psmt = con.prepareStatement(sql);
		     ResultSet rs = psmt.executeQuery()) {
			
			while(rs.next()) {
				User u = new User();
				u.setId(rs.getInt("Id")); 
				u.setUsername(rs.getString("Username"));
				u.setPhone(rs.getString("Phone"));
				u.setEmail(rs.getString("Email"));
				u.setPassword(rs.getString("Password"));
                
                // *** CRITICAL FIX: Retrieve BLOB as byte[] ***
				u.setPhoto(rs.getBytes("Photo")); 
				al.add(u);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return al;
	}


	@Override
	public User deleteData(int id) {
		DbConn db = new DbConn();
		String sql = "DELETE FROM bankapp WHERE Id=?";
		
		try (Connection con = db.getConnection(); 
		     PreparedStatement psmt = con.prepareStatement(sql)) {
			
			psmt.setInt(1, id);
			int i = psmt.executeUpdate();
			
			if(i > 0) {
				System.out.println("Data Deleted");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null; 
	}


	@Override
	public int updateData(User user) {
		DbConn db = new DbConn();
		String sql = "UPDATE bankapp SET Username=?,Phone=?,Email=?,Password=? WHERE Id=?";
		
		try (Connection con = db.getConnection(); 
		     PreparedStatement psmt = con.prepareStatement(sql)) {
			
			psmt.setString(1, user.getUsername());
	     	psmt.setString(2, user.getPhone());
	     	psmt.setString(3, user.getEmail());
	     	psmt.setString(4, user.getPassword());
	     	psmt.setInt(5, user.getId());
			
	        return psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public User getUserById(int id) {
	    DbConn db = new DbConn();
	    User user = null;
	    String sql = "SELECT * FROM bankapp WHERE Id=?"; 
	    
	    try (Connection con = db.getConnection(); 
	         PreparedStatement psmt = con.prepareStatement(sql)) {
	        
	        psmt.setInt(1, id);
	        
	        try (ResultSet rs = psmt.executeQuery()) { 
	            if (rs.next()) {
	                user = new User();
	                user.setId(rs.getInt("Id")); 
	                user.setUsername(rs.getString("Username"));
	                user.setPhone(rs.getString("Phone"));
	                user.setEmail(rs.getString("Email"));
	                user.setPassword(rs.getString("Password"));
                    // Retrieve BLOB as byte[]
                    user.setPhoto(rs.getBytes("Photo"));
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return user; 
	}


	@Override
	public User login(String email, String password) {
	    DbConn db = new DbConn();
	    User user = null;
	    String sql = "SELECT * FROM bankapp WHERE Email=? AND Password=?";
	    
	    try(Connection con = db.getConnection();
	        PreparedStatement psmt = con.prepareStatement(sql)){
	        
	        psmt.setString(1, email);
	        psmt.setString(2, password);
	        
	        try (ResultSet rs = psmt.executeQuery()) {
	            if(rs.next()) {
	                user = new User();
	                user.setId(rs.getInt("Id")); 
	                user.setUsername(rs.getString("Username"));
	                user.setPhone(rs.getString("Phone"));
	                user.setEmail(rs.getString("Email"));
	                user.setPassword(rs.getString("Password"));
                    // Retrieve BLOB as byte[]
                    user.setPhoto(rs.getBytes("Photo"));
	            }
	        }
	        
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return user;
	}


	@Override
	public int updateDataWithPhoto(User user) {
	    DbConn db = new DbConn();
	    
	    // We update with photo ONLY if photoData is NOT null
	    boolean photoUpdated = user.getPhoto() != null;
	    
	    // 1. Base SQL: Update text fields
	    String sql = "UPDATE bankapp SET Username=?, Phone=?, Email=?, Password=? WHERE Id=?";
	    
	    // 2. Conditional SQL: Add Photo to the query if byte[] is present
	    if (photoUpdated) {
	        // SQL WITH photo update: 6 parameters
	        sql = "UPDATE bankapp SET Username=?, Phone=?, Email=?, Password=?, Photo=? WHERE Id=?";
	    }
	    
	    try (Connection con = db.getConnection(); 
	         PreparedStatement psmt = con.prepareStatement(sql)) {
	        
	        // Bind text fields (parameters 1 through 4)
	        psmt.setString(1, user.getUsername());
	        psmt.setString(2, user.getPhone());
	        psmt.setString(3, user.getEmail());
	        psmt.setString(4, user.getPassword());
	        
	        if (photoUpdated) {
	            // Bind the BLOB data (parameter 5) and the ID (parameter 6)
	            psmt.setBytes(5, user.getPhoto());
	            psmt.setInt(6, user.getId()); 
	        } else {
	            // Bind only the ID (parameter 5)
	            psmt.setInt(5, user.getId()); 
	        }
	        
	        return psmt.executeUpdate();
	        
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return 0;
	    }
	
	}
}