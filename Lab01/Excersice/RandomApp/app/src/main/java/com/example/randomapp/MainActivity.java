package com.example.randomapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txtRanNum;
    Button btnPickNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initControl();
    }
    private void initControl(){
        txtRanNum=findViewById(R.id.txtRanNum);
        btnPickNum=findViewById(R.id.btnPickNum);

        btnPickNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int number = rand.nextInt(100);
                txtRanNum.setText(String.valueOf(number));
            }
        });
    }
}