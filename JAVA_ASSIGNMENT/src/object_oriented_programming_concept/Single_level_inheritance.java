package object_oriented_programming_concept;
class parent_class{
	int i;
	public parent_class(int i) {
		this.i = i;
		System.out.println("This is parent class constructor with parameter: " + i);
	}
	void display(int j) {
		System.out.println("This is display method of parent class: "+i);
		
	}
}
	
class child_class extends parent_class {
	child_class(int i){
		super(1);
		System.out.println("This is child class constructor with parameter: " + i);
	}
	void display (int j) {
		super.display(2);
		System.out.println("This is display method of child class: " + i);
	}
}
public class Single_level_inheritance {
public static void main(String[] args) {
		// TODO Auto-generated method stub
child_class c = new child_class(3);
		c.display(4);
		}

}
