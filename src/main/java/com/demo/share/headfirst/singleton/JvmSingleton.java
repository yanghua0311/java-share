package com.demo.share.headfirst.singleton;

/**
 * Created by youngwa on 2019/04/01. 22:17
 */
public class JvmSingleton {
    private static JvmSingleton singletn = new JvmSingleton();
    private JvmSingleton() {

    }
    public static JvmSingleton getInstance() {
        return singletn;
    }
}
