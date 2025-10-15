package Exception_handlng;

public class Ex_4_string_to_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
