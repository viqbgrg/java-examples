package com.github.viqbgrg.onjava8.functional;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

/**
 * @author bing
 */
class Y {
    int show(){
        System.out.println("方法执行");
        return 1;
    }
}

class YY {

    int a;

    public YY(int a) {
        this.a = a;
    }

    int show(YY yy){
        System.out.printf("this = ", this.a);
        System.out.println("yy.a = " + yy.a);
        return this.a + yy.a;
    }
}
@FunctionalInterface
interface Test1 {
    int execute(Y y);
}
@FunctionalInterface
interface Test2 {
    int execute(YY y, YY y1);
}
public class UnboundMethodReference1 {
    @Test
    void test() {
        Test1 t = Y::show;
        Y y = new Y();
        int execute = t.execute(y);
        System.out.println(execute);
    }

    @Test
    void test1() {
        Test2 test2 = YY::show;
        YY yy = new YY(1);
        YY yy1 = new YY(2);
        int execute = test2.execute(yy, yy1);
        System.out.println(execute);

    }
}
