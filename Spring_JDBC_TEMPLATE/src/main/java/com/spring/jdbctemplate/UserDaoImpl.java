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
		}


