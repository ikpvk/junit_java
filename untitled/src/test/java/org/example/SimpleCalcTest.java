package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalcTest {

    @Test
    void twoPlusTwoEqualsFour() {
        SimpleCalc cal = new SimpleCalc();
        assertEquals(4,cal.add(2,2));
    }

    @Test
    void twoPlusThreeEqualsFive() {
        SimpleCalc cal = new SimpleCalc();
        assertEquals(5,cal.add(2,3));
    }
}