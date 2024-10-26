package ru.tlcfr.stepik.java187.step_2_1_12;

public class DoubleExpression {

    private DoubleExpression() {
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(c - (a + b)) < 1E-4;
    }
}
