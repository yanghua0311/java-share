package com.demo.share.headfirst.factory.factorymethod;

import com.demo.share.headfirst.factory.factorymethod.stores.ChinaPizzaStore;
import com.demo.share.headfirst.factory.model.Pizza;

/**
 * Created by youngwa on 2019/03/25. 22:40
 */
public class test {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new ChinaPizzaStore();
        Pizza pizza = pizzaStore.OrderPizza("HF");
        System.out.println(pizza);
    }
}
