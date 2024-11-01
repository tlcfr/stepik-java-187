package ru.tlcfr.stepik.java187.module_3.step_3_5_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.tlcfr.stepik.java187.module_3.step_3_5_7.Integrate.integrate;

class IntegrateTest {

    @Test
    void sampleInput1() {
        assertEquals(10, integrate(x -> 1, 0, 10));
    }
}
