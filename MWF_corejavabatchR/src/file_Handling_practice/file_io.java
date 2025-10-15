package file_Handling_practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class file_io {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileOutputStream fout = new FileOutputStream("New_text.txt");
	String s = "Hello, this is a test file for file handling in Java.";
	//write data to the file
	fout.write(s.getBytes());
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
