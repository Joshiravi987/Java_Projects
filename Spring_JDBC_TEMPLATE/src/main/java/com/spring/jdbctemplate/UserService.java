package com.spring.jdbctemplate;

import java.util.List;

public interface UserService {
	void register(User user);
	List<User> getAllUsers();
}
