package com.whiseps.lambda2;

import java.time.LocalDate;
import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;
    String surname;
    double grade;
    char gender;
    LocalDate birthdate;

    public Student(int id, String name, String surname, double grade, char gender, LocalDate birthdate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.grade = grade;
        this.gender = gender;
        this.birthdate = birthdate;
    }

    // This will sort by id by default
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + surname + " " + grade + " " + gender + " " + birthdate;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(7, "Harry", "Potter", 95.0, 'M', LocalDate.of(2000, 7, 31)));
        students.add(new Student(10, "Hermione", "Granger", 98.5, 'F', LocalDate.of(1999, 9, 19)));
        students.add(new Student(3, "Frodo", "Baggins", 88.0, 'M', LocalDate.of(2001, 6, 15)));
        students.add(new Student(8, "Arya", "Stark", 91.5, 'F', LocalDate.of(2002, 2, 23)));
        students.add(new Student(4, "Tony", "Stark", 85.0, 'M', LocalDate.of(1998, 5, 29)));
        students.add(new Student(6, "Bruce", "Wayne", 87.5, 'M', LocalDate.of(1997, 4, 17)));
        students.add(new Student(1, "Luke", "Skywalker", 92.0, 'M', LocalDate.of(2000, 5, 4)));
        students.add(new Student(5, "Diana", "Prince", 96.0, 'F', LocalDate.of(1999, 3, 22)));
        students.add(new Student(9, "Sherlock", "Holmes", 99.0, 'M', LocalDate.of(1996, 1, 6)));
        students.add(new Student(2, "Katniss", "Everdeen", 90.0, 'F', LocalDate.of(2001, 8, 8)));


        // Custom sorting using lambda
        Comparator<Student> customComparator = Comparator
                .comparingDouble((Student s) -> -s.grade) //Descending grade
                .thenComparing(s -> s.birthdate) //Ascending birthdate
                .thenComparing(s -> s.gender) //'F' before 'M'
                .thenComparing(s -> s.surname) //Ascending surname
                .thenComparing(Comparator.comparing(s -> s.name, Comparator.reverseOrder())) //Descending name
                .thenComparingInt(s -> s.id); //Ascending ID



        students.sort(customComparator);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}

