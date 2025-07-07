package com.example.importantquestions.JUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    private Calc cato;

    @BeforeEach
    void setUp() {
        cato = new Calc();
    }

    @Test
    void testDivide_NormalCase() {
        assertEquals(2, cato.divide(10, 5));
    }

    @Test
    void testDivide_ByZero() {
        assertThrows(ArithmeticException.class, () -> cato.divide(10, 0));
    }

    @Test
    void testMultiply_PositiveNumbers() {
        assertEquals(50, cato.multiply(10, 5));
    }

    @Test
    void testMultiply_ByZero() {
        assertEquals(0, cato.multiply(10, 0));
    }

    @Test
    void testMultiply_NegativeNumbers() {
        assertEquals(-50, cato.multiply(-10, 5));
    }
}