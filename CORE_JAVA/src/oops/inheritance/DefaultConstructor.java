package oops.inheritance;

//single level inheritance

class parent {
	parent() {
		System.out.println("parent class");
	}
}

class child extends parent {
	child() {
		System.out.println("child class");
	}
}

public class DefaultConstructor {
	public static void main(String[] args) {
	 new child();
	}

}
