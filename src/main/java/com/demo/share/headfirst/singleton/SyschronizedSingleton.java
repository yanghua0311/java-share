package com.demo.share.headfirst.singleton;

/**
 * Created by youngwa on 2019/04/01. 22:19
 */
public class SyschronizedSingleton {
    private SyschronizedSingleton() {

    }

    private static SyschronizedSingleton singleton;

    public static synchronized SyschronizedSingleton getInstance() {
        if (singleton == null) {
            singleton = new SyschronizedSingleton();
        }
        return singleton;
    }
}
