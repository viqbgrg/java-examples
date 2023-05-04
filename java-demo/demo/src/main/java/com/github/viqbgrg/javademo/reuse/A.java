package com.github.viqbgrg.javademo.reuse;

public class A {

    static {
        System.out.println("父类静态代码块");
    }

    public A() {
        System.out.println("父类初始化");
    }

    public A(Integer a) {
        System.out.println("父类有参构造器初始化");
    }
}
