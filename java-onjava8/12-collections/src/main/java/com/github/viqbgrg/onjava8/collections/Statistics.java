package com.github.viqbgrg.onjava8.collections;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Random;

/**
 * 验证随机数生成的分布
 */
public class Statistics {
    @Test
    void test() {
        Random random = new Random(47);
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            int r = random.nextInt(20);
            Integer integer = m.get(r);
            m.put(r, integer == null ? 1 : integer + 1);
        }
        System.out.println(m);
    }
}
