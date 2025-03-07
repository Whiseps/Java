package com.whiseps.happyfamilyy;

class DomesticCat extends Pet implements Foulable {
    public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        setSpecies(Species.DOMESTIC_CAT);
    }

    @Override
    public void respond() {
        System.out.println("Meow! I am domestic cat " + getNickname());
    }

}