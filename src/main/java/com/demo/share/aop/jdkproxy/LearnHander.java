/**
 * 
 */
package com.demo.share.aop.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by youngwa on 2018��9��4��
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
		System.out.println("==============��׼������");
		Object invoke = method.invoke(target, args);
		System.out.println("==============����������");
		return null;
	}

}
