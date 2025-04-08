package com.whiseps.lesson6;

public class Course {
    public String courseName;
    public int credits;
    public int countPerWeek;
    public Exam exam;

    public Course(String courseName, int credits, int countPerWeek, Exam exam) {
        this.courseName = courseName;
        this.credits = credits;
        this.countPerWeek=countPerWeek;
        this.exam=exam;
    }

}

