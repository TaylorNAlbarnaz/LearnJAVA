package edu.taylor.modulo3.models.vehicles;

public class Truck extends Vehicle {
    public Truck(String name, String color, int wheelQuantity) {
        super(name, color, wheelQuantity);
    }

    @Override
    public String toString() {
        return "a " + getDescription() + " truck with " + wheelQuantity + " wheels";
    }
}