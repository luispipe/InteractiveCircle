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

        interactiveCircles(yellow1,"YELLOW",Color.BLACK);
        interactiveCircles(yellow2,"YELLOW",Color.BLACK);
        interactiveCircles(orange1,"ORANGE",Color.BLACK);
        interactiveCircles(orange2,"ORANGE",Color.BLACK);
        interactiveCircles(purple1,"PURPLE",Color.WHITE);
        interactiveCircles(purple2,"PURPLE",Color.WHITE);

        interactiveCircles(blue1,"BLUE",Color.WHITE);
        interactiveCircles(blue2,"BLUE",Color.WHITE);
        interactiveCircles(green1,"GREEN",Color.WHITE);
        interactiveCircles(green2,"GREEN",Color.WHITE);
        interactiveCircles(red1,"RED",Color.WHITE);
        interactiveCircles(red2,"RED",Color.WHITE);

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

    public void interactiveCircles(Button circle,String texto,int color){
        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quitarTexto();
                circle.setText(texto);
                circle.setTextColor(color);
                circle.setTextSize(14);
            }
        });
    }
    public void interactiveCircles(TextView circle,String texto,int color){
        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quitarTexto();
                circle.setText(texto);
                circle.setTextColor(color);
                circle.setTextSize(14);
            }
        });
    }


}