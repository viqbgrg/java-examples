package concurrent;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class SingleThreadExecutorTest {


    @Test
    void test() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 100; i++) {
            executorService.execute(new RunnableTest());
        }
        executorService.shutdown();
        // 如果不执行此操作, main进程结束,多线程也结束了
        while(!executorService.isTerminated()) {
            System.out.println(
                    Thread.currentThread().getName() +
                            " awaiting termination");
            new Nap();
        }
    }
}
