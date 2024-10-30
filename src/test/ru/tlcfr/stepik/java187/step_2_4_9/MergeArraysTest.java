package ru.tlcfr.stepik.java187.step_2_4_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static ru.tlcfr.stepik.java187.step_2_4_9.MergeArrays.mergeArrays;

class MergeArraysTest {

    @Test
    void sampleInput1() {
        assertArrayEquals(new int[]{0, 1, 2, 2, 3}, mergeArrays(new int[]{0, 2, 2}, new int[]{1, 3}));
    }
}
