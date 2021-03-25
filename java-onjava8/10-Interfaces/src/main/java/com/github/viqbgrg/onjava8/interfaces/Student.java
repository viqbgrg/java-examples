package com.github.viqbgrg.onjava8.interfaces;

import org.junit.jupiter.api.Test;

public class Student implements Person{
    @Override
    public void learn() {
        System.out.println("好好学习, 天天向上");
    }

    @Test
    public void test() {
        System.out.println(Student.word);
        learn();
    }
}
