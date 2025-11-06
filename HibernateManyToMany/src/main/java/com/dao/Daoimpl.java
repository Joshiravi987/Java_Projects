package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Students;
import com.util.Dbconn;

public class Daoimpl {
Session session;
Dbconn db=new Dbconn();
Transaction tx;
public void SaveData(Students stu)
{
	session=db.gSession();
	tx=session.beginTransaction();
	session.save(stu);
	tx.commit();
	session.close();

}
}
