package com.example.rollthedice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button roll;
    ImageView dice;
    int[] images= {R.drawable.dice_one,R.drawable.dice_two,R.drawable.dice_three,R.drawable.dice_four, R.drawable.dice_five, R.drawable.dice_six};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initControl();
    }

    private void initControl(){
        dice=findViewById(R.id.imgDice);
        roll=findViewById(R.id.btnGetDice);
        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand=new Random();
                dice.setImageResource(images[rand.nextInt(images.length)]);
            }
        });
    }
}