package ru.tlcfr.stepik.java187.step_2_1_12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ru.tlcfr.stepik.java187.step_2_1_12.DoubleExpression.doubleExpression;

class DoubleExpressionTest {

    @Test
    void sampleInput1() {
        assertTrue(doubleExpression(0.1, 0.2, 0.3));
    }
}
