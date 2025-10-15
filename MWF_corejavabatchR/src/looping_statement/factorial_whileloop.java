package looping_statement;

public class factorial_whileloop {
	factorial_whileloop(int n) {
		int fact = 1;
		int i = 1;
		while (i <= n) {
			fact = fact * i;
			i++;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		factorial_whileloop obj = new factorial_whileloop(5);

	}
}
