package com.demo.share.headfirst.factory.simplefactory;

import com.demo.share.headfirst.factory.model.HFPizza;
import com.demo.share.headfirst.factory.model.Pizza;
import com.demo.share.headfirst.factory.model.SHPizza;

/**
 * Created by youngwa on 2019/03/25. 22:48
 */
public class ChinaPizzaFactory extends SimplePizzaFactory {
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
