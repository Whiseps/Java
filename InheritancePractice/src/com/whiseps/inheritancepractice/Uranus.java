package com.whiseps.inheritancepractice;

public class Uranus extends Planet {
    private final double axialTilt; // in degrees

    public Uranus() {
        super("Uranus", 8.681e25, 25_559_000, 2.871e12);
        this.axialTilt=98.0;
    }

    @Override
    public boolean supportsLife() {
        return false;
    }

    @Override
    public String getAtmosphereComposition() {
        return "83% Hydrogen, 15% Helium, 2% Methane";
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Axial tilt: " + axialTilt);
    }

    public static void main(String[] args) {
        Uranus uranus = new Uranus();

        double gravity = uranus.calculateGravity();
        System.out.println("Gravity on Uranus: " + gravity + " m/s^2");

        uranus.showInfo();
    }

}
