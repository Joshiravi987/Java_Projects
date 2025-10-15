package com.test;

import java.util.ArrayList;

import com.dao.Datadao;
import com.model.Department;
import com.model.Employee;

public class Runfile {
public static void main(String[] args)
{
	Department dept = new Department();
	dept.setDeptName("Mth");
	Datadao dao=new Datadao();

	Employee emp=new Employee();
	emp.setEmpName("john");
	emp.setEmpsal(1000000);
	emp.setDepartment(dept);
	
	Employee emp1=new Employee();
	emp1.setEmpName("xyz");
	emp1.setEmpsal(200000);
	emp1.setDepartment(dept);
	
	Employee emp2=new Employee();
	emp2.setEmpName("abc");
	emp2.setEmpsal(285000);
	emp2.setDepartment(dept);
	ArrayList<Employee> emplist=new ArrayList<Employee>();
	emplist.add(emp);
	emplist.add(emp1);
	emplist.add(emp2);
	
	dept.setEmployees(emplist);
	dao.SaveDepartment(dept);
	System.out.println("Data Saved !");
}
}