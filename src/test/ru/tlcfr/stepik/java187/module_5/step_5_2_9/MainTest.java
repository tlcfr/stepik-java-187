package ru.tlcfr.stepik.java187.module_5.step_5_2_9;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static ru.tlcfr.stepik.java187.module_5.step_5_2_9.Main.main;

class MainTest {

    @Test
    void sampleInput1() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[]{65, 13, 10, 10, 13});
        System.setIn(in);

        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        main(new String[]{});

        assertArrayEquals(new byte[]{65, 10, 10, 13}, out.toString().getBytes());
    }
}
