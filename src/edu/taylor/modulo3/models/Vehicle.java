package edu.taylor.modulo3.models;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
    public String name;
    public String color;
    public int wheelQuantity;

    public List<Wheel> wheels = new ArrayList<>();

    public Vehicle(String name, String color, int wheelQuantity) {
        this.name = name;
        this.color = color;
        this.wheelQuantity = wheelQuantity;

        for (int i = 0; i < wheelQuantity; i++) {
            Wheel wheel = new Wheel(Resistances.Normal);
            wheels.add(wheel);
        }
    }
}
