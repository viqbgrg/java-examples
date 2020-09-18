package javademo;

import org.junit.jupiter.api.Test;

public class StaticTest {
    @Test
    void staticTest() {
        StaticA ab = new StaticB();
        ab = new StaticB();
    }

}

