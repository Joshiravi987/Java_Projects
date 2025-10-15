package data_Types_Variables_and_Operators;
//Demonstrate type casting (explicit and implicit).
public class Casting_types {
int a = 10;
double b = a; // Implicit casting (int to double)

double x = 9.7;
int y = (int) x; // Explicit casting (double to int)

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Casting_types casting = new Casting_types();
		System.out.println("Implicit Casting (int to double): " + casting.b);
		System.out.println("Explicit Casting (double to int): " + casting.y);
		System.out.println("Original int value: " + casting.a);
		System.out.println("Original double value: " + casting.x);
		System.out.println("After explicit casting, double value becomes: " + casting.y);
		System.out.println("After implicit casting, int value becomes: " + casting.b);
		System.out.println("After explicit casting, int value becomes: " + casting.a);
		System.out.println("After implicit casting, double value becomes: " + casting.b);
		System.out.println("After explicit casting, double value becomes: " + casting.x);
		
	}

}
