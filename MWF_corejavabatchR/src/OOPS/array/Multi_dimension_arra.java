package OOPS.array;

import java.util.Scanner;

public class Multi_dimension_arra {
	/*
	 * int arr[][] = {{1,2,3},{4,5,6},{7,8,9}}; for (int i=0; i<3;i++){for (int
	 * j=0;j<3;j++){ System.out.print(arr[i][j]+" ");}System.out.println();}
	 */
	public Multi_dimension_arra() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of row:");
		int row = scn.nextInt();
		System.out.println("Enter the size of column:");
		int column = scn.nextInt();

		int arr[][] = new int[row][column];
		int sum = 0;
int mul = 1;
		// take input
		System.out.println("Enter the elements of array:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j] = scn.nextInt();
				sum += arr[i][j];
				mul *= arr[i][j];
			}
		}
//display the values of array
		System.out.println("The 2-D array is:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("sum of all array elements :" + sum);
		System.out.println("multipication of all araay :" + mul);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Multi_dimension_arra();
	}
}
