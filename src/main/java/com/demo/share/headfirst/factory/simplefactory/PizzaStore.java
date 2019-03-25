package com.demo.share.headfirst.factory.simplefactory;

import com.demo.share.headfirst.factory.model.Pizza;

/**
 * Created by youngwa on 2019/03/25. 22:49
 */
public class PizzaStore {
    private SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public Pizza orderPizza(String type) {
        return simplePizzaFactory.createPizza(type);

    }
}
