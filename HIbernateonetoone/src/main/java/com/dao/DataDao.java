package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Student;
import com.util.Dbutil;

public class DataDao {
	Dbutil db = new Dbutil();
	Session session;
	Transaction tx;
	
	public void SaveData(Student s) {
		session = db.gSession();
		tx = session.beginTransaction();
		session.save(s);
		tx.commit();
		session.close();
		System.out.println("Data Saved Successfully");
		
	}

}
