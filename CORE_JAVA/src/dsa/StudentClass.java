package dsa;

// This code is part of a Java program that manages a list of students.
import java.util.ArrayList;
import java.util.Iterator;

public class StudentClass {
	// TODO Auto-generated constructor stub
	int id;
	String name;

	public StudentClass(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<StudentClass> al = new ArrayList<StudentClass>();
		al.add(new StudentClass(1, "avd"));
		al.add(new StudentClass(2, "bvd"));
		al.add(new StudentClass(3, "cvd"));
		al.add(new StudentClass(4, "dvd"));

		Iterator<StudentClass> it = al.iterator();
		while (it.hasNext()) {
			StudentClass s = it.next();
			System.out.println("ID: " + s.id + ", Name: " + s.name);
		}
	}

}
