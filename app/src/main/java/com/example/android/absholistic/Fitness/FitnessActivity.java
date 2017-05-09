package com.example.android.absholistic.Fitness;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.example.android.absholistic.MainActivity;
import com.example.android.absholistic.R;

public class FitnessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness);

        Button fitnessbutton = (Button) findViewById(R.id.fitnessbutton);
        fitnessbutton.setOnClickListener(FitnessActivity.this);

    }
}
