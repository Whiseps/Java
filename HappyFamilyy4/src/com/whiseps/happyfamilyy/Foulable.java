package com.whiseps.happyfamilyy;

public interface Foulable {
    public default void foul() {

        System.out.println("I need to cover it up");
    }
}
