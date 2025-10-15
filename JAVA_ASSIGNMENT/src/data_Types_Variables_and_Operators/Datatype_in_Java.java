package data_Types_Variables_and_Operators;

public class Datatype_in_Java {
	// Primitive Data Types
	byte b = 10; // 1 byte
	short s = 20; // 2 bytes
	int i = 30; // 4 bytes
	long l = 40L; // 8 bytes
	float f = 50.545f; // 4 bytes
	double d = 60.55445132; // 8 bytes
	char c = 'A'; // 2 bytes
	boolean bool = true; // 1 bit
	// Non-Primitive Data Types
	String str = "Hello"; // Reference type
	// Arrays
	int[] arr = {1, 2, 3, 4, 5}; // Array of integers	
	// Classes
	class Person {
		String name;
		int age;

		Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Datatype_in_Java dataTypes = new Datatype_in_Java();
		System.out.println("Primitive Data Types:");
		System.out.println("Byte: " + dataTypes.b);
		System.out.println("Short: " + dataTypes.s);
		System.out.println("Integer: " + dataTypes.i);
		System.out.println("Long: " + dataTypes.l);
		System.out.println("Float: " + dataTypes.f);
		System.out.println("Double: " + dataTypes.d);
		System.out.println("Character: " + dataTypes.c);
		System.out.println("Boolean: " + dataTypes.bool);
		System.out.println("\nNon-Primitive Data Types:");
		System.out.println("String: " + dataTypes.str);
		System.out.println("Array: " + java.util.Arrays.toString(dataTypes.arr));
			}

}
