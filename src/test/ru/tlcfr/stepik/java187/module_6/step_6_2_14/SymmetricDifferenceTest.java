package ru.tlcfr.stepik.java187.module_6.step_6_2_14;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.tlcfr.stepik.java187.module_6.step_6_2_14.SymmetricDifference.symmetricDifference;

class SymmetricDifferenceTest {

    @Test
    void sampleInput1() {
        assertEquals(Set.of(0, 3), symmetricDifference(Set.of(1, 2, 3), Set.of(0, 1, 2)));
    }
}
