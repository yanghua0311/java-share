/**
 * 
 */
package com.demo.share.aop.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * Created by youngwa on 2018年9月4日
 *
 */
public class CglibProxy implements MethodInterceptor {

	@Override
	public Object intercept(Object object, Method arg1, Object[] arg2, MethodProxy proxy) throws Throwable {
		// 添加切面逻辑（advise），此处是在目标类代码执行之前，即为MethodBeforeAdviceInterceptor。
		System.out.println("before-------------");
		// 执行目标类add方法
		proxy.invokeSuper(object, arg2);
		// 添加切面逻辑（advise），此处是在目标类代码执行之后，即为MethodAfterAdviceInterceptor。
		System.out.println("after--------------");

		return null;
	}

}
