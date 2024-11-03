package ru.tlcfr.stepik.java187.module_6.step_6_2_15;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> nums = new LinkedList<>();

        int index = 0;
        while (sc.hasNext()) {
            int num = sc.nextInt();
            if (index++ % 2 != 0) {
                nums.addFirst(num);
            }
        }

        for (Integer n : nums) {
            System.out.print(n + " ");
        }
    }
}
