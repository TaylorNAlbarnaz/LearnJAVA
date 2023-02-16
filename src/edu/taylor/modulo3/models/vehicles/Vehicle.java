package edu.taylor.modulo3.models.vehicles;

import java.util.ArrayList;
import java.util.List;

import edu.taylor.modulo3.models.actors.Driver;

public abstract class Vehicle {
    protected String name;
    protected String color;
    protected int wheelQuantity;

    private List<Wheel> wheels = new ArrayList<>();
    public Driver driver;

    public Vehicle(String name, String color, int wheelQuantity) {
        this.name = name;
        this.color = color;
        this.wheelQuantity = wheelQuantity;

        for (int i = 0; i < wheelQuantity; i++) {
            Wheel wheel = new Wheel(Resistances.Normal);
            wheels.add(wheel);
        }
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getDescription() {
        return color + " " + name;
    }

    public int getWheelQuantity() {
        return wheelQuantity;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return "a " + getDescription();
    }
}
