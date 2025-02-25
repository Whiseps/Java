package com.whiseps.inheritancepractice;

public class Jupiter extends Planet {
    public final int numberOfMoons;

    public Jupiter() {
        super("Jupiter", 1.898e27, 69911e3, 778.5e6);
        this.numberOfMoons = 80;
    }

    @Override
    public boolean supportsLife() {
        return false;
    }

    @Override
    public String getAtmosphereComposition() {
        return "89% Hydrogen, 10% Helium, Trace amounts of Methane and Ammonia";
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Number of Moons: " + numberOfMoons);
    }

    public static void main(String[] args) {
        Jupiter jupiter = new Jupiter();

        double gravity = jupiter.calculateGravity();
        System.out.println("Gravity on Jupiter: " + gravity + " m/s^2");

        jupiter.showInfo();
    }
}
