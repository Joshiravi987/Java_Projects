package DSA;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

//Tim sort is the hybrid sorting algorithm derived from merge sort and insertion sort.
// It is designed to perform well on many kinds of real-world data.
//It is the default sorting algorithm in Java's Arrays.sort() method for objects.
//collections.sort() is a method in Java that sorts the elements of a collection in ascending order.
//Tim Sort is a stable, adaptive, and iterative sorting algorithm.
// It is stable and has a time complexity of O(n log n) in the worst case.
//It is stable, meaning that it maintains the relative order of equal elements.
//comparable is an interface in Java that allows objects to be compared to each other.
//The compareTo method is used to compare two objects of the same class.
// Comparable is used to define the natural ordering of objects of a class.
class Admin_sorting_class implements Comparable<Admin_sorting_class>{
int id;
String name;
public Admin_sorting_class(int id,String name) {
	this.id=id;
	this.name = name;
}
	@Override
	public int compareTo(Admin_sorting_class o) {
		return Integer.compare(o.id, id);//library logic
		//return name.compareTo(o.name,name);
	

		
	/*	if(id == o.id) {
			return 0;
		}
		else if (id>o.id) {
			return 1;
		}                                   //logic
		else {
		return -1; 
	}*/
	
}
}


public class sorting_algo {
	public static void main(String[] args) {
ArrayList<Admin_sorting_class> al = new ArrayList<Admin_sorting_class>();
al.add(new Admin_sorting_class(4, "test4"));
al.add(new Admin_sorting_class(1, "st1"));
al.add(new Admin_sorting_class(44, "best44"));
al.add(new Admin_sorting_class(23, "aest23"));
al.add(new Admin_sorting_class(11, "est11"));
al.add(new Admin_sorting_class(404, "dest404"));
al.add(new Admin_sorting_class(67, "guest67"));

Collections.sort(al);
Iterator<Admin_sorting_class> it = al.iterator();
while(it.hasNext()) {
	Admin_sorting_class a = it.next();
	System.out.println(a.id +"  " +a.name);
}

	}

}
