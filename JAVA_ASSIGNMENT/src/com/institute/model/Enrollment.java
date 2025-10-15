package com.institute.model;

import java.time.LocalDateTime;

public class Enrollment {
    private int id;
    private int studentId;
    private int courseId;
    private LocalDateTime enrolledOn;

    public Enrollment() {}

    public Enrollment(int id, int studentId, int courseId, LocalDateTime enrolledOn) {
        this.id = id;
        this.studentId = studentId;
        this.courseId = courseId;
        this.enrolledOn = enrolledOn;
    }

    public Enrollment(int studentId, int courseId) {
        this.studentId = studentId;
        this.courseId = courseId;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getStudentId() { return studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }
    public int getCourseId() { return courseId; }
    public void setCourseId(int courseId) { this.courseId = courseId; }
    public LocalDateTime getEnrolledOn() { return enrolledOn; }
    public void setEnrolledOn(LocalDateTime enrolledOn) { this.enrolledOn = enrolledOn; }

    @Override
    public String toString() {
        return String.format("Enrollment{id=%d, studentId=%d, courseId=%d, enrolledOn=%s}", id, studentId, courseId, enrolledOn);
    }
}
