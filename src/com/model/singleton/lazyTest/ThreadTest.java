package com.model.singleton.lazyTest;

import com.model.singleton.Lazy;

public class ThreadTest extends Thread {
    @Override
    public void run() {
        Lazy lazy=Lazy.getInstance();
        System.out.println(lazy);
    }
}
