package ru.tlcfr.stepik.java187.module_2.step_2_1_15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ru.tlcfr.stepik.java187.module_2.step_2_1_15.FlipBit.flipBit;

class FlipBitTest {

    @Test
    void sampleInput1() {
        assertEquals(1, flipBit(0, 1));
    }
}
