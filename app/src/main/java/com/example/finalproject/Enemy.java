package com.example.finalproject;

public class Enemy extends Stats {

    private int newEnemy;

    public Enemy(int health, int speed, int availablePoint, int newEnemy) {
        super(health, speed, availablePoint);
        this.newEnemy = newEnemy;
    }
}
