package edu.taylor.modulo3.models.actors;

import edu.taylor.modulo3.models.vehicles.Car;

public class Driver {
    public String name;
    public char gender;
    public double money;

    public Car car;

    public Driver(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    public void getIntoCar(Car car) {
        this.car = car;
    }
}
