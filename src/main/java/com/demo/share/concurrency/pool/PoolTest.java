package com.demo.share.concurrency.pool;

/**
 * Created by youngwa on 2018/08/27. 20:39
 */
public class PoolTest {
    public static void main(String[] args) throws InterruptedException {
        ThreadPool<Runnable> pool = new DefaultThreadPool<>(3);
        pool.exeute(() -> {
            System.out.println("one" + Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        pool.exeute(() -> {
            System.out.println("two" +Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        pool.exeute(() -> {
            System.out.println("three" +Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        pool.exeute(() -> {
            System.out.println("four" +Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
