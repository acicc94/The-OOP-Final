package com.example.finalproject;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Enemy extends Stats {

    List<String> enemyNames = Arrays.asList("Slime", "Skeleton", "Zombie");

    private int newEnemy;

    Random numOfEnemy = new Random();

    public Enemy(int health, int speed, int availablePoint, int newEnemy) {
        super(health, speed, availablePoint);
        this.newEnemy = newEnemy;
    }

    private int genNumOfEnemy(int loop){
        int x1 = numOfEnemy.nextInt(4)+1;
        for(int i = 0; i < loop; i++){
            if(x1==1){
                newEnemy();
            }

        }

        return x1;
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
