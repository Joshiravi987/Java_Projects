package com.spring.jdbctemplate;

import java.util.List;

public interface UserDao {
	//method to insert user /data
	void register(User user);
	//show all users
	List<User> getAllUsers();
	//delete method
	void delete(int id);
	//edit method
	User getUserById(int id);
	//update method
	void update(User user);
}
