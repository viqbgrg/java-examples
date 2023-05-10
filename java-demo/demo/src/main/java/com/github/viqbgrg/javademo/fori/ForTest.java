package com.github.viqbgrg.javademo.fori;

import org.junit.jupiter.api.Test;

public class ForTest {


    @Test
    void test1() {
        int a = 100;
        for (int i = 0; i < a; i++) {
            System.out.println(i);
        }
    }

    @Test
    void test2() {
        int a = 100;
        for (int i = a; i > 0; i--) {
            System.out.println(i);
        }
    }
}
