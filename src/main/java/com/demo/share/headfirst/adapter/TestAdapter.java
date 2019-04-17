package com.demo.share.headfirst.adapter;

import java.io.InputStream;

/**
 * 代理模式和装饰者模式有相识之处，但是代理模式的目的是转换，而装饰者是增强原有的东西，
 * 比如java中的流设计，首先顶层的InputStream，下面实现的组件有file、byte...等等方式读取数据转换为流，下面的装饰者有filter、buffered等扩展这些基础组件
 * 其实现方式是在装饰者中包装了一个顶层的接口，以此注入实现的顶层接口的组件
 * 代理模式则做法类似，包装的顶层的接口是需要被代理的接口
 * Created by youngwa on 2019/04/17. 21:45
 */
public class TestAdapter {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(turkey);
        duck.fly();
        duck.quack();
    }
}
