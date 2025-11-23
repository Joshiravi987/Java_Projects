package com.spring.jdbctemplate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service 
@Transactional
public class UserServiceImpl implements UserService{
	
	
	@Autowired
	UserDao userdao;

	@Override
	public void register(User user) {
		userdao.register(user);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userdao.getAllUsers();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		userdao.delete(id);
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userdao.getUserById(id);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		userdao.update(user);
	}

}
