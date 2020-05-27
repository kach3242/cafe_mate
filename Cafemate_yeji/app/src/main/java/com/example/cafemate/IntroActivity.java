package com.example.cafemate;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
// 1.5초 뒤에 MainActivity로 넘어가기
public class IntroActivity extends Activity {
    Handler handler = new Handler();
    Runnable r = new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            finish();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro_layout);
    }

    @Override
    protected void onResume() {
        super.onResume();
        handler.postDelayed(r, 1500);
    }

    @Override
    protected void onPause() {
        super.onPause();
        handler.removeCallbacks(r);
    }
}