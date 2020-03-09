package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import static com.example.finalproject.Outside.nomOfEnemies;
//import static com.example.finalproject.MainActivity.attack;


public class Combat extends AppCompatActivity{
    private TextView playerHealth,EnemyHp,log;
    private Button attackBtn;
    Random random=new Random();
    private final int TEN=10;
    private int level = 1;
    private int xp=0,currentHealth;
    private Stats newEnemy=new Stats(random.nextInt(TEN)+level,random.nextInt(TEN)+level,random.nextInt(TEN)+level,random.nextInt(TEN)+level);
    private Player player;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.combat);
        player=new Player(100,10,10,1,"6");
        currentHealth=player.getHealth();
        playerHealth=findViewById(R.id.playerhp);
        EnemyHp=findViewById(R.id.Enemyhp);
        attackBtn=findViewById(R.id.attackenemy);
        updateHP();
        log=findViewById(R.id.log);
    }
    public void run(View v){
        Intent intent = new Intent(this, Outside.class);
        startActivity(intent);
    }
    public void attack(View v){
        speedCheck();
        deadCheck();
        xpCheck();
    }
    public void speedCheck(){
        int PSC=random.nextInt(player.getSpeed())+1,ESC=random.nextInt(newEnemy.getSpeed())+1;
//        PSC=player speed Check ESC=enemy speed check
        int playerDamage=player.getAttack(),enemyDamage=newEnemy.getAttack();
        if (PSC==player.getSpeed()){
            PSC*=2;
        }
        if (PSC>ESC){
            newEnemy.setHealth(newEnemy.getHealth()-playerDamage);
            log.append("you hit enemy for "+playerDamage+" and the enemy misses"+"\n");
        }else if (PSC<ESC){
            currentHealth-=enemyDamage;
            log.append("the enemy hit you for "+enemyDamage+" and you miss"+"\n");
        }else {
            newEnemy.setHealth(newEnemy.getHealth()-playerDamage);
            currentHealth-=enemyDamage;
            log.append("you hit enemy for "+playerDamage+" and the enemy hit you for "+enemyDamage+"\n");
        }
        updateHP();
    }
    public void xpCheck(){
        if (xp==100){
            player.setAvailablePoint(player.getAvailablePoint()+3);
            xp=0;
        }
    }
    private void deadCheck(){
        if (newEnemy.getHealth()<=0){
            xp+=10;
            if (nomOfEnemies!=1) {
                newEnemy = new Stats(random.nextInt(TEN) + level, random.nextInt(TEN) + level, random.nextInt(TEN) + level, random.nextInt(TEN) + level);
                log.append("the next enemy walks up"+"\n");
                nomOfEnemies--;
                updateHP();
            }else {
                log.append("you win");
                attackBtn.setEnabled(false);
            }
        }
        if (player.getHealth()<=0){
            attackBtn.setEnabled(false);
        }
    }
    private void updateHP(){
        playerHealth.setText("Your Hp:"+currentHealth);
        EnemyHp.setText("Enemy Hp:"+newEnemy.getHealth());
    }
}
