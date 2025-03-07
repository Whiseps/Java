package com.whiseps.happyfamilyy;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private int yearOfBirth;
    private int iq;
    private String[][] schedule;
    private Family family;
    private Pet pet;



    static {
        System.out.println("Loading a new Human class...");
    }


    {
        System.out.println("Creating a new Human object...");
    }

    public Human(String name, String surname, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    public Human(String name, String surname, int yearOfBirth, int iq, String[][] schedule,Pet pet) {
        this(name, surname, yearOfBirth);
        this.iq = iq;
        this.schedule = schedule;
        this.pet=pet;
    }

    public Human() {

    }



    @Override
    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + yearOfBirth + ", iq=" + iq +
                ", schedule=" + Arrays.deepToString(schedule) + "}";
    }


    public void greetPet() {
        if (pet != null) {
            System.out.println("Hello, " + pet.getNickname() + "!");
        } else {
            System.out.println("I should buy a new pet");
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getIq() {
        return iq;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public Family getFamily() {
        return family;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    @Override
    public boolean equals(Object comparedObject) {
        if (this==comparedObject) {
            return true;
        }
        if (comparedObject==null || getClass()!=comparedObject.getClass()) {
            return false;
        }

        Human comparedHuman =(Human) comparedObject;

        return yearOfBirth==comparedHuman.yearOfBirth &&
                iq==comparedHuman.iq &&
                Objects.equals(name,comparedHuman.name) &&
                Objects.equals(surname, comparedHuman.surname) &&
                Arrays.deepEquals(schedule, comparedHuman.schedule);
        // I did not compare Family objects, because this might lead to cyclic references and infinite loops
        // as I also compare Human objects in Family class.

    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + yearOfBirth;
        result = 31 * result + iq;
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(surname);
        result = 31 * result + Arrays.deepHashCode(schedule);
        // I did not consider hashcode for Family objects, because this might lead to cyclic references and infinite loops
        // as I also consider hashcode for Human objects in Family class.
        return result;
    }


    /* ======================================================================================================


    finalize() WAS DEPRECATED IN JAVA 9 AND REMOVED IN JAVA 18, BUT SINCE IT IS REQUIRED |
                                                                                         |
                                                                                         V
     ======================================================================================================== */

    @Override
    protected void finalize() throws Throwable {
        throw new UnsupportedOperationException("finalize() method is not supported");
    }



}