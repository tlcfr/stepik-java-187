package ru.tlcfr.stepik.java187.module_6.step_6_4_11;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static ru.tlcfr.stepik.java187.module_6.step_6_4_11.PseudoRandomStream.pseudoRandomStream;

class PseudoRandomStreamTest {

    @Test
    void sampleInput1() {
        List<Integer> actual = pseudoRandomStream(13)
                .limit(9)
                .boxed()
                .toList();
        List<Integer> expected = List.of(13, 16, 25, 62, 384, 745, 502, 200, 0);

        assertIterableEquals(expected, actual);
    }
}