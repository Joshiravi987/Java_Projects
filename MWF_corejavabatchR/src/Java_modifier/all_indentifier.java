package Java_modifier;

public class all_indentifier {
	{
		System.out.println("object block");
	}
	static {
		System.out.println("static block");
	}
	public all_indentifier() {
		System.out.println("default constructor");
	}
	static void s1() {
		System.out.println("static method");
	}
	void m1() {
System.out.println("non static method"); 		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
s1();
new all_indentifier().s1();
	}

}
