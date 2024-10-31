package ru.tlcfr.stepik.java187.module_2.step_2_3_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static ru.tlcfr.stepik.java187.module_2.step_2_3_10.IsPalindrome.isPalindrome;

class IsPalindromeTest {

    @Test
    void sampleInput1() {
        assertTrue(isPalindrome("Madam, I'm Adam!"));
    }
}
