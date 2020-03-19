package com.homework.lesson13;

import java.util.List;

public class Student {

   private  String name;
   private  String secondName;
   private List<Integer> scores;

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public List<Integer> getScores() {
        return scores;
    }


    public Student(String name, String secondName, List<Integer> scores) {
        this.name = name;
        this.secondName = secondName;
        this.scores = scores;
    }

    @Override
    public String toString() {
        return getSecondName() + " " + getName();
    }
}
