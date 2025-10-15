package DSA;
//Arraylist is a resizable array implementation of the List interface in Java.
import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_class {
public Arraylist_class() {
	//create an ArrayList
	ArrayList<Integer> al = new ArrayList<Integer>();
	//add elements to the ArrayList
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	//print the ArrayList
	Iterator<Integer> it = al.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	//print by for each loop
	for(Integer i : al) {
		System.out.println("for each loop"+i);
	}
	//using for loop
	for (int i = 0; i < al.size(); i++) {
		System.out.println("for loop"+al.get(i));
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Arraylist_class();
	}

}
