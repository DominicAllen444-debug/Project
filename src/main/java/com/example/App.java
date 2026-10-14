package com.example;

public class App {
    public String grade(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("marks must be between 0 and 100");
        }
        if (marks >= 90) return "A";
        if (marks >= 80) return "B";
        if (marks >= 70) return "C";
        if (marks >= 60) return "D";
        return "F";
    }

    public static void main(String[] args) {
        App app = new App();
        int marks = 86;
        System.out.println("Grade for " + marks + " marks = " + app.grade(marks));
    }
}
