package Encapsulation;

import java.util.Scanner;

public class calling_students1 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
Student1 s = new Student1();
System.out.println("Enter Student Name: ");
s.setName(sc.nextLine());
System.out.println("Enter Student Roll No: ");
s.setRollno(sc.nextInt());

boolean validMarks = false;
while (!validMarks) {
	System.out.println("Enter Total Marks (0-100): ");
	int marks = sc.nextInt();
	validMarks = s.setTotalMarks(marks);
	}
System.out.println("\n===== Student Report =====");
System.out.println("Name       : " + s.getName());
System.out.println("Roll No    : " + s.getRollno());
System.out.println("Total Marks: " + s.getTotalMarks());
s.getGrade();


}}
