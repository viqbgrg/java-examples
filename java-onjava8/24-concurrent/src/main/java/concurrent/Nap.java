package concurrent;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Nap {
    public Nap() {
        int t = ThreadLocalRandom.current().nextInt(5);
        try {
            TimeUnit.MILLISECONDS.sleep(1000 * t);
            System.out.println(
                    Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
