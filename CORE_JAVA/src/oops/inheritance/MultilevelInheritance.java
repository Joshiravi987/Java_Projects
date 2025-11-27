package oops.inheritance;
class ParentClass{
	int i;
	public ParentClass(int i) {
	this.i = i;
	System.out.println("This is parent class constructor with parameter: " + i);
	}
	void display(int j) {
		System.out.println("This is display method of parent class" + i);
	}
}
class ChildClass extends ParentClass {
	public ChildClass(int i) {
		super(10);
		System.out.println("child class with parameter: " + i);
	}
	void display(int j) {
		super.display(10);
		System.out.println("display method of child class" + i);
	}
	}
class ChildClass1 extends ChildClass {
	public ChildClass1(int i) {
		super(i);
		System.out.println("child class1 with parameter: " + i);
	}
	void display(int j) {
		super.display(20);
		System.out.println("display method of child class1 with parameter: " + j);
}
}
	public class MultilevelInheritance {
public static void main(String[] args) {
	ChildClass1 c = new ChildClass1(250);
	c.display(100);
}
	}
