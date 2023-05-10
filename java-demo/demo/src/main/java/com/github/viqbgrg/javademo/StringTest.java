package com.github.viqbgrg.javademo;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringTest {
    void replaceTest() {
        String a = "ABCD";
        String b = a.toLowerCase();
        b.replace("a", "d");
        b.replace("d", "c");
        System.out.println(b);
    }

    @Test
    void splitTest() {
        String a = "a";
        String b = "a, b";
        String[] split = a.split(",");
        String[] split1 = b.split(",");
        List<String> collect = Arrays.asList(split).stream().map(String::trim).collect(Collectors.toList());
        List<String> collect1 = Arrays.asList(split1).stream().map(String::trim).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect1);
    }

    @Test
    void splitTest1() {
        String a = "jdaslfjkl_mpCount";
        int count = a.indexOf("_mpCount");
        System.out.println(count);
        String substring = a.substring(0, count);
        System.out.println(substring);
    }

    @Test
    void stringLength() {
        String a = "[CXRAW][ウルトラギャラクシーファイト ニュージェネレーションヒーローズ][ウルトラギャラクシーファイト ニュージェネレーションヒーローズ-YouTube配信版本編][BDrip][1080p][HEVC Ma10p FLAC MKV]";
        System.out.println(a.getBytes().length);
    }

    private static int hex2dec(char c) {
        if ('0' <= c && c <= '9') {
            return c - '0';
        } else if ('a' <= c && c <= 'f') {
            return c - 'a' + 10;
        } else if ('A' <= c && c <= 'F') {
            return c - 'A' + 10;
        } else {
            return 0;
        }
    }

    public static byte[] base16Decode(String input) {
        int inputLength = input.length();
        int halfInputLength = inputLength / 2;
        byte[] output = new byte[halfInputLength];
        for (int i = 0; i < halfInputLength; i++) {
            //16进制数字转换为10进制数字的过程
            output[i] = (byte) (hex2dec(input.charAt(2 * i)) * 16 + hex2dec(input.charAt(2 * i + 1)));
        }
        return output;
    }

    @Test
    void baseString() {
        byte[] bytes = base16Decode("31363535303531323833323339");
        String s = new String(bytes);
        System.out.println(s);
    }
}
