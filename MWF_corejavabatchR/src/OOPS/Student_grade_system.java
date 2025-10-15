package OOPS;

public class Student_grade_system {
	double ave;
	int total_marks;
	String grade;
	//method for take marks of 1 student
	void Calculate_avg(int marks1)
	{
		System.out.println("total marks of 1 student is: " + marks1 +"average is: " + (marks1/1));
		calculateGrade();
	}
	//calling grade method
	//method for take marks of 2 student
	void Calculate_avg(int marks1, int marks2)
	{
		total_marks = marks1 + marks2;
		ave = total_marks / 2.0;
		System.out.println("total marks of 2 student is: " + total_marks + " average is: " + ave);
		calculateGrade();
	}
	//calling grade method
	
	void Calculate_avg(int marks1, int marks2, int marks3)
	{
		total_marks = marks1 + marks2 + marks3;
		ave = total_marks / 3.0;
		System.out.println("total marks of 3 student is: " + total_marks + " average is: " + ave);
		calculateGrade();
	}
	void Calculate_avg(int marks1, int marks2, int marks3, int marks4)
	{
		total_marks = marks1 + marks2 + marks3 + marks4;
		ave = total_marks / 4.0;
		System.out.println("total marks of 4 student is: " + total_marks + " average is: " + ave);
		calculateGrade();
	}
	void Calculate_avg(int marks1, int marks2, int marks3, int marks4, int marks5)
	{
		total_marks = marks1 + marks2 + marks3 + marks4 + marks5;
		ave = total_marks / 5.0;
		System.out.println("total marks of 5 student is: " + total_marks + " average is: " + ave);
		calculateGrade();
	}
	void calculateGrade() {
		if (ave > 90) {
			grade = "A";
			System.out.println("Grade: " + grade);
			} 
		else if (ave >= 80 && ave < 90) {
				grade = "B";
			System.out.println("Grade: " + grade);	
			}
			else if (ave >= 70 && ave < 80) {
				grade = "C";
				System.out.println("Grade: " + grade);
			}
			else if (ave >= 60 && ave < 70) {
				grade = "C";
				System.out.println("Grade: " + grade);
			} 
			else if (ave >= 50 && ave < 60) {
				grade = "E";
				System.out.println("Grade: " + grade);
			} else {
				grade = "FAIL";
				System.out.println("Grade: " + grade);
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Student_grade_system s = new Student_grade_system();
		s.Calculate_avg(70);
		s.Calculate_avg(75, 150);
		s.Calculate_avg(80, 200, 300);
		s.Calculate_avg(100, 200, 300, 400);
		s.Calculate_avg(100, 200, 300, 400, 500);
		
	}

}
