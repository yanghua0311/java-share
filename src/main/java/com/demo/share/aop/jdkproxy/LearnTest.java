/**
 * 
 */
package com.demo.share.aop.jdkproxy;

import java.lang.reflect.Proxy;

/**
 * Created by youngwa on 2018年9月4日
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
