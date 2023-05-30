package concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import static java.util.stream.LongStream.rangeClosed;

public class PrimeTask implements  Runnable {

    private final AtomicBoolean running;

    public PrimeTask(AtomicBoolean running) {
        this.running = running;
    }

    private boolean isPrime(long n) {
        return rangeClosed(2, (long)Math.sqrt(n))
                .noneMatch(i -> n % i == 0);
    }

    @Override
    public void run() {
        Integer result = null;
        while (this.running.get()) {
            int i1 = ThreadLocalRandom.current().nextInt(0, 5000);
            try {
                TimeUnit.MILLISECONDS.sleep(i1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            result = ThreadLocalRandom.current().nextInt();
            if (isPrime(result)) {
                System.out.println("result: " + result);
                this.running.set(false);
            }
            System.out.println(Thread.currentThread().getName() + ", 结果: " + result + ", 睡眠: " + i1);
        }
    }
}
