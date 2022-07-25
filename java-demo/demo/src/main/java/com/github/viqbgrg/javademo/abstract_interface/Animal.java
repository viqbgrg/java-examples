package com.github.viqbgrg.javademo.abstract_interface;

public abstract class Animal {
    private int age;

    public abstract void eat();

    public void sleep() {
        System.out.println("sleep");
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
