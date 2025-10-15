package OOPS;

public class Class_Object {
//what is constructor?
	// A constructor is a special method that is called when an object is instantiated.
	// It is used to initialize the object's state.
	//when object is created, constructor is called automatically.
	//when object is intantiated, it is usedto initialize the object's.
	//A constructor has the same name as the class and does not have a return type.
	 Class_Object() {
		 System.out.println("Default Constructor is called");
		 }
public Class_Object(int a) {
		 System.out.println("Parameterized Constructor is called with value: " + a);
		 }
//what is object?
// An object is an instance of a class.
// It is a real-world entity that has state and behavior.
// An object is created using the new keyword followed by the class name and parentheses.
// For example, Class_Object obj = new Class_Object();
// In this example, obj is an object of the Class_Object class.
// An object can access the members (fields and methods) of the class using the dot operator.
// For example, obj.methodName() or obj.fieldName.
// An object can also be passed as an argument to a method or returned from a method.
// In Java, everything is an object, including primitive data types, which are wrapped in their corresponding wrapper classes (e.g., Integer, Double).
// An object can also be serialized, which means it can be converted into a byte stream for storage or transmission.
// Serialization is done using the Serializable interface, which is a marker interface in Java.
// An object can also be cloned, which means it can create a copy of itself.
// Cloning is done using the Cloneable interface, which is also a marker interface in Java.
public static void main(String[] args) {
	//make an object of Class_Object using the parameterized constructor
	Class_Object obj2 = new Class_Object(10);
		// Creating an object of Class_Object using the default constructor
		Class_Object obj3 = new Class_Object();
}}
