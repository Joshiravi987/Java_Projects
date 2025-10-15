package Java_modifier;
//final is used to make constant value
	//1. variable can't be changed once value assigned 
	//2. method - method can't be overriding in final keyword ,it can be overloading
	//3. class   -class can't be inheritate by using final keyword
final class Test{
	final void test() {
		System.out.println("final method");
	}
	void test(int a) {
		System.out.println(a);
	}
}
public class final_modifier {
public static void main(String[] args) {
	Test t = new Test();
	t.test(); // calling final method
	t.test(10); // calling overloaded method
}
	
	
}
