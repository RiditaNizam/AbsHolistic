package com.example.android.absholistic.Fat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.android.absholistic.Food.FoodActivity;
import com.example.android.absholistic.MainActivity;
import com.example.android.absholistic.R;

public class FatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fat);

        Button anatomyandphysiologybutton = (Button) findViewById(R.id.anatomyandphysiology);
        anatomyandphysiologybutton.setOnClickListener(FatActivity.this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.anatomyandphysiology:
                startActivity(new Intent(FatActivity.this, AnatomyandPhysiology.class));
                break;
        }
    }
}