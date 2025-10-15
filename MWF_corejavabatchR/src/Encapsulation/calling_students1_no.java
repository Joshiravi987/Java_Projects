package Encapsulation;
import java.util.Scanner;
public class calling_students1_no {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of students:: ");
	        int count = sc.nextInt();
	        sc.nextLine(); 
	        Student1[] students = new Student1[count];

	        for (int i = 0; i < count; i++) {
	            students[i] = new Student1();

	            System.out.println("\nEnter details for Student " + (i + 1));

	            System.out.print("Name: ");
	            students[i].setName(sc.nextLine());

	            System.out.print("Roll No: ");
	            students[i].setRollno(sc.nextInt());
	            boolean valid = false;
	            while (!valid) {
	                System.out.print("Total Marks (0–100): ");
	                int marks = sc.nextInt();
	                sc.nextLine();
	                valid = students[i].setTotalMarks(marks); 
	            }
	        }
	        System.out.println("\n========= Student Report =========");
	        for (Student1 s : students) {
	            System.out.println("\nName       : " + s.getName());
	            System.out.println("Roll No    : " + s.getRollno());
	            System.out.println("Total Marks: " + s.getTotalMarks());
	            System.out.print("Grade      : ");
	            s.getGrade();
	        }

	        sc.close();
	    }
	}