package javademo;

public class StaticB extends StaticA {
    static {
        System.out.print("a");
    }

    public StaticB() {
        System.out.print("b");
    }
}
