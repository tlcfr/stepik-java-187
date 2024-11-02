package ru.tlcfr.stepik.java187.module_6.step_6_1_12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PairTest {

    @Test
    void sampleInput1() {
        Pair<Integer, String> pair1 = Pair.of(1, "hello");
        Pair<Integer, String> pair2 = Pair.of(1, "hello");

        assertEquals(pair1, pair2);
        assertEquals(pair1.hashCode(), pair2.hashCode());
    }
}
