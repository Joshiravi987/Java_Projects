package com.spring.jdbctemplate;

import java.util.List;

public interface UserDao {
	//method to insert user /data
	void register(User user);
	//show all users
	List<User> getAllUsers();
	

}
