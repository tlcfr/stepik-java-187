package ru.tlcfr.stepik.java187.module_2.step_2_3_10;

public class IsPalindrome {

    private IsPalindrome() {
    }

    /**
     * Checks if given <code>text</code> is a palindrome.
     *
     * @param text any string
     * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
     */
    public static boolean isPalindrome(String text) {
        String rawText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return new StringBuilder(rawText).reverse().toString().equals(rawText);
    }
}
