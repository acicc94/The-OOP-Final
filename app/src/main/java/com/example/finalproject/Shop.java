package com.example.finalproject;

import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Shop {
    public TextView shopEvent;

    public int gold;

    private int attack;

    private int defense;

    private Random cost = new Random();



    private void shopTalk(View v){
        if (shopEvent.getText()=="you are greeted by a woman behind a oak wood counter."){
            shopEvent.setText("she asks you to hurry up and buy something");
        }
    }

    private void upgradeWeapon(){
        attack=attack+1;
        gold=gold-cost.nextInt(990)+10;

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

    public TextView getShopEvent() {
        return shopEvent;
    }

    public void setShopEvent(TextView shopEvent) {
        this.shopEvent = shopEvent;
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
