package com.whiseps.lesson6;

import java.time.LocalDate;

public class Student extends Human implements Gradable {
    public String university;
    public String major;
    public int submissionYear;
    private double gpa;
    private boolean scholarship;
    public Course[] coursesTaken;

    public Student(String name, String surname, int age, String gender, String nationality,
                   String university, String major, int submissionYear, double gpa, boolean scholarship, Course[] coursesTaken) {
        super(name, surname, age, gender, nationality);
        this.university = university;
        this.major = major;
        this.submissionYear = submissionYear;
        this.gpa = gpa;
        this.scholarship = scholarship;
        this.coursesTaken=coursesTaken;
    }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }

    public boolean getScholarship() { return scholarship; }
    public void setScholarship(boolean scholarship) { this.scholarship = scholarship; }

    @Override
    public void appeal(String courseName) {
        System.out.println(name + surname + " appealed for " + courseName);
    }

    @Override
    public void submitAssignment(String courseName,String assignment, LocalDate date){
        System.out.println(name +surname+ " submitted " + assignment + " for " + courseName + " at "+ date);
    }

    public int calculateStudyYear(int currentYear) {
        return currentYear - submissionYear;
    }
}