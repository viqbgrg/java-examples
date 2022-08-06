package javademo;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 可变参数测试
 */
public class VarargsTest {
    @Test
    public void test() {
        // 不能为空
        test1(null);
    }

    private String test1(String... a) {
        return Stream.of(a).collect(Collectors.joining("/"));
    }
}
