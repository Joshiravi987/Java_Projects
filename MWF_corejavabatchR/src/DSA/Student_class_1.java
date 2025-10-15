package DSA;
//Enter Employee Data, Search Employee Data, Delete Employee Data, Display Remaining Employee Data using ArrayList
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Employee{
int id;
String name;
String dpartment;
int salary;

public Employee(int id,String name,String department,int salary) {
this.id=id;
this.name=name;
this.dpartment=department;
this.salary=salary;
}
}
public class Student_class_1 {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
ArrayList<Employee> al=new ArrayList<Employee>();

int cn=0;
do {
System.out.println("1.Enter Employee Data");
System.out.println("2.Search Employee Data");
System.out.println("3.Delete Employee Data");
System.out.println("4.Display Remaining Employee Data");
System.out.println("5.Exit");
System.out.println("Please select an option (1-5):");
int op = sc.nextInt();
switch(op) {

//Enter Employee Data
case 1:
System.out.println("Enter total number of Employee:");
int size=sc.nextInt();
System.out.println("\nEmployee Data:");
for(int i=0;i<size;i++){
System.out.println("Enter Employee ID "+ (i+1) +":");
int id=sc.nextInt();
System.out.println("Enter Employee Name "+ (i+1) + ":");
String name=sc.next();
System.out.println("Enter Employee Department "+ (i+1) + ":");
String department=sc.next();
System.out.println("Enter Employee Salary "+ (i+1) +":");
int salary=sc.nextInt();
System.out.println("\n");

Employee e=new Employee(id,name,department,salary);


al.add(e);
System.out.println("Record Added successfully...!");
}
break;

//Search Employee Data
case 2:

      System.out.println("\nEnter employee id you want to search:");
      int s_id=sc.nextInt();
      boolean fo=false;
      Iterator<Employee> it_1=al.iterator();
      while(it_1.hasNext()) {
      Employee emp1=it_1.next();
     
      if(emp1.id==s_id) {
      System.out.println("ID: " + emp1.id + ", Name: " + emp1.name + ", Department: " + emp1.dpartment + ", Salary: " + emp1.salary);
      fo=true;
      break;
      }
     
      }
      if(!fo) {
System.out.println("ID not found..!");

}
      break;
     
      //Delete Employee Data
case 3:
      System.out.println("\nEnter ID do you want to delete:");
int r_id=sc.nextInt();
boolean found = false;
Iterator<Employee> it = al.iterator();
      while (it.hasNext()) {
          Employee emp = it.next();
          if (emp.id == r_id) {
              it.remove();
              found=true;
              System.out.println("Record Deleted successfully...!");
             
          }
         
      }
      if(!found) {
      System.out.println("ID not found..!");
     
      }
      break;

      //Display Remaining Employee Data
case 4:
System.out.println("\n Employees Data:");
      for (Employee emp : al) {
          System.out.println("ID: " + emp.id + ", Name: " + emp.name + ", Department: " + emp.dpartment + ", Salary: " + emp.salary);
      }
      break;
case 5:
System.exit(0);
break;
default:
System.out.println("Not a valid option, please try again.");
break;
}
System.out.println("Do you want to continue? (yes/no)");// Ask user if they want to continue
cn=sc.nextInt();




}while(cn==1);

}
}



