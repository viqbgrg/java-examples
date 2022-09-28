package com.github.viqbgrg.javademo.regexp;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexpTest {

    @Test
    void test() {
        String name = "3:10 to Yuma - Bluray.1080p.x264.(1-a56c39644b91f1427999b7f4c3d00064)-thumb.jpg";
        Pattern sourcePattern = Pattern.compile("\\(([0-9]{1,2})-(.*)\\)");
        Matcher sourceMatcher = sourcePattern.matcher(name);
        if (sourceMatcher.find()) {
            String group = sourceMatcher.group(1);
            Integer embyId = Integer.valueOf(group);
            String mediaSourceId = sourceMatcher.group(2);
            System.out.println(embyId);
            System.out.println(mediaSourceId);
        }
    }

    @Test
    void test1() {
        String resolution = "1920*1080";
        String resolution1 = "1920x1036";
        String resolution2 = "1920 x 1036";
        Pattern sourcePattern = Pattern.compile("([0-9]{4}[*,x, ]{1,3}[0-9]{3,4})");
        Matcher sourceMatcher = sourcePattern.matcher(resolution2);
        if (sourceMatcher.find()) {
            String group = sourceMatcher.group(1);
            System.out.println(group);
        }
    }

    @Test
    void test2() {
        Pattern movieNamePattern = Pattern.compile("^(.*)( \\(([0-9]{4})\\))\\s?(\\[((tmdbid=(.*))|(imdbid=(.*)))\\])?");
        String s = "暗夜博士：莫比亚斯 (2022)";
        String s1 = "暗夜博士：莫比亚斯 (2022) [tmdbid=111111]";
        String s2 = "暗夜博士：莫比亚斯 (2022) [imdbid=222222]";
        String s3 = "狙击手 (2022)";
        Matcher matcher = movieNamePattern.matcher(s3);
        if (matcher.find()) {
            String group1 = matcher.group(1);
            System.out.println(group1);
            String group2 = matcher.group(2);
            System.out.println(group2);
            String group3 = matcher.group(3);
            System.out.println(group3);
            String group4 = matcher.group(4);
            System.out.println(group4);
            String group5 = matcher.group(5);
            System.out.println(group5);
            String group6 = matcher.group(6);
            System.out.println(group6);
            String group7 = matcher.group(7);
            System.out.println(group7);
            String group9 = matcher.group(9);
            System.out.println(group9);
        }
    }

    @Test
    void test3() {
        String tmdb = "105248-cyberpunk-edgerunners";
        Integer tmdbId = null;
        try {
            tmdbId = tmdb != null ? Integer.valueOf(tmdb) : null;
        } catch (NumberFormatException e) {
            Pattern pattern = Pattern.compile("([0-9]+).*");
            Matcher isNum = pattern.matcher(tmdb);
            if (isNum.matches()) {
                tmdbId = Integer.valueOf(isNum.group(1));
            }
        }
        System.out.println(tmdbId);
    }
}
