package concurrent;

import org.junit.jupiter.api.Test;

import java.util.stream.LongStream;

public class ParallelPrime {
    @Test
    public void first() {
        LongStream.range(1, 2000).parallel().forEach(item-> {
            System.out.println(Thread.currentThread().getName() + ":" + item);
        });
    }
}
