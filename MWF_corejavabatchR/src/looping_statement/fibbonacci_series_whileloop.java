package looping_statement;

public class fibbonacci_series_whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//fibonacci series using while loop
		int a= 0, b= 1 ,c, count = 20; 
		System.out.print(a + " " + b); 
		int i =0; 
		while (i < count) {
			c = a + b; 
			System.out.print(" " + c); 
			a = b; 
			b = c; 
			i++; 
			}
		System.out.println(); 
	}
}