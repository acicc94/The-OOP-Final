package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import static com.example.finalproject.MainActivity.*;

import java.util.Random;

public class Shop extends AppCompatActivity{
    private TextView shopEvent,goldamount;
    private Button armor,weapon;
    private Random cost = new Random();
    private int weaponAmount,armorAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop);
        shopEvent =findViewById(R.id.showevent);
        goldamount=findViewById(R.id.goldamount);
        armor=findViewById(R.id.button2);
        weapon=findViewById(R.id.button8);
        goldamount.setText("you have "+gold);
        weaponAmount=(cost.nextInt(attack)*50+cost.nextInt(level)*10);
        armorAmount=(cost.nextInt(defense+1)*50+cost.nextInt(level)*10);
        goldCheck(weaponAmount);
        goldCheck(armorAmount);
    }

    public void shopTalk(View v){
        if (shopEvent.getText()=="you are greeted by a woman behind a oak wood counter."){
            shopEvent.setText("she asks you to hurry up and buy something");
        }
    }

    public void upgradeWeapon(View v){
        attack++;
        gold-=weaponAmount;
        goldamount.setText("you have "+gold);
        goldCheck(weaponAmount);
    }

    public void upgradeArmor(View v){
        defense++;
        gold-=armorAmount;
        goldamount.setText("you have "+gold);
        goldCheck(armorAmount);
    }

    public void onLeaveShopClick(View v){
        Intent intent = new Intent(this, InTown.class);
        startActivity(intent);
    }

    private void goldCheck(int num){
        if (gold<num){
            armor.setEnabled(false);
            weapon.setEnabled(false);
        }else {
            armor.setEnabled(true);
            weapon.setEnabled(true);
        }
    }

    public TextView getShopEvent() {
        return shopEvent;
    }

    public void setShopEvent(TextView shopEvent) {
        this.shopEvent = shopEvent;
    }
}
