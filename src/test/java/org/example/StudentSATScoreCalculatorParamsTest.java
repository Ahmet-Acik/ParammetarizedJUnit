package org.example;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class StudentSATScoreCalculatorParamsTest {

    private static Object[] testParameters() {
        return new Object[]{
                new Object[]{50, 50, 2500},
                new Object[]{-1, 50, -1},
                new Object[]{101, 50, -1},
                new Object[]{50, -1, -1},
                new Object[]{50, 101, -1},
                new Object[]{-1, -1, -1},
                new Object[]{101, 101, -1},
                new Object[]{0, 0, 0},
                new Object[]{100, 100, 10000}
        };
    }

    @Test
    @Parameters(method = "testParameters")
    public void StudentSATScoreCalculatorParamsTest_ParamsTest(int mathsScore, int englishScore, int expectedScore) {
        StudentSATScoreCalculator studentSATScoreCalculator = new StudentSATScoreCalculator();
        studentSATScoreCalculator.calculateSatScore(mathsScore, englishScore);
        assertEquals(expectedScore, studentSATScoreCalculator.getSatScore());
    }

}
