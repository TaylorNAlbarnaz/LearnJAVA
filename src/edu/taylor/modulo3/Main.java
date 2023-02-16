package edu.taylor.modulo3;

import edu.taylor.modulo3.models.vehicles.Car;
import edu.taylor.modulo3.models.vehicles.Motorcycle;
import edu.taylor.modulo3.models.vehicles.Truck;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Corvette", "red");
        Motorcycle motorcycle = new Motorcycle("Cg 125", "red");
        Truck truck = new Truck("AVTR 2620", "white", 8);

        System.out.println(car);
        System.out.println(motorcycle);
        System.out.println(truck);
    }
}
