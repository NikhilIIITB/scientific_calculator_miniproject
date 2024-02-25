package org.spe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {

    //    @Test
//    void add() {
//        Calculator cal = new Calculator();
//        assertEquals(10,cal.add(7,3));
//    }
//
//    @Test
//    void sub() {
//        Calculator cal = new Calculator();
//        assertEquals(4,cal.sub(7,3));
//    }
    Calculator calculator=new Calculator();
    @Test
    void squareRoot() {

        assertEquals(2.0, calculator.squareRoot(4)); // Test square root of 4
        assertEquals(3.0, calculator.squareRoot(9)); // Test square root of 9
        assertEquals(4.0, calculator.squareRoot(16)); // Test square root of 16
    }

    @Test
    void factorial() {
        assertEquals(1,calculator.factorial(0));
        assertEquals(1,calculator.factorial(1));
        assertEquals(24,calculator.factorial(4));
    }

    @Test
    void naturalLogarithm() {
        assertEquals(0,calculator.naturalLogarithm(1));
    }

    @Test
    void power() {
        assertEquals(4,calculator.power(2,2));
        assertEquals(27,calculator.power(3,3));
    }
}
