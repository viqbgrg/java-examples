package javademo;


public class StringTest {
    void replaceTest() {
        String a = "ABCD";
        String b = a.toLowerCase();
        b.replace("a", "d");
        b.replace("d", "c");
        System.out.println(b);
    }
}
