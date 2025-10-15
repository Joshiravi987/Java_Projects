package File_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileoutputstram {
	//file create
	public Fileoutputstram()
	{
try {
/*FileOutputStream fout=new FileOutputStream("sam.txt");
	String s = "Welcome to the world of coding";
	byte b[]=s.getBytes();
	fout.write(b);*/
	FileInputStream fin=new FileInputStream("sam.txt");
int i=0;
while((i=fin.read())!=-1) {
	System.out.print((char)i);
}
	
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
public static void main(String[] args) {
	new Fileoutputstram();
}
}
