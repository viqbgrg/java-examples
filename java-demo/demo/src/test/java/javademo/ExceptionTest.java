package javademo;

import javademo.exception.AException;
import javademo.exception.BException;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class ExceptionTest {
    @Test
    void tryCatch() {
        try {
            try {
                throw new BException();
            } catch (AException a) {
                System.out.println("Caught A");
                throw a;
            }
        } catch (BException bException) {
            System.out.println("Caught B");
            return;
        } finally {
            System.out.println("Hello World!");
        }
    }

    @Test
    void testDebug() {
        Random random = new Random(1);
        for (int i = 0; i < 100; i++) {
            int i1 = random.nextInt(2);
            int a = 2/i1;
        }
    }
}
