package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

import static com.example.finalproject.Player.level;


public class Combat extends AppCompatActivity{
    private TextView playerHealth,EnemyHp,log;
    Random random=new Random();
    private final int TEN=10;
    private Stats newEnemy=new Stats(random.nextInt(TEN)+level,random.nextInt(TEN)+level,random.nextInt(TEN)+level,random.nextInt(TEN)+level);
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.combat);

        playerHealth=findViewById(R.id.playerhp);
        EnemyHp=findViewById(R.id.Enemyhp);
        log=findViewById(R.id.log);
    }
    public void run(){
        Intent intent = new Intent(this, Outside.class);
        startActivity(intent);
    }
    public void attack(){

    }
    public void speedCheck(){

    }
    public void xpCheck(){

    }
    public void winCheck(){

    }
    public void deadCheck(){

    }

}
