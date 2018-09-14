/**
 * 
 */
package com.demo.share.aop.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by youngwa on 2018年9月4日
 *
 */
public class LearnHander implements InvocationHandler{
	Object target;
	
	public LearnHander(Object target) {
		super();
		this.target = target;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("==============》准备工作");
		Object invoke = method.invoke(target, args);
		System.out.println("==============》结束工作");
		return null;
	}

}
