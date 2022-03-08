package javademo;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

public class SplitTest {
    @Test
    public void split() {
        String url = "https://aaaa/emby-videos/1/292860/Zero%20Hour%20(2013)%20S01E01%20%5BWEBDL-1080p%5D%5B8bit%5D%5Bh264%5D%5BAC3%205.1%5D-NTb.mkvroot@bing:/opt/media/%E6%AC%A7%E7%BE%8E%E5%89%A7/Zero";
        int i = url.indexOf("emby-videos");
        int i1 = url.indexOf("/", i);
        int i2 = url.indexOf("/", i1+1);
        int i3 = url.indexOf("/", i2+1);
        String substring = url.substring(i1+1,i2);
        String itemId = url.substring(i2+1,i3);
        System.out.println(substring);
        System.out.println(itemId);
    }
}
