package ru.tlcfr.stepik.java187.module_3.step_3_5_9;

class SpamAnalyzer extends KeywordAnalyzer {

    private final String[] keywords;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }
}
