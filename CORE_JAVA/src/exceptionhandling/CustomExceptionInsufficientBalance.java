package exceptionhandling;

class InsufficientBalanceException extends Exception{

	public InsufficientBalanceException(String message) {
		super(message);
	}
	
}


public class CustomExceptionInsufficientBalance {

	double balance = 1000.00;
	double withdrawAmount = 110000.00;
	
	void withdraw() throws InsufficientBalanceException {
		if(withdrawAmount <= balance) {
			System.out.println("Available balance: " + (balance - withdrawAmount));
		} else {
			throw new InsufficientBalanceException("Insufficient balance for withdrawal of " + withdrawAmount);
		}
	}

	public static void main(String[] args) {
		CustomExceptionInsufficientBalance obj = new CustomExceptionInsufficientBalance();
		try {
			obj.withdraw();
		} catch (InsufficientBalanceException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
