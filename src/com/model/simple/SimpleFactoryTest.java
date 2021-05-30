package com.model.simple;

import com.model.resource.Phone;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory simpleFactory=new SimpleFactory();
        Phone phone=simpleFactory.create("oppo");
        System.out.println(phone.getName());
        phone=simpleFactory.create("vivo");
        System.out.println(phone.getName());
    }
}
