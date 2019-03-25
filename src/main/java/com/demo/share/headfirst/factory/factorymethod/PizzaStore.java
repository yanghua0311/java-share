package com.demo.share.headfirst.factory.factorymethod;

import com.demo.share.headfirst.factory.model.Pizza;

/**
 * Created by youngwa on 2019/03/25. 22:00
 */
public abstract class PizzaStore {

    public Pizza OrderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
