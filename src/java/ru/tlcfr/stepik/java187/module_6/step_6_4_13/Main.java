package ru.tlcfr.stepik.java187.module_6.step_6_4_13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");
        String text = sc.nextLine();

        Comparator<Map.Entry<String, Long>> comparator = Map.Entry.<String, Long>comparingByValue()
                .reversed()
                .thenComparing(Map.Entry.comparingByKey());

        Arrays.stream(text.split("[\\p{Punct}\\s]+"))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted(comparator)
                .limit(10)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
