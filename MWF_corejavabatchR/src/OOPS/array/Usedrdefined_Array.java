package OOPS.array;

import java.util.Scanner;

public class Usedrdefined_Array {
public Usedrdefined_Array() {
	int total=0,index_position_max=0,index_position_min=0;
	double average =0.0;
	Scanner scn =new Scanner(System.in);
	System.out.println("Enter the size of array:");
//define the size of the array
	int size =scn.nextInt();
	//declaration of array
	int number[] =new int [size];
	String name[] = new String[size];
	// input the values in the array
	for (int i=0 ; i< size; i++) {
		System.out.println("Numbers are " );
		number[i]=scn.nextInt();
		System.out.println("Enter the names :");
		name[i]= scn.next();
		
	}
	int max =number[0];
	int min =number[0];
	//diplay the values of array
	for (int i=0; i<size;i++) {
		System.out.println("Numbers are :"+ number[i]);
		System.out.println("Name is : " + name[i]);
		total +=number[i];
		average =(double)total/size;
		if (max<number[i]) {
			max =number[i];
			if (min>number[i]) {
				min =number[i];
			}
		}
		//find index position of the max  value
		if(max==number [i]) {
			index_position_max=i;
		}
		if (min==number[i]) {
			index_position_min=i;
		}
	}
	System.out.println(""+ "total of the array value is : " + total);
	System.out.println(""+ " Average of the array value is :" +average);
	System.out.println("maximum value in the array is " + max);
	System.out.println("minimum value in arrat us " +min);
	System.out.println("maximum value in array at index position :" + index_position_max);
	System.out.println("minumum value in array at index position :" + index_position_min);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Usedrdefined_Array();
	}

}
