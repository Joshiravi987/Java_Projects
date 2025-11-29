package oops.concept;

import java.util.Scanner;



public class PracticeConstructor {
	  //  int value
	PracticeConstructor(int a) {
        System.out.println("You entered: " + a);
    }

    // int and String value
	PracticeConstructor(int a, String b) {
        System.out.println("You entered: " + a + ", " + b);
    }

    //  int and double value
	PracticeConstructor(int a, double b) {
        System.out.println("You entered: " + a + ", " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Call first constructor
        System.out.print("Enter an integer: ");
        int a1 = sc.nextInt();
        PracticeConstructor obj1 = new PracticeConstructor(a1);

        // Call second constructor
        System.out.print("Enter an integer: ");
        int a2 = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter a string: ");
        String b2 = sc.nextLine();
        PracticeConstructor obj2 = new PracticeConstructor(a2, b2);

        // Call third constructor
        System.out.print("Enter an integer: ");
        int a3 = sc.nextInt();
        System.out.print("Enter a double: ");
        double b3 = sc.nextDouble();
        PracticeConstructor obj3 = new PracticeConstructor(a3, b3);

      
    }
}
