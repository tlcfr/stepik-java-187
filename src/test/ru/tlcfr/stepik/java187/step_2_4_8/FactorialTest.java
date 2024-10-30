package ru.tlcfr.stepik.java187.step_2_4_8;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.tlcfr.stepik.java187.step_2_4_8.Factorial.factorial;

class FactorialTest {

    @Test
    void sampleInput1() {
        assertEquals(BigInteger.ONE, factorial(1));
    }

    @Test
    void sampleInput2() {
        assertEquals(BigInteger.valueOf(6), factorial(3));
    }

    @Test
    void customInput1() {
        assertEquals(BigInteger.valueOf(120), factorial(5));
    }

}
