package com.example.garageapp;

import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                ActivityUtils.launchActivity(SplashActivity.this, MainActivity.class, ActivityUtils.TYPE_FADE);
            }
        },3000);
    }

}
