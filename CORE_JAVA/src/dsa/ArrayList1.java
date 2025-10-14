package dsa;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
public ArrayList1() {
	ArrayList<Integer> ak = new ArrayList<>();
	ak.add(10);
	ak.add(20);
	ak.add(30);
	ak.add(40);
	ak.add(50);
	ak.add(60);
	System.out.println("your index is "+ ak.get(2));
	ak.set(3, 212);
	System.out.println("remove element is" + ak.remove(4));
	ak.add(90);
	System.out.println("find element from given index"+ ak.get(0));
ak.addLast(100);
ak.addFirst(5);
System.out.println("Arraylist after adding element :" + ak);
ak.removeLast();
ak.removeFirst();
System.out.println("Arraylist after removing first and last elements : "+ak);
	Iterator<Integer> i = ak.iterator();
	while (i.hasNext()) {
		System.out.println(i.next());
	}
}
public static void main(String[] args) {
	new ArrayList1();
}
}