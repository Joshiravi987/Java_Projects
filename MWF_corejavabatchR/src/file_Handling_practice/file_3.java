package file_Handling_practice;
//this code reads the contents of a file named "New_text.txt" and prints it to the console.
import java.io.FileOutputStream;
import java.io.IOException;

public class file_3 {
public static void main(String[] args) throws IOException {
	FileOutputStream fpit =new FileOutputStream("New_text.txt",true);
	fpit.write("\tHI this line is added to the file".getBytes());
	
}
}
