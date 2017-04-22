package com.example.android.absholistic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.android.absholistic.Food.FoodActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        public void sendMessage(View view)
        {
            Intent intent = new Intent(MainActivity.this, FoodActivity.class);
            startActivity(intent);
        }




    }




}
