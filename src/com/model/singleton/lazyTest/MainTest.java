package com.model.singleton.lazyTest;

import com.model.singleton.Lazy;


public class MainTest {
    public static void main(String[] args) {
        Thread thread=new ThreadTest();
        thread.start();
        Lazy lazy=Lazy.getInstance();
        System.out.println(lazy);
    }
}
