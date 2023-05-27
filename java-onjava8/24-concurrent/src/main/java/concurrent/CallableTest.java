package concurrent;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CallableTest {

    @Test
    void test() throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();
        List<RandomIntTask> collect = IntStream.range(0, 10).boxed().map(item -> new RandomIntTask()).collect(Collectors.toList());
        List<Future<Integer>> futures = exec.invokeAll(collect);
        Integer reduce = futures.stream().map(item -> {
            try {
                return item.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }).reduce(0, Integer::sum);
        System.out.println(reduce);
    }
}
