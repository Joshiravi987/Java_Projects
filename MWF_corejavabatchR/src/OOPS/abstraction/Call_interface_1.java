package OOPS.abstraction;

public class Call_interface_1 implements interface_1, interface_2, interface_3, interface_4 {

	@Override
	public void test4() {
		// TODO Auto-generated method stub
		System.out.println(""+"test4 method from interface_4 :-)");
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		System.out.println("" + "test3 method from interface_3 ;-)");
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("" + "test2 method from interface_2");
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("" + "test1 method from interface_1");
	}

	public static void main(String[] args) {
		Call_interface_1 obj = new Call_interface_1();
		obj.test1(); // Calling method from interface_1
			obj.test2(); // Calling method from interface_2
			obj.test3(); // Calling method from interface_3
			obj.test4(); // Calling method from interface_4
			
	}
	
}
