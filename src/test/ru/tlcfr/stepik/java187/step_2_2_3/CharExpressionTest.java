package ru.tlcfr.stepik.java187.step_2_2_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.tlcfr.stepik.java187.step_2_2_3.CharExpression.charExpression;

class CharExpressionTest {

    @Test
    void sampleInput1() {
        assertEquals('|', charExpression(32));
    }

    @Test
    void sampleInput2() {
        assertEquals('y', charExpression(29));
    }
}
