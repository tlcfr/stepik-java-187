package ru.tlcfr.stepik.java187.module_6.step_6_4_11;

import java.util.stream.IntStream;

public class PseudoRandomStream {

    private PseudoRandomStream() {
    }

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, x -> x * x / 10 % 1000);
    }
}
