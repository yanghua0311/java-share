/**
 * 
 */
package com.demo.share.designpattern.factory;

import com.demo.share.InitSpringContext;

/**
 * Created by youngwa on 2018/9/05.
 *
 */
public class Test {
    public static void main(String[] args) {
        InitSpringContext.init();
        FooService a = CreateFactory.getService("a");
        FooService b = CreateFactory.getService("b");
        FooService c = CreateFactory.getService("c");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }


}
