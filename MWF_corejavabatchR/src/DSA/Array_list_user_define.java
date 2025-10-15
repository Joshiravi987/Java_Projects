package DSA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Array_list_user_define {

	public Array_list_user_define() {
		// Creating ArrayList
		ArrayList<Integer> al = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		

		// Ask user for size
		System.out.println("Enter the size of ArrayList:");
		int size = sc.nextInt();

		// Add elements to ArrayList
		for (int i = 0; i < size; i++) {
			System.out.println("Enter element " + (i + 1) + ":");
			int arr = sc.nextInt();
			al.add(arr);
		}

		// Print using while loop with iterator
		Iterator<Integer> it = al.iterator();
		System.out.println("\n--- Using Iterator ---");
		while (it.hasNext()) {
			System.out.println("Element (while loop): " + it.next());
		}

		// Print using for-each loop
		System.out.println("\n--- Using for-each loop ---");
		for (int element : al) {
			System.out.println("Element (for-each): " + element);
		}

		// Print using for loop
		System.out.println("\n--- Using for loop ---");
		for (int i = 0; i < al.size(); i++) {
			System.out.println("Element at index " + i + ": " + al.get(i));
		}

		// Close scanner
		sc.close();
	}

	public static void main(String[] args) {
		new Array_list_user_define();
	}
}
