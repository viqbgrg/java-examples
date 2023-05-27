package concurrent;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolTest {

    @Test
    void test() {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            exec.execute(new RunnableTest());
        }
        exec.shutdown();
        // 如果不执行此操作, main进程结束,多线程也结束了
        while(!exec.isTerminated()) {
            System.out.println(
                    Thread.currentThread().getName() +
                            " awaiting termination");
            new Nap();
        }
    }
}
