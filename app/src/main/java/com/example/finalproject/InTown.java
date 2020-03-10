package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class InTown extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intown);
    }

    public void onHeadToShopClick(View v){
        Intent intent = new Intent(this, Shop.class);
        startActivity(intent);
    }
    public void onHeadOutClick(View v){
        Intent intent = new Intent(this, Outside.class);
        startActivity(intent);
    }
}
