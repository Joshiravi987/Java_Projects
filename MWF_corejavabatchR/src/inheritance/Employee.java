package inheritance;

class employee1 {
	int id;
	String name;

	public employee1(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void displayDetails() {
		System.out.println("Employee detail ::");
		System.out.println("ID:" + id+"\t"+"Name:" + name);
	}
}

class FullTimeEmployee extends employee1 {
	int salary;
	int id;
	String name;
	
	public FullTimeEmployee(int id, String name, int salary) {
		super(1,"dev");
		this.id=id;
		this.name=name;
		this.salary = salary;
		
	}

	void displayDetails() {
		super.displayDetails();
		System.out.println("Full time employee:: " + name +"  "+ "ID :"+id);
		System.out.println("Salary detail:: " + salary);
	}
}

class PartTimeEmployee extends FullTimeEmployee {
	double hourlyRate;
	int hoursWorked;
	int salary;
	int id;
	String name;
	public PartTimeEmployee(int id, String name, int salary, int hoursWorked, int hourlyRate) {
		super(3, "Ravi", 5000000);
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	void displayDetails() {
		super.displayDetails();
		System.out.println("Part-time employee payment details: ");
		System.out.println("ID:"+id+"  "+"NAME:"+ name+"  "+"Salary:"+salary);
		double totalPayment = hourlyRate * hoursWorked;
		System.out.println("Hourly rate: " + hourlyRate);
		System.out.println("Hours worked: " + hoursWorked);
		System.out.println("Total payment: " + totalPayment);
		
	}

}

class Employees {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PartTimeEmployee pte = new PartTimeEmployee(3, "Amit", 60000, 20, 500);
		pte.displayDetails();

	}

}