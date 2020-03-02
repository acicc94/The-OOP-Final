package com.example.finalproject;

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
    private void headback(){

    }
    private void fight(){

    }
    private void talk(){

    }
    private void search() {
        int nomOfEnemies = random.nextInt(5) + 1;
        
    }
}
