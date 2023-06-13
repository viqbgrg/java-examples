package concurrent;

import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

/**
 * 任务队列阻塞
 * 异常处理
 */
public class RetryTask {

    private static final ArrayBlockingQueue<Runnable> QUEUE = new ArrayBlockingQueue<>(7);

    private static final ExecutorService EXECUTOR_SERVICE = new ThreadPoolExecutor(5, 1000,
            0L, TimeUnit.MILLISECONDS,
            QUEUE);

    @Test
    void test1() {
        ThreadLocalRandom.current().ints(1, 100).limit(100).boxed().forEach(index->{
            EXECUTOR_SERVICE.submit(()->{
                if (index == 10 || index == 50) {
                    System.out.println("模拟异常:" + index);
//                    throw new RuntimeException();
                }
                try {
                    TimeUnit.SECONDS.sleep(index);
                    System.out.println("模拟异步:" + index);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        });
        EXECUTOR_SERVICE.shutdown();
    }

}
