package edu.taylor.modulo3.models.vehicles;

public class Wheel {
    public Resistances resistance;
    public boolean pooped;

    public Wheel(Resistances resistance) {
        this.resistance= resistance;
    }

    public void pop() {
        pooped = true;
    }
}
