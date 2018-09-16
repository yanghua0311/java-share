package com.demo.share.concurrency.lock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by youngwa on 2018/08/28. 20:42
 */
public class CacheRWLock {
    static Map<String, Object> map = new HashMap<>();
    static ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
    static Lock w = reentrantReadWriteLock.writeLock();
    static Lock r = reentrantReadWriteLock.readLock();

    static {
        map.put("aaa", "bbb");
    }

    public static final Object get(String key) throws InterruptedException {
        System.out.println("进入读方法");
        r.lock();
        try {
            System.out.println("成功获取读锁");
            Thread.sleep(10000);
            return map.get(key);
        } finally {
            System.out.println("将要释放读锁");
            r.unlock();
        }
    }

    public static final Object put(String key, Object object) throws InterruptedException {
        System.out.println("进入写方法");
        w.lock();
        try {
            System.out.println("成功获取写锁");
            Thread.sleep(5000);
            return map.put(key, object);
        } finally {
            System.out.println("将要释放写锁");
            w.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread r1 = new Thread(() -> {
            try {
                System.out.println(get("aaa"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread r2 = new Thread(() -> {
            try {
                put("aaa", "ddd");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread r3 = new Thread(() -> {
            try {
                System.out.println(get("aaa"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        r1.start();
        r2.start();
        Thread.sleep(10);
        r3.start();
    }
}
