package DSA;
// This code is part of a Java program that manages a list of students.
import java.util.ArrayList;
import java.util.Iterator;

public class Student_class {
	// TODO Auto-generated constructor stub
	int id;
	String name;
	 public  Student_class(int id, String name) {
		this.id = id;
		this.name = name;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Student_class> al =new ArrayList<Student_class>();
al.add(new Student_class(1,"avd"));
al.add(new Student_class(2,"bvd"));
al.add(new Student_class(3,"cvd"));
al.add(new Student_class(4,"dvd"));

Iterator<Student_class> it = al.iterator();
while(it.hasNext()) {
	Student_class s = it.next();
	System.out.println("ID: " + s.id + ", Name: " + s.name);
}
	}

}
