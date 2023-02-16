package edu.taylor.modulo3.models;

public class Motorcycle extends Vehicle {
    public Motorcycle(String name, String color) {
        super(name, color, 2);
    }

    @Override
    public String toString() {
        return name + " is a " + color + " motorcycle.";
    }
}
