package javademo.clazz;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bing
 */
@Slf4j
public class ListClazz {
    @Test
    void clazzListClassTest() {
        List<String> stringList = new ArrayList<>();
        String s = stringList.getClass().toString();
        log.info(s);
    }
}
