package methods_in_java;
//method overloading
public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}

	public double add(double a, double b) {
		return a + b;

	}

	public int add(int a, int b, int c) {
		return a + b + c;
	
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public int multiplication(int a ,int b) {
		return a*b;
	}
public int division(int a, int b) {
	if (a < b) {
		System.out.println("division not possible");
		return 0;
	}
	else {
		return a/b;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator cal = new Calculator();
System.out.println("Sum of 5 and 10 is: " + cal.add(5,10));
System.out.println("Sum of 5.52 and 10.48 is " + cal.add(5.52, 10.48));
System.out.println("Sum of 50,10 and 30 is " + cal.add(50, 10, 30));
System.out.println("Substraction of 10 and 5 is " + cal.sub(10, 5));
System.out.println("Multiplicaiton of 19 and 21 is " + cal.multiplication(19, 21));
System.out.println("divission of 345 and 3 is :" + cal.division(345, 3));
	}

}
