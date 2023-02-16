package edu.taylor.modulo3.models.actors;

import java.util.Random;

import edu.taylor.modulo3.models.vehicles.Car;

public class Pedestrian extends Driver {
    public Pedestrian(String name, char gender, Car car) {
        super(name, gender);
        getIntoCar(car);

        Random random = new Random();
        setMoney(100.0 + random.nextDouble() * (400.0));
    }
}
