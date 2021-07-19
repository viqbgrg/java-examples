package javademo.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author hhj
 */
public class StreamTest {
    @Test
    void streamTest() {
        List<String> strings = Arrays.asList("1", "2");
        String collect = strings.stream().map(item -> "").filter(item -> !item.equals("")).collect(Collectors.joining(","));
        collect = Optional.of(collect).orElse("123333");
        System.out.println(collect);
    }
}
