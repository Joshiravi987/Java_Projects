package com.model;

import javax.annotation.processing.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Student_Details")
public class Student {
	@Id
	@GeneratedValue
private int Rollno;
	@Column
private String std_name;
	@Column
private String std_mail;
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	//fetch type is EAGER so that it will fetch the subject details along with student details are fetched
	//it it is lazy it will not fetch the subject details along with student details casecade type is ALL so that if we delete student details subject details will also be deleted
	// operations on subject when student operations are performed
	@JoinColumn(name="sub_id") // foreign key column name in student table
	private Subject subjects; // Passing Subject object reference
public int getRollno() {
	return Rollno;
}
public void setRollno(int rollno) {
	Rollno = rollno;
}
public String getStd_name() {
	return std_name;
}
public void setStd_name(String std_name) {
	this.std_name = std_name;
}
public String getStd_mail() {
	return std_mail;
}
public void setStd_mail(String std_mail) {
	this.std_mail = std_mail;
}
public Subject getSubjects() {
	return subjects;
}
public void setSubjects(Subject subjects) {
	this.subjects = subjects;
}


}
