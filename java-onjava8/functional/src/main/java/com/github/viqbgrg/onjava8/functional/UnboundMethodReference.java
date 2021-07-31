package com.github.viqbgrg.onjava8.functional;

import java.util.function.BiPredicate;
import java.util.function.Function;

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
}
