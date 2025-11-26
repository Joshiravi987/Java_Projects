package oops.encapsulation;

import java.util.Scanner;

public class CallEncapsulation {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter id: ");
	int id = sc.nextInt();
	System.out.println("Enter name: ");
	String name = sc.next();
	System.out.println("Enter email id: ");
	String emailId = sc.next();
	Encapsulation e = new Encapsulation();
	e.setId(id);
	e.setName(name);
	e.setEmailId(emailId);
	
	System.out.println("Id: " + id);
	System.out.println("Name: " + name);
	System.out.println("Email Id: " + emailId);
	System.out.println(e.getId() + " " + e.getName() + " " + e.getEmailId());
	System.out.println(e.toString());
	
}
}
