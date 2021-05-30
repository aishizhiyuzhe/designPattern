package com.model.singleton;

public class Test {
    public static void main(String[] args) {
        //懒汉式
        Hungry hungry=Hungry.getInstance();
        System.out.println(hungry);
        Hungry hungry2=Hungry.getInstance();
        System.out.println(hungry2);
    }
}
