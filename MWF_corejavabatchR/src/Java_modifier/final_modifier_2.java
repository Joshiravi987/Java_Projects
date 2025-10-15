package Java_modifier;

public class final_modifier_2 {
	final int a = 10; // final variable

	public final_modifier_2() {
	
		System.out.println("Value of final variable a: " + a); // printing final variable
		// a = 20; // This line would cause a compilation error because 'a' is final and
		// cannot be reassigned
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new final_modifier_2();
	}

}
