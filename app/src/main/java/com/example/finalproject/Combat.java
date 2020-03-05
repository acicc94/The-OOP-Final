package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import static com.example.finalproject.Player.level;


public class Combat extends AppCompatActivity{
    private TextView playerHealth,EnemyHp,log;
    Random random=new Random();
    private final int TEN=10;
    private int xp=0,currentHealth;
    private Stats newEnemy=new Stats(random.nextInt(TEN)+level,random.nextInt(TEN)+level,random.nextInt(TEN)+level,random.nextInt(TEN)+level);
    private Player player;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.combat);
        player=new Player(player.getHealth(),player.getSpeed(),player.getAttack(),player.getAvailablePoint(),player.getName());
        currentHealth=player.getHealth();
        playerHealth=findViewById(R.id.playerhp);
        EnemyHp=findViewById(R.id.Enemyhp);
        log=findViewById(R.id.log);
    }
    public void run(View v){
        Intent intent = new Intent(this, Outside.class);
        startActivity(intent);
    }
    public void attack(View v){
        speedCheck();
        xpCheck();
    }
    public void speedCheck(){
        int PSC=random.nextInt(player.getSpeed())+1,ESC=newEnemy.getSpeed()+1;
//        PSC=player speed Check ESC=enemy speed check
        int playerDamage=player.getAttack(),enemyDamage=newEnemy.getAttack();
//        if (PSC==player.getSpeed()){
//            PSC*=2;
//        }what you think? if PSC=player speed PSC*2
        if (PSC>ESC){
            newEnemy.setHealth(newEnemy.getHealth()-playerDamage);
        }else if (PSC<ESC){
            currentHealth-=enemyDamage;
        }else {
            newEnemy.setHealth(newEnemy.getHealth()-playerDamage);
            currentHealth-=enemyDamage;
        }
    }
    public void xpCheck(){
        if (xp==100){
            player.setAvailablePoint(player.getAvailablePoint()+3);
            xp=0;
        }
    }
    public void winCheck(){

    }
    public void deadCheck(){

    }

}
