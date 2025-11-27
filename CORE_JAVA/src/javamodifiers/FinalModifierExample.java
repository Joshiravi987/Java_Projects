package javamodifiers;

public class FinalModifierExample {
	final int a = 10; // final variable

	public FinalModifierExample() {
	
		System.out.println("Value of final variable a: " + a); // printing final variable
		// a = 20; // This line would cause a compilation error because 'a' is final and
		// cannot be reassigned
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FinalModifierExample();
	}
}
