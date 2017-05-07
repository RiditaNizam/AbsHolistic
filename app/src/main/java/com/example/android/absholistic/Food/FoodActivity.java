package com.example.android.absholistic.Food;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.android.absholistic.R;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        Button mealideas = (Button) findViewById(R.id.mealideas);
        mealideas.setOnClickListener(FoodActivity.this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.mealideas:
                startActivity(new Intent(FoodActivity.this, MealIdeas.class));
                break;
        }
    }

}