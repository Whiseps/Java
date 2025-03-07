package com.whiseps.happyfamilyy;

enum Species {
    FISH(false, 0, false),
    DOMESTIC_CAT(false, 4, true),
    DOG(false, 4, true),
    ROBO_CAT(false, 4, false),
    UNKNOWN(false, 0, false);

    public final boolean canFly;
    public final int numberOfLegs;
    public final boolean hasFur;

    Species(boolean canFly, int numberOfLegs, boolean hasFur) {
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
    }
}
