/**
 * 
 */
package com.demo.share.aop.cglib;

import net.sf.cglib.proxy.Factory;

/**
 * Created by youngwa on 2018年9月4日
 *
 */
public class CglibTest {
	public static void main(String[] args) {
		CglibProxy proxy = new CglibProxy();
		// base为生成的增强过的目标类
		LearnService service = CglibFactory.getInstance(proxy);
		service.read();
	}

}	
