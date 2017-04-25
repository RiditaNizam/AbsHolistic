package com.example.android.absholistic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.android.absholistic.Activity.ActivityActivity;
import com.example.android.absholistic.Body.BodyActivity;
import com.example.android.absholistic.Calories.CaloriesActivity;
import com.example.android.absholistic.Diet.DietActivity;
import com.example.android.absholistic.Effort.EffortActivity;
import com.example.android.absholistic.Energy.EnergyActivity;
import com.example.android.absholistic.Fat.FatActivity;
import com.example.android.absholistic.Fitness.FitnessActivity;
import com.example.android.absholistic.Food.FoodActivity;
import com.example.android.absholistic.Health.HealthActivity;
import com.example.android.absholistic.Weight.WeightActivity;

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
            case R.id.bodybutton:
                startActivity(new Intent(MainActivity.this, BodyActivity.class));
                break;
            case R.id.activitybutton:
                startActivity(new Intent(MainActivity.this, ActivityActivity.class));
                break;
            case R.id.caloriesbutton:
                startActivity(new Intent(MainActivity.this, CaloriesActivity.class));
                break;
            case R.id.dietbutton:
                startActivity(new Intent(MainActivity.this, DietActivity.class));
                break;
            case R.id.effortbutton:
                startActivity(new Intent(MainActivity.this, EffortActivity.class));
                break;
            case R.id.energybutton:
                startActivity(new Intent(MainActivity.this, EnergyActivity.class));
                break;
            case R.id.fatbutton:
                startActivity(new Intent(MainActivity.this, FatActivity.class));
                break;
            case R.id.fitnessbutton:
                startActivity(new Intent(MainActivity.this, FitnessActivity.class));
                break;
            case R.id.weightbutton:
                startActivity(new Intent(MainActivity.this, WeightActivity.class));
                break;
        }
    }
}