package oops.modifiers;



public class ThisConstructorChaining {
	public ThisConstructorChaining() {
		System.out.println("Default constructor called");
	}

	public ThisConstructorChaining(int a) {
		this(); // Calls the default constructor
		System.out.println("First constructor   : " + a);
	}

	public ThisConstructorChaining(int a, int b) {
		this(10);// Calls the parameterized constructor with one argument
		System.out.println("Second constructor : " + a + " and " + b);
	}

	public ThisConstructorChaining(int a, int b, int c) {
		this(20, 30);// call the parameterized constructor with two arguments
		System.out.println("Third constructor : " + a + ", " + b + " and " + c);
	}

	public static void main(String[] args) {
		ThisConstructorChaining obj = new ThisConstructorChaining(40, 50, 60);
	}
}
