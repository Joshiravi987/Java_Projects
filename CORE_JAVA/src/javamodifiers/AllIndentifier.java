package javamodifiers;

public class AllIndentifier {
	{
		System.out.println("object block");
	}
	static {
		System.out.println("static block");
	}
	public AllIndentifier() {
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
new AllIndentifier().s1();
	}

}
