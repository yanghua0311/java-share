/**
 * 
 */
package com.demo.share.designpattern.observer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.share.InitSpringContext;

/**
 * Created by youngwa on 2018/9/05.
 *
 */
public class Test {
	
    public static void main(String[] args) {
    	ClassPathXmlApplicationContext classPathXmlApplicationContext = InitSpringContext.init();
    	OrderService orderService = (com.demo.share.designpattern.observer.OrderService) classPathXmlApplicationContext.getBean("orderService");
    	orderService.save();
    }
}
