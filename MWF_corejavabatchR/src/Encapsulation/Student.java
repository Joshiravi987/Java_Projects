package Encapsulation;
public class Student {
private String name;
private int rollno;
private int totalMarks;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public int getTotalMarks() {
	return totalMarks;
}
public void setTotalMarks(int totalMarks) {
	if (totalMarks >= 0 && totalMarks <= 100) {
		this.totalMarks = totalMarks;
	} else {
		System.out.println("Invalid marks. Please enter a value between 0 and 100.");
	}}
	public void  getGrade() {
		if (totalMarks >= 75) {
			System.out.println("A");
		}
			else if (totalMarks <75 && totalMarks >= 60) {
				System.out.println("B");
			}
			else if(totalMarks < 60 && totalMarks >= 45) {
				System.out.println("C");
			}
			else if(totalMarks < 45 && totalMarks >= 35) {
				System.out.println("D");
			}
			else {
				System.out.println("F");
			}}
		
		}
