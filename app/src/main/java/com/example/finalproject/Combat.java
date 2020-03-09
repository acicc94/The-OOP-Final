package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import static com.example.finalproject.Outside.nomOfEnemies;
import static com.example.finalproject.MainActivity.hp;
import static com.example.finalproject.MainActivity.speed;
import static com.example.finalproject.MainActivity.attack;
import static com.example.finalproject.MainActivity.points;
import static com.example.finalproject.MainActivity.xp;


public class Combat extends AppCompatActivity{
    private TextView playerHealth,EnemyHp,log;
    private Button attackBtn;
    Random random=new Random();
    private final int TEN=10;
    private int level = 1,currentHealth=hp;
    private Stats newEnemy=new Stats(random.nextInt(TEN)+level,random.nextInt(TEN)+level,random.nextInt(TEN)+level,random.nextInt(TEN)+level);
    private Player player;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.combat);
        player=new Player(hp,speed,attack,points,"name");
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
        int PSC=random.nextInt(speed)+1,ESC=random.nextInt(newEnemy.getSpeed())+1;
//        PSC=player speed Check ESC=enemy speed check
        int playerDamage=attack,enemyDamage=newEnemy.getAttack();
        if (PSC==speed){
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
