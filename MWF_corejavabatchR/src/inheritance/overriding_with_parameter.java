package inheritance;
class employe {
	int salary;
	int id;
	String name;
	void display(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		System.out.println("Employee class details are :");
		System.out.println("ID :: " + 1);
		System.out.println("" + "Name :: " + "Ravi");
		System.out.println("" + "Salary :: " + 5000000);
	}
}
class Manager1 extends employe {
	int teamsize;
	void display(int id, String name, int salary) {
		super.display(id, name, salary);
		this.teamsize = 10;
		System.out.println("\n" + "Manager class details are :");
		System.out.println("Team size: " + 10);
		System.out.println("ID: " + 2);
		System.out.println("Name :: " + "Dev");
		System.out.println("" + "Salary :: " + 16000000);
	}
}

class HR1 extends Manager1 {
	String department = "IT";

	void display(int id, String name, int salary) {
		super.display(id, name, salary);
		System.out.println("HR class details are :");
		System.out.println("Department:" + department);
		System.out.println("" + "ID :: " + id);
		System.out.println("Name :: " + name);
		System.out.println("" + "Salary :: " + salary);
	}
}
public class overriding_with_parameter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HR1 hr = new HR1();
		hr.display(1, "Ravi", 5000000);
	}
}