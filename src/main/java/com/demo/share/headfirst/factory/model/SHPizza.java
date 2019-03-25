package com.demo.share.headfirst.factory.model;


/**
 * Created by youngwa on 2019/03/25. 22:34
 */
public class SHPizza extends Pizza {
    public SHPizza() {
        this.name = "上海pizza";
        this.price = "9元";
    }

    @Override
    public String toString() {
        return "SHPizza{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
