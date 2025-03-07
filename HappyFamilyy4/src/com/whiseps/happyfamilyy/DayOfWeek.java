package com.whiseps.happyfamilyy;

// Not completely sure if this is what you meant in the project info,
// but that's what I understood (Weekdays + extracurricular activities) .

public enum DayOfWeek {
    MONDAY("Square a doughnut"),
    TUESDAY("Play chess"),
    WEDNESDAY("Play football"),
    THURSDAY("Touch grass"),
    FRIDAY("Invade Canada"),
    SATURDAY("Play video games"),
    SUNDAY("Sleep");

    private String activities;

    DayOfWeek(String activities) {
        this.activities = activities;
    }

    public String getActivities() {
        return activities;
    }
}
