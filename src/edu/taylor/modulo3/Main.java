package edu.taylor.modulo3;

import edu.taylor.modulo3.models.vehicles.Car;
import edu.taylor.modulo3.models.vehicles.Motorcycle;
import edu.taylor.modulo3.models.vehicles.Truck;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Mustang", "white");
        Motorcycle motorcycle = new Motorcycle("Honda", "red");
        Truck truck = new Truck("Volkswagen", "blue", 16);

        System.out.println(car);
        System.out.println(motorcycle);
        System.out.println(truck);
    }
}
