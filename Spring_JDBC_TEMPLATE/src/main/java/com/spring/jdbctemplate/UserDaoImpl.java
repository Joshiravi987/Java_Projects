package com.spring.jdbctemplate;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class UserDaoImpl implements UserDao {
   
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	@Override
	public void register(User user) {
		
		String sql="insert into Students(username,password) values(?,?)";
		jdbcTemplate.update(sql,new Object[] {user.getUsername(),user.getPassword()});
	
	}


	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		String sql="select * from Students";
		return jdbcTemplate.query(sql,(rs,rowNum)->{
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			return user;
		} );
	}


	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		String sql="delete from Students where id=?";
		jdbcTemplate.update(sql,new Object[] {id} );
	}


	@Override
	public User getUserById(int id) {
		String sql= "SELECT * FROM Students WHERE id=?";
		return jdbcTemplate.queryForObject(sql, new Object[] {id}, (rs,rowNum)->{
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			return user;
		});
	}


	@Override
	public void update(User user) {
		String sql="UPDATE Students SET username=?, password=? WHERE id=?";
		jdbcTemplate.update(sql, new Object[] {user.getUsername(), user.getPassword(), user.getId()});		
	}
		}


