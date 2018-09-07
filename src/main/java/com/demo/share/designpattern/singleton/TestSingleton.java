/**
 * 
 */
package com.demo.share.designpattern.singleton;

/**
 * Created by youngwa on 2018/9/05.
 *
 */
public class TestSingleton {
    public static void main(final String[] args) throws InterruptedException {
        for (int i = 1; i <= 100000; i++) {
            final Thread t1 = new Thread(new ThreadSingleton());
            t1.setName("thread" + i);
            t1.start();
        }
    }

    public static class ThreadSingleton implements Runnable {
        @Override
        public void run() {
            DoubleCheckSingleton.getInstance();
        }
    }
}
