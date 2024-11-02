package ru.tlcfr.stepik.java187.module_5.step_5_2_8;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.tlcfr.stepik.java187.module_5.step_5_2_8.CheckSumOfStream.checkSumOfStream;

class CheckSumOfStreamTest {

    @Test
    void sampleInput1() throws IOException {
        assertEquals(71, checkSumOfStream(new ByteArrayInputStream(new byte[]{0x33, 0x45, 0x01})));
    }
}
