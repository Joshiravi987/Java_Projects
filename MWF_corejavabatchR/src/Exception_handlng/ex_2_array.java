package Exception_handlng;


public class ex_2_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int arr[]= new int[3];
	arr[5]=10; // This will throw ArrayIndexOutOfBoundsException
} catch (ArrayIndexOutOfBoundsException e) {
	System.out.println(e);
	
}
		System.out.println("After exception handling");
	}

}
