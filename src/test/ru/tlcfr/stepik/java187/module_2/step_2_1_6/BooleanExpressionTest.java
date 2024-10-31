package ru.tlcfr.stepik.java187.module_2.step_2_1_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ru.tlcfr.stepik.java187.module_2.step_2_1_6.BooleanExpression.booleanExpression;

class BooleanExpressionTest {

    @Test
    void sampleInput1() {
        assertFalse(booleanExpression(false, false, false, false));
    }

    @Test
    void sampleInput2() {
        assertFalse(booleanExpression(true, true, true, true));
    }

    @Test
    void sampleInput3() {
        assertTrue(booleanExpression(false, false, true, true));
    }
}
