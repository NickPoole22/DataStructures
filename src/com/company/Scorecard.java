package com.company;


import java.util.ArrayList;
import java.util.List;

public class Scorecard {
    String nameOfEvent;
    List<Integer> scores = new ArrayList<Integer>();

    public Scorecard(String nameOfEvent) {
        this.nameOfEvent = nameOfEvent;
    }

    public void addScore(int n) {
        scores.add(n);
    }

    public int highestScore() {
        int maximum = scores.get(0);
        for (Integer n : scores) {
            if (n > maximum) {
                maximum = n;
            }
        }
        return maximum;
    }

    /* return the average score*/
    public int averageScore() {
        int total = 0;
        for (int i = 0; i <= scores.size() - 1; i++){
            total += scores.get(i);
        }
        return (total / scores.size()-1);
    }

}
