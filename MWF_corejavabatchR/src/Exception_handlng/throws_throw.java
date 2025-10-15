package Exception_handlng;
//throws and throw
//throw is used to explicitly throw an exception
//throws is used to declare an exception that can be thrown by a method

public class throws_throw {
int i = -10;
void validate() throws Exception
{
	if (i>0) {
		System.out.println("postive number");
	}
	else {
		throw new Exception("Not a positive number");
	}
}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
new throws_throw().validate();
		
	}

}
