package com.github.viqbgrg.onjava8.interfaces;

interface Person {
    String word = "Hello World";
    void learn();
    default void say(){
        System.out.println(word);
    }
}
