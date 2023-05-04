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
}
