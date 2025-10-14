package com.dao;

import java.util.List;

import com.model.User;

public interface DatadaoI {

	//insert query
	public String InsertData(User user);
	//show all data
	List<User> showalldata();
	//delete data
	public User deleteData(int id);
	//update data
	public int updateData(User user);
	//get single user by id
	public User getUserById(int Id);
	//login
	public User login(String email,String password);
	int updateDataWithPhoto(User user);
}
