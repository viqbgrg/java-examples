package com.github.viqbgrg.javademo.list;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class ListTest {
    @Test
    void addTest() {
        List<Integer> integers = new ArrayList<>(10);
        log.info(integers.toString());
    }

}
