package edu.taylor.modulo3.models.actors;

import edu.taylor.modulo3.models.vehicles.Car;

public class Driver {
    private String name;
    private char gender;
    private double money;
    private int health = 100;

    public Car car;

    public Driver(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    public void getIntoCar(Car car) {
        this.car = car;
        car.driver = this;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public double getMoney() {
        return money;
    }

    public int getHealth() {
        return health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void giveMoney(double money) {
        setMoney(getMoney() + money);
    }

    public void takeMoney(double money) {
        var currentMoney = getMoney();
        currentMoney -= money;
        if (currentMoney > 0) {
            setMoney(currentMoney);
        } else {
            setMoney(0);
        }
    }
}
