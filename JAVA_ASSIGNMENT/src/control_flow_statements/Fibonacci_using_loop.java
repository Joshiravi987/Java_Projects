package control_flow_statements;

public class Fibonacci_using_loop {
	// Generate Fibonacci series using a loop
	public static void Fibonacci(int n) {
		int a = 0 ,b =1, c;
		if (n<=0) {
			System.out.println("Please enter a positive integer greater than 0.");
			return;
		}
		System.out.print("Fibonacci series: " + a + " " + b);
		for (int i = 2; i < n; i++) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}
		System.out.println();
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20; // Example input, can be changed to generate more or fewer terms
		Fibonacci(n);
		System.out.println("Fibonacci series generated for " + n + " terms.");
		

	}

}
