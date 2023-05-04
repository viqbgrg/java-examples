package com.github.viqbgrg.javademo.concurrency;

public class Counter {
    private int c = 0;

    public static void main(String[] args) {
        Counter counter = new Counter();
        Runnable a = () -> counter.decrement();
        Runnable b = () -> counter.increment();
        for (int i = 0; i < 1000; i++) {
            Thread aThread = new Thread(a);
            Thread bThread = new Thread(b);
            aThread.start();
            bThread.start();
        }
        int value = counter.value();
        System.out.println(value);
    }

    public void increment() {
        c++;
    }

    public void decrement() {
        c--;
    }

    public int value() {
        return c;
    }

}
