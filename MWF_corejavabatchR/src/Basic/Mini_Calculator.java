package Basic;
import java.util.Scanner;

public class Mini_Calculator {

    public static void main(String[] args) {
        int a, b;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter value of a and b:");
        a = scn.nextInt();
        b = scn.nextInt();
        System.out.println("Enter character ");
        char operator = scn.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Addition: " + (a + b));
                break;
            case '-':
                System.out.println("Subtraction: " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication: " + (a * b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("divide by zero is not allowed");
                } else {
                    System.out.println("Division: " + (a / b));
                }
                break;
            default:
                System.out.println("Invalid operation. Please choose +, -, *, or /.");
                break;
        }
    }
}
