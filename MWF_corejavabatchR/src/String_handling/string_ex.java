package String_handling;

import java.util.Scanner;

public class string_ex {
	public string_ex() {
		String s = "Hello";
		String s1 = "Hello";
		//compare two strings
		
		System.out.println(s.equals(s1)); // true
		System.out.println(s.equalsIgnoreCase(s1)); // true
		System.out.println(s.compareTo(s1)); // 0 (equal)
		//length of string
		System.out.println("the length of string is: " + s.length()); // 5
		//update string,add string
		System.out.println(s.concat("world"));
		s+="test";
		System.out.println(s); // Hello worldtest
		System.out.println(s.indexOf("r")); //index of 'r' in string, returns -1 if not found
		System.out.println("char at index 2: " + s.charAt(2)); // char at index 2 find character array index
		System.out.println(s.replace('h', 'e'));//replace character
		System.out.println(s.substring(0, 3)); //print specific index of string
		System.out.println("capitalize first letter of string: " + s.substring(0, 1).toUpperCase() + s.substring(1)); //capitalize first letter of string
		System.out.println(s.toUpperCase()); //convert string to upper case
		System.out.println(s.toLowerCase()); //convert string to lower case
		char arr[] = s.toCharArray(); //convert string to character array);
		
		for (char c : arr) {
			System.out.print(c + " "); // print character array
			System.out.println(s.contains("Hello")); // check if string contains word/character
			System.out.println(s.trim()); // remove leading and trailing spaces
			//convert int /double to string
			int num = 123;
			String s2 = String.valueOf(num); // convert int to string
			System.out.println(s); // print converted string
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email");
		String email = sc.nextLine();
		int atindexOf = email.indexOf('@'); // find index of '@' in email
		System.out.println(email.substring(0, atindexOf)); // print username part of email
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new string_ex();
	}

}
//what is string pool ?
// String pool is a special memory area in Java where string literals are stored.
// When you create a string literal, Java checks the string pool to see if an identical string already exists.
