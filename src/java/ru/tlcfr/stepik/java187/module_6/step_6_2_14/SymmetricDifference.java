package ru.tlcfr.stepik.java187.module_6.step_6_2_14;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {

    private SymmetricDifference() {
    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> set3 = new HashSet<>();

        set3.addAll(set1);
        set3.addAll(set2);
        set3.removeIf(el -> set1.contains(el) && set2.contains(el));

        return set3;
    }
}
