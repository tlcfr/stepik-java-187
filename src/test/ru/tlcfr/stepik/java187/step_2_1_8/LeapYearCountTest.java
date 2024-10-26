package ru.tlcfr.stepik.java187.step_2_1_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ru.tlcfr.stepik.java187.step_2_1_8.LeapYearCount.leapYearCount;

class LeapYearCountTest {

    @Test
    void sampleInput1() {
        assertEquals(0, leapYearCount(1));
    }

    @Test
    void sampleInput2() {
        assertEquals(1, leapYearCount(4));
    }

    @Test
    void sampleInput3() {
        assertEquals(24, leapYearCount(100));
    }
}
