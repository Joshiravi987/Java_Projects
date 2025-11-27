package oops.modifiers;


public class ThisChainingMethodCall {
	void display() {
		System.out.println("display method//default method :" );

	}

	void display(int a) {
		this.display();// You can use or no use this in display method
		System.out.println("display first method a=" +a);
	}

	void display(int a, int b) {
		this.display(10);
		System.out.println("display second method a=" + a + "    " + "b="+ b);
	}

	void display(int a,int b,int c) {
		this.display(20, 30);
		System.out.println("display third method with three parameter a="+ a + "   " + "b="+b + "   "  +   "c=" +c );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method 	
		ThisChainingMethodCall obj = new ThisChainingMethodCall();
		obj.display(11, 22, 33);
	}

}
