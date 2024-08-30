package org.example;

public class DetermineGrade {
    public char determineGrade(int score) {
        if (score < 0) {
            throw new IllegalArgumentException("Score can't be less than 0");
        }
        if (score > 90) {
            return 'A';
        } else if (score > 80) {
            return 'B';
        } else if (score > 70) {
            return 'C';
        } else {
            return 'D';
        }
    }
}
