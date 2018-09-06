/**
 * 
 */
package com.demo.share.designpattern.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * Created by youngwa on 2018/9/05.
 *
 */
public class Test {
    public static void main(String[] args) {
        CountDownLatch cd = new CountDownLatch(1);
        for (int i = 0; i < 1000; i++) {
            Thread t1 = new Thread(() -> {
                try {
                    cd.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(DoubleCheckSingleton.getInstance());
            });
            t1.start();
        }
        cd.countDown();
    }

}
