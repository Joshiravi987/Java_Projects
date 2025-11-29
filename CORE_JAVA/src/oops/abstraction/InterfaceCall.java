package oops.abstraction;

public class InterfaceCall implements interface_1, interface_2, interface_3, Interface {

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		System.out.println(""+"test4 method from interface_4 :-)");
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("" + "test3 method from interface_3 ;-)");
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("" + "test2 method from interface_2");
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("" + "test1 method from interface_1");
	}

	public static void main(String[] args) {
		InterfaceCall obj = new InterfaceCall();
		
	obj.test(); // Calling method from interface
	obj.test1(); // Calling method from interface1
	obj.test2(); // Calling method from interface_2
	obj.test3(); // Calling method from interface_3
			
			
	}

}
