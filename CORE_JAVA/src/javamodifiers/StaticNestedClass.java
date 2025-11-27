package javamodifiers;

// Static nested class is a nested class that is declared static.
// It can be instantiated without an instance of the outer class.
// It can access static members of the outer class directly.
// It cannot access non-static members of the outer class directly.
// Static nested classes are often used to group related classes together for better organization.
// Example:
class outer{
	void outer_method() {
		System.out.println("outer method display");
	}
	static class static_class {
		public static_class() {
			System.out.println("static nested class constructor");}
		static void static_method() {
			System.out.println("static method of static nested class");
		}
	}
}
public class StaticNestedClass {
public static void main(String[] args) {
	outer o = new outer();
	o.outer_method();//calling outer class method
	outer.static_class o1 =new outer.static_class();
	o1.static_method();

		}

}

