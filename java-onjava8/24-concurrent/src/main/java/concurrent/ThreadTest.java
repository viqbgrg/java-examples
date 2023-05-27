package concurrent;

import org.junit.jupiter.api.Test;

public class ThreadTest extends Thread{
    @Override
    public void run() {
        new Nap();
    }

    @Test
    void test() {
        for (int i = 0; i < 100; i++) {
            ThreadTest threadTest = new ThreadTest();
            threadTest.start();
        }
    }
}
