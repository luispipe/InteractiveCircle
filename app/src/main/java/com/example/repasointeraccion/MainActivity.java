package com.example.repasointeraccion;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button yellow1,yellow2,orange1,orange2,purple1,purple2;
    private TextView blue1,blue2,green1,green2,red1,red2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        * Cada vez que el usuario seleccione un circulo se indica el texto del color
        * para solo ese circulo
        * */
        yellow1= findViewById(R.id.btn_yellow1);
        yellow2=findViewById(R.id.btn_yellow2);
        orange1=findViewById(R.id.btn_orange1);
        orange2=findViewById(R.id.btn_orange);
        purple1=findViewById(R.id.btn_purple1);
        purple2=findViewById(R.id.btn_purple2);

        blue1=findViewById(R.id.tv_blue1);
        blue2=findViewById(R.id.tv_blue2);
        green1=findViewById(R.id.tv_green1);
        green2= findViewById(R.id.tv_green2);
        red1= findViewById(R.id.tv_red1);
        red2= findViewById(R.id.tv_red2);

        yellow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quitarTexto();
                yellow1.setText("YELLOW");
                yellow1.setTextColor(Color.BLACK);
            }
        });

        yellow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quitarTexto();
                yellow2.setText("YELLOW");
                yellow2.setTextColor(Color.BLACK);
            }
        });

        blue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quitarTexto();
                blue1.setText("YELLOW");
                blue1.setTextColor(Color.WHITE);
            }
        });

        blue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quitarTexto();
                blue2.setText("YELLOW");
                blue2.setTextColor(Color.WHITE);
            }
        });

        purple1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quitarTexto();
                purple1.setText("YELLOW");
                purple1.setTextColor(Color.WHITE);
            }
        });

        purple2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quitarTexto();
                purple2.setText("YELLOW");
                purple2.setTextColor(Color.WHITE);
            }
        });



    }

    public void quitarTexto(){
        yellow1.setText("");
        yellow2.setText("");
        blue1.setText("");
        blue2.setText("");
        orange1.setText("");
        orange2.setText("");
        green1.setText("");
        green2.setText("");
        red1.setText("");
        red2.setText("");
        purple1.setText("");
        purple2.setText("");
    }
}