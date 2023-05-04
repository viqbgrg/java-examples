package javademo;

import com.github.viqbgrg.javademo.A;
import org.junit.jupiter.api.Test;

public class ATest {
    @Test
    void aTest() {
        A obj = A.getInstance();
        System.out.println("obj.num1 = " + obj.num1);
        System.out.println("obj.num2 = " + obj.num2);
    }
}
