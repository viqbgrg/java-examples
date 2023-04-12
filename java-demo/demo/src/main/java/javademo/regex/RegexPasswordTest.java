package javademo.regex;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author viqbg
 * 验证密码
 * (?!.*\d).*  不能含有数字
 */
public class RegexPasswordTest {
    /**
     * 密码长度
     */
    @Test
    void test() {
        // 要包含数字和字母
        Assertions.assertThat(Pattern.matches("^.{6,8}", "123dfad")).isTrue();
        Assertions.assertThat(Pattern.matches("(?=^.{6,16}$)", "123dfad")).isTrue();
        Assertions.assertThat(Pattern.matches("^.{6,8}", "1")).isFalse();
        Assertions.assertThat(Pattern.matches("^.{6,8}", "123dfad123dfad")).isFalse();
    }

    /**
     * 至少包含一个数字
     */
    @Test
    void numRegexTest() {
        String regex = "(?=(?:.*?\\d){1})";
        Assertions.assertThat(Pattern.matches(regex, "aaaa2")).isTrue();
        Assertions.assertThat(Pattern.matches(regex, "aaaa")).isFalse();
    }

    @Test
    void test1() {

        String body = "{\n" +
                "    \"newPassword\": \"121212\",\n" +
                "    \"oldPassword\": \"232323232\"\n" +
                "}";
        String regex = "(?<=\"(newPassword|oldPassword)\":\\s{0,120}\")[^\"\n]*";
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(body);
        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }
}
