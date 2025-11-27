package oops.inheritance;
class employe{
	int salary;
	int id;
	String name;
	void display(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		System.out.println("Employee class details are :");
		System.out.println("ID :: " + 1);
		System.out.println("Name :: " + "Ravi");
		System.out.println("Salary :: " + 500000000);
	}
}
class Manager extends employe{
	int teamsize;
	void display(int id, String name, int salary) {
		super.display(id, name, salary);
		this.teamsize = 10;
		System.out.println("\n"+"Manager class details are :");
		System.out.println("Team size: " + 15);
		System.out.println("ID: " + 2);
		System.out.println("Name :: " + "Daksh");
		System.out.println("Salary :: " + 1000000);
	}
}

class HR extends Manager{
	String department = "IT";

	void display(int id, String name, int salary) {
		super.display(id, name, salary);
		System.out.println("HR class details are :");
		System.out.println("Department:" + department);
		System.out.println("ID :: " + id);
		System.out.println("Name :: " + name);
		System.out.println("Salary :: " + salary);
	}
	}
public class OverridingWithParameter {
public static void main(String[] args) {
	HR hr = new HR();
	hr.display(1, "Ravi", 5000000);
}
}
