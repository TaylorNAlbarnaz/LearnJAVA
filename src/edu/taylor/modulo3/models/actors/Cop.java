package edu.taylor.modulo3.models.actors;

import edu.taylor.modulo3.models.objects.Gun;

public class Cop extends Driver {
    public Gun gun;

    public Cop(String name, char gender, Gun gun) {
        super(name, gender);
        this.gun = gun;
    }
}
