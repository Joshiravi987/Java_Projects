package dsa;

import java.util.ArrayList;
import java.util.Iterator;

//ArrayList is a resizable array implementation of the List interface in Java.
public class ArrayListClass {
public ArrayListClass() {
	// create an ArrayList
	ArrayList<Integer> al= new ArrayList<Integer>();
	// add elements to the ArrayList
	al.add(10);
		al.add(20);
		al.add(30);
			al.add(40);
			// print the ArrayList
			Iterator<Integer> it = al.iterator();
			while(it.hasNext()) {
				System.out.println("using iterator :"+it.next());
			}
			// print by for each loop
			for(Integer i : al) {
				System.out.println("for each loop: " + i);
			}
			// using for loop
			for (int i = 0; i < al.size(); i++) {
				System.out.println("for loop: " + al.get(i));
			}
}
public static void main(String[] args) {
	new ArrayListClass();
}
}
