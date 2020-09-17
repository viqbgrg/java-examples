package javademo;

public class A {
    public static int num1 = 0;
    public static int num2;
    private static A obj = new A();

    private A() {
        num1++;
        num2++;
    }

    public static A getInstance() {
        return obj;
    }
}
