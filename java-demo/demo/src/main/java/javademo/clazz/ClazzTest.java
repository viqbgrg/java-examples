package javademo.clazz;

import lombok.Data;
import org.junit.jupiter.api.Test;

import java.lang.annotation.*;
import java.lang.reflect.Field;

/**
 * @author hhj
 */
public class ClazzTest {

    @Test
    void classNameTest() {
        Class<UserType> userClass = UserType.class;
        String simpleName = userClass.getSimpleName();
        System.out.println(simpleName);
        final Field[] method = userClass.getDeclaredFields();
        for (Field me : method) {
            if (me.isAnnotationPresent(Key.class)) {
                Key key = me.getAnnotation(Key.class);
                String value = key.value();
                System.out.println(value);
            }
        }
    }

    @Target(ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    public @interface Key {
        String value() default "";
    }

    @Data
    private class UserType {
        @Key("test")
        private String username;
        private String password;
    }
}


