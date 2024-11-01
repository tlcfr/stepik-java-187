package ru.tlcfr.stepik.java187.module_3.step_3_5_9;

class TooLongTextAnalyzer implements TextAnalyzer {

    private final int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        if (text.length() > maxLength) {
            return Label.TOO_LONG;
        }
        return Label.OK;
    }
}
