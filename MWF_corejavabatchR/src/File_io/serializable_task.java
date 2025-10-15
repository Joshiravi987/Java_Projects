package File_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	int id;
	String name;
	String department;
	double salary;
	public Employee(int id, String name, String department, double salary) {
	this.id =id;
	this.name = name;
	this.department = department;
	this.salary = salary;
}
}
public class serializable_task {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
Employee emp = new Employee(111,"Rajesh","IT",600000.00);
Employee emp2 = new Employee(007,"dev","Finance",500000.00);
FileOutputStream fout = new FileOutputStream("employee.txt");
ObjectOutputStream oo = new ObjectOutputStream(fout);
oo.writeObject(emp2);
oo.writeObject(emp);
FileInputStream fin = new FileInputStream("employee.txt");
// Deserialization of object
ObjectInputStream os = new ObjectInputStream(fin);
Employee employee = (Employee) os.readObject();
Employee employee2 = (Employee) os.readObject();

System.out.println("" + emp.id + " " + emp.name + " " + emp.department + " " + emp.salary);
System.out.println("" + emp2.id + " " + emp2.name + " " + emp2.department + " " + emp2.salary);
	}

}
