package Encapsulation;
public class call_bank {
public static void main(String[] args) {
	 bank b = new bank();
	 b.setAccountholderName("Ravi");
	 b.setAccountNumber(123456);
	 b.setBalance(1000000.0);
	 b.setAmount(5000);
	 System.out.println("Account Holder Name: " + b.getAccountholderName());
	 System.out.println("Account Number: " + b.getAccountNumber());
	 System.out.println("Initial Balance: " + b.getBalance());
	 b.deposit(20000);
	 b.withdraw(10000);
	 System.out.println("Balance after deposit and withdrawal: " + b.getBalance());
}
}
