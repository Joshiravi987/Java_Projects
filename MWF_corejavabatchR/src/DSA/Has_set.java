package DSA;

import java.util.HashSet;

public class Has_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		
		System.out.println("HashSet elements: " + hs); // Displaying the HashSet elements
		
		// Checking if an element exists in the HashSet
		if (hs.contains(30)) { 
			System.out.println("HashSet contains 30");
		} else {
			System.out.println("HashSet does not contain 30");
		}
		// Checking if an element exists in the HashSet
		
		System.out.println("DOes HashSet contain 30? " + hs.contains(30)); // Checking for an element not in the set
		// Removing an element from the HashSet
		hs.remove(20); 
		System.out.println("HashSet after removing 20: " + hs);
		 // Getting the size of the HashSet
		System.out.println("Size of HashSet: " + hs.size());
		// clearing the HashSet
		hs.clear();
		// Checking if the HashSet is empty
		System.out.println("Is HashSet empty? " + hs.isEmpty());
		// Adding elements again to demonstrate that it is empty
		hs.add(100);
		hs.add(200);
		System.out.println("HashSet after adding elements again: " + hs);
		// Iterating through the HashSet
		System.out.println("Iterating through HashSet:");
		for (Integer element : hs) {
			System.out.println(element);
		}
		
	}

}
