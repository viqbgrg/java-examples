package concurrent;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {

    @Test
    void test1() {
        BlockingQueue<Integer> data = new ArrayBlockingQueue<>(5);
        for (int i = 0; i < 100; i++) {
            try {
                data.put(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
