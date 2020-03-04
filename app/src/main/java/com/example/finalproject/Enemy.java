package com.example.finalproject;

import java.util.Random;

public class Enemy extends Stats {
    Random random=new Random();

    public Enemy(int health, int speed, int attack, int availablePoint) {
        super(health, speed, attack, availablePoint);
    }
    public String Newenemy() {
        int newenemy = random.nextInt(4);
        if (newenemy == 0) {
            return "goblin";
        }
        else if (newenemy==1){
            return "wolf";
        }
        else if (newenemy==2){
            return "skeleton";
        }
        else{
            return "slime";
        }
    }
}
