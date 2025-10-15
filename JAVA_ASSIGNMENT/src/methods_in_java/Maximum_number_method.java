package methods_in_java;

import java.util.Scanner;

public class Maximum_number_method {
int a; 
int b;
int c;
int max_number() {
	int max;
	if ( a>= b && a>=c) {
		return a;
	}else if (b>=a && b>=c) {
		return b; 
	}
	else {
		return c;
	}
}
	public int min_number() {
	int min;
	if (a<= b && a<=c) {
		return a;
	}
	else if (b<=a && b<=c) {
		return b;
	}
	else {
		return c;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Maximum_number_method obj = new Maximum_number_method();
		
		System.out.println("Enter first number a =");
		obj.a = sc.nextInt();
		System.out.println("Enter second number b =");
		obj.b = sc.nextInt();
		System.out.println("Enter third number = ");
		obj.c = sc.nextInt();
		
		int max =obj.max_number();
		System.out.println("THe max number is :" + max);
		sc.close();

		int min = obj.min_number();
		System.out.println("The min number is :" +min);
	}

}
