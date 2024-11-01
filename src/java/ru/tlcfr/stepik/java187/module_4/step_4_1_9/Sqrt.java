package ru.tlcfr.stepik.java187.module_4.step_4_1_9;

public class Sqrt {

    private Sqrt() {
    }

    public static double sqrt(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Expected non-negative number, got " + x);
        }
        return Math.sqrt(x);
    }
}
