package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtName, txtPoints, txtXp, txtHealth,txtAttack,txtSpeed;
    static int hp = 10, speed = 5,attack = 5,points = 10,xp=0,gold,defense;
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
        txtHealth.setText(stats.getHealth()+"");
        txtAttack.setText(stats.getAttack()+"");
        txtSpeed.setText(stats.getSpeed()+"");
        txtXp.setText(xp+"/100");



    }
    public void onAddHealthClick(View v){
        hp=+10;
        txtHealth.setText(hp+"");
        canUpgrade();

    }
    public void onAddStrengthClick(View v){
        attack++;
        txtAttack.setText(attack+"");
        canUpgrade();
    }
    public void onAddSpeedClick(View v){
        speed++;
        txtSpeed.setText(speed+"");
       canUpgrade();
    }
    public void onContinueClick(View v){
    Intent intent = new Intent(this, InTown.class);
        startActivity(intent);
    }




    public void canUpgrade(){
        points--;
        txtPoints.setText(points+"");
        if(stats.getAvailablePoint() == 0){
            buttonHp.setEnabled(false);
            buttonAtk.setEnabled(false);
            buttonSp.setEnabled(false);
        }
    }


}
