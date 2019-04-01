package com.demo.share.headfirst.singleton;

import org.junit.runner.Runner;

import java.util.concurrent.CountDownLatch;

/**
 * Created by youngwa on 2019/04/01. 21:47
 */
public class Test {
    static CountDownLatch countDownLatch = new CountDownLatch(3001);

    public static void main(String[] args) {
        for (int i = 0; i < 3000; i++) {
            new Worker(() -> {
                System.out.println(EnumSingleton.getInstance());
            }, countDownLatch).start();
            countDownLatch.countDown();
        }
        countDownLatch.countDown();
    }
}

class Worker extends Thread {
    public Worker(Runnable target, CountDownLatch countDownLatch) {
        super(target);
        this.countDownLatch = countDownLatch;
    }
    public CountDownLatch getCountDownLatch() {
        return countDownLatch;
    }

    public void setCountDownLatch(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    private CountDownLatch countDownLatch;

    @Override
    public void run() {
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.run();
    }
}