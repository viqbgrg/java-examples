package com.github.viqbgrg.javademo.time;


import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.TimeZone;

public class LocalTimeDataTest {
    @Test
    public void longToTime() {
//        2022年2月17日17:45:52
        long l = 1645091152576L;
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(l),
                TimeZone.getDefault().toZoneId());
        System.out.println(localDateTime);

    }
}
