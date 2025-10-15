package class_and_object;

public class Multiple_constructor_overloading {
//Create multiple constructors in a class and demonstrate constructor overloading.
	public String name;
	public int age;
	public String course;
	//default constructor
	public Multiple_constructor_overloading() {
		name = "Aman";
		age = 12;
		course = "Biology";
	}
	//constructor with one parameter
	public Multiple_constructor_overloading(String name) {
		this.name = name;
		age = 18;
		course = "NEET";
	}
	//constructor with two parameter
	public Multiple_constructor_overloading(String name,int age) {
		this.name= name;
		this.age= age;
		course ="JEE";
		
	}
	//constructor wiht three parameter
	public Multiple_constructor_overloading(String name,int age,String course) {
		this.name=name;
		this.age=age;
		this.course=course;
	}
	void display() {
		System.out.println("NAme:"+ name +"Age" + age + "Course" + course);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple_constructor_overloading s1 = new Multiple_constructor_overloading();
		Multiple_constructor_overloading s2 = new Multiple_constructor_overloading("Ravi");
		Multiple_constructor_overloading s3 = new Multiple_constructor_overloading("Rajesh",34);
		Multiple_constructor_overloading s4 = new Multiple_constructor_overloading("Amit",22,"Full stack devloper");
		s1.display();
		s2.display();
		s3.display();
		s4.display();

	}

}
