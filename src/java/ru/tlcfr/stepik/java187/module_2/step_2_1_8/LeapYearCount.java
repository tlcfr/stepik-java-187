package ru.tlcfr.stepik.java187.module_2.step_2_1_8;

public class LeapYearCount {

    private LeapYearCount() {
    }

    public static int leapYearCount(int year) {
        return year / 4 - year / 100 + year / 400;
    }
}
