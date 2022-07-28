package com.github.viqbgrg.javademo.date;

import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateFormatTest {

    @Test
    void parseTime() {
        Date date = new Date();
        String strDateFormat = "yyyy-MM-dd HH:mm:ss";
        DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
        //dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        dateFormat.setTimeZone(TimeZone.getTimeZone("Etc/GMT+8"));
        //dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        System.out.println(date);
        System.out.println(dateFormat.format(date));
    }
}
