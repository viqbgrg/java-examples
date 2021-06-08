package javademo;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author hhj
 */
public class SetTest {
    @Test
    void setToStringTest() {
        Set<String> set = new HashSet<>();
        set.add("1111");
        set.add("2222");
        System.out.println(set.toString());
    }
}
