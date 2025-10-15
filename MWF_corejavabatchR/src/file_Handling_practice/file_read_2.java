package file_Handling_practice;
//this code reads the contents of a file named "New_text.txt" and prints it to the console.

import java.io.FileInputStream;
import java.io.IOException;

public class file_read_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fin = new FileInputStream("New_text.txt");
int i=0;
while((i=fin.read())!=-1) {
	System.out.print((char)i);
}
	}

}
