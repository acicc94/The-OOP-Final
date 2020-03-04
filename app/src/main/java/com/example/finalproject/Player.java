package com.example.finalproject;

public class Player extends Stats{
    private String name;
    public static int level = 1;

    public Player(int health, int speed, int attack, int availablePoint, String name) {
        super(health, speed, attack, availablePoint);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cant be null, empty, or whitespace-only.");
        }
        this.name = name;
    }
}
