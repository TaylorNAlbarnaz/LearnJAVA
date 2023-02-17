package edu.taylor.modulo3.models.vehicles;

public abstract class Vehicle {
    protected String name;
    protected String color;
    protected int wheelQuantity;

    public Vehicle(String name, String color, int wheelQuantity) {
        this.name = name;
        this.color = color;
        this.wheelQuantity = wheelQuantity;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "a " + getDescription();
    }
}
