package exceptionhadling;

public class ExceptionHandling3Nullpointer {
public static void main(String[] args) {
	try {
		String str = null;
		System.out.println(str.length()); // This will throw NullPointerException
	} catch (NullPointerException e) {
		System.out.println(e);
	}
	System.out.println("After exception handling");
}
}
