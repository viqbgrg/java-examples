package concurrent;

import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class RunnableTest implements Runnable {

    @Override
    public void run() {
        new Nap();
    }


    @Test
    void first() {
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(new RunnableTest());
            thread.start();
        }
    }
}
