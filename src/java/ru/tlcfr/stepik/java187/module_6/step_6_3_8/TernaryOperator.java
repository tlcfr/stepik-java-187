package ru.tlcfr.stepik.java187.module_6.step_6_3_8;

import java.util.function.Function;
import java.util.function.Predicate;

public class TernaryOperator {

    private TernaryOperator() {
    }

    public static <T, U> Function<T, U> ternaryOperator(Predicate<? super T> condition,
                                                        Function<? super T, ? extends U> ifTrue,
                                                        Function<? super T, ? extends U> ifFalse) {
        return t -> condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);
    }
}
