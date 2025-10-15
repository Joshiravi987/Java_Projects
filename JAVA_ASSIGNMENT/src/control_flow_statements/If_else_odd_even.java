package control_flow_statements;

public class If_else_odd_even {
	//find odd or even number using if else statement
	public static void checkOddEven(int a) {
		if (a % 2 == 0) {
			System.out.println(a + " is an even number.");
		} else {
			System.out.println(a + " is an odd number.");
		}
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method st
		checkOddEven(10); // Example input
		checkOddEven(15); // Example input
		checkOddEven(0);  // Example input
		checkOddEven(-3); // Example input
	}

}
