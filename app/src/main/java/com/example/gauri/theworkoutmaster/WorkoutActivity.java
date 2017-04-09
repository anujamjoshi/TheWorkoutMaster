package com.example.gauri.theworkoutmaster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


import java.util.ArrayList;

public class WorkoutActivity extends AppCompatActivity {
    Bundle b;
     static ArrayList<String> workoutAssignment = new ArrayList<>();
    static WorkoutLists list = new WorkoutLists();
    public  static void createActivities(String type){
        if((type == "cardio_full_intensity")||(type == "cardio_light_warmup")||(type == "strength_core")){
            for (String s: list.getCardio().get(type)) {
                workoutAssignment.add(s);
            }
        }
        else if ((type == "strength_full")|| (type == "strength_lower")|| (type == "strength_upper")){
            for (String s: list.getStrength().get(type)) {
                workoutAssignment.add(s);
            }
        }
        else if ((type == "stretching_back_strengthening")|| (type == "stretching_full_body")||(type == "stretching_head_to_toe_warmup")||(type == "stretching_standing_only")){
           for (String s: list.getStretching().get(type)){
               workoutAssignment.add(s);
           }
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        b = savedInstanceState;
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_workout);




    }
}
