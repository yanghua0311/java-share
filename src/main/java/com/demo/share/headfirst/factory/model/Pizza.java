package com.demo.share.headfirst.factory.model;

/**
 * Created by youngwa on 2019/03/25. 22:03
 */
public abstract class Pizza {
    String name;
    String price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
