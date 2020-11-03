package javademo.reuse;

public class B extends A {

    static {
        String a = "!11";
        System.out.println("子类静态代码块");
    }

    public B() {
        super(1);
        System.out.println("子类初始化");
        System.out.println(super.toString());
    }

    public static void main(String[] args) {
        B b = new B();
    }
}
