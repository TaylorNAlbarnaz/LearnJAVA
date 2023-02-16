package edu.taylor.modulo3.models;

public class Truck extends Vehicle {
    public Truck(String name, String color, int wheelQuantity) {
        super(name, color, wheelQuantity);
    }

    @Override
    public String toString() {
        return name + " is a " + color + " truck with " + wheelQuantity + " wheels";
    }
}