package Java_modifier;

//interview specific

//we can access static memebers without creating an object of the class
//static variable, static method , static block, static nested class
public class static_keyword {
	static int a1 =10;//static var
	int a2 = 20;//non static var
	
	static void mehtod() {
		//static method can access static variable only
		System.out.println("static mehtod");
	}
	//block
	{
		System.out.println("object block");
	}
	static {
		System.out.println("static block");
	}
	void method1() {
		System.out.println(a1+a2);
		System.out.println("non static mehtod");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
static_keyword.mehtod();//calling static method without creating object
static_keyword s = new static_keyword();
s.method1();
System.out.println(a1);//you can call static variable without method or constructor by add static keyword

	}

}
