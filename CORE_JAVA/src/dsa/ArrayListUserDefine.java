package dsa;

import java.security.DomainCombiner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListUserDefine {
public ArrayListUserDefine() {
	// creating Array list
	ArrayList<Integer> al = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	
	//Ask user for size 
	System.out.println("Enter the size of Arraylist ");
	int size = sc.nextInt();
	
	// add elements to arraylist
	for (int i=0;i<size ;i++) {
		System.out.println("Enter element " + (i+1) + ":");
		int arr = sc.nextInt();
		al.add(arr);
	}
	// print using while loop with iterator
	Iterator<Integer> it = al.iterator();
	System.out.println("\n--- Using Iterator ---");
	while (it.hasNext()) {
		System.out.println("Element (while loop): " + it.next());
	}
	
	// print using for-each loop
	System.out.println("\n--- Using for-each loop ---");
	for (int element : al) {
		System.out.println("Element (for-each): " + element);
	}
	// print using for loop
	System.out.println("\n--- Using for loop ---");
	for(int i = 0; i < al.size(); i++) {
		System.out.println("Element at index " + i + ": " + al.get(i));
	}
	// close scanner
		sc.close();
		
}
public static void main(String[] args) {
	new ArrayListUserDefine();
}
}
