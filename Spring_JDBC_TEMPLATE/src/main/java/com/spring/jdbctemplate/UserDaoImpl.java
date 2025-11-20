package com.spring.jdbctemplate;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements UserDao {
    @Autowired
	DataSource dataSource;
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String sql="insert into Students values(?,?)";
		jdbcTemplate.update(sql,new Object[] {user.getUsername(),user.getPassword()});
	
	}
		}


