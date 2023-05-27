package concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class RandomIntTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception{
        return ThreadLocalRandom.current().nextInt();
    }
}
