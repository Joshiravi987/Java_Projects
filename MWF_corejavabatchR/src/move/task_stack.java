package move;

import java.util.Scanner;
import java.util.Stack;

public class task_stack {
	// Stack is a data structure that allows adding and removing elements in a
	// specific order.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();

		int choice;
		do {
			System.out.println("\n--- Stack Menu ---");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter value to push: ");
				int value = sc.nextInt();
				stack.push(value);
				System.out.println(value + " pushed to stack.");
				break;

			case 2:
				if (stack.isEmpty()) {
					System.out.println("Stack is empty. Cannot pop.");
				} else {
					int popped = stack.pop();
					System.out.println(popped + " popped from stack.");
				}
				break;

			case 3:
				if (stack.isEmpty()) {
					System.out.println("Stack is empty.");
				} else {
					System.out.println("Stack elements: " + stack);
				}
				break;

			case 4:
				System.out.println("Exiting program...");
				break;

			default:
				System.out.println("Invalid choice! Please enter 1-4.");
				break;
			}
		} while (choice != 4);

		sc.close();
	}

}
