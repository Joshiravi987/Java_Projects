package com.test;

import java.util.ArrayList;

import com.dao.Daoimpl;
import com.model.Courses;
import com.model.Students;

public class Testrun {
public static void main(String[] args)
{
	Students stu = new Students();
	stu.setStudentName("Dev");
	stu.setStudentsemester(" 1 ");
	
	Students stu1 = new Students();
	stu1.setStudentName("Daksh");
	stu1.setStudentsemester(" 2 ");
	
	ArrayList<Students> studentlist = new ArrayList<Students>();
	studentlist.add(stu);
	studentlist.add(stu1);
	
	Courses course = new Courses();
	course.setCourseName("C");
	
	Courses course1 = new Courses();
	course1.setCourseName("C++");
	
	Courses course2 = new Courses();
	course2.setCourseName("Java");
	
	Courses course3 = new Courses();
	course3.setCourseName("Python");
	
	ArrayList<Courses> courselist = new ArrayList<Courses>();
	courselist.add(course);
	courselist.add(course1);
	courselist.add(course2);
	courselist.add(course3);
	
	course.setStudents(studentlist);
	course1.setStudents(studentlist);
	course2.setStudents(studentlist);
	course3.setStudents(studentlist);
	
	stu.setCourses(courselist);
	stu1.setCourses(courselist);
	Daoimpl dao = new Daoimpl();
	dao.SaveData(stu);
	dao.SaveData(stu1);
	
	
	
}
}
