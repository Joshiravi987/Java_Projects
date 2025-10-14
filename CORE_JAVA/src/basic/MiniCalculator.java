package basic;

import java.util.Scanner;

public class MiniCalculator {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a and b ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Enter symbol");
		char operator = sc.next().charAt(0);
		
		switch (operator) {
		case '+':
			System.out.println("Addition :" + (a + b));
			break;
		case '-':
			System.out.println("Substraction " + (a - b));
			break;
		case '*':
			System.out.println("Multiplication :" + (a * b));
		case '/':
			if (b == 0) {
				System.out.println("divide by zero is not allowed");
			} else {
				System.out.println("Division: " + (a / b));
			}
			break;
		default:
			System.out.println("Invalid operation. Please choose +, -, *, or /.");
			break;
		}

	}
}