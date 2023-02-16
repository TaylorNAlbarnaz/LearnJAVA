package edu.taylor.modulo3.models;

import edu.taylor.modulo3.models.actors.Bandit;
import edu.taylor.modulo3.models.objects.Gun;
import edu.taylor.modulo3.models.objects.GunType;
import edu.taylor.modulo3.models.vehicles.Car;
import edu.taylor.modulo3.models.vehicles.Resistances;

public class GameManager {
    public boolean quit = false;
    public static Bandit player;

    public GameManager() {
        Car car = new Car("Van", "black");
        Gun gun = new Gun("Pistol", GunType.SemiAutomatic, Resistances.Weak, 12);
        player = new Bandit("Player", 'M', gun);
        player.getIntoCar(car);
    }
}
