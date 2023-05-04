package com.github.viqbgrg.javademo.concurrency;

public class SynchronizedCounter {
    private int c = 0;

    public static void main(String[] args) {
        SynchronizedCounter counter = new SynchronizedCounter();
        Runnable a = counter::decrement;
        Runnable b = counter::increment;
        for (int i = 0; i < 10; i++) {
            Thread aThread = new Thread(a);
            Thread bThread = new Thread(b);
            aThread.start();
            bThread.start();
        }
        int value = counter.value();
        System.out.println(value);
    }

    public synchronized void increment() {
        c++;
    }

    public synchronized void decrement() {
        c--;
    }

    public synchronized int value() {
        return c;
    }

}
