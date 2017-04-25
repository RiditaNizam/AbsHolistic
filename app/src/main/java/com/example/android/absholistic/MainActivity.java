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

        Button foodbutton = (Button) findViewById(R.id.foodbutton);
        foodbutton.setOnClickListener(MainActivity.this);

        Button healthbutton = (Button) findViewById(R.id.healthbutton);
        healthbutton.setOnClickListener(MainActivity.this);

        Button bodybutton = (Button) findViewById(R.id.bodybutton);
        bodybutton.setOnClickListener(MainActivity.this);

        Button activitybutton = (Button) findViewById(R.id.activitybutton);
        activitybutton.setOnClickListener(MainActivity.this);

        Button caloriesbutton = (Button) findViewById(R.id.caloriesbutton);
        caloriesbutton.setOnClickListener(MainActivity.this);

        Button dietbutton = (Button) findViewById(R.id.dietbutton);
        dietbutton.setOnClickListener(MainActivity.this);

        Button effortbutton = (Button) findViewById(R.id.effortbutton);
        effortbutton.setOnClickListener(MainActivity.this);

        Button energybutton = (Button) findViewById(R.id.energybutton);
        energybutton.setOnClickListener(MainActivity.this);

        Button fatbutton = (Button) findViewById(R.id.fatbutton);
        fatbutton.setOnClickListener(MainActivity.this);

        Button fitnessbutton = (Button) findViewById(R.id.fitnessbutton);
        fitnessbutton.setOnClickListener(MainActivity.this);

        Button weightbutton = (Button) findViewById(R.id.weightbutton);
        weightbutton.setOnClickListener(MainActivity.this);

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