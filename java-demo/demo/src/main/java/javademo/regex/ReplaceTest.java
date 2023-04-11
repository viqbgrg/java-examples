package javademo.regex;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceTest {


    @Test
    public void replace() {
        Pattern pattern = Pattern.compile("\"loginPwd\":\"(.*)\""); //去掉空格符合换行符
        Matcher matcher = pattern.matcher("aaaaaaaaaa,\"loginPwd\":\"123456\",\"bbbb}");
        String result = matcher.replaceFirst("*");
        System.out.println(result);
    }

    @Test
    public void replaceString() {
        String a = "aaaaaaaaaa,\"loginPwd\":\"123456\",\"bbbb}";
        String s = a.replaceAll("\\s\"loginPwd\":\"([^\"\n]*)\"\\s", "******");
        System.out.println(s);
    }

    @Test
    public void replaceString1() {
        String s = "the quick brown fox jumps over the lazy dog.";
        String r = s.replaceAll("\\s([a-z]{4})\\s", " <b>$1</b> ");
        System.out.println(r);
    }
}
