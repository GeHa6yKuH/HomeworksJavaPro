package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Unit1Test {

    @Test
    void dividePositiveTest() {
        double a = 10;
        double b = 10;
        double expected = 1;
        Assertions.assertEquals(expected, new Unit1().divide(10, 10));
    }

    @Test
    @DisplayName("Test idet ne tuda")
    void divideByZeroTest() {
        double a = 10;
        double b = 0;
        Assertions.assertThrows(ArithmeticException.class, () -> new Unit1().divide(a, b));
    }
}