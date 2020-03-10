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
    private int costAmount;
    private Random cost = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop);
        shopEvent =findViewById(R.id.showevent);
        goldamount=findViewById(R.id.goldamount);
        armor=findViewById(R.id.button2);
        weapon=findViewById(R.id.button8);
        goldamount.setText("you have "+gold);
        goldCheck(500);
    }

    public void shopTalk(View v){
        if (shopEvent.getText()=="you are greeted by a woman behind a oak wood counter."){
            shopEvent.setText("she asks you to hurry up and buy something");
        }
    }

    public void upgradeWeapon(View v){
        attack++;
        costAmount=(cost.nextInt(attack)*50+cost.nextInt(level)*10);
        gold-=costAmount;
        goldamount.setText("you have "+gold);
        goldCheck(costAmount);
    }

    public void upgradeArmor(View v){
        defense++;
        costAmount=(cost.nextInt(defense)*50+cost.nextInt(level)*10);
        gold-=costAmount;
        goldamount.setText("you have "+gold);
        goldCheck(costAmount);
    }

    public void onLeaveShopClick(View v){
        Intent intent = new Intent(this, InTown.class);
        startActivity(intent);
    }

    private void goldCheck(int num){
        if (gold<num){
            armor.setEnabled(false);
            weapon.setEnabled(false);
        }
    }

    public TextView getShopEvent() {
        return shopEvent;
    }

    public void setShopEvent(TextView shopEvent) {
        this.shopEvent = shopEvent;
    }
}
