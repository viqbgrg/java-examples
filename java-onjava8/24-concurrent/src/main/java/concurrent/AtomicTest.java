package concurrent;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicTest {
    @Test
    void test() {
        ExecutorService exec = Executors.newCachedThreadPool();
        AtomicBoolean running = new AtomicBoolean(true);
        for (int i = 0; i < 100; i++) {
            PrimeTask primeTask = new PrimeTask(running);
            exec.execute(primeTask);
        }
        exec.shutdown();
    }
}
