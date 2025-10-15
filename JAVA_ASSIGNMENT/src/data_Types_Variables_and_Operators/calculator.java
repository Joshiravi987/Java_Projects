package data_Types_Variables_and_Operators;

public class calculator {
// Create a calculator using arithmetic and relational operators.
	// Arithmetic Operators
	int add(int a, int b) {
		return a + b;
	}

	int subtract(int a, int b) {
		return a - b;
	}

	int multiply(int a, int b) {
		return a * b;
	}

	int divide(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("Division by zero is not allowed.");
		}
		return a / b;
	}
//relational operators
	
	boolean isEqual(int a, int b) {
		return a == b;
	}

	boolean isGreater(int a, int b) {
		return a > b;
	}

	boolean isLess(int a, int b) {
		return a < b;
	}

	boolean isGreaterOrEqual(int a, int b) {
		return a >= b;
	}

	boolean isLessOrEqual(int a, int b) {
		return a <= b;
	}

	boolean isNotEqual(int a, int b) {
		return a != b;
	}
	// Main method to test the calculator

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator calc = new calculator();
		int a = 10;
		int b = 5;
		System.out.println("Addition: " + calc.add(a, b));
		System.out.println("Subtraction: " + calc.subtract(a, b));
		System.out.println("Multiplication: " + calc.multiply(a, b));
		System.out.println("Division: " + calc.divide(a, b));
		System.out.println("Is Equal: " + calc.isEqual(a, b));
		System.out.println("Is Greater: " + calc.isGreater(a, b));
		System.out.println("Is Less: " + calc.isLess(a, b));
		System.out.println("Is Greater or Equal: " + calc.isGreaterOrEqual(a, b));
		System.out.println("Is Less or Equal: " + calc.isLessOrEqual(a, b));
		System.out.println("Is Not Equal: " + calc.isNotEqual(a, b));
		System.out.println("Division by zero test:");

	}

}
