package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="students_data")
public class Students {

@Id
@GeneratedValue
	private int studentId;
	@Column
	private String studentName;
	@Column
	private String studentsemester;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="student_courses",
	joinColumns=@JoinColumn(name="studentId"),
	inverseJoinColumns=@JoinColumn(name="courseId"))
	private List<Courses> courses;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentsemester() {
		return studentsemester;
	}
	public void setStudentsemester(String studentsemester) {
		this.studentsemester = studentsemester;
	}
	public List<Courses> getCourses() {
		return courses;
	}
	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}
	
}
