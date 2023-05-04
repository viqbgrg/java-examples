package com.github.viqbgrg.javademo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

enum Order {
    ONE, TWO, THREE;
}

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

    @Test
    void getEnumString() {
        String name = Sex.MAN.name();
        System.out.println(name);
    }

    @Test
    void sort() {
        List<OrderClazz> orders = new ArrayList<>();
        orders.add(new OrderClazz(Order.THREE));
        orders.add(new OrderClazz(Order.TWO));
        orders.add(new OrderClazz(Order.ONE));
        orders.stream().sorted(Comparator.comparing(OrderClazz::getOrder)).forEach(item -> System.out.println(item));
    }
}

@Data
@AllArgsConstructor
class OrderClazz {
    private Order order;
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
