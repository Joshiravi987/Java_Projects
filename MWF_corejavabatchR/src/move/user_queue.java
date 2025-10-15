package move;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class user_queue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Add element to queue");
		System.out.println("2. Remove element from queue");
		System.out.println("3. peek element from queue");
		System.out.println("4. Display queue");
		System.out.println("5. Exit");
		int choice = 0;
		do {
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter element to add to queue:");
				int element = sc.nextInt();
				queue.add(element); // Add element to the queue
				System.out.println("Element " + element + " added to queue.");
				break;
			case 2:
				System.out.println("whihc element to remove from queue:");
				int removeElement = sc.nextInt();
				if (queue.remove(removeElement)) { // Remove the specified element from the queue
					System.out.println("Element " + removeElement + " removed from queue.");
				} else {
					System.out.println("Element " + removeElement + " not found in queue.");
				}
				break;
			case 3:
				if (!queue.isEmpty()) {
					System.out.println("Front element: " + queue.peek()); // View the front element without removing it
				} else {
					System.out.println("Queue is empty.");
				}
				break;
			case 4:
				if (!queue.isEmpty()) {
					System.out.println("Queue: " + queue); // Print the queue
				} else {
					System.out.println("Queue is empty.");
				}
				break;
			case 5:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}
		} while (choice != 5);
	}

}
