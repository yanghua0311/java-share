/**
 * 
 */
package com.demo.share.aop.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * Created by youngwa on 2018��9��4��
 *
 */
public class CglibProxy implements MethodInterceptor {

	@Override
	public Object intercept(Object object, Method arg1, Object[] arg2, MethodProxy proxy) throws Throwable {
		// ��������߼���advise�����˴�����Ŀ�������ִ��֮ǰ����ΪMethodBeforeAdviceInterceptor��
		System.out.println("before-------------");
		// ִ��Ŀ����add����
		proxy.invokeSuper(object, arg2);
		// ��������߼���advise�����˴�����Ŀ�������ִ��֮�󣬼�ΪMethodAfterAdviceInterceptor��
		System.out.println("after--------------");

		return null;
	}

}
