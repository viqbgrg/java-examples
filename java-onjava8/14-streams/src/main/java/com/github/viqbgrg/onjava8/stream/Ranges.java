package com.github.viqbgrg.onjava8.stream;

import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.stream.IntStream;

public class Ranges {

    @Test
    void intStream() {
        IntStream.range(0,10).forEach(System.out::println);
    }
}
