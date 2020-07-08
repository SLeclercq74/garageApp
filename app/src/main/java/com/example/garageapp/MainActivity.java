package com.example.garageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button connexion;
    TextView id;
    TextView pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connexion = findViewById(R.id.connexion);
        id = findViewById(R.id.username);
        pwd = findViewById(R.id.password);

        if (id.getText() != null && pwd.getText() != null) {
            launchPlanningActivity();

        }
    }

    private void launchPlanningActivity() {
        Intent intent = new Intent(this, PlanningActivity.class);
        startActivity(intent);
    }
}