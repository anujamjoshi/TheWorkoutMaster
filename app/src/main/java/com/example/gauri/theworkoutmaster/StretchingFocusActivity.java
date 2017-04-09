package com.example.gauri.theworkoutmaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StretchingFocusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stretching_focus);
        Button upperStrength = (Button)  findViewById(R.id.stretching_back_strengthening_button);
        upperStrength.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(StretchingFocusActivity.this, WorkoutActivity.class));
                WorkoutActivity.createActivities("back_strenghthening");
            }

        });   Button fullBody = (Button)  findViewById(R.id.stretching_full_body_button);
        fullBody.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(StretchingFocusActivity.this, WorkoutActivity.class));
                WorkoutActivity.createActivities("full_body");
            }

        });
        Button head_to_toe_warmup = (Button)  findViewById(R.id.stretching_head_to_toe_warmup_button);
        head_to_toe_warmup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(StretchingFocusActivity.this, WorkoutActivity.class));
                WorkoutActivity.createActivities("head_to_toe_warmup");
            }

        });
        Button standing_only = (Button)  findViewById(R.id.stretching_standing_only_button);
        standing_only.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(StretchingFocusActivity.this, WorkoutActivity.class));
                WorkoutActivity.createActivities("standing_only");
            }

        });

    }

}
