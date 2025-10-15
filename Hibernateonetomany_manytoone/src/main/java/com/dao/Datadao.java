package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Department;
import com.util.Dbutil;

public class Datadao {

	Dbutil db = new Dbutil();
	Session session;
	Transaction tx;
	public void SaveDepartment(Department dept)
	{
		session = db.gSession();
		tx=session.beginTransaction();
		session.save(dept);
		tx.commit();
		session.close();
		System.out.println("Data Saved !");
	}
}