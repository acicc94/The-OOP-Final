package com.example.finalproject;

public class Player extends Stats{
    private String name;

    public Player(int health, int speed, int availablePoint) {
        super(health, speed, availablePoint);
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
