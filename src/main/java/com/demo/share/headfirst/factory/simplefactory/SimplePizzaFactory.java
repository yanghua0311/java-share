package com.demo.share.headfirst.factory.simplefactory;

import com.demo.share.headfirst.factory.model.Pizza;

/**
 * 简单工厂设计模式，像是对公共不变的东西的一种封装，变动性大情况下不易维护
 * Created by youngwa on 2019/03/25. 22:46
 */
public abstract class SimplePizzaFactory {
    public abstract Pizza createPizza(String type);
}
