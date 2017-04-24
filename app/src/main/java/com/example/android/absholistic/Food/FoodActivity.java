package com.example.android.absholistic.Food;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.android.absholistic.R;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(FoodActivity.this, ToActivity.class);
        startActivity(intent);
    }



}