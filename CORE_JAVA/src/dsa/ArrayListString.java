package dsa;

import java.util.ArrayList;
import java.util.Iterator;

class Admin{
	int id;
	String name;
	
	public Admin(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
}
public class ArrayListString {
public static void main(String[] args) {
	
	Admin a1 = new Admin(1,"Jayes");
	Admin a2 = new Admin(2,"Jay");
	Admin a3 = new Admin(3,"Darshak");
	
	ArrayList<Admin> al = new ArrayList<Admin>();
	al.add(a1);
	al.add(a2);
	al.add(a3);
	Iterator<Admin> it = al.iterator();
	while (it.hasNext()) {
		Admin a= it.next();
		System.out.println("ID:" + a.id + "NAME: " +a.name);
	}
}
}
