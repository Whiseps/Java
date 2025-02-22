package com.whiseps.happyfamilyy;

public enum Species {
    DOG(false, 4, true),
    CAT(false, 4, true),
    PARROT(true, 2, false),
    HAMSTER(false, 4, true),
    FISH(false, 0, false),
    RABBIT(false, 4, true),
    HORSE(false, 4, false),
    SNAKE(false, 0, false);

    public final boolean canFly;
    public final int numberOfLegs;
    public final boolean hasFur;

    Species(boolean canFly, int numberOfLegs, boolean hasFur) {
        this.canFly=canFly;
        this.numberOfLegs=numberOfLegs;
        this.hasFur=hasFur;
    }

}
