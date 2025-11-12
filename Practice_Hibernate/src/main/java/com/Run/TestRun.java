package com.Run;

import com.dao.DataDao;
import com.model.MAIN;

public class TestRun {
public static void main(String[] args) {
	MAIN m = new MAIN();
	m.setRollno(12);
	m.setName("Darshak");
	m.setPassword("dar@123");
	
	DataDao d = new DataDao();
	d.InsertData(m);
	System.out.println("Data inserted successfully.");
}

}
