package javademo;

import org.junit.jupiter.api.Test;

/**
 * @author viqbg
 */
public class EnumTest {
    @Test
    void test() {
        Sex sex = Sex.valueOf("MAN");
        System.out.println(sex.name());
        System.out.println(sex);
        Sex[] enumConstants = Sex.class.getEnumConstants();
        Sex enumConstant = enumConstants[1];
        System.out.println(enumConstant);
    }
}

enum Sex {
    MAN(1, "男"),
    WOMAN(2, "女");
    private int code;
    private String sexType;
    Sex(int code, String sexType) {
        this.code = code;
        this.sexType = sexType;
    }
    Sex(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return sexType;
    }

    public String getSexType() {
        return sexType;
    }
}
