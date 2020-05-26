package com.example.cafemate;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonRed = (Button) findViewById(R.id.buttonRed) ;
        buttonRed.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view){
                view = (LinearLayout) findViewById(R.id.lay);
                view.setBackgroundColor(Color.rgb(255,0,0));
            }
            // TODO : click event
        });

        Button buttonBlue = (Button) findViewById(R.id.buttonBlue) ;
        buttonBlue.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view){
                view = (LinearLayout) findViewById(R.id.lay);
                view.setBackgroundColor(Color.rgb(0,0,255));
            }
            // TODO : click event
        });

    }


    public void onClick(View view) {
    }
}