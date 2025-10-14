package multithreading;

class BankAccount {
	double balance = 100000;

	public synchronized void withdraw(String name, int amount) {
		if (balance > amount) {
			System.out.println(name + " is going to withdraw " + amount);
			try {
				Thread.sleep(1000); // Simulate time taken to withdraw
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			balance -= amount;
			System.out.println(name + " has withdrawn " + amount + ", remaining balance: " + balance);
		} else {
			System.out.println(name + " not enough balance to withdraw " + amount);
		}

	}
}

class Customer extends Thread {
	BankAccount b;
	int amount;

	public Customer(BankAccount b, String name, int amount) {
		super(name);
		this.b = b;
		this.amount = amount;
	}

	public void run() {
		b.withdraw(getName(), amount);
	}
}

class Customer1 extends Thread {
	BankAccount b;
	int amount;

	public Customer1(BankAccount b, String name, int amount) {
		super(name);
		this.b = b;
		this.amount = amount;
	}

	public void run() {

		b.withdraw(getName(), amount);
	}
}

public class BankMultithreading {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bank = new BankAccount();
		Customer c1 = new Customer(bank, "RJ", 2000);
		Customer1 c2 = new Customer1(bank, "PJ", 3000);
		c1.start();
		c2.start();

		try {
			c1.join(); // Wait for Customer 1 to finish
			c2.join(); // Wait for Customer 2 to finish
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
