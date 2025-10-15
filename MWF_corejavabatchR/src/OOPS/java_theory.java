package OOPS;
import java.util.Scanner;
//constructor is special method which is used to initialize the object
//it is called when object of class is created
//constructor name is same as class name
//constructor does not have return type
//constructor can be parameterized or non-parameterized
//constructor can be overloaded
//constructor overloading is a feature in java that allows a class to have multiple constructors with different parameter lists. This allows for the creation of objects in different ways, depending on the parameters passed during instantiation.
public class java_theory {
int a;
//non-parameterized constructor no return type
//one parameterized constructor no return type
void display(int a) {
this.a = a;//using this keyword to refer to the current object
	System.out.println("one parameterized constructor: " + a);
	}
//two parameterized constructor no return type
void display(int a, String name) {
	this.a = a;
	System.out.println("two parameterized constructor: " + a + " " + name);
	
}
//default constructor no return type
void display() {	
	System.out.println("default constructor/no parameter method: " + a);
	}
public static void main(String[] args) {
	Scanner var = new Scanner(System.in);
	int a = var.nextInt();
	java_theory obj = new java_theory();//creating object of class
	//calling non-parameterized constructor
	obj.display();//default constructor
	//calling one parameterized constructor
	obj.display(a);//one parameterized constructor
	int b = var.nextInt();
	String name = var.next();
	//calling two parameterized constructor
	obj.display(b, name);//two parameterized constructor
	
	
}
}
