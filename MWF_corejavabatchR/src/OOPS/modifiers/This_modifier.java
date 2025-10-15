package OOPS.modifiers;

//this keyword is used to refer to the current class properties and methods.
//method and constructor and variable can be used with this keyword.
//this is used to pass local variable to instance/global variable. 
public class This_modifier {
	int a;
	String name;

	This_modifier(int a, String name) {
		this.a = a; // using this to refer to the instance variable
		this.name = name; // using this to refer to the instance variable
		System.out.println("a: " + this.a + ", name: " + this.name);
	}

	void display() {
		System.out.println("a: " + this.a + ", name: " + this.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_modifier R = new This_modifier(10, "Ravi");
		R.display(); // calling display method to show values
	}
}
