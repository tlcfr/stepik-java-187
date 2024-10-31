package ru.tlcfr.stepik.java187.module_2.step_2_4_8;

import java.math.BigInteger;

public class Factorial {

    private Factorial() {
    }

    /**
     * Calculates factorial of given <code>value</code>.
     *
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= value; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}
