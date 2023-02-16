package edu.taylor.modulo3.models.objects;

import edu.taylor.modulo3.models.vehicles.Resistances;

public class Gun {
    private String name;
    private GunType type;
    private Resistances damage;

    protected int ammo;
    
    public Gun(String name, GunType type, Resistances damage, int ammo) {
        this.name = name;
        this.type = type;
        this.damage = damage;
        this.ammo = ammo;
    }

    public String getName() {
        return name;
    }

    public GunType getType() {
        return type;
    }

    public Resistances getDamage() {
        return damage;
    }
}
