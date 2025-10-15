package OOPS;

import java.util.Scanner;

public class practice_Constructor {
    //  int value
    practice_Constructor(int a) {
        System.out.println("You entered: " + a);
    }

    // int and String value
    practice_Constructor(int a, String b) {
        System.out.println("You entered: " + a + ", " + b);
    }

    //  int and double value
    practice_Constructor(int a, double b) {
        System.out.println("You entered: " + a + ", " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Call first constructor
        System.out.print("Enter an integer: ");
        int a1 = sc.nextInt();
        practice_Constructor obj1 = new practice_Constructor(a1);

        // Call second constructor
        System.out.print("Enter an integer: ");
        int a2 = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter a string: ");
        String b2 = sc.nextLine();
        practice_Constructor obj2 = new practice_Constructor(a2, b2);

        // Call third constructor
        System.out.print("Enter an integer: ");
        int a3 = sc.nextInt();
        System.out.print("Enter a double: ");
        double b3 = sc.nextDouble();
        practice_Constructor obj3 = new practice_Constructor(a3, b3);

      
    }
}
