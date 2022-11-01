package com.cs361mcnutt.exerciseserver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class ExerciseMap {
    private HashMap<String, Integer> exerciseMap;

    public ExerciseMap() {
        exerciseMap = new HashMap<>();
        exerciseMap.put("jogging", 500);
        exerciseMap.put("sprinting", 300);
        exerciseMap.put("hiking", 350);
    }

    public int getCaloriesBurned(String exercise) {
        if (exerciseMap.containsKey(exercise)) {
            return exerciseMap.get(exercise);
        } else {
            return -1;
        }
    }

}