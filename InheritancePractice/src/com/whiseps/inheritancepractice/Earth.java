package com.whiseps.inheritancepractice;



public class Earth extends Planet {
    public final int numberOfContinents;

    public Earth() {
        super("Earth", 5.972e24, 6371e3, 149.6e6);
        this.numberOfContinents = 7;
    }

    @Override
    public boolean supportsLife() {
        return true;
    }

    @Override
    public String getAtmosphereComposition() {
        return "78% Nitrogen, 21% Oxygen, 1% Other gases";
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Number of Continents: " + numberOfContinents);
    }

    public static void main(String[] args) {
        Earth earth = new Earth();

        double gravity = earth.calculateGravity();
        System.out.println("Gravity on Earth: " + gravity + " m/s^2");

        earth.showInfo();
    }
}
