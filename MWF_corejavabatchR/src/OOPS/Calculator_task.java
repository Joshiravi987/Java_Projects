package OOPS;

public class Calculator_task {
	int calculate(int a, int b, int c) {
		return a + b + c;
	}
	int calculate(int a, int b) {
		return a - b;
		}
	double calculate(double a, double b ,double c) {
		return a * b * c;
	}
	double calculate(double a, double b) {
		return a / b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator_task cal = new Calculator_task();
		int addition_result = cal.calculate(10, 20, 30); // Calls the first method
		System.out.println("Addition of three numbers: " + addition_result);
		int subtraction_result = cal.calculate(50, 20); // Calls the second method
		System.out.println("Subtraction Result: " + subtraction_result);
		double multiplication_result = cal.calculate(2.5, 4.0, 3.0); // Calls the third method
		System.out.println("Multiplication Result: " + multiplication_result);
		double division_result = cal.calculate(20.0, 5.0); // Calls the fourth method
		System.out.println("Division Result: " + division_result);
		
	}

}
