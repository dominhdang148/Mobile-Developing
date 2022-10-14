package com.example.firstprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtX, txtY;
    TextView txtResult;
    Button btnPlus, btnSub, btnMul, btnDiv, btnMod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initControl();
    }
    private void initControl(){
        txtX=findViewById(R.id.txtX);
        txtY=findViewById(R.id.txtY);
        txtResult=findViewById(R.id.txtResult);
        btnPlus=findViewById(R.id.btnPlus);
        btnSub=findViewById(R.id.btnSub);
        btnMul=findViewById(R.id.btnMul);
        btnDiv=findViewById(R.id.btnDiv);
        btnMod=findViewById(R.id.btnMod);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x=Integer.parseInt(txtX.getText().toString());
                int y=Integer.parseInt(txtY.getText().toString());
                int result=x+y;
                txtResult.setText(String.valueOf(result));
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x=Integer.parseInt(txtX.getText().toString());
                int y=Integer.parseInt(txtY.getText().toString());
                int result=x-y;
                txtResult.setText(String.valueOf(result));
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x=Integer.parseInt(txtX.getText().toString());
                int y=Integer.parseInt(txtY.getText().toString());
                int result=x*y;
                txtResult.setText(String.valueOf(result));
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x=Integer.parseInt(txtX.getText().toString());
                int y=Integer.parseInt(txtY.getText().toString());
                int result=x%y;
                txtResult.setText(String.valueOf(result));
            }
        });
        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x=Integer.parseInt(txtX.getText().toString());
                int y=Integer.parseInt(txtY.getText().toString());
                int result=x/y;
                txtResult.setText(String.valueOf(result));
            }
        });

    }
}