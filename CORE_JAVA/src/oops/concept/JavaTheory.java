package oops.concept;

import java.util.Scanner;
//constructor is special method which is used to initialize the object
//it is called when object of class is created
//constructor name is same as class name
//constructor does not have return type
//constructor can be parameterized or non-parameterized
//constructor can be overloaded
//constructor overloading is a feature in java that allows a class to have multiple- 
//-constructors with different parameter lists. This allows for the creation of objects in different ways,- 
//-depending on the parameters passed during instantiation.

public class JavaTheory {
    int a;

    // 1. Default Constructor (No arguments, No return type, Name = ClassName)
    JavaTheory() {
        System.out.println("Default constructor called.");
    }

    // 2. One Parameterized Constructor
    JavaTheory(int a) {
        this.a = a;
        System.out.println("One parameterized constructor: " + a);
    }

    // 3. Two Parameterized Constructor
    JavaTheory(int a, String name) {
        this.a = a;
        System.out.println("Two parameterized constructor: " + a + " " + name);
    }

    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        // -- Testing Default Constructor --
        System.out.println("Creating object 1 (Default)...");
        JavaTheory obj1 = new JavaTheory(); // Calls JavaTheory()

        // -- Testing 1-Param Constructor --
        System.out.println("Enter a number for Object 2:");
        int a = var.nextInt();
        JavaTheory obj2 = new JavaTheory(a); // Calls JavaTheory(int a)

        // -- Testing 2-Param Constructor --
        System.out.println("Enter a number and a name for Object 3:");
        int b = var.nextInt();
        String name = var.next();
        JavaTheory obj3 = new JavaTheory(b, name); // Calls JavaTheory(int a, String name)
        
        var.close(); // Good practice to close scanner
    }
}