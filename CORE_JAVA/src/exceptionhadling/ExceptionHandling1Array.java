package exceptionhadling;
// Example of try-catch block to handle ArrayIndexOutOfBoundsException
// Array handling ArrayIndexOutOfBoundsException

public class ExceptionHandling1Array {
public static void main(String[] args) {
	try {
	int arr[]= new int[3];
	arr[5]=10; // This will throw ArrayIndexOutOfBoundsException
	}catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}
	System.out.println("After exception handling");

}
}