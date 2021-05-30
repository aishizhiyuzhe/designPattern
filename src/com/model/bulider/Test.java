package com.model.bulider;

/**
 * 建造者模式：用于需要很多配置的，而这些配置是必须要有的，但有些是可以设置为了默认值的。
 * 使用静态内部类的方式添加属性有以下几个特性。
 *      一、能在原有的方法直接点出方法，无需使用对象点方法。
 *      二、创建了则无法进行修改。
 */
public class Test {
    public static void main(String[] args) {
        Phone phone=new Phone.Bulid("oppo").builder();
        show(phone);
        phone=new Phone.Bulid("oppo").size(11).builder();
        show(phone);
    }

    public static void show(Phone phone){
        System.out.println("你所选择的手机牌子为"+phone.getType()+",内存为"+phone.getInternal()+",尺寸为"+phone.getSize()+",颜色为"+phone.getColor());
    }
}
