package File_io;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Studnet implements Serializable{
	int id;
	String name;
	 public Studnet(int id,String name) {
		 this.id = id;
		 this.name = name;
	 }
		// TODO Auto-generated constructor stub
	}

public class serialize_concept {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
//Serialization is the process of converting an object into a byte stream
		//so that it can be easily saved to a file or transmitted over a network.
		// in java this is done using the Serializable interface.
		Studnet s =new Studnet(100, "Balleriane");
		/*FileOutputStream fos = new FileOutputStream("Test123.txt");
		ObjectOutputStream o = new ObjectOutputStream(fos);
		o.writeObject(s);*/
		
		FileInputStream fin = new FileInputStream("student.txt");//deserialization of object
		ObjectInputStream os = new ObjectInputStream(fin);
		Studnet student = (Studnet) os.readObject();
		System.out.println("" + student.id + " " + student.name);
		
	}

}

