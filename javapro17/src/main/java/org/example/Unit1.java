package org.example;

public class Unit1 {
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException();
        }

        return a / b;
    }
}
