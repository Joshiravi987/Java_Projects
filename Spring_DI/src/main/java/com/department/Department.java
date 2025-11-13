package com.department;

import com.employee.Employee;

//Constructor injection
public class Department {

	int Dept_id;
	public int getDept_id() {
		return Dept_id;
	}
	public void setDept_id(int dept_id) {
		Dept_id = dept_id;
	}
	public String getDept_name() {
		return Dept_name;
	}
	public void setDept_name(String dept_name) {
		Dept_name = dept_name;
	}
	String Dept_name;
	Employee emp;         //dependency
	Department(int dept_id,String dept_name,Employee emp){
		this.Dept_id = dept_id;
		this.Dept_name = dept_name;
		this.emp=emp;
	}
	public void getEmployeeDetails() {
		System.out.println("Employee Details: ");
		System.out.println("Employee ID: "+ emp.getEmp_id());
		System.out.println("Employee Name: " + emp.getEmp_name());
	}
	
}
