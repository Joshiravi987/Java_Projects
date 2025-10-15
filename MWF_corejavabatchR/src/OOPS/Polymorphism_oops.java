package OOPS;
//compile time polymorphism

//run time Polymorphisam
//method overloading -> same method name with different parameters
//method overriding -> same method name in parent and child class

public class Polymorphism_oops {
	int balance;

	void deposit(int amount) {
		balance += amount;
		System.out.println("Deposited: " + amount);
		System.out.println(getbalance());
	}

	void deposit(int amount, String name) {
		balance += amount;
		System.out.println("Deposited: " + amount + " by " + name);
		System.out.println(getbalance());
	}

	void deposit(int amount, String name, String bankName) {
		balance += amount;
		System.out.println("Deposited: " + amount + " by " + name + " in " + bankName);
		System.out.println(getbalance());
	}

	void deposit(int amount, String name, String bankName, String branch) {
		balance += amount;
		System.out.println("Deposited: " + amount + " by " + name + " in " + bankName + ", " + branch);
		System.out.println(getbalance());
	}

	void deposit(int amount, double consverionRate) {
		balance += amount;
		double convertedAmount = amount * consverionRate;
		System.out.println("Deposited: " + amount + consverionRate + " converted to " + convertedAmount);
	}

	public int getbalance() {
		return balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism_oops p = new Polymorphism_oops();
		p.deposit(1000);
		p.deposit(2000, "RAVI");
		p.deposit(3000, "RAVI", "HDFC");
		p.deposit(4000, "RAVI", "HDFC", "BARODA");
		p.deposit(5000, 0.012); // Example with conversion rate
		int currentBalance = p.getbalance();
		System.out.println("Current Balance: " + currentBalance);
	}
}
