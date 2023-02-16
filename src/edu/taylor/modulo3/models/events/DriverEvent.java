package edu.taylor.modulo3.models.events;

import edu.taylor.modulo3.models.GameManager;
import edu.taylor.modulo3.models.actors.Pedestrian;
import edu.taylor.modulo3.models.vehicles.Car;

public class DriverEvent extends Event {
    private Car car;
    private Pedestrian ped;

    public DriverEvent() {
        setDescription("You see a driver in a " + car.getDescription() + " " + getDirectional());

        setOption1("Rob him");
        setOption2("Take his car");
        setOption3("Do nothing");
    }

    @Override
    public void initialize() {
        car = new Car("Mustang", "red");
        ped = new Pedestrian("John", 'M', car);
    }

    @Override
    public void act() {
        if (getChosen() == 1) {
            var money = ped.getMoney();
            GameManager.player.giveMoney(money);
        } else
        if (getChosen() == 2) {
            GameManager.player.getIntoCar(ped.car);
        }
    }
}
