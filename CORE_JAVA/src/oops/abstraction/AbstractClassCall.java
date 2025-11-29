package oops.abstraction;

public class AbstractClassCall extends AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClassCall obj = new AbstractClassCall();
		obj.display(); // Calling the abstract method
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("This is an abstract class method implementation.");
	}

}
