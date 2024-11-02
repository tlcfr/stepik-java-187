package ru.tlcfr.stepik.java187.module_5.step_5_3_13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double sum = 0.0d;
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            try {
                sum += Double.parseDouble(sc.next());
            } catch (NumberFormatException ignored) {
            }
        }

        System.out.printf("%.6f", sum);
        System.out.flush();
    }
}
