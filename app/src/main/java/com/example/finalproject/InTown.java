package com.example.finalproject;

import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class InTown extends AppCompatActivity {

    public void onHeadToShopClick(View v){
        Intent intent = new Intent(this, Shop.class);
        startActivity(intent);
    }
}
