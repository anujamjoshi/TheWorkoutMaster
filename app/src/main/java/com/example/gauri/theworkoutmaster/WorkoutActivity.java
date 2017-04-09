package com.example.gauri.theworkoutmaster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class WorkoutActivity extends AppCompatActivity {
    Bundle b;
    WorkoutLists list = new WorkoutLists();
    public static void createActivities(String type){

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        b = savedInstanceState;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
        list.initialize();
    }
}
