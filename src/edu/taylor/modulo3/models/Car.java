package edu.taylor.modulo3.models;

public class Car extends Vehicle {
    public Car(String name, String color) {
        super(name, color, 4);
    }

    @Override
    public String toString() {
        return name + " is a " + color + " car.";
    }
}
