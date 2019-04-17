package com.demo.share.headfirst.adapter;

/**
 * Created by youngwa on 2019/04/17. 21:41
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("quack");
    }

    @Override
    public void fly() {
        System.out.println("go to flying");
    }
}
