package com.whiseps.lesson6;

public abstract class Human {
    public String name;
    public String surname;
    private int age;
    public String gender;
    private String nationality;


    public Human(String name,String surname, int age, String gender, String nationality) {
        this.name = name;
        this.surname=surname;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;

    }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }


    public String getNationality() { return nationality; }
    public void setNationality(String nationality) { this.nationality = nationality; }

    public String getFullName() {
        return name + " " + surname;
    }

}
