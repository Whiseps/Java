package com.whiseps.happyfamilyy;

final class Man extends Human {

    public Man(String name, String surname, int yearOfBirth, int iq, String[][] schedule, Pet pet) {
        super(name, surname, yearOfBirth, iq, schedule, pet);
    }

    public void repairCar() {
        System.out.println("I'm fixing my car.");
    }

    @Override
    public void greetPet() {
        if (getPet() != null) {
            System.out.println("What's up " + getPet().getNickname());
        } else {
            System.out.println("Yo " + getPet().getNickname() + ", let's go for a walk!");
        }
    }
}