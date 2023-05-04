package javademo;

import com.github.viqbgrg.javademo.StaticA;
import com.github.viqbgrg.javademo.StaticB;
import org.junit.jupiter.api.Test;

public class StaticTest {
    @Test
    void staticTest() {
        StaticA ab = new StaticB();
        ab = new StaticB();
    }

}

