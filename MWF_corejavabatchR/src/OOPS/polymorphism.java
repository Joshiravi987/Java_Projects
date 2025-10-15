package OOPS;

public class polymorphism {

	// make a constructor
	public polymorphism() {
		System.out.println("Default constructor called");

	}

	polymorphism(int a) {
		System.out.println("Parameterized constructor called with value: " + a);
	}

	// make a function to print a message
	// polymorphism function
	void printMessage() {
		System.out.println("Hello from the class object !");
	}

	void printMessage(int a) {
		System.out.println("a is " + a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polymorphism obj = new polymorphism();// calling constructor
		polymorphism obj1 = new polymorphism(5);// calling parameterized constructor

		obj.printMessage();// calling function without parameter
		obj.printMessage(10);// calling function with parameter

	}

}
