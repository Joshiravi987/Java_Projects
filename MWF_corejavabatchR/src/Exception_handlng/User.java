package Exception_handlng;

import java.util.Scanner;

class InvalidAgeException11 extends Exception {

	public InvalidAgeException11(String message) {
		super(message);
	}
}

public class User {
	String name;
	String email;
	int age;
	Scanner sc = new Scanner(System.in);

	void register() throws InvalidAgeException {
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter email");
		String email = sc.nextLine();
		System.out.println("enter age");
		int age = sc.nextInt();

		if (age < 18) {

			throw new InvalidAgeException("Age is not valid for registration");
		} else {
			System.out.println("Registration successful ");
		}
	}

	public static void main(String[] args) throws InvalidAgeException {
		// TODO Auto-generated method stub

		User u = new User();
		u.register();
	}
}
