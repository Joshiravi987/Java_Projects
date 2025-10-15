package DSA;

// This code is part of a Java program that manages a list of students.
import java.util.ArrayList;
import java.util.Scanner;

public class Student_class_switch {
	int id;
	String name;


	public Student_class_switch(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student_class_switch> al = new ArrayList<Student_class_switch>();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		int num_of_students;
		do {
			System.out.println("1. Add Student");
			System.out.println("2. Display Students");
			System.out.println("3. Search Student by ID");
			System.out.println("4. Delete Student by ID");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("how many students you want to add: ");
				num_of_students = sc.nextInt();
				for (int i = 0; i < num_of_students; i++) {
					System.out.println("enter id and name ");
					int id = sc.nextInt();
					String name = sc.next();
					al.add(new Student_class_switch(id, name));
				}
				break;
			case 2:
				for (Student_class_switch s : al) {
					System.out.println("ID: " + s.id + ", Name: " + s.name);
				}
				break;
			case 3:
				System.out.println("Enter id for search: ");
				int searchId = sc.nextInt();
				boolean found = false;
				for (Student_class_switch s : al) {
					if (s.id == searchId) {
						System.out.println("" + s.id + " " + s.name);
						found = true;

					}
				}
				if (!found) {
					System.out.println("Student with ID " + searchId + " not found.");
				}
				break;
			case 4:
				System.out.println("Delete the id ");
				int deleteId = sc.nextInt();
				boolean removed = false;
				for (int i = 0; i < al.size(); i++) {
				    if (al.get(i).id == deleteId) {
				        al.remove(i);
				        System.out.println("Student with ID " + deleteId + " has been deleted.");
				        removed = true;
				        break; // Break to avoid skipping or exception
				    }
				}
				if (!removed) {
				    System.out.println("Student with ID " + deleteId + " not found.");
				}
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice, please try again.");
				break;
			}
			System.out.println("Do you want to continue? (1 for Yes, 2 for No)");
			choice = sc.nextInt();
		} while (choice != 5);
	}

}
