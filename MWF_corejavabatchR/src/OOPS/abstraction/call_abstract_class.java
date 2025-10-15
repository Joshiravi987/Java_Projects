package OOPS.abstraction;

public class call_abstract_class extends abstract_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
call_abstract_class obj = new call_abstract_class();
		obj.display(); // Calling the abstract method
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("" + "This is an abstract class method implementation.");
	}

}
