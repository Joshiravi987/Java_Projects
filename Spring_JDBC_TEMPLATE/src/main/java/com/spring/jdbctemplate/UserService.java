package com.spring.jdbctemplate;

import java.util.List;

public interface UserService {
	void register(User user);
	List<User> getAllUsers();
	
	//delete method
	void delete(int id);
	//edit method
	User getUserById(int id);
	//update method
	void update(User user);

	
}
