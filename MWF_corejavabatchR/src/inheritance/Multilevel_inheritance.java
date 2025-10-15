package inheritance;
class parent_class_1{
	int i;
	public parent_class_1(int i) {
		this.i = i;
		System.out.println("This is parent class constructor with parameter: " + i);
	}
	void display(int j) {
		System.out.println("This is display method of parent class" + i);
	}
}
	class child_class extends parent_class_1 {
	public child_class(int i) {
		super(10);
		System.out.println("child class with parameter: " + i);
	}
void display(int j) {
	super.display(10);
	System.out.println("display method of child class" + i);
	}
	}
class child_class1 extends child_class {
	public child_class1(int i) {
		super(i);
		System.out.println("child class1 with parameter: " + i);
	}
	void display(int j) {
		super.display(20);
		System.out.println("display method of child class1 with parameter: " + j);
	
}
}
	
public class Multilevel_inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child_class1 c = new child_class1(250);
		c.display(100);
	}

}
