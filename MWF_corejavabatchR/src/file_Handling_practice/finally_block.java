package file_Handling_practice;

// This code is a placeholder for a Java class named `finally_block`.
// it is follow try catch block
// session terminate , connection close , file close etc.
public class finally_block {
	public finally_block() {
		// TODO Auto-generated constructor stub
		try {
			int a = 10 / 0;
			System.out.println(a);
		} catch (Exception e) {
			System.out.println(e);
		}
		// finally block is used to execute the code after try and catch block
		finally {
			System.out.println("Finally block executed");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new finally_block();
	}

}