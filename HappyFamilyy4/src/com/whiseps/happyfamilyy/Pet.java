package com.whiseps.happyfamilyy;

import java.util.Arrays;
import java.util.Objects;

public abstract class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    static {
        System.out.println("Loading a new Pet class...");
    }

    {
        System.out.println("Creating a new Pet object...");
    }

    public Pet() {
        this.species = Species.UNKNOWN;
    }

    public Pet(Species species, String nickname) {
        this.species = (species != null) ? species : Species.UNKNOWN;
        this.nickname = nickname;
    }

    public Pet(String nickname, int age, int trickLevel, String[] habits) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public abstract void respond();

    @Override
    public String toString() {
        return species + "{nickname='" + nickname + "', age=" + age + ", trickLevel=" + trickLevel + ", habits=" + Arrays.toString(habits) +
                ", Can fly=" + species.canFly + ", Number of legs=" + species.numberOfLegs + ", Has fur=" + species.hasFur + "}";
    }

    public Species getSpecies() {
        return species;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public void setNickname(String nickname) {
        this.nickname=nickname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTrickLevel(int trickLevel) {
        if (trickLevel<=100 && trickLevel>=0) {
            this.trickLevel = trickLevel;
        } else {
            System.out.println("Trick level must be between 0 and 100");
        }

    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    @Override
    public boolean equals(Object comparedObject) {
        if (this == comparedObject) {
            return true;
        }
        if (comparedObject == null || getClass() != comparedObject.getClass()) {
            return false;
        }

        Pet comparedPet = (Pet) comparedObject;
        return age == comparedPet.age &&
                trickLevel == comparedPet.trickLevel &&
                Objects.equals(species, comparedPet.species) &&
                Objects.equals(nickname, comparedPet.nickname) &&
                Arrays.equals(habits != null ? habits : new String[0], comparedPet.habits != null ? comparedPet.habits : new String[0]);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(species, nickname, age, trickLevel);
        result = 31 * result + Arrays.hashCode(habits != null ? habits : new String[0]);
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