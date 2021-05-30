package com.model.abstract1;

import com.model.resource.Phone;

/**
 * 抽象工厂的本质就是在抽象了种类的基础上抽象了工厂
 */
public class FactoryTest {
    public static void main(String[] args) {
        AbstractFactory abstractFactory=new OppoFactory();
        Phone phone=abstractFactory.create();
        System.out.println(phone.getName());
        abstractFactory=new VivoFactory();
        phone=abstractFactory.create();
        System.out.println(phone.getName());
    }
}
