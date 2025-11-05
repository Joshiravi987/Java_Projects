package com.test;

import java.util.ArrayList;

import com.dao.Datadao;
import com.model.Department;
import com.model.Employee;

public class Runfile {
public static void main(String[] args)
{
	Department dept = new Department();
	dept.setDeptName("HR");
	
	Department dept1 = new Department();
	dept1.setDeptName("IT");
	Datadao dao=new Datadao();

	Employee emp=new Employee();
	emp.setEmpName("DEV");
	emp.setEmpsal(100000);
	emp.setDepartment(dept);
	
	Employee emp1=new Employee();
	emp1.setEmpName("DAKSH");
	emp1.setEmpsal(210000);
	emp1.setDepartment(dept);
	
	Employee emp2=new Employee();
	emp2.setEmpName("DARSHAK");
	emp2.setEmpsal(305000);
	emp2.setDepartment(dept);
	
	Employee emp3=new Employee();
	emp3.setEmpName("JIGNESH");
	emp3.setEmpsal(150000);
	emp3.setDepartment(dept1);
	
	Employee emp4=new Employee();
	emp4.setEmpName("KIRAN");
	emp4.setEmpsal(250000);
	emp4.setDepartment(dept1);
	
	ArrayList<Employee> emplist=new ArrayList<Employee>();
	emplist.add(emp);
	emplist.add(emp1);
	emplist.add(emp2);
	
	ArrayList<Employee> emplist1=new ArrayList<Employee>();
	emplist1.add(emp3);
	emplist1.add(emp4);
	
	
	dept.setEmployees(emplist);
	dept1.setEmployees(emplist1);
	dao.SaveDepartment(dept);
	dao.SaveDepartment(dept1);
	System.out.println("Data Saved !");
}
}