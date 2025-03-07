package com.whiseps.happyfamilyy;

class Dog extends Pet implements Foulable {
    public Dog(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        setSpecies(Species.DOG);
    }

    @Override
    public void respond() {
        System.out.println("Woof! I am dog " + getNickname());
    }


}
