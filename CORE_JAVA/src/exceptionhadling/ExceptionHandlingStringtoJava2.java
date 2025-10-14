package exceptionhadling;

public class ExceptionHandlingStringtoJava2 {
public static void main(String[] args) {
	try {
		String str = "a";
		int num = Integer.parseInt(str);//wrapper class method to convert string to int ,automatic boxing,
		System.out.println(num);
	} catch (NumberFormatException e) {
		System.out.println(e);
	}
	System.out.println("After exception handling");
}
}
