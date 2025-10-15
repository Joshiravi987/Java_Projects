package OOPS;

import java.util.Scanner;

public class User_calculator {
//user defined calculator

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int result;
		var input = new Scanner(System.in);
		System.out.println("Enter first number:");
		a = input.nextInt();
		System.out.println("Enter second number:");
		b = input.nextInt();

		Scanner op = new Scanner(System.in);
		System.out.println("Enter operation to be performed: +, -, *, /");
		String operation = op.nextLine();
		switch (operation) {
		case "+":
			result = a + b;
			System.out.println("Result: " + result);
			break;
		case "-":
			result = a - b;
			System.out.println("Result: " + result);
			break;
		case "*":
			result = a * b;
			System.out.println("Result: " + result);
			break;
		case "/":
			if (b != 0) {
				result = a / b;
				System.out.println("Result: " + result);
			} else {
				System.out.println("Error: Division by zero is not allowed.");
			}
			break;
		default:
			System.out.println("Error: Invalid operation. Please enter +, -, *, or /.");
			break;
		}
	}
}
