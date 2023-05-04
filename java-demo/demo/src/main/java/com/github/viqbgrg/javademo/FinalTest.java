package com.github.viqbgrg.javademo;

public class FinalTest {
    int addOne(final int x) {
        // 不能 return ++x
        return x;
    }
}
