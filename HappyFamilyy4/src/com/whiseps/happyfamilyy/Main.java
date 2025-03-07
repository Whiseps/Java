package com.whiseps.happyfamilyy;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Pet pet1 = new Dog("Roster", 5, 73, new String[]{"eat", "drink", "sleep"});

        Man father = new Man("Walter", "White", 1975,200,new String[][]{
                {DayOfWeek.MONDAY.name(), "cook meth"},
                {DayOfWeek.TUESDAY.name(), "cook meth"},
                {DayOfWeek.WEDNESDAY.name(), "cook meth"},
                {DayOfWeek.THURSDAY.name(), "cook meth"},
                {DayOfWeek.FRIDAY.name(), "cook meth"},
                {DayOfWeek.SATURDAY.name(), "cook meth"},
                {DayOfWeek.SUNDAY.name(), "cook meth"}},pet1);
        Woman mother = new Woman("Skyler", "White", 1970,25,new String[][]{},pet1);

        Man child = new Man("Walter", "White", 1995, 90, new String[][]{
                {DayOfWeek.MONDAY.name(), DayOfWeek.MONDAY.getActivities()},
                {DayOfWeek.TUESDAY.name(), DayOfWeek.TUESDAY.getActivities()},
                {DayOfWeek.WEDNESDAY.name(), DayOfWeek.WEDNESDAY.getActivities()}
        }, pet1);


        Family family1=new Family(mother,father,pet1);
        family1.addChild(child);



        System.out.println("\n==============================\n");

        Pet brian = new Dog("Brian", 8, 100, new String[]{"drink martinis", "write novels", "talk"});

        Woman lois = new Woman("Lois", "Griffin", 1975,110,new String[][]{},brian);
        Man peter= new Man("Peter", "Griffin", 1970,110,new String[][]{},brian);

        Man stewie = new Man("Stewie", "Griffin", 1999, 160, new String[][]{
                {DayOfWeek.MONDAY.name(), "plan world domination"},
                {DayOfWeek.TUESDAY.name(), "build a time machine"},
                {DayOfWeek.SATURDAY.name(), "argue with Brian"}
        },brian);


        Family family2=new Family(lois,peter,brian);
        family2.addChild(stewie);


        stewie.greetPet();

        Human newborn = family2.bornchild(family2);

        System.out.println(newborn.toString());

        newborn.greetPet();

        peter.greetPet();

        lois.applyMakeup();

        brian.respond();

    }
}