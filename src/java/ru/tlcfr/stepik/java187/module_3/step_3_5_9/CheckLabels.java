package ru.tlcfr.stepik.java187.module_3.step_3_5_9;

public class CheckLabels {

    private CheckLabels() {
    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer : analyzers) {
            Label label = analyzer.processText(text);
            if (label != Label.OK) {
                return label;
            }
        }
        return Label.OK;
    }
}
