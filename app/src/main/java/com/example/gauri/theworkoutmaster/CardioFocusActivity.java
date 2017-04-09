package com.example.gauri.theworkoutmaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CardioFocusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio_focus);
        Button fullIntensity = (Button)  findViewById(R.id.cardio_full_intensity_button);
        fullIntensity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(CardioFocusActivity.this, WorkoutActivity.class));
               // WorkoutActivity.createActivities("cardio_full_intensity");
            }

        });
        Button warmup = (Button)  findViewById(R.id.cardio_light_warmup_button);
        warmup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(CardioFocusActivity.this, WorkoutActivity.class));
               // WorkoutActivity.createActivities("cardio_light_warmup");
            }

        });
    }
}
