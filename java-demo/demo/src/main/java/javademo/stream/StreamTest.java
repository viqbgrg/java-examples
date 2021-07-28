package javademo.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author hhj
 */
public class StreamTest {

    List<String> strings = Arrays.asList("1", "2");
    @Test
    void streamTest() {
        String collect = strings.stream().map(item -> "").filter(item -> !item.equals("")).collect(Collectors.joining(","));
        collect = Optional.of(collect).orElse("123333");
        System.out.println(collect);
    }

    @Test
    void iteratorTest() {
        Iterator<String> iterator = strings.stream().map(item -> {
            System.out.println(item);
            return item + "a";
        }).iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
            break;
        }
    }
}
