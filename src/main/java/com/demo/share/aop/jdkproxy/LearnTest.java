/**
 * 
 */
package com.demo.share.aop.jdkproxy;

import java.lang.reflect.Proxy;

/**
 * Created by youngwa on 2018Äê9ÔÂ4ÈÕ
 *
 */
public class LearnTest {
	public static void main(String[] args) {
		MyLearn my = new MyLearn();
		LearnHander hander = new LearnHander(my);
		LearnService service = (LearnService)Proxy.newProxyInstance(MyLearn.class.getClassLoader(), MyLearn.class.getInterfaces(), hander);
		service.read();
	}
}
