package file_Handling_practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Parent implements Serializable {
	int a;

	public Parent(int a) {
		this.a = a;
		System.out.println("Parent class constructor" + a);
	}
}

class Child extends Parent {
	int b;

	public Child(int b) {
		super(10); // Calling Parent class constructor
		this.b = b;
		System.out.println("Child class constructor" + b);
	}
}

public class inheritance_io {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Child c = new Child(20); // Creating an object of Child class
		FileOutputStream f = new FileOutputStream("New_in.txt");
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject(c); // Serializing the Child object
		FileInputStream fin = new FileInputStream("New_in.txt");
// Deserializing the Child object	
		ObjectInputStream on = new ObjectInputStream(fin);
		Child ch = (Child) on.readObject(); // Reading the object from file
		System.out.println("Deserialized Child object: a = " + ch.a + ", b = " + ch.b);
	}
}
