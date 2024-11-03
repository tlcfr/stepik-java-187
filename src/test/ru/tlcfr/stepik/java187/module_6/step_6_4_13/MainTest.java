package ru.tlcfr.stepik.java187.module_6.step_6_4_13;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static ru.tlcfr.stepik.java187.module_6.step_6_4_13.Main.main;

class MainTest {

    static Stream<Arguments> sampleInputData() {
        return Stream.of(
                Arguments.of(
                        "Мама мыла-мыла-мыла раму!",
                        List.of("мыла", "мама", "раму")
                ),
                Arguments.of(
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                                "Sed sodales consectetur purus at faucibus. " +
                                "Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. " +
                                "Morbi lacinia velit blandit tincidunt efficitur. " +
                                "Vestibulum eget metus imperdiet sapien laoreet faucibus. " +
                                "Nunc eget vehicula mauris, ac auctor lorem. " +
                                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                                "Integer vel odio nec mi tempor dignissim.",
                        List.of("consectetur", "faucibus", "ipsum", "lorem", "adipiscing", "amet", "dolor", "eget", "elit", "mi")
                )
        );
    }

    @ParameterizedTest
    @MethodSource("sampleInputData")
    void sampleInput1(String strIn, List<String> expected) {
        InputStream in = new ByteArrayInputStream(strIn.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        main(new String[]{});

        List<String> actual = Arrays.stream(out.toString().split("\n")).toList();
        assertIterableEquals(expected, actual);
    }
}
