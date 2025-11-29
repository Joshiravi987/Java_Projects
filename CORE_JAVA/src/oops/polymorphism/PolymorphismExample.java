package oops.polymorphism;



public class PolymorphismExample {

	// make a constructor
	public PolymorphismExample() {
		System.out.println("Default constructor called");

	}

	PolymorphismExample(int a) {
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
		PolymorphismExample obj = new PolymorphismExample();// calling constructor
		PolymorphismExample obj1 = new PolymorphismExample(5);// calling parameterized constructor

		obj.printMessage();// calling function without parameter
		obj.printMessage(10);// calling function with parameter

	}
}
