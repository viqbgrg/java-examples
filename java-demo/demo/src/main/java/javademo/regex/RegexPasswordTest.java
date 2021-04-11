package javademo.regex;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

/**
 * @author viqbg
 * 验证密码
 */
public class RegexPasswordTest {
    @Test
    void test() {
        // 要包含数字和字母
        Assertions.assertThat(Pattern.matches(".*runoob.*", "123dfad")).isTrue();
    }
}
