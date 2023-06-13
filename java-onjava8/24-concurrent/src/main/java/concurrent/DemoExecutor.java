package concurrent;

import java.util.concurrent.*;

public class DemoExecutor {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Runnable> blockingQueue =
                new ArrayBlockingQueue<>(5);

        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(10, 20, 5, TimeUnit.SECONDS,
                        blockingQueue);

        // Let start all core threads initially
        executor.prestartAllCoreThreads();

        for (int i = 1; i <= 100; i++) {
            System.out.println("put 任务 " + i);
            blockingQueue.put(new DemoTask("Task " + i));
            System.out.println("put 结束 " + i);
        }

        executor.shutdown();
//        executor.awaitTermination(Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
    }
}