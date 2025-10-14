package com.Run;

import com.dao.DataDao;
import com.model.Student;
import com.model.Subject;

public class RunFile {
	public static void main(String[] args) {
		Subject s = new Subject();
		s.setSub_id(101);
		s.setSub_name("Java");
		System.out.println("Subject Details" +s);
		
		Student st = new Student();
		st.setRollno(1);
		st.setStd_name("Amit");
		st.setStd_mail("Amit@gmail.com");
		st.setSubjects(s); // setting subject object to student object
		DataDao dao = new DataDao();
		dao.SaveData(st);
		System.out.println("Student Details" +st);
		
		
		
	}

}
