package com.github.viqbgrg.javademo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author hhj
 */
@Slf4j
public class ClazzNameTest {
    private static final Pattern TO_LINE_PATTERN = Pattern.compile("[A-Z]+");

    @Test
    void clazzNameTest() {
        log.info(this.getClass().getSimpleName());
        log.info(this.getClass().getCanonicalName());
    }

    @Test
    void uncapitalizeTest() {
        Matcher matcher = TO_LINE_PATTERN.matcher("ClazzNameTest");
        StringBuffer buffer = new StringBuffer();
        while (matcher.find()) {
            if (matcher.start() > 0) {
                matcher.appendReplacement(buffer, "_" + matcher.group(0).toLowerCase());
            } else {
                matcher.appendReplacement(buffer, matcher.group(0).toLowerCase());
            }
        }
        matcher.appendTail(buffer);
        String s = buffer.toString();
        log.info(s);
    }

    @Test
    void stringInt() {
        String a = "aaaa";
        String b = new String("aaaa");
        Integer c = 100;
        Integer d = 300;
        Integer e = 100;
        Integer f = 300;
        System.out.println(d == f);
        System.out.println(a == "aaaa");
        System.out.println(c == e);
        System.out.println(b == "aaaa");
    }
}
