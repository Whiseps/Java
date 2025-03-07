package com.whiseps.happyfamilyy;

class RoboCat extends Pet {
    public RoboCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        setSpecies(Species.ROBO_CAT);
    }

    @Override
    public void respond() {
        System.out.println("Beep beep! I am robo cat" + getNickname());
    }
}
