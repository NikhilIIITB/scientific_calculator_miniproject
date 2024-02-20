package org.spe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {

    @Test
    void add() {
        Calculator cal = new Calculator();
        assertEquals(10,cal.add(7,3));
    }

    @Test
    void sub() {
        Calculator cal = new Calculator();
        assertEquals(4,cal.sub(7,3));
    }
}