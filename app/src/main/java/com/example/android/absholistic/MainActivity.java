package com.example.android.absholistic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.android.absholistic.Food.FoodActivity;
import com.example.android.absholistic.Health.HealthActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.foodbutton);
        button.setOnClickListener(MainActivity.this);

        Button health = (Button) findViewById(R.id.healthbutton);
        health.setOnClickListener(MainActivity.this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.foodbutton:
                startActivity(new Intent(MainActivity.this, FoodActivity.class));
                break;
            case R.id.healthbutton:
                startActivity(new Intent(MainActivity.this, HealthActivity.class));
                break;
        }
    }
}