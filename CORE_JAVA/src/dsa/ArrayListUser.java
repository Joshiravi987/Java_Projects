package dsa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListUser {
public ArrayListUser() {
	//creating array list
	ArrayList<Integer> al = new ArrayList<Integer>();
	Scanner sc = new Scanner (System.in);
	 
	// ask user for size
	System.out.println("Enter the size of Arraylist:");
	int size = sc.nextInt();
	for (int i=0; i < size;  i++) {
		System.out.println("Enter element "+ (i+1)+ ":");
		int arr = sc.nextInt();
		al.add(arr);
		
	}
	ArrayList<String> st = new ArrayList<String>();
	System.out.println("Enter the size of arraystring :");
	int size1 = sc.nextInt();
	sc.nextLine();
	//add elements to array list for string
	for (int i=0 ;i<size1;i++) {
		System.out.println(" Enter string "+ (i+1) + ":" );
		String arr= sc.next();
		st.add(arr);
		
	}
	//printing the Array list using while loop
	Iterator<Integer> it = al.iterator();
	while(it.hasNext()) {
		System.out.println("Element is: " + it.next());
	}
	
	//printing the Array list using for each loop
	for (int element : al) {
		System.out.println("Using each loop: " + element);
		}
	//printing the Array list using for loop
	for (int i=0; i<al.size(); i++) {
		System.out.println("Using for loop index at " + i + ": " + al.get(i));
	}
	// printing the Array list for string using while loop
	Iterator<String> it1 = st.iterator();
	while(it1.hasNext()) {
		System.out.println("Element is: " + it1.next());
	}
	//printing the Array list for string using for each loop
	for (String element : st) {
		System.out.println("Using each loop: " + element);
	}
	//printing the Array list for string using for loop
	for (int i=0; i<st.size(); i++) {
		System.out.println("Using for loop index at " + i + ": " + st.get(i));
	}
	sc.close();
}
public static void main(String[] args) {
	new ArrayListUser();
}
}
