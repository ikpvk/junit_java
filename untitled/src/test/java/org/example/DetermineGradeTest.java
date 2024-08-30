package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetermineGradeTest {
    @Test
    void testScoreNinetyOneGradeA() {
        var detGrade = new DetermineGrade();
        assertEquals('A', detGrade.determineGrade(91));
    }

    @Test
    void testScoreNinetyGradeB() {
        var detGrade = new DetermineGrade();
        assertEquals('B', detGrade.determineGrade(90));
    }

    @Test
    void testScoreEightyFiveGradeB() {
        var detGrade = new DetermineGrade();
        assertEquals('B', detGrade.determineGrade(85));
    }

    @Test
    void testScoreEightyGradeC() {
        var detGrade = new DetermineGrade();
        assertEquals('C', detGrade.determineGrade(80));
    }

    @Test
    void testScoreSeventySevenGradeC() {
        var detGrade = new DetermineGrade();
        assertEquals('C', detGrade.determineGrade(77));
    }

    @Test
    void testScoreSeventyGradeD() {
        var detGrade = new DetermineGrade();
        assertEquals('D', detGrade.determineGrade(70));
    }

    @Test
    void testScoreSixtyNineGradeD() {
        var detGrade = new DetermineGrade();
        assertEquals('D', detGrade.determineGrade(69));
    }

    @Test
    void testInvalidScore() {
        var detGrade = new DetermineGrade();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    detGrade.determineGrade(-1);
                });
        assertEquals('D', detGrade.determineGrade(69));
    }

}