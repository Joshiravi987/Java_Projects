package Exception_handlng;

public class Ex_1 {
// This class demonstrates exception handling in Java
	// It includes a method to handle division by zero and another to handle array
	// index out of bounds
	// exception handling is a mechanism to handle runtime errors, allowing the
	// program to continue running or terminate gracefully
	// exception has 2 types: checked and unchecked
	// 1. compile time exception: checked exception
	// 2. runtime exception: unchecked exception

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 10 / 0;

			System.out.println(a);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("After exception handling");

	}

}
