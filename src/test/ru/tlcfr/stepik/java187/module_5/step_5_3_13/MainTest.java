package ru.tlcfr.stepik.java187.module_5.step_5_3_13;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.*;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.tlcfr.stepik.java187.module_5.step_5_3_13.Main.main;

class MainTest {

    static Stream<Arguments> sampleInputData() {
        return Stream.of(
                Arguments.of("1 2 3", 6.000000d),
                Arguments.of("a1 b2 c3", 0.000000d),
                Arguments.of(
                        """
                                -1e3
                                18 .111 11bbb""",
                        -981.889000
                )
        );
    }

    @ParameterizedTest
    @MethodSource("sampleInputData")
    void sampleInput(String strIn, double expected) throws Exception {
        InputStream in = new ByteArrayInputStream(strIn.getBytes());
        System.setIn(in);

        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        main(new String[]{});

        NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
        assertEquals(expected, format.parse(out.toString()).doubleValue());
    }
}
