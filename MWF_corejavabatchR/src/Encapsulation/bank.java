package Encapsulation;
public class bank {
private String accountholderName;
private int amount;
private double balance;
private int accountNumber;
public String getAccountholderName() {
	return accountholderName;
}
public void setAccountholderName(String accountholderName) {
	this.accountholderName = accountholderName;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public int getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}
public void deposit(double amount) {
	if (amount > 0) {
		balance += amount;
		System.out.println("Deposited: " + amount);
	} else {
		System.out.println("Deposit amount must be positive.");
	}}
	public void withdraw(double amount) {
		if (amount > 0 && amount <= this.balance) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
		} else if (amount > this.balance) {
			System.out.println("Insufficient balance for withdrawal.");
		} else {
			System.out.println("Withdrawal amount must be positive.");
		}
	
}
}


