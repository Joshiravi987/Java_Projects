package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.MAIN;
import com.util.Dbconn;

public class DataDao {
Session s;
Transaction t;
Dbconn db = new Dbconn();

public void InsertData(MAIN main) {
	s=db.gSession();
	t=s.beginTransaction();
	s.save(main);
	t.commit();
	s.close();
	
}


}
