package com.example.gauri.theworkoutmaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StrengthFocusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strength_focus);
        Button upperStrength = (Button)  findViewById(R.id.strength_upper_button);
        upperStrength.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View v){
                startActivity(new Intent(StrengthFocusActivity.this, WorkoutActivity.class));
            }

        });
        Button coreStrength = (Button)  findViewById(R.id.strength_core_button);
        coreStrength.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(StrengthFocusActivity.this, WorkoutActivity.class));
            }
        });
        Button lowerStrength = (Button)  findViewById(R.id.strength_lower_button);
        lowerStrength.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(StrengthFocusActivity.this, WorkoutActivity.class));
            }
        });
        Button fullStrength = (Button) findViewById(R.id.strength_full_button);
        fullStrength.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(StrengthFocusActivity.this, WorkoutActivity.class));
            }
        });

    }
}
