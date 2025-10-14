package dsa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Employee {
	int id;
	String name;
	String department;
	double salary;
	java.time.LocalDate joiningDate;
	
	public Employee(int id, String name, String department, double salary, java.time.LocalDate joiningDate) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.joiningDate = joiningDate;
	}
}


public class EmployeeArrayList {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<Employee> al = new ArrayList<>();
	 int choice;
	 do {
		 System.out.println("\n--- Employee Menu ---");
		 System.out.println("1. Enter Employee Data");
		 System.out.println("2. Search Employee Data");
		 System.out.println("3. Delete Employee Data");
		 System.out.println("4. Display Remaining Employee Data");
		 System.out.println("5. Max salary Employee");
		 System.out.println("6. Min salary Employee");
		 System.out.println("7. Exit");
		 System.out.print("Please select an option (1-7): ");
		 
		 int op = sc.nextInt();
		 
		 switch(op) {
		 case 1: 
			 
			 System.out.println("Enter total number of Employees: ");
			 int size = sc.nextInt();
			 for(int i=0 ; i<size; i++) {
				 System.out.println("Enter Employee ID "+(i+1)+": ");
				 int id = sc.nextInt();
				 
				 System.out.println("Enter Employee Name "+(i+1)+": ");
				 String name = sc.next();
				 
				 System.out.println("Enter Employee Department "+(i+1)+": ");
				 String department = sc.next();
				 
				 System.out.println("Enter Employee Salary "+(i+1)+": ");
				 double salary = sc.nextDouble();
				 
				 System.out.println("Enter Employee Joining Date (YYYY-MM-DD) "+(i+1)+": ");
				 String date = sc.next();
				 LocalDate joiningDate = LocalDate.parse(sc.next());
		

Employee e = new Employee(id, name, department, salary, joiningDate);
al.add(e);
System.out.println("Record Added successfully...!");
}
break;

// Search Employee Data
case 2:
System.out.print("\nEnter employee ID you want to search: ");
int s_id = sc.nextInt();
boolean foundSearch = false;
for (Employee emp : al) {
if (emp.id == s_id) {
    System.out.println("ID: " + emp.id + ", Name: " + emp.name +
            ", Department: " + emp.department + ", Salary: " + emp.salary +
            ", Joining Date: " + emp.joiningDate);
    foundSearch = true;
    break;
}
}
if (!foundSearch) {
System.out.println("ID not found..!");
}
break;

// Delete Employee Data
case 3:
System.out.print("\nEnter ID you want to delete: ");
int r_id = sc.nextInt();
boolean foundDelete = false;
Iterator<Employee > it = al.iterator();
while (it.hasNext()) {
Employee emp = it.next();
if (emp.id == r_id) {
    it.remove();
    foundDelete = true;
    System.out.println("Record Deleted successfully...!");
}
}
if (!foundDelete) {
System.out.println("ID not found..!");
}
break;

// Display Remaining Employee Data
case 4:
System.out.println("\n--- Employees Data ---");
if (al.isEmpty()) {
System.out.println("No records found.");
} else {
for (Employee emp : al) {
    System.out.println("ID: " + emp.id + ", Name: " + emp.name +
            ", Department: " + emp.department + ", Salary: " + emp.salary +
            ", Joining Date: " + emp.joiningDate);
}
}
break;

// Max salary Employee
case 5:
if (al.isEmpty()) {
System.out.println("No records to compare.");
break;
}
double maxSalary = al.get(0).salary;
String maxEmpName = al.get(0).name;
for (Employee emp : al) {
if (emp.salary > maxSalary) {
    maxSalary = emp.salary;
    maxEmpName = emp.name;
}
}
System.out.println("Employee with max salary: " + maxEmpName + " with salary: " + maxSalary);
break;

// Min salary Employee
case 6:
if (al.isEmpty()) {
System.out.println("No records to compare.");
break;
}
double minSalary = al.get(0).salary;
String minEmpName = al.get(0).name;
for (Employee emp : al) {
if (emp.salary < minSalary) {
    minSalary = emp.salary;
    minEmpName = emp.name;
}
}
System.out.println("Employee with min salary: " + minEmpName + " with salary: " + minSalary);
break;

// Exit
case 7:
System.out.println("Exiting program...");
System.exit(0);
break;

default:
System.out.println("Not a valid option, please try again.");
break;
}

System.out.print("\nDo you want to continue? (1 for yes / 0 for no): ");
choice = sc.nextInt();

} while (choice == 1);

sc.close();
}
}
