package com.employee;
//constructor injection
public class Employee {
	
int Emp_id;
String Emp_name;
public Employee(int emp_id, String emp_name) {
	this.Emp_id = emp_id;
	this.Emp_name = emp_name;
}
public int getEmp_id() {
	return Emp_id;
}
public void setEmp_id(int emp_id) {
	Emp_id = emp_id;
}
public String getEmp_name() {
	return Emp_name;
}
public void setEmp_name(String emp_name) {
	Emp_name = emp_name;
}
}
