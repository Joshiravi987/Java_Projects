package com.institute.model;

import java.math.BigDecimal;

public class Course {
    private int id;
    private String title;
    private BigDecimal fees;
    private int durationMonths;

    public Course() {}

    public Course(int id, String title, BigDecimal fees, int durationMonths) {
        this.id = id;
        this.title = title;
        this.fees = fees;
        this.durationMonths = durationMonths;
    }

    public Course(String title, BigDecimal fees, int durationMonths) {
        this.title = title;
        this.fees = fees;
        this.durationMonths = durationMonths;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public BigDecimal getFees() { return fees; }
    public void setFees(BigDecimal fees) { this.fees = fees; }
    public int getDurationMonths() { return durationMonths; }
    public void setDurationMonths(int durationMonths) { this.durationMonths = durationMonths; }

    @Override
    public String toString() {
        return String.format("Course{id=%d, title='%s', fees=%s, durationMonths=%d}", id, title, fees, durationMonths);
    }
}
