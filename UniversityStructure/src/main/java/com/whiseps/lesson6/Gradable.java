package com.whiseps.lesson6;

import java.time.LocalDate;

public interface Gradable {
    void appeal(String courseName);

    void submitAssignment(String courseName, String assignment, LocalDate date);
}
