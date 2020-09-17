package javademo;

import org.junit.jupiter.api.Test;

public class StringTest {
    @Test
    void replaceTest() {
        String a = "ABCD";
        String b = a.toLowerCase();
        b.replace("a", "d");
        b.replace("d", "c");
        System.out.println(b);
    }
}
