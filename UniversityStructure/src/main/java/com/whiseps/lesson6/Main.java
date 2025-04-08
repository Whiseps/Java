package com.whiseps.lesson6;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Arrays;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Exam exam1 = new Exam("Java Programming", LocalDate.of(2025, 5, 15), 120, "Room 101");
        Exam exam2 = new Exam("Data Structures", LocalDate.of(2025, 5, 20), 90, "Room 102");
        Exam exam3 = new Exam("Mathematics", LocalDate.of(2025, 5, 25), 60, "Room 103");
        Exam exam4 = new Exam("Physics", LocalDate.of(2025, 5, 30), 120, "Room 104");
        Exam exam5 = new Exam("Chemistry", LocalDate.of(2025, 6, 1), 90, "Room 105");


        Course course1 = new Course("Java Programming", 6, 4, exam1);
        Course course2 = new Course("Data Structures", 5, 2, exam2);
        Course course3 = new Course("Mathematics", 5, 4, exam3);
        Course course4 = new Course("Physics", 4, 2, exam4);
        Course course5 = new Course("Chemistry", 3, 3, exam5);


        Teacher teacher1 = new Teacher("Charles", "Xavier", 60, "Male", "American", "Mutant Studies", 20, 40, 10000, 15);
        Teacher teacher2 = new Teacher("Emmett", "Brown", 65, "Male", "American", "Physics", 40, 50, 12000, 8);


        Student student1 = new Student("Peter", "Parker", 20, "Male", "American", "Empire State University", "Physics", 2023, 3.9, true, new Course[]{course1, course2});
        Student student2 = new Student("Hermione", "Granger", 21, "Female", "British", "Hogwarts", "Magical Studies", 2022, 4.0, false, new Course[]{course2, course3});
        Student student3 = new Student("Luke", "Skywalker", 22, "Male", "American", "Tatooine Academy", "Jedi Studies", 2024, 3.8, true, new Course[]{course3, course4});
        Student student4 = new Student("Bruce", "Wayne", 23, "Male", "American", "Gotham University", "Business Administration", 2021, 3.7, false, new Course[]{course1, course4});
        Student student5 = new Student("Wanda", "Maximoff", 22, "Female", "American", "Xavier Institute", "Mutant Studies", 2023, 3.6, true, new Course[]{course5, course2});


        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5);
        List<Teacher> teachers = Arrays.asList(teacher1, teacher2);
        List<Course> courses = Arrays.asList(course1, course2, course3, course4, course5);
        List<Exam> exams = Arrays.asList(exam1, exam2, exam3, exam4, exam5);


        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule()); // so that LocalDate works with jackson
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);


        try {
            objectMapper.writeValue(new File("students.json"), students);

            objectMapper.writeValue(new File("teachers.json"), teachers);

            objectMapper.writeValue(new File("courses.json"), courses);

            objectMapper.writeValue(new File("exams.json"), exams);

            System.out.println("Data was successfully written!!!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        System.out.println(student1.name + " " + student1.surname + " is enrolled in " + student1.coursesTaken[0].courseName + " and " + student1.coursesTaken[1].courseName);
        System.out.println(student2.name + " " + student2.surname + " is enrolled in " + student2.coursesTaken[0].courseName + " and " + student2.coursesTaken[1].courseName);
        System.out.println(student3.name + " " + student3.surname + " is enrolled in " + student3.coursesTaken[0].courseName + " and " + student3.coursesTaken[1].courseName);
        System.out.println(student4.name + " " + student4.surname + " is enrolled in " + student4.coursesTaken[0].courseName + " and " + student4.coursesTaken[1].courseName);
        System.out.println(student5.name + " " + student5.surname + " is enrolled in " + student5.coursesTaken[0].courseName + " and " + student5.coursesTaken[1].courseName);

    }
}

