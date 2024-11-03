package ru.tlcfr.stepik.java187.module_6.step_6_3_8;

import org.junit.jupiter.api.Test;

import java.util.Objects;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.tlcfr.stepik.java187.module_6.step_6_3_8.TernaryOperator.ternaryOperator;

class TernaryOperatorTest {

    @Test
    void sampleInput1() {
        Function<String, Integer> safeStringLength = ternaryOperator(Objects::isNull, obj -> 0, CharSequence::length);

        assertEquals(0, safeStringLength.apply(null));
        assertEquals(3, safeStringLength.apply("123"));
    }
}
