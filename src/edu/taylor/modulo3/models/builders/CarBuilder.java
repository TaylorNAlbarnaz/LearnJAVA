package edu.taylor.modulo3.models.builders;

import java.util.Random;

import edu.taylor.modulo3.models.vehicles.Car;

public class CarBuilder {
    Car car;

    public CarBuilder() {
        car = new Car("Car", "white");
    }

    public CarBuilder asAny() {
        Random random = new Random();
        int rand = random.nextInt(2);

        if (rand == 0) {
            return asCommon();
        } else {
            return asSuper();
        }
    }

    public CarBuilder asSuper() {
        Random random = new Random();
        int rand = random.nextInt(4);
        switch (rand) {
            case 0:
                car.setName("Lamborghini");
                break;
            case 1:
                car.setName("Ferrari");
                break;
            case 2:
                car.setName("Porsche");
                break;
            case 3:
                car.setName("Bugatti");
                break;
        }
        return this;
    }

    public CarBuilder asCommon() {
        Random random = new Random();
        int rand = random.nextInt(4);
        switch (rand) {
            case 0:
                car.setName("Fiat");
                break;
            case 1:
                car.setName("Volkswagen");
                break;
            case 2:
                car.setName("Ford");
                break;
            case 3:
                car.setName("Chevrolet");
                break;
        }
        return this;
    }
    
    public CarBuilder withRandomColor() {
        Random random = new Random();
        int rand = random.nextInt(8);
        switch (rand) {
            case 0:
                car.setName("white");
                break;
            case 1:
                car.setName("black");
                break;
            case 2:
                car.setName("gray");
                break;
            case 3:
                car.setName("orange");
                break;
            case 4:
                car.setName("red");
                break;
            case 5:
                car.setName("blue");
                break;
            case 6:
                car.setName("green");
                break;
            case 7:
                car.setName("yellow");
                break;
        }
        return this;
    }

    public CarBuilder withColor(String color) {
        car.setColor(color);
        return this;
    }

    public Car build() {
        return this.car;
    }
}
