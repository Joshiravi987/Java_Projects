package exceptionhandling;
//IMP INTERVIEW QUESTION
//throw unchecked exception --
//throws checked exception --
//Custom exception handling in Java
//Custom exceptions are user-defined exceptions that extend the Exception class.


class InvalidAgeException extends Exception {
	public InvalidAgeException(String string) {
	super(string);
	}
}

public class CustomException {
 int i = -10;
 void display() throws InvalidAgeException {
	 if(i > 0 ) {
		System.out.println(i);
	}
	else {
		throw new InvalidAgeException("Invalid age/Negative age not allowed");
	}}
 public static void main(String[] args) throws InvalidAgeException {
	CustomException obj = new CustomException();
	obj.display();
}
 }

