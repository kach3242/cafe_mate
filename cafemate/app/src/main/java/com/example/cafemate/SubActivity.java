package com.example.cafemate;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
// intent를 사용해 화면 넘기기
public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

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

        Button imageButton = (Button) findViewById(R.id.btn1);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
