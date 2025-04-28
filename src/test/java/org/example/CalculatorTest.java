package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAdd() {
        assertEquals(7, Calculator.add(3, 4));
        assertEquals(0, Calculator.add(-2, 2));
    }

    @Test
    void testSubtract() {
        assertEquals(5, Calculator.subtract(10, 5));
        assertEquals(-1, Calculator.subtract(4, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(20, Calculator.multiply(4, 5));
        assertEquals(0, Calculator.multiply(0, 100));
    }

    @Test
    void testDivide() {
        assertEquals(5, Calculator.divide(10, 2));
        assertEquals(2, Calculator.divide(5, 2)); // Цілочисельне ділення
    }

    @Test
    void testDivideByZeroThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Calculator.divide(10, 0);
        });
        assertEquals("Ділення на нуль неможливе!", exception.getMessage());
    }
}
