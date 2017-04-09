package com.example.gauri.theworkoutmaster;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Anuja on 4/9/17.
 */

public class WorkoutLists {
    HashMap<String, ArrayList<String>> cardio, strength, stretching;

    public HashMap<String, ArrayList<String>> getCardio() {
        return cardio;
    }

    public HashMap<String, ArrayList<String>> getStrength() {
        return strength;
    }

    public HashMap<String, ArrayList<String>> getStretching() {
        return stretching;
    }

    public void initialize(){
        ArrayList<String> full = new ArrayList<String>();
        full.add("Push-up");
        full.add("Overhead Press");
        full.add("Diamond Push-ups");
        full.add("Overhead Arm Clap");
        full.add("Wide Arm Push-ups");
        strength.put("fullStrength", full );
        ArrayList<String> upper = new ArrayList<String>();
        full.add("Wall Push-up");
        full.add("T Raise");
        full.add("Diamond Push-ups");
        full.add("Overhead Arm Clap");
        full.add("Tricep Dips");
        strength.put("upperStrength", upper );
        ArrayList<String> core = new ArrayList<String>();
        full.add("Sit-up");
        full.add("Elevated Crunches");
        full.add("Leg Spreader");
        full.add("Plank");
        full.add("Burpees");
        strength.put("coreStrength", core );

        ArrayList<String> lower = new ArrayList<String>();
        full.add("Squats");
        full.add("Lunges");
        full.add("Leg Spreader");
        full.add("Front Kicks ");
        full.add("Leg Ups");
        strength.put("lowerStrength", lower );
        ArrayList<String> warmup = new ArrayList<String>();
        full.add("Step Touch");
        full.add("High Knees");
        full.add("Butt Kickers ");
        full.add("Single Leg Hops ");
        full.add("Running in place");
        cardio.put("warmup", warmup );
        ArrayList<String> fullIntensity = new ArrayList<String>();
        full.add("Fast feet");
        full.add("Step Touch");
        full.add("Power Skip");
        full.add("High Knees");
        full.add("Jump Rope");
        cardio.put("full_intensity", fullIntensity );
        ArrayList<String> back_strenghthening = new ArrayList<String>();
        back_strenghthening.add("Shoulder Touch");
        back_strenghthening.add("Step Touch");
        back_strenghthening.add("Power Skip");
        back_strenghthening.add("High Knees");
        back_strenghthening.add("Jump Rope");
        stretching.put("back_strenghthening", back_strenghthening);
        ArrayList<String> full_body = new ArrayList<String>();
        full_body.add("Shoulder Shrugs");
        full_body.add("Bend and Reach ");
        full_body.add("Butterfly Stretch");
        full_body.add("Side Stretch");
        full_body.add("Kneeling Hip Flexor");
        stretching.put("full_body", full_body);
        ArrayList<String> head_to_toe_warmup = new ArrayList<String>();
        head_to_toe_warmup.add("Shoulder Shrugs");
        head_to_toe_warmup.add("Bend and Reach ");
        head_to_toe_warmup.add("Butterfly Stretch");
        head_to_toe_warmup.add("Side Stretch");
        head_to_toe_warmup.add("Kneeling Hip Flexor");
        stretching.put("head_to_toe_warmup", head_to_toe_warmup);
        ArrayList<String> standing_only = new ArrayList<String>();
        standing_only.add("Neck Stretch");
        standing_only.add("Arm and Shoulder Strech");
        standing_only.add("Overhead Arm Pull");
        standing_only.add("Chest Stretch");
        standing_only.add("Calf Strech");
        stretching.put("standing_only", standing_only);


    }


}
