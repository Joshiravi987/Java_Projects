package File_io;

import java.io.FileOutputStream;
import java.io.IOException;

public class employee_file {
public static void main(String[] args) throws IOException {
	FileOutputStream emp = new FileOutputStream("employee.txt",true);
	emp.write("ID: 101, Name: MR XYZ, Department: IT, Salary: 75000.00\n".getBytes());
	
}
}
