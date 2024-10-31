package ru.tlcfr.stepik.java187.module_2.step_2_2_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ru.tlcfr.stepik.java187.module_2.step_2_2_9.IsPowerOfTwo.isPowerOfTwo;

class IsPowerOfTwoTest {

    @Test
    void sampleInput1() {
        assertFalse(isPowerOfTwo(0));
    }

    @Test
    void sampleInput2() {
        assertTrue(isPowerOfTwo(1));
    }

    @Test
    void sampleInput3() {
        assertTrue(isPowerOfTwo(-2));
    }
}
