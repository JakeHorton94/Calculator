package com.company;

public class Bicycle {

    int speed = 0;
    int gear = 1;

    void applyBrakes (int decrement) {
        speed = speed - decrement;
    }

    void speedUp (int increment) {
        speed = speed + increment;
    }

    void changeGear (int newValue) {
        gear = newValue;
    }

    void printStates() {
        System.out.println("speed: " + speed + "gear: " + gear);
    }
}
