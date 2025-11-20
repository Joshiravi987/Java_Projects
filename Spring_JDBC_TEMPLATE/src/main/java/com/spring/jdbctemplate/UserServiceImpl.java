package com.spring.jdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service ("userservice")
@Transactional
public class UserServiceImpl implements UserService{
	
	
	@Autowired
	UserDao userdao;

	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		userdao.register(user);
	}

}
