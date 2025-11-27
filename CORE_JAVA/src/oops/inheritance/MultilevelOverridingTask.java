package oops.inheritance;

import java.util.Scanner;

class Employee1 {
	int salary;
	int id;
	String name;
	String department;
	int teamsize;

	Scanner sc = new Scanner(System.in);
	void display() {
		System.out.println("Enter Employee id");
		id = sc.nextInt();
		System.out.println("Enter Employee name");
		name = sc.next();
		System.out.println("Enter Employee salary");
		salary = sc.nextInt();
		System.out.println("\n" + "Employee class id : " + id + "\n " + " name :" + name + "\n " + " salary :" + salary);
	}
}
class Manager1 extends Employee1{
	void display() {
		super.display(); 
		System.out.println(""+ "\n"+"Manager class details are :");
		System.out.println("Enter manager id");
		id = sc.nextInt();
		System.out.println("Enter manager name");
		name = sc.next();
		System.out.println("Enter manager salary");
		salary = sc.nextInt();
		System.out.println("Enter team size");
		int teamsize = sc.nextInt();
		// Displaying the details of the manager
		System.out.println("" + "\n" + "Manager class id: " + id + "\n" + "name: " + name + "\n" + "salary: " + salary + "\n" + "team size: " + teamsize);
		}
}
class HR1 extends Manager1{
	void display() {
		super.display();
		System.out.println("" + "\n" + "HR class details are :");
		System.out.println("Enter HR id");
		id = sc.nextInt();
		System.out.println("Enter HR name");
		name = sc.next();
		System.out.println("Enter HR salary");
		salary = sc.nextInt();
		System.out.println("Enter department name");
		String department = sc.next();
		System.out.println("" + "\n" + "HR class id: " + id + "\n" + "name: " + name + "\n" + "salary: " + salary + "\n" + "department: " + department);
		}
}
public class MultilevelOverridingTask {
public static void main(String[] args) {
	HR1 hr = new HR1();
	hr.display();
}
}