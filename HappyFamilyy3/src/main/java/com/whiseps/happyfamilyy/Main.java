package com.whiseps.happyfamilyy;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Pet pet1 = new Pet(Species.DOG, "Roster", 5, 73, new String[]{"eat", "drink", "sleep"});

        Human father = new Human("Walter", "White", 1975);
        Human mother = new Human("Skyler", "White", 1970);

        Human child = new Human("Walter", "White", 1995, 90, new String[][]{
                {DayOfWeek.MONDAY.name(), DayOfWeek.MONDAY.getActivities()},
                {DayOfWeek.TUESDAY.name(), DayOfWeek.TUESDAY.getActivities()},
                {DayOfWeek.WEDNESDAY.name(), DayOfWeek.WEDNESDAY.getActivities()}
        });


        Family family1=new Family(mother,father,pet1);
        family1.addChild(child);

        System.out.println(family1.toString());

        System.out.println("\n==============================\n");

        Pet brian = new Pet(Species.DOG, "Brian", 8, 100, new String[]{"drink martinis", "write novels", "talk"});

        Human lois = new Human("Lois", "Griffin", 1975);
        Human peter = new Human("Peter", "Griffin", 1970);

        Human stewie = new Human("Stewie", "Griffin", 1999, 160, new String[][]{
                {DayOfWeek.MONDAY.name(), "plan world domination"},
                {DayOfWeek.TUESDAY.name(), "build a time machine"},
                {DayOfWeek.SATURDAY.name(), "argue with Brian"}
        });


        Family family2=new Family(lois,peter,brian);
        family2.addChild(stewie);

        System.out.println(family2.toString());


        System.out.println(brian.toString());







        for (int i=0;i<100_000;i++) {
            Human human = new Human("Alex","DeLarge",1966);
            if (i%10_000==0) {
                System.out.println("Created "+ i + "Human objects");
            }
        }

        System.gc();   // NOT GUARANTEED


    }
}