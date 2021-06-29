package com.example.mytiket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //pindah activity
                Intent gogetstarted = new Intent(SplashActivity.this, GetStartedActivity.class);
                startActivity(gogetstarted);

                this.finish();
            }
             private void finish(){

            }
        },1000); // 1000 ms = 1s
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}