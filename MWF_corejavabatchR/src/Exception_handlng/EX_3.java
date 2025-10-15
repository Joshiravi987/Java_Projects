package Exception_handlng;

public class EX_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String str = null;
			System.out.println(str.length()); // This will throw NullPointerException
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		System.out.println("After exception handling");
	}

}
