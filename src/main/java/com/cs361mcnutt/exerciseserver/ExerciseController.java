package com.cs361mcnutt.exerciseserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.io.File;
import java.util.Scanner;

@RestController
public class ExerciseController {

    ExerciseMap eMap = new ExerciseMap();

    @GetMapping(path ="/exercise")

    @ResponseBody
    public int getCaloriesBurned(@RequestParam String exercise, @RequestParam int reps) {
        int rate = eMap.getCaloriesBurned(exercise);
        return rate != -1 ? rate * reps : rate;
    }
}
