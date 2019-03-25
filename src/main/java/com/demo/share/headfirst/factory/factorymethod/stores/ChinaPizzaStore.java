package com.demo.share.headfirst.factory.factorymethod.stores;

import com.demo.share.headfirst.factory.factorymethod.PizzaStore;
import com.demo.share.headfirst.factory.model.HFPizza;
import com.demo.share.headfirst.factory.model.Pizza;
import com.demo.share.headfirst.factory.model.SHPizza;

/**
 * Created by youngwa on 2019/03/25. 22:18
 */
public class ChinaPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("SH".equals(type)) {
            pizza = new SHPizza();
        } else if ("HF".equals(type)) {
            pizza = new HFPizza();
        }
        return pizza;
    }
}
