package com.github.viqbgrg.onjava8.functional;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

/**
 * 使用函数式编程
 */
public class Functions {

    @Test
    void testFunction() {
        Function<Integer,String> function = s -> String.valueOf(s);
        Function<String,String> a = s -> s + "a";
        Function<Integer, String> b = function.andThen(a);
        String apply = b.apply(1);
        assert apply.equals("1a");
    }
}
