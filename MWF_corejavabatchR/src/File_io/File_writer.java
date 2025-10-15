package File_io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_writer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileWriter fout = new FileWriter("Test123.txt");
String s ="This is a test file for writing and reading operations in Java."; // String to write to file
fout.write(s); // Write string to file
//closing the file
fout.close(); // Close the file writer
//char c[] = new char[100];
int i=0;
FileReader fin = new FileReader("Test123.txt"); // Open file reader
while ((i = fin.read()) != -1) { // Read until end of file
	
	System.out.print((char)i); // Print character read from file
}
fin.close(); // Close the file reader
	}

}
