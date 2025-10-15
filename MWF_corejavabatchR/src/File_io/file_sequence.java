package File_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class file_sequence {
	// merge two files into one file
	public file_sequence() throws IOException {
		FileInputStream fin = new FileInputStream("sam.txt"); // Open file input stream
		FileInputStream fin1 = new FileInputStream("student.txt"); // Open second file input stream

		SequenceInputStream sin = new SequenceInputStream(fin, fin1); // Create sequence input stream to merge both
																		// files
		int i = 0;
		while ((i = sin.read()) != -1) { // Read until end of file
			System.out.print((char) i); // Print character from merged files
		}
	}

	void make_file() throws IOException {
		File f = new File("merged_file.txt");
		System.out.println(f.getAbsolutePath() + "" + f.getName() + "" + f.length() + "" + f.getPath());
		f.createNewFile(); // Create new file to store merged content
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new file_sequence().make_file();
		;
	}

}
