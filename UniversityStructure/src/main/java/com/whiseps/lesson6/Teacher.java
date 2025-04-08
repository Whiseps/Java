package com.whiseps.lesson6;

import java.time.LocalDate;

public class Teacher extends Human implements Teachable{
    public String subject;
    private int yearsAtUniversity;
    private int yearsOfExperience;
    private double salary;
    private int classesPerWeek;


    public Teacher(String name, String surname, int age, String gender, String nationality,
                   String subject, int yearsAtUniversity , int yearsOfExperience, double salary, int classesPerWeek) {
        super(name, surname, age, gender, nationality);
        this.subject = subject;
        this.yearsAtUniversity = yearsAtUniversity;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
        this.classesPerWeek = classesPerWeek;
    }


    public int getYearsAtUniversity() {
        return yearsAtUniversity;
    }
    public void setYearsAtUniversity(int yearsAtUniversity) {
        this.yearsAtUniversity = yearsAtUniversity;
    }

    public int getYearsOfExperience() { return yearsOfExperience; }
    public void setYearsOfExperience(int yearsOfExperience) { this.yearsOfExperience = yearsOfExperience; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public int getClassesPerWeek() {
        return classesPerWeek;
    }
    public void setClassesPerWeek(int classesPerWeek) {
        this.classesPerWeek = classesPerWeek;
    }

    @Override
    public void assignHomework (String courseName, LocalDate deadline) {
        System.out.println(name +surname+ " assigned homework for "+ courseName +" due "+ deadline);
    }

    @Override
    public void cancelClass(String courseName) {
        System.out.println(name +surname+" cancelled " + courseName +" class");
    }

    public void increaseSalary(double percent) {
        this.salary += this.salary * percent / 100;
    }

}

