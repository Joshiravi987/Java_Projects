package OOPS.modifiers;
public class This_constuctor_chaining {
	public This_constuctor_chaining() {
		System.out.println("Default constructor called");
	}

	public This_constuctor_chaining(int a) {
		this(); // Calls the default constructor
		System.out.println("First constructor   : " + a);
	}

	public This_constuctor_chaining(int a, int b) {
		this(10);// Calls the parameterized constructor with one argument
		System.out.println("Second constructor : " + a + " and " + b);
	}

	public This_constuctor_chaining(int a, int b, int c) {
		this(20, 30);// call the parameterized constructor with two arguments
		System.out.println("Third constructor : " + a + ", " + b + " and " + c);
	}

	public static void main(String[] args) {
		This_constuctor_chaining obj = new This_constuctor_chaining(40, 50, 60);
	}
}