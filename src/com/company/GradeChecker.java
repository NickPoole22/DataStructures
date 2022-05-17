package com.company;

import java.util.HashMap;

public class GradeChecker {

    String className;
    int grade;
    HashMap<String, Integer> grades = new HashMap<>();

    public GradeChecker(String className){
      this.className = className;
    }
    public String checkGrade(String name){
        if (grades.containsKey(name)){
            return name + " has a " + grades.get(name) + "%" + " in " + getClassName();
        }
        return "This student does not exist";
    }
    public void addStudent(String name, int grade){
        grades.put(name, grade);
    }


    public void updateScore(String name, int newScore){
//       int newGrade = (grades.get(name) + newScore) / 2;
        grades.put(name, newScore);
    }

    public int getGrade() {
        return grade;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getHighestScore() {
        String result = "";
        int highestScore = 0;
        for( String person : grades.keySet()) {
            int thisPersonsScore = grades.get(person);
            if(thisPersonsScore > highestScore) {
                highestScore = thisPersonsScore;
                result = person;
            }
        }
        return result;
    }
}

