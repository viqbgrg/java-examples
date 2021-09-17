package com.github.viqbgrg.onjava8.stream;

import java.util.stream.Stream;

/**
 * 按照自己的规则去创建流
 * @author hhj
 */
public class Streambuilder {
    private Stream.Builder<Integer> builder = Stream.builder();

    public Streambuilder() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("i = " + i);
            builder.add(i);
        }
    }

    Stream<Integer> stream() {
        return builder.build();
    }

    public static void main(String[] args) {
        new Streambuilder().stream().limit(7).map(w -> w + " ").forEach(System.out::print);
    }
}
