package oops.inheritance;
//Single level inheritance
class ParentClassS{
	int i;
	public ParentClassS(int i) {
		this.i= i;
		System.out.println("This is parent class constructor with parameter: " + i);
		
	}
	void display(int j) {
		System.out.println("This is display method of parent class" + i);
	}
	
}
 class ChildClassS extends ParentClassS {
	 public ChildClassS(int i) {
		// TODO Auto-generated constructor stub
		 super(10);
		 System.out.println("child class with parameter: " + i);
	}
	 void display(int j) {
		 super.display(50);
		 System.out.println("display method of child class" + i);
	 }
 }
public class SingleLevelInheritance {
public static void main(String[] args) {
	ChildClassS c = new ChildClassS(210);
		c.display(110);
}
}
