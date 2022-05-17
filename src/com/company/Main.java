package com.company;



public class Main {

    public static void main(String[] args) {
        Scorecard scorecard = new Scorecard("Math tests");
        scorecard.addScore(78);
        scorecard.addScore(54);
        scorecard.addScore(99);
        scorecard.addScore(56);
        scorecard.addScore(98);
        System.out.println(scorecard.highestScore());
        System.out.println(scorecard.averageScore());

        GradeChecker check = new GradeChecker("Math");

        check.addStudent("Jim", 90);
        check.addStudent("John", 79);
        System.out.println(check.checkGrade("John"));
        check.updateScore("John", 70);
        System.out.println(check.checkGrade("John"));
        System.out.println(check.getHighestScore() + " has the highest score.");
        check.updateScore("John", 94);
        System.out.println(check.getHighestScore() + " has the highest score.");
    }


}
