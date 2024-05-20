package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentSATScoreCalculatorTest {

    private StudentSATScoreCalculator studentSATScoreCalculator;

    @BeforeEach
    public void setUp() {
        studentSATScoreCalculator = new StudentSATScoreCalculator();
    }

    @Test
    public void StudentSATScoreCalculator_RegularTest() {
        studentSATScoreCalculator.calculateSatScore(50, 50);
        assertEquals(2500, studentSATScoreCalculator.getSatScore());

    }

    @Test
    public void StudentSATScoreCalculator_MathNegativeRegularTest() {
        studentSATScoreCalculator.calculateSatScore(-1, 50);
        assertEquals(-1, studentSATScoreCalculator.getSatScore());

    }

    @Test
    public void StudentSATScoreCalculator_MathHighRegularTest() {
        studentSATScoreCalculator.calculateSatScore(101, 50);
        assertEquals(-1, studentSATScoreCalculator.getSatScore());

    }

    @Test
    public void StudentSATScoreCalculator_EnglishNegativeRegularTest() {
        studentSATScoreCalculator.calculateSatScore(50, -1);
        assertEquals(-1, studentSATScoreCalculator.getSatScore());

    }

    @Test
    public void StudentSATScoreCalculator_EnglishHighRegularTest() {
        studentSATScoreCalculator.calculateSatScore(50, 101);
        assertEquals(-1, studentSATScoreCalculator.getSatScore());

    }

    @Test
    public void StudentSATScoreCalculator_BothNegativeRegularTest() {
        studentSATScoreCalculator.calculateSatScore(-1, -1);
        assertEquals(-1, studentSATScoreCalculator.getSatScore());

    }

    @Test

    public void StudentSATScoreCalculator_BothHighRegularTest() {
        studentSATScoreCalculator.calculateSatScore(101, 101);
        assertEquals(-1, studentSATScoreCalculator.getSatScore());

    }
}