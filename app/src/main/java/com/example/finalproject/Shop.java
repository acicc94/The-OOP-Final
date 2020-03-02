package com.example.finalproject;

public class Shop {
    public int gold;

    private int attack;

    private int defense;

    private void shopTalk(){

    }

    private void upgradeWeapon(){

    }

    private void upgradeArmor(){

    }

    private void leaveShop(){

    }

    private void goldCheck(){

    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "Player's gold is now : " + gold +
                "\nPlayer's attack is now : " + attack +
                "\nPlayer's defense is now : " + defense +
                '}';
    }
}
