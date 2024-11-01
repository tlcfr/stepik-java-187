package ru.tlcfr.stepik.java187.module_3.step_3_5_7;

import java.util.function.DoubleUnaryOperator;

public class Integrate {

    private Integrate() {
    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double n = 10E6;
        double h = Math.abs(b - a) / n;
        double result = 0d;

        for (int i = 0; i < n; i++) {
            result += f.applyAsDouble(a + h * i);
        }

        return result * h;
    }
}
