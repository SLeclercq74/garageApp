package com.example.garageapp;

import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplachScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_del);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                ActivityUtils.launchActivity(SplachScreenActivity.this, PlanningActivity.class, ActivityUtils.TYPE_FADE);
            }
        },3000);
    }
}
