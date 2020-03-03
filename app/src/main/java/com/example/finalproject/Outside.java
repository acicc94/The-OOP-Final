package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class Outside extends AppCompatActivity{
    Random random=new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.outside);
    }
    public void search(View v) {
        int nomOfEnemies = random.nextInt(5) + 1;


    }
    public void headback(View v){

    }
    public void fight(View v){
        Intent intent = new Intent(this, Combat.class);
        startActivity(intent);
    }
//    private void talk(){
//
//    }
}
