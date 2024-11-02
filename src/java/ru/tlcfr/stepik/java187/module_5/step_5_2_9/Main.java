package ru.tlcfr.stepik.java187.module_5.step_5_2_9;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int prev = System.in.read();
        int next;

        if (prev != -1) {
            while ((next = System.in.read()) != -1) {
                if (prev != '\r' || next != '\n') {
                    System.out.write(prev);
                }
                prev = next;
            }
            System.out.write(prev);
            System.out.flush();
        }
    }
}
