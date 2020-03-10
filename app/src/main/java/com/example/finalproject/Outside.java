package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class Outside extends AppCompatActivity{
    private TextView showevent;
    Random random=new Random();
    private Enemy enemy=new Enemy();
    public String enemyName;
    public static int nomOfEnemies;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.outside);
        showevent=findViewById(R.id.showevent);
    }
    public void search(View v) {
        enemyName=enemy.NewEnemy();
        int eventNum=random.nextInt(2);
        nomOfEnemies = random.nextInt(5) + 1;
        String event;
        if (eventNum==0){
            event="you found "+nomOfEnemies+" "+enemyName;
            showevent.setText(event);
        }else {
            event="nothing happened";
            showevent.setText(event);
        }
    }
    public void headback(View v){
        Intent intent = new Intent(this, InTown.class);
        startActivity(intent);
    }
    public void fight(View v){
        Intent intent = new Intent(this, Combat.class);
        startActivity(intent);
    }
//    private void talk(){
//
//    }
}
