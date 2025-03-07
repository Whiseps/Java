package com.whiseps.happyfamilyy;

final class Woman extends Human {

    public Woman(String name, String surname, int yearOfBirth, int iq, String[][] schedule, Pet pet) {
        super(name, surname, yearOfBirth, iq, schedule, pet);
    }

    public void applyMakeup() {
        System.out.println("I'm applying my makeup.");
    }

    @Override
    public void greetPet() {
        if (getPet() != null) {
            System.out.println("Hello there, my sweet " + getPet().getNickname());
        } else {
            System.out.println("Hello, sweetie");
        }
    }
}