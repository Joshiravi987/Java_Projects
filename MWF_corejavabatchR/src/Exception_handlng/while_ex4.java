package Exception_handlng;

import java.util.Scanner;

public class while_ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = null;
		Scanner sc = new Scanner(System.in);
		try {
			while (true) {
				System.out.println("Enter a number");
				s = sc.nextLine();

			}

		} catch (NumberFormatException e) {
			System.out.println(e);
			int num = Integer.parseInt(s);
			System.out.println(num);
		}
		System.out.println("After exception handling");
	}

}
