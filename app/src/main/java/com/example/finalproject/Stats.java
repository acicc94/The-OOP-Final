package com.example.finalproject;

public class Stats {
    protected int health;
    protected int speed;
    protected int attack;
    private int AvailablePoint;

    public Stats(int health, int speed, int attack, int availablePoint) {
        setHealth(health);
        setSpeed(speed);
        setAttack(attack);
        AvailablePoint = availablePoint;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health <= 0){
            throw new IllegalArgumentException("Health cant be 0 or less. ");
        }
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed < 0){
            throw new IllegalArgumentException("speed cant be less than 0. ");
        }
        this.speed = speed;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getAvailablePoint() {
        return AvailablePoint;
    }

    public void setAvailablePoint(int availablePoint) {
        AvailablePoint = availablePoint;
    }

    public void addHealth(){
        setHealth(getHealth() + 10);
    }
    public void addAttack(){
    setAttack(getAttack()+ 10);
    }
    public void addSpeed(){
        setSpeed(getSpeed() + 5);
    }

}
