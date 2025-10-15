package inheritance;
class Admin{
	void display(int a) {
		System.out.println("display method of Admin class 1 is" +"::"+ a);
		
	}
}
class Admin1 extends Admin{
	void display(int a) {
		super.display(1); // Call the display method of Admin class
		System.out.println("display method of Admin class "+""+"2 is::" + a);
	}
}
class Admin2 extends Admin{
	void display(int a) {
		//super.display(2); // Call the display method of Admin1 class
		System.out.println("display method of Admin class "+ "" +"3 is::" +a );
	}
}
public class herierachy_inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Admin1 admin1 =new Admin1();
admin1.display(3);
Admin2 admin2 = new Admin2();
admin2.display(4);
	}

}
