package com.example.gauri.theworkoutmaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WorkoutTypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_type);
        Button cardioButton = (Button)  findViewById(R.id.cardio_button);
        cardioButton.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
               startActivity(new Intent(WorkoutTypeActivity.this, CardioFocusActivity.class));
           }

        });
        Button strengthButton = (Button)  findViewById(R.id.strength_button);
        strengthButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(WorkoutTypeActivity.this, StrengthFocusActivity.class));
            }
        });
        Button stretchingButton = (Button) findViewById(R.id.stretch_button);
        stretchingButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(WorkoutTypeActivity.this, StretchingFocusActivity.class));
            }
        });

    }
}
