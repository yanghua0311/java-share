package com.demo.share.concurrency;

import java.sql.Connection;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by youngwa on 2018/08/26. 22:19
 */
public class ConnectionTest {
    static ConnectionPool pool = new ConnectionPool(10);
    //当走countDown时值减1，当值为0时，被await的线程被唤醒
    static CountDownLatch start = new CountDownLatch(1);
    static CountDownLatch end;

    public static void main(String[] args) throws InterruptedException {
        int threadCount = 20;
        end = new CountDownLatch(threadCount);
        int count = 20;
        AtomicInteger got = new AtomicInteger();
        AtomicInteger notGot = new AtomicInteger();
        for (int i = 0; i < threadCount; i++) {
            Thread thread = new Thread(new ConnectionRunner(count, got, notGot), "ConnectionRunnerThread");
            thread.start();
        }
        start.countDown();
        end.await();
        System.out.println("total invoke: " + (threadCount * count));
        System.out.println("got Connection: " + got);
        System.out.println("not got Cooection: " + notGot);
    }
    static class ConnectionRunner implements Runnable {
        int count;
        AtomicInteger got;
        AtomicInteger notGot;

        public  ConnectionRunner(int count, AtomicInteger got, AtomicInteger notGot) {
            this.count = count;
            this.got = got;
            this.notGot = notGot;
        }
        @Override
        public void run() {
            try {
                start.await();
            } catch (InterruptedException e) {

            }
            while (count > 0) {
                try {
                    Connection connection = pool.fetchConnection(1000);
                    if (connection != null) {
                        try {
                            connection.createStatement();
                            connection.commit();
                        } finally {
                            pool.releaseConnection(connection);
                            got.incrementAndGet();
                        }
                    } else {
                        notGot.incrementAndGet();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    count --;
                }
            }
            end.countDown();
        }
    }
}
