package edu.taylor.modulo3.models.builders;

import java.util.Random;

import edu.taylor.modulo3.models.actors.Pedestrian;
import edu.taylor.modulo3.models.vehicles.Car;

public class PedestrianBuilder {
    Pedestrian ped;

    public PedestrianBuilder() {
        ped = new Pedestrian("Ped", 'M');
    }

    public PedestrianBuilder asAny() {
        Random random = new Random();
        int rand = random.nextInt(2);

        if (rand == 0) {
            return asMale();
        } else {
            return asFemale();
        }
    }

    public PedestrianBuilder asMale() {
        Random random = new Random();
        int rand = random.nextInt(4);

        ped.setGender('M');
        switch (rand) {
            case 0:
                ped.setName("Jonathan");
                break;
            case 1:
                ped.setName("Steven");
                break;
            case 2:
                ped.setName("Robert");
                break;
            case 3:
                ped.setName("Geralt");
                break;
        }
        return this;
    }

    public PedestrianBuilder asFemale() {
        Random random = new Random();
        int rand = random.nextInt(4);

        ped.setGender('F');
        switch (rand) {
            case 0:
                ped.setName("Jane");
                break;
            case 1:
                ped.setName("Rebecca");
                break;
            case 2:
                ped.setName("Michelle");
                break;
            case 3:
                ped.setName("Isabelle");
                break;
        }
        return this;
    }

    public PedestrianBuilder withAnyCar() {
        var car = new CarBuilder().asAny().withRandomColor().build();
        ped.getIntoCar(car);
        return this;
    }

    public PedestrianBuilder withCar(Car car) {
        ped.getIntoCar(car);
        return this;
    }

    public Pedestrian build() {
        return this.ped;
    }
}
