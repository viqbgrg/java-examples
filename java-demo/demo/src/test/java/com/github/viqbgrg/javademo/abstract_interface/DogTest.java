package com.github.viqbgrg.javademo.abstract_interface;

import org.junit.jupiter.api.Test;

class DogTest {
    @Test
    void eat() {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}