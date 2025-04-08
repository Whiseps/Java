package com.whiseps.lesson6;

import java.time.LocalDate;

public class Exam {
    private String courseName;
    public LocalDate examDate;
    public int durationInMinutes;
    public String location;

    public Exam(String courseName, LocalDate examDate, int durationInMinutes, String location) {
        this.courseName = courseName;
        this.examDate = examDate;
        this.durationInMinutes = durationInMinutes;
        this.location = location;
    }


    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }
}
