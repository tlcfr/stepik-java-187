package ru.tlcfr.stepik.java187.module_5.step_5_3_12;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

public class ReadAsString {

    private ReadAsString() {
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        int b;
        Reader reader = new InputStreamReader(inputStream, charset);
        StringBuilder sb = new StringBuilder();

        while ((b = reader.read()) != -1) {
            sb.append((char) b);
        }

        return sb.toString();
    }
}
