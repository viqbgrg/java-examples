package javademo;

import java.io.ByteArrayOutputStream;

public class Rb {
    private static final String KEY = "tceQPo";
    private static final String hexString = "0123456789ABCDEF";

    public static String d(String str) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream(str.length() / 2);
        for (int i = 0; i < str.length(); i += 2) {
            baos.write((hexString.indexOf(str.charAt(i)) << 4) | hexString.indexOf(str.charAt(i + 1)));
        }
        byte[] b = baos.toByteArray();
        int len = b.length;
        int keyLen = KEY.length();
        for (int i2 = 0; i2 < len; i2++) {
            b[i2] = (byte) (b[i2] ^ KEY.charAt(i2 % keyLen));
        }
        return new String(b);
    }

    public static void main(String[] args) {
        System.out.println(d("011109"));
        System.out.println(d("281F"));
        System.out.println(d("0402172235"));
        System.out.println(d("040F0428051D18"));
        System.out.println(d("1C060435351D"));
        System.out.println(d("07160737"));
        System.out.println(d("5B1511257F1A00054869"));
        System.out.println(d("100C"));
        System.out.println(d("1007173A"));
        System.out.println(d("07160725"));
    }

}
