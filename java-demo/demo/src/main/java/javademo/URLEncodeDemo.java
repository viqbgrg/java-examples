package javademo;

import org.junit.jupiter.api.Test;

import java.net.URLEncoder;
import java.nio.charset.Charset;

public class URLEncodeDemo {

    @Test
    public void test() {
        String url = "https://www.baidu.com/a b/a c";
        String encode = URLEncoder.encode(url, Charset.defaultCharset());
        encode = encode.replaceAll("%3A", ":").replaceAll("%2F", "/").replaceAll("\\+", "%20");
        System.out.println(encode);
    }
}
