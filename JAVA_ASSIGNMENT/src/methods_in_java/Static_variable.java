package methods_in_java;

public class Static_variable {
    // Static variable
    static int count = 0;

    // Instance variable
    String name;

    // Constructor
    Static_variable(String name) {
        this.name = name;
        count++; // Increment static variable for each object created
    }

    // Static method
    static void displayCount() {
        System.out.println("Total number of objects created: " + count);
    }

    // Instance method
    void displayName() {
        System.out.println("Name: " + name);
    }

    // Main method
    public static void main(String[] args) {
    	Static_variable obj1 = new Static_variable("Alice");
    	Static_variable obj2 = new Static_variable("Bob");

        obj1.displayName(); // Alice
        obj2.displayName(); // Bob

        // Call static method using class name
        Static_variable.displayCount(); // Output: 2
    }
}

