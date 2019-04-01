package com.demo.share.headfirst.singleton;

/**
 * Created by youngwa on 2019/04/01. 21:43
 */
public class DoubleCheckSingleton {
    private DoubleCheckSingleton(){

    }
    private volatile static DoubleCheckSingleton singleton;

    public static DoubleCheckSingleton getInstance() {
        if (singleton == null) {
            synchronized(DoubleCheckSingleton.class) {
                //如果不为volatile保证happen-before原则，极度并发繁忙的情况下，cpu无法及时刷新前一个线程new的对象给予当前线程。
                if (singleton == null) {
                    singleton =new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
