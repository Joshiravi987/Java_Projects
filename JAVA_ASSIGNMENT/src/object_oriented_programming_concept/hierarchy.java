package object_oriented_programming_concept;

// Multilevel Inheritance in Java
class parent{
	void display() {
			System.out.println("" + "Parent class display method");
	}
}
class child extends parent{
	void display() {
		super.display();
		System.out.println("" + "Child class display method");
	}
}
class grandchild extends child{
	void display() {
		super.display();
		System.out.println("Grandchild class display method");
	}
}
public class hierarchy {
public static void main(String[] args) {
		// TODO Auto-generated method stub
grandchild g = new grandchild();
g.display();
	}

}
