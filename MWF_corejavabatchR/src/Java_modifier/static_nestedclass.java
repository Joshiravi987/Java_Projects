package Java_modifier;
//nested static class s
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
public class static_nestedclass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
outer o = new outer();
o.outer_method();//calling outer class method
outer.static_class o1 =new outer.static_class();
o1.static_method();

	}

}
