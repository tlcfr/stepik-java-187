package ru.tlcfr.stepik.java187.module_5.step_5_2_8;

import java.io.IOException;
import java.io.InputStream;

public class CheckSumOfStream {

    private CheckSumOfStream() {
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int b;
        int checkSum = 0;

        while ((b = inputStream.read()) != -1) {
            checkSum = Integer.rotateLeft(checkSum, 1) ^ b;
        }

        return checkSum;
    }
}
