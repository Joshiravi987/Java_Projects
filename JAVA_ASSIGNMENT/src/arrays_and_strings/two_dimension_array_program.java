package arrays_and_strings;

import java.util.Scanner;

class two_dimension_array {
    Scanner scn = new Scanner(System.in);

    public two_dimension_array() {
        System.out.println("Enter the size of row:");
        int row = scn.nextInt();
        System.out.println("Enter the size of column:");
        int column = scn.nextInt();

        int[][] arr = new int[row][column];
        int sum = 0;
        int mul = 1;
        int sub;

        System.out.println("Enter the elements of array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        // Initialize subtraction with the first element
        sub = arr[0][0];

        // Calculate sum, multiplication, and proper subtraction
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sum += arr[i][j];
                mul *= arr[i][j];

                if (i == 0 && j == 0)
                    continue; // Skip the first element for subtraction
                sub -= arr[i][j];
            }
        }

        // Display the values of array
        System.out.println("The 2-D array is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Sum of all array elements: " + sum);
        System.out.println("Multiplication of all array elements: " + mul);
        System.out.println("Subtraction of all array elements: " + sub);
    }
}

public class two_dimension_array_program {
    public static void main(String[] args) {
        new two_dimension_array();
    }
}
