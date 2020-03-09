package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtName, txtPoints, txtXp, txtHealth,txtAttack,txtSpeed;
    int hp = 10, speed = 5,attack = 5,points = 100;
    private Button buttonHp,buttonAtk,buttonSp;
    private Stats stats=new Stats(hp, speed, attack, points);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName = findViewById(R.id.name);
        txtPoints = findViewById(R.id.points);
        txtXp = findViewById(R.id.Xp);
        txtHealth = findViewById(R.id.HP);
        txtAttack = findViewById(R.id.Attack);
        txtSpeed = findViewById(R.id.Speed);
        buttonHp = findViewById(R.id.HPadd);
        buttonAtk = findViewById(R.id.Attackadd);
        buttonSp = findViewById(R.id.Speedadd);


    }
    public void onAddHealthClick(View v){
        stats.setHealth(stats.getHealth() + 10);
        txtHealth.setText(stats.getHealth());
        stats.setAvailablePoint(-1);
        canUpgrade();

    }
    public void onAddStrengthClick(View v){
        stats.setAttack(stats.getAttack()+ 1);
        txtAttack.setText(stats.getAttack());
        stats.setAvailablePoint(-1);
        canUpgrade();
    }
    public void onAddSpeedClick(View v){
        stats.setSpeed(stats.getSpeed() + 1);
        txtSpeed.setText(stats.getSpeed());
        stats.setAvailablePoint(-1);
        canUpgrade();
    }
    public void onContinueClick(View v){
    Intent intent = new Intent(this, InTown.class);
        startActivity(intent);
    }




    public void canUpgrade(){
        if(stats.getAvailablePoint() == 0){
            buttonHp.setEnabled(false);
            buttonAtk.setEnabled(false);
            buttonSp.setEnabled(false);
        }
    }


}
