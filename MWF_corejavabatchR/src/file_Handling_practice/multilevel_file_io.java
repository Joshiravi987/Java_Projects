package file_Handling_practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Admin_class implements Serializable{
	int id;
	String name;
	public Admin_class(int id, String name) {
		this.id = id;
		this.name = name;
}}
class Sub_class_1 extends Admin_class{
	int sub_id;
	String sub_name;
	public Sub_class_1(int sub_id, String sub_name) {
		super(1,"test");
		this.sub_id = sub_id;
		this.sub_name = sub_name;
		
	}
}
class grand_child extends Sub_class_1{
	int grand_c_id;
	String grand_c_name;
	public grand_child(int grand_c_id, String grand_c_name) {
		super(2,"test2");
		this.grand_c_id = grand_c_id;
		this.grand_c_name = grand_c_name;
	}
}
public class multilevel_file_io {
public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
	grand_child sub =new grand_child(3,"test3");
 {
		FileOutputStream fout = new FileOutputStream("file_in_io.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		oos.writeObject(sub); // Serializing the object
		FileInputStream fin = new FileInputStream("file_in_io.txt");
		ObjectInputStream o = new ObjectInputStream(fin);
		grand_child sub1 = (grand_child) o.readObject(); // Deserializing the object
		System.out.println(sub1.id + " " + sub1.name );
		System.out.println(sub1.sub_id + " " + sub1.sub_name);
		System.out.println(sub1.grand_c_id + " " + sub1.grand_c_name);
	
	}

	}

}
