package Encapsulation;
public class calling_student {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1 = new Student();
Student s2 = new Student();
Student s3 = new Student();
s1.setName("RAVI");
s1.setRollno(123);
s1.setTotalMarks(85);
s2.setName("RAJ");
s2.setRollno(124);
s2.setTotalMarks(35);
s3.setName("DINESH");
s3.setRollno(125);
s3.setTotalMarks(105);
System.out.println("Name: " + s1.getName());
System.out.println("Roll No: " + s1.getRollno());
System.out.println("Total Marks: " + s1.getTotalMarks());
System.out.print("Grade      : ");
s1.getGrade();

System.out.println("Name: " + s2.getName());
System.out.println("Roll No: " + s2.getRollno());
System.out.println("Total Marks: " + s2.getTotalMarks());
System.out.print("Grade      : ");
s2.getGrade();
System.out.println("Name: " + s3.getName());
System.out.println("Roll No: " + s3.getRollno());
System.out.println("Total Marks: " + s3.getTotalMarks());
System.out.print("Grade      : ");
s3.getGrade();
	}
	

}
