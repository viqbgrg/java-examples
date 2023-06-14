package concurrent;

import java.util.concurrent.*;

/**
 * 任务队列阻塞
 * 异常处理
 */
public class ThreadPoolExecutorTask {

    private static final ArrayBlockingQueue<Runnable> QUEUE = new ArrayBlockingQueue<>(7);

    private static final ThreadPoolExecutor EXECUTOR_SERVICE = new ThreadPoolExecutor(5, 1000, 0L, TimeUnit.MILLISECONDS, QUEUE);

    public static void main(String[] args) throws InterruptedException {
        EXECUTOR_SERVICE.prestartAllCoreThreads();
        for (int i = 0; i < 10; i++) {
            int index = ThreadLocalRandom.current().nextInt(100);
            QUEUE.put(() -> {
                if (index == 10 || index == 50) {
                    System.out.println("模拟异常:" + index);
                    throw new RuntimeException();
                }
                try {
                    TimeUnit.MILLISECONDS.sleep(index*100);
                    System.out.println("模拟异步:" + index);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            System.out.println("添加任务:" + index);
            System.out.println("QUEUE:" + QUEUE.size());
        }
        EXECUTOR_SERVICE.shutdown();
    }

}
