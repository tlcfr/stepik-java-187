package ru.tlcfr.stepik.java187.module_6.step_6_4_12;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindMinMax {

    private FindMinMax() {
    }

    public static <T> void findMinMax(Stream<? extends T> stream,
                                      Comparator<? super T> order,
                                      BiConsumer<? super T, ? super T> minMaxConsumer) {
        T min;
        T max;

        List<? extends T> list = stream.sorted(order).collect(Collectors.toList());
        if (list.isEmpty()) {
            min = null;
            max = null;
        } else {
            min = list.get(0);
            max = list.get(list.size() - 1);
        }

        minMaxConsumer.accept(min, max);
    }
}
