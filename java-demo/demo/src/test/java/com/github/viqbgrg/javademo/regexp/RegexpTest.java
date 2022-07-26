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
}
