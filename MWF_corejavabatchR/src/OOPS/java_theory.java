package OOPS;

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

public class java_theory { 
    int a;

    // 1. Default Constructor
    // MUST match class name "java_theory" exactly. NO "void".
    java_theory() {
        System.out.println("default constructor/no parameter method called");
    }

    // 2. One Parameterized Constructor
    java_theory(int a) {
        this.a = a;
        System.out.println("one parameterized constructor: " + a);
    }

    // 3. Two Parameterized Constructor
    java_theory(int a, String name) {
        this.a = a;
        System.out.println("two parameterized constructor: " + a + " " + name);
    }

    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        // --- 1. Calling Default Constructor ---
        // Happens automatically when you create the object
        java_theory obj1 = new java_theory(); 

        // --- 2. Calling One Parameter Constructor ---
        System.out.println("Enter a number:"); // Added prompt so you know when to type
        int a = var.nextInt();
        java_theory obj2 = new java_theory(a); // Passing 'a' directly here

        // --- 3. Calling Two Parameter Constructor ---
        System.out.println("Enter another number:");
        int b = var.nextInt();
        System.out.println("Enter a name:");
        String name = var.next();
        
        java_theory obj3 = new java_theory(b, name); // Passing 'b' and 'name' here

        var.close();
    }
}