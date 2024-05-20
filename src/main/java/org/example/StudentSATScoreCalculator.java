package org.example;

public class StudentSATScoreCalculator {
    private int satScore;

    public void calculateSatScore(int mathScore, int englishScore) {
        if (mathScore < 0 || mathScore > 100 || englishScore < 0 || englishScore > 100) {
            satScore = -1;
        } else {
            satScore = mathScore * englishScore;
        }

    }

    public int getSatScore() {
        return this.satScore;
    }
}
