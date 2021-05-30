package com.model.pattern;

import com.model.resource.Phone;

/**
 * 工厂方法：每一个种类对应一个生产类，创建方法名一致。
 * 优点：有新增的产品时，无需对其原有的代码进行修改
 * 缺点：要了解每一个产品对应的生产类
 */
public class FactoryTest {
    public static void main(String[] args) {
        OppoPatternFactory oppoPatternFactory=new OppoPatternFactory();
        Phone phone=oppoPatternFactory.create();
        System.out.println(phone.getName());
        VivoPatternFactory vivoPatternFactory=new VivoPatternFactory();
        phone=vivoPatternFactory.create();
        System.out.println(phone.getName());
    }
}
