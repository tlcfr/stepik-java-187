package ru.tlcfr.stepik.java187.module_6.step_6_2_15;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static ru.tlcfr.stepik.java187.module_6.step_6_2_15.Main.main;

class MainTest {

    @Test
    void sampleInput1() {
        ByteArrayInputStream in = new ByteArrayInputStream("1 2 3 4 5 6 7".getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        main(new String[]{});

        List<Integer> actual = Arrays.stream(out.toString().split(" "))
                .map(Integer::parseInt)
                .toList();
        assertIterableEquals(List.of(6, 4, 2), actual);
    }
}
