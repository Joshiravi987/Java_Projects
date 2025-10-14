package exceptionhadling;

public class ThrowThrows {
int i = -10;
void validate() {
	if (i>0) {
		System.out.println("positive number");
	}
	else {
	throw	new ArithmeticException("Not a positive number");
		
	}	
}
public static void main(String[] args) {
	new ThrowThrows().validate();
}
}
