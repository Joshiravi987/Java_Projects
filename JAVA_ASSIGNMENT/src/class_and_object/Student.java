package class_and_object;

public class Student {
	//Create a class Student with attributes (name, age) and a method to display the  details.
public String name;
public int age;

public Student(String name, int age) {
this.name = name;
this.age = age;
			
}
public void displaydetail() {
	System.out.println("name: " + name);
	System.out.println("age: " + age);
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student sc = new Student ("RAVI",20);
		sc.displaydetail();
	}

}
