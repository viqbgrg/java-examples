package com.github.viqbgrg.javademo.clazz;

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
        final Field[] fields = userClass.getDeclaredFields();
        for (Field me : fields) {
            if (me.getAnnotationsByType(Key.class).length != 0) {
                Key[] key = me.getAnnotationsByType(Key.class);
                for (int i = 0; i < key.length; i++) {
                    Key key1 = key[i];
                    String value = key1.value();
                    System.out.println(value);
                }
            }
        }
    }

    @Target(ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @Repeatable(Keys.class)
    public @interface Key {
        String value() default "";
    }

    @Target(ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    public @interface Keys {
        Key[] value();
    }

    @Data
    private class UserType {
        @Key("test")
        @Key("test1")
        private String username;
        private String password;
    }
}


