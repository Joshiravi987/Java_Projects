package DSA;

import java.util.ArrayList;
import java.util.Iterator;

class Admin {
	int id;
	String name;

	public Admin(int id, String name) {
		this.id = id;
		this.name = name;

	}
}

public class Array_list_2_string {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Admin a1 = new Admin(101, "Jayesh");
		Admin a2 = new Admin(102, "Jay");
		Admin a3 = new Admin(103, "Darshak");

		ArrayList<Admin> al = new ArrayList<Admin>();
		al.add(a1);
		al.add(a2);
		al.add(a3);
		Iterator<Admin> it = al.iterator();
		while (it.hasNext()) {
			Admin a = it.next();
			System.out.println("ID: " + a.id + ", Name: " + a.name);
		}
	}

}
