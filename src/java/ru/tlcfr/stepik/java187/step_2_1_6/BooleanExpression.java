package ru.tlcfr.stepik.java187.step_2_1_6;

public class BooleanExpression {

    private BooleanExpression() {
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return (a && b && !c && !d) || (a && !b && c && !d) || (a && !b && !c && d)
                || (!a && b && c && !d) || (!a && b && !c && d)
                || (!a && !b && c && d);
    }
}
