package ru.tlcfr.stepik.java187.module_5.step_5_3_12;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.tlcfr.stepik.java187.module_5.step_5_3_12.ReadAsString.readAsString;

class ReadAsStringTest {

    @Test
    void sampleInput1() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[]{48, 49, 50, 51});
        System.setIn(in);

        assertEquals("0123", readAsString(in, StandardCharsets.US_ASCII));
    }
}
