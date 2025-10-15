package DSA;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_list_1 {
	// This class is a placeholder for Array List operations
	public Array_list_1() {
		// TODO Auto-generated constructor stub
		ArrayList<Integer> ak = new ArrayList<>();
		ak.add(10);
		ak.add(20);
		ak.add(30);
		ak.add(40);
		ak.add(50);
		ak.add(60);
		System.out.println("your index is " + ak.get(2));
		ak.set(3, 232);
		System.out.println("removed element is " + ak.remove(4));
		ak.add(70);
		System.out.println("find element from given index"+ak.get(0));
		ak.addLast(80);
		ak.addFirst(90);
		System.out.println("ArrayList after adding elements: " + ak);
		ak.removeLast();
		ak.removeFirst();
		System.out.println("ArrayList after removing first and last elements: " + ak);
		
			Iterator<Integer> i = ak.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Array_list_1();
	}

}
