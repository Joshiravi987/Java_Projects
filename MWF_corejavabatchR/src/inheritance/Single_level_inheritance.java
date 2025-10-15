package inheritance;
//single level inheritance
class parents_class{
	int i;
	public parents_class(int i) {
		this.i = i;
		System.out.println("This is parent class constructor with parameter: " + i);
	}
	void display(int j) {
		System.out.println("This is display method of parent class" + i);
	}}
	class child_class_2 extends parents_class {
	public child_class_2(int i) {
		super(10);
		System.out.println("child class with parameter: " + i);
	}
void display(int j) {
	super.display(50);
	System.out.println("display method of child class" + i);
	}
}
public class Single_level_inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
child_class_2 c = new child_class_2(210);
		c.display(110);
	}

}
