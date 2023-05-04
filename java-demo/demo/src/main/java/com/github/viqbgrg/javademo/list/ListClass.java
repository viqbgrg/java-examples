package com.github.viqbgrg.javademo.list;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListClass {

    /**
     * list范围的class
     */
    @Test
    void listClassName() {
        List<Integer> list = new ArrayList<>();
        System.out.println(list.getClass().getName());
    }
}
