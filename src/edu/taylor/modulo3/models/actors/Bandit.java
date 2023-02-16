package edu.taylor.modulo3.models.actors;

import edu.taylor.modulo3.models.objects.Gun;

public class Bandit extends Driver {
    public Gun gun;
    public int wantedLevel = 0;

    public Bandit(String name, char gender, Gun gun) {
        super(name, gender);
        this.gun = gun;
    }
}
