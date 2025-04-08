package com.whiseps.lesson6;

import java.time.LocalDate;

public interface Teachable
{
    void assignHomework(String courseName, LocalDate deadline);
    void cancelClass(String courseName);
}
