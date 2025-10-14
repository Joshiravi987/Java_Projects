package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

import com.model.User;
import com.util.Dbconn;

public class DataDao {
	
	
Session s;
Transaction t;
Dbconn db= new Dbconn();
//method to insert data into the database
public void InsertData(User user) {
	s=db.gSession();
	t=s.beginTransaction();
	s.save(user);
	t.commit();
	s.close();
	
}
//method to update data in the database
public void UpdateData(User user) {
	s=db.gSession();
	t=s.beginTransaction();
	s.update(user);
	t.commit();
	s.close();
}
//method to delete data from the database
public void DeleteData(User user) {
	s=db.gSession();
	t=s.beginTransaction();
	s.delete(user);
	t.commit();
	s.close();
}
//method for fetching data from the database
public User FetchData(int id)
{
	s=db.gSession();
	User u=(User) s.get(User.class, id);
	s.close();
	return u;
	
}
//fetch all data from the database
public List<User> FetchAllData()
{
	s=db.gSession();
	List<User> list=s.createQuery("from User").list();

	return list;

}
}
