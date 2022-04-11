package com.github.viqbgrg.onjava8.functional;

import org.junit.jupiter.api.Test;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author bing
 */
class X{
    String f() { return "X::f()"; }
}
interface MakeString {
    String make();
}
interface TransformX {
    String transform(X x);
}
public class UnboundMethodReference {
    public static void main(String[] args) {
// MakeString ms = X::f; // [1]
        TransformX sp = X::f;
        X x = new X();
        System.out.println(sp.transform(x));
        System.out.println(x.f());
        BiPredicate<String, String> b = String::equals;
        b.test("abc", "abcd");
    }

    @Test
    void predicate() {
        Predicate<String> p = String::isEmpty;
        boolean test = p.test("");
        System.out.println(test);
    }
}
