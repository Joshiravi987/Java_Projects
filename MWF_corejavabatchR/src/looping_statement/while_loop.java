package looping_statement;

public class while_loop {
	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		// armstrong number using while loop
		int num = 153; // Example number
		// An Armstrong number is a number that is equal to the sum of its own digits
		// each raised to the power of the number of digits.
		int sum = 0;
		int temp = num;
		while (num > 0) {
			// get the last digit
			int digit = num % 10;
			// cube the digit and add it to the sum
			sum += digit * digit * digit;
			// remove the last digit
			num /= 10;

		}
		if (temp == sum) {
			System.out.println(temp + " is an Armstrong number");
		} else {
			System.out.println(temp + " is not an Armstrong number");
		}
	}
}