package javademo;

import javademo.exception.AException;
import javademo.exception.BException;
import org.junit.jupiter.api.Test;

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
}
