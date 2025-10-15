package DSA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Array_list_used {
public Array_list_used() {
	// TODO Auto-generated constructor stub
	//creatimg arryllist\
	ArrayList<Integer> al = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	// Ask user for size
	System.out.println("Enter the size of ArrayList:");
	int size = sc.nextInt();
	for (int i = 0; i < size; i++) {
		System.out.println("Enter element " + (i + 1) + ":");
		int arr = sc.nextInt();
		al.add(arr);
	}
//	sc.nextLine(); // Consume the newline character left by nextInt()
	ArrayList<String> al1 = new ArrayList<String>();
	System.out.println("Enter the size of ArrayList for String:");
	int size1 = sc.nextInt();
	sc.nextLine(); // Consume the newline character left by nextInt()
	// Add elements to ArrayList for String
	for (int i = 0; i < size1; i++) {
		System.out.println("Enter Sting " + (i + 1) + ":");
		String arr = sc.next();
		al1.add(arr);
	}

	// Add elements to ArrayList
	
	//printing the ArrayList using while loop
	Iterator<Integer> it = al.iterator();
	while(it.hasNext()) {
		System.out.println("Element is: " + it.next());
	}
	//printing the ArrayList using for each loop
	for(int element : al) {
		System.out.println("usign each loop " + element);
	}
		//printing the ArrayList using for loop 
		for(int i=0 ; i< al.size();i++) {
			System.out.println("using for loop "+"index at "+ i +":"+ al.get(i));
		
	}
		//printing the ArrayList for String using while loop
		Iterator<String> it1 = al1.iterator();
		while(it1.hasNext()) {
			System.out.println("Element is: " + it1.next());
		}
		//printing the ArrayList for String using for each loop
		for(String element : al1) {
			System.out.println("usign each loop " + element);
		}
			//printing the ArrayList for String using for loop 
			for(int i=0 ; i< al1.size();i++) {
				System.out.println("using for loop "+"index at "+ i +":"+ al1.get(i));
			
		}
		sc.close();	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Array_list_used();
	}

}
