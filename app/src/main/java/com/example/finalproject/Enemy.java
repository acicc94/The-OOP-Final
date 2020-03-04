package com.example.finalproject;

import java.util.Random;

public class Enemy{
    Random random=new Random();
    public String NewEnemy() {
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
