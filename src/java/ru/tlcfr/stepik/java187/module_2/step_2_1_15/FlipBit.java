package ru.tlcfr.stepik.java187.module_2.step_2_1_15;

public class FlipBit {

    private FlipBit() {
    }

    /**
     * Flips one bit of the given <code>value</code>.
     *
     * @param value     any number
     * @param bitIndex  index of the bit to flip, 1 <= bitIndex <= 32
     * @return new value with one bit flipped
     */
    public static int flipBit(int value, int bitIndex) {
        return value ^ (1 << bitIndex - 1);
    }
}
