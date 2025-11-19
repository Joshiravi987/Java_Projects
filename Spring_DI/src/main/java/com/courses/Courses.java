package com.courses;

public class Courses {
private int courseId;
private String courseName;
public int getCourseId() {
	return courseId;
}
public void setCourseId(int courseId) {
	this.courseId = courseId;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
@Override
public String toString() {
	return "Courses [courseId=" + courseId + ", courseName=" + courseName + "]";
}
}
