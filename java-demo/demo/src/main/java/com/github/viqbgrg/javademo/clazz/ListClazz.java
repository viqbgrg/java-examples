package com.github.viqbgrg.javademo.clazz;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
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
        Class<? extends List> aClass = stringList.getClass();
        String s = aClass.toString();
        ParameterizedType genericSuperclass = (ParameterizedType) aClass.getGenericSuperclass();
        Type[] actualTypeArguments = genericSuperclass.getActualTypeArguments();
        log.info(actualTypeArguments[0].getTypeName());
    }
}
