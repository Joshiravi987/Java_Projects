package Exception_handlng;

public class throw_throws {
int i = -10;
void validate() {
	if (i>0) {
		System.out.println("postive number");
	}
	else {
		throw new ArithmeticException("Not a positive number");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new throw_throws().validate();
	}

}
