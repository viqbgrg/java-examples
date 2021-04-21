package javademo.time;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Date;

public class TimeToString {

    @Test
    void toStringTest() {
        Date data = new Date();
        System.out.println(data);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
    }
}
