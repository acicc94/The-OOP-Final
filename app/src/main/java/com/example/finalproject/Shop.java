package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import static com.example.finalproject.MainActivity.*;

import java.util.Random;

public class Shop extends AppCompatActivity{
    private TextView shopEvent,goldamount;

    private Random cost = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop);
        shopEvent =findViewById(R.id.showevent);
        goldamount=findViewById(R.id.goldamount);
        goldamount.setText("you have "+gold);
    }

    public void shopTalk(View v){
        if (shopEvent.getText()=="you are greeted by a woman behind a oak wood counter."){
            shopEvent.setText("she asks you to hurry up and buy something");
        }
    }

    public void upgradeWeapon(View v){
        attack++;
        gold=-(cost.nextInt(attack)*50+cost.nextInt(level)*10);
        goldamount.setText("you have "+gold);
    }

    public void upgradeArmor(View v){
        defense++;
        gold=-(cost.nextInt(defense)*50+cost.nextInt(level)*10);
        goldamount.setText("you have "+gold);
    }

    public void onLeaveShopClick(View v){
        Intent intent = new Intent(this, InTown.class);
        startActivity(intent);
    }

    private void goldCheck(){

    }

    public TextView getShopEvent() {
        return shopEvent;
    }

    public void setShopEvent(TextView shopEvent) {
        this.shopEvent = shopEvent;
    }
}
