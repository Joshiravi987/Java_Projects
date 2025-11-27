package loopingstatement;

public class FibbonacciSeriesForLoop {
	public static void main(final String[] args) {
		//print 1 to 10 using for loop
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		//find factorial of a number using for loop
		int number = 5; // Example number
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial =factorial* i; // factorial = factorial * i
		}
		System.out.println("Factorial of " + number + " is: " + factorial);
		//fibonacci series using for loop
		int num_tofind = 5;
		int count = 0;
		for (int i =1;i<=num_tofind;i++) {
			if(num_tofind%i==0) {
				count++;
				System.out.println("factor of " + num_tofind + " is: " + i);
			}
	}
		System.out.println("Total number of factors of " + num_tofind + " is: " + count);
if(count > 2) {
	System.out.println(num_tofind + " is not a prime number");
}
else {
	System.out.println(num_tofind + " is a prime number");
}
	
	}
}
