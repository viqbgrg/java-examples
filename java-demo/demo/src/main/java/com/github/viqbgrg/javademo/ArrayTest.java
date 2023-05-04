package com.github.viqbgrg.javademo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@Slf4j
public class ArrayTest {
    @Test
    void appendTest() {
        int[] a = new int[10];
        log.info(Arrays.toString(a));
        Integer[] b = new Integer[24];
        log.info(Arrays.toString(b));
        System.out.println(a.getClass());
    }
}
