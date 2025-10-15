package Exception_handlng;
class InsufficientBalanceException extends Exception{

	public InsufficientBalanceException(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}
	
}

public class Cust_ex_insufficient_bal {
	double balance = 1000.00;
	double withdraw = 11000.00;
	void withdraw() throws InsufficientBalanceException {
	if(withdraw <= balance) {
		System.out.println("Available balance"+(balance - withdraw));
	}
	else
	{
		throw new InsufficientBalanceException(" balance");
	}
	}

	public static void main(String[] args) throws InsufficientBalanceException {
		Cust_ex_insufficient_bal obj=new Cust_ex_insufficient_bal();
		obj.withdraw();
		
		// TODO Auto-generated method stub
		

	}

}
