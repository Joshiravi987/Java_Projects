package multithreading;

class Thread_B {
	int balance = 1000;
	public void withdraw(int amount) {
		if (balance >= amount) {
			System.out.println(Thread.currentThread().getName() + " is going to withdraw " + amount);
			try {
				Thread.sleep(1000); // Simulate time taken to withdraw
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance -= amount;
			System.out.println(Thread.currentThread().getName() + " has withdrawn " + amount + ", remaining balance: " + balance);
		} else {
			System.out.println( " not enough balance to withdraw ");
		}
	}
}
public class BankClass {
public static void main(String[] args) {

	Thread_B bank = new Thread_B();
	Runnable task = () -> {
		for (int i = 0; i < 3; i++) {
			bank.withdraw(400);
		}
		};
		Thread b1 = new Thread(task,"ATM 1");
		Thread b2 = new Thread(task,"ATM 2");
		b1.start();
		b2.start();
	
	}
}

