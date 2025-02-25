package com.whiseps.inheritancepractice;

public abstract class Planet {
    public String name;
    public double mass;
    public double radius;
    public double distanceFromSun;

    public Planet(String name, double mass, double radius, double distanceFromSun){
        this.name=name;
        this.mass=mass;
        this.radius=radius;
        this.distanceFromSun=distanceFromSun;
    }

    // Concrete method
    public double calculateGravity() {
        double G = 6.67430e-11;
        return (G * mass) / (radius * radius);
    }

    // Concrete method
    public void showInfo() {
        System.out.println("Planet: " + name);
        System.out.println("Mass (in kg): " + mass);
        System.out.println("Radius (in m): " + radius);
        System.out.println("Distance from the Sun (in m): " + distanceFromSun);
    }

    // Abstract methods
    public abstract boolean supportsLife();
    public abstract String getAtmosphereComposition();
}
