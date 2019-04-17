package com.demo.share.headfirst.adapter;

/**
 * Created by youngwa on 2019/04/17. 21:41
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("go to fly short distance");
    }
}
