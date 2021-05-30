package com.model.singleton;

public class Lazy {
//    private static Lazy lazy;
    private Lazy(){

    }
//    /**
//     * 使用了多线程，则不能保证单例
//     */
//    public static Lazy getInstance(){
//        if (lazy==null)
//            lazy=new Lazy();
//        return lazy;
//    }

//    /**
//     * 这样能保证单例，但对性能有很大的影响，如在获取时都要等锁，但如果有了的话，其实不需要在去等锁的
//     * @return
//     */
//    public static Lazy getInstance(){
//        synchronized (Lazy.class){
//            if (lazy==null)
//                lazy=new Lazy();
//        }
//        return lazy;
//    }
    private static class LazyHold{
        public static Lazy lazy=new Lazy();
    }

    /**
     * 采用静态类来创建单例
     * @return
     */
    public static Lazy getInstance(){
        return LazyHold.lazy;
    }

}
