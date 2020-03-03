package com.example.finalproject;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Enemy extends Stats {

    List<String> enemyNames = Arrays.asList("Slime", "Skeleton", "Zombie");

    private int newEnemy;

    Random numOfEnemy = new Random();

    public Enemy(int health, int speed, int attack, int availablePoint, List<String> enemyNames, int newEnemy, Random numOfEnemy) {
        super(health, speed, attack, availablePoint);
        setEnemyNames(enemyNames);
        setNewEnemy(newEnemy);
        setNumOfEnemy(numOfEnemy);
    }


    public List<String> getEnemyNames() {
        return enemyNames;
    }

    public void setEnemyNames(List<String> enemyNames) {
        this.enemyNames = enemyNames;
    }

    public int getNewEnemy() {
        return newEnemy;
    }

    public void setNewEnemy(int newEnemy) {
        this.newEnemy = newEnemy;
    }

    public Random getNumOfEnemy() {
        return numOfEnemy;
    }

    public void setNumOfEnemy(Random numOfEnemy) {
        this.numOfEnemy = numOfEnemy;
    }

    public void newEnemy(){
        String enemy = enemyNames.get(numOfEnemy.nextInt(enemyNames.size()));
    }


}
