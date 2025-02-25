package com.whiseps.inheritancepractice;

public class Mars extends Planet {
    public final boolean hasRings;

    public Mars() {
        super("Mars", 6.4171e23, 3389.5e3, 227.9e6);
        this.hasRings = false;
    }

    @Override
    public boolean supportsLife() {
        return false;
    }

    @Override
    public String getAtmosphereComposition() {
        return "95% Carbon Dioxide, 2.7% Nitrogen, 1.6% Argon";
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Has rings: " + hasRings);
    }

    public static void main(String[] args) {
        Mars mars = new Mars();

        double gravity = mars.calculateGravity();
        System.out.println("Gravity on Mars: " + gravity + " m/s^2");

        mars.showInfo();
    }
}
