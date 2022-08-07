package com.github.viqbgrg.javademo.string;

import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class URLEncodeTest {

    @Test
    void test1() throws UnsupportedEncodingException {
        String url = "aaa";
        String decode = URLEncoder.encode(url, StandardCharsets.UTF_8.toString());
        System.out.println(decode);

    }
}
