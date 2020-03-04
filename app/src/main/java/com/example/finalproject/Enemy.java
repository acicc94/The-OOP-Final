package com.example.finalproject;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Enemy extends Stats {

    List<String> enemyNames = Arrays.asList("Slime", "Skeleton", "Zombie");

    Random stats = new Random();

    public Enemy(int health, int speed, int attack, int availablePoint, List<String> enemyNames) {
        super(health, speed, attack, availablePoint);
        setEnemyNames(enemyNames);
    }


    public List<String> getEnemyNames() {
        return enemyNames;
    }

    public void setEnemyNames(List<String> enemyNames) {
        this.enemyNames = enemyNames;
    }
}
