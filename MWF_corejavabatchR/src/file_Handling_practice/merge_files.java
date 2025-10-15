package file_Handling_practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class merge_files {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream f =new FileInputStream("New_text.txt");
FileInputStream f2 = new FileInputStream("student.txt");

SequenceInputStream sin = new SequenceInputStream(f, f2);
int i=0;
while((i=sin.read())!=-1) {
	
}	System.out.print((char)i);
	}

}
